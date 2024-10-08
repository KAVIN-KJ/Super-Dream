#include<iostream>
using namespace std;
int main(){
    int num;
    cin>>num;
    int arr[num];
    for(int i=0;i<num;i++){
        cin>>arr[i];
    }
    int k;
    cin>>k;
    while(k>0){
        for(int i=0;i<num-1;i++){
            swap(arr[i],arr[i+1]);
        }
        k--;
    }
    for(int i=0;i<num;i++){
        cout<<arr[i]<<" ";
    }
    
}