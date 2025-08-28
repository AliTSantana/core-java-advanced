package streams.advanced;

import java.util.List;

public class ParallelStreams {
    public static void main(String[] args){
        List<String> names = List.of("Eva", "Alex", "Sophia", "Adri", "Angel", "Nathan");

        //Sequential processing
        long startSeq = System.currentTimeMillis();
        List<String> upperSeq = names.stream()
                .map(String::toUpperCase)
                .toList();
        long endSeq = System.currentTimeMillis();
        System.out.println("Sequential: " + upperSeq + " | Time: " + (endSeq - startSeq) + " ms");

        //Parallel processing
        long startPar = System.currentTimeMillis();
        List<String> upperPar = names.parallelStream()
                .map(String::toUpperCase)
                .toList();
        long endPar = System.currentTimeMillis();
        System.out.println("Parallel: " + upperPar + " | Time: " + (endPar - startPar) + " ms");
    }
}
