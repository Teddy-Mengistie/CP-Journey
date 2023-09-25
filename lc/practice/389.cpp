#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    char findTheDifference(string s, string t) {
        int count = 0;

        for (unsigned int i = 0; i < s.size(); i++) 
            count += t[i] - s[i];

        return count + t.back();
    }
};