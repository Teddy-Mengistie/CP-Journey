#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    for (cin >> t; t > 0; t--) {
        int n;
        cin >> n;
        unordered_map <int, int> map;
        for (int i = 0; i < n; i++) {
            unordered_set<int> set;
            int k;
            cin >> k;
            for (int i = 0; i < k; i++) {
                int num;
                cin >> num;
                set.insert(num);
            }

            for (auto f : set)
                map[f]++;

        }
        int m = INT_MAX;
        int total = 0;
        for (auto i : map) {
            total += i.second;
            m = min(m, i.second);
        }
        cout << total - m << "\n";
    }
    return 0;
}