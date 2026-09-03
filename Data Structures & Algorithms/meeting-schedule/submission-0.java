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
    public boolean canAttendMeetings(List<Interval> intervals) {

       intervals.sort((a, b) -> a.start - b.start);

        int i=0;
        

        while(i<intervals.size()-1){
            if(intervals.get(i).end>intervals.get(i+1).start){
                return false;
            }
            i++;
        }
        return true;


    }
}
