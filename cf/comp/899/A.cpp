#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    for (cin >> t; t-- > 0;) {
        int n;
        cin >> n;
        int k = n;
        int max = 1;
        int a[n];
        for (int i = 0; i < n; i++) cin >> a[i];

        for (int i = 0; i < n; i++) {
            while (a[i] == max++)
            k--;
        }
        cout << max-1 << "\n";

    }
    
    return 0;
}