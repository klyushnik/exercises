const oddishOrEvenish = (num) => {
    let result = -1
    while (num > 0){
        result += num % 10
        num = Math.floor(num / 10)
    }
    return result % 2 == 0 ? "Evenish" : "Oddish"
}

console.log(oddishOrEvenish(41));