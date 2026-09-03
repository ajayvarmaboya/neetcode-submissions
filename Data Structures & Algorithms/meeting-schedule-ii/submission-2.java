/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {

        TreeMap<Integer,Integer>map=new TreeMap<>();

        for(Interval interval:intervals){
            map.put(interval.start,map.getOrDefault(interval.start,0)+1);
            map.put(interval.end,map.getOrDefault(interval.end,0)-1);



        }
        int rooms=0;
        int maxrooms=0;

        for(int changes:map.values()){
            rooms+=changes;
            maxrooms=Math.max(rooms,maxrooms);
        }
        return maxrooms;
        

    }
}
