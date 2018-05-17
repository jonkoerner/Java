arr= [20,40,30,50,80,10]


function AvgSort(arr, avg){ 
    let left= [];
    let right = [];
    let sum = 0;
    let lcount = 0;
    let rcount = 0;
    let SortedArray = [];
    if ( avg == null ) {
        for (let i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            if (arr[i] == (arr.length-1)){
                let avg = (sum/arr.length);
            }
        }
    }   
    for(let i = (arr.length-1) ; i >= 0 ; i--){ 
        if (arr[i] <= avg) {
            lcount ++;
            left.push(arr[i]);
        }
        if (arr[i] > avg){ 
            Rcount ++;
            right.push(arr[i]);
        } 
        let lavg = (avg * lcount);
        let ravg = (avg * rcount);
        // if (arr[i]<=avg){
        //     tempL = Arr.length/
        //     left.push(arr[i])
        // }
        if (left.length == 1){
            SortedArray.push(left[arr[0]])
        }
        AvgSort(left, lavg);
        AvgSort(right, ravg);
    return SortedArray
    }}
console.log(AvgSort(arr))