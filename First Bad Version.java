/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            if(n == 1)
                return 1;
            int l = 1;
            int r = n;
            int result = 0;
            while(l <= r){
                int mid = l + (r - l) / 2;
                if(isBadVersion(mid) == false)
                    l = mid + 1;
                else if(isBadVersion(mid) == true)
                    r = mid - 1;
                if(isBadVersion(mid) != isBadVersion(mid - 1))
                    result = mid;
            }
            return result ;
        }
    }