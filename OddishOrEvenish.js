function oddishOrEvenish(num) {
  sum = 0
  while (num > 0) {
    sum += num % 10
    num = Math.floor(num / 10)
  }
  
  if (sum % 2 == 0) {
  	return "Evenish"
  } else {
  	return "Oddish"
  }
}

console.log(oddishOrEvenish(121))
console.log(oddishOrEvenish(41))
