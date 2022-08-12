function rightShift(num, power) {
    return Math.floor(num / (2 ** power))
}
console.log(rightShift(4666, 6));