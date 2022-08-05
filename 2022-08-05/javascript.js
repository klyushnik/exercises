export function repeatCharacters(c, num){
    if(num == 0){
        return ""
    }
    if(num == 1){
        return c
    }
    result = ""
    for(i = 0; i < num; i++){
        result += c
    }
    return result
}

console.log(repeatCharacters("d", 1));