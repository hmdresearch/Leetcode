
/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/
Given a string s, find the length of the longest substring without repeating characters.
*/

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int currentMaxPos = -1;
        int ans = 0;
        vector<int> m(256, -1);
        for(int i = 0; i < s.length(); ++i) {
            currentMaxPos = max(currentMaxPos, m[s[i]]);
            ans = max(ans, i - currentMaxPos);
            m[s[i]] = i;
        }

        return ans;
    }
};
