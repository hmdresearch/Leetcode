
/*
Given n orders, each order consist in pickup and delivery services. 

Count all valid pickup/delivery possible sequences such that delivery(i) is always after of pickup(i). 

Since the answer may be too large, return it modulo 10^9 + 7.
*/

class Solution {
    public int countOrders(int n) {
        int MOD = 1000000007;
        long ans = 1;
        for(int i = 1, j = 1; i <= n; ++i, j += 2){
            ans = (ans * i) % MOD;
            ans = (ans * j) % MOD;            
        }

        return (int)ans;
    }
}
