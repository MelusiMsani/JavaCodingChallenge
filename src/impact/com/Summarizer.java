package impact.com;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;


public class Summarizer implements NumberRangeSummarizer {

    public Collection<Integer> collect(String input) {
        List<Integer> listInt = Stream.of(input.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Collection<Integer> collectionInt = listInt;
        return collectionInt;
    }


    public String summarizeCollection(Collection<Integer> input) {
        String joinedList = input.stream()
                .sorted()
                .distinct()
                .map(String::valueOf)
                .collect(joining(","));
        System.out.println("Main : "+ joinedList);

        String[] joinedArray = joinedList.split(",");
        int[] parseIntArray = Stream.of(joinedArray).mapToInt(Integer::parseInt).toArray();

        List<Integer> list = Arrays.stream(parseIntArray).boxed().collect(Collectors.toList());;
        StringBuilder sb = new StringBuilder();
        int previous = list.get(0), start = previous;
        for(int next: list.subList(1, list.size())) {
            if(previous+1 != next) {
                appendRange(sb, start, previous).append(", ");
                start = next;
            }
            previous = next;
        }
        String result = appendRange(sb, start, previous).toString();
        System.out.println("Summarized: "+result);
        return result;
    }


private static StringBuilder appendRange(StringBuilder sb, int start, int previous) {
    sb.append(start);
    if(start!=previous) sb.append(previous-start>1? " - ": ", ").append(previous);
    return sb;
}

}

