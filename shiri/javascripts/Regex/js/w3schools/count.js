function count(str) {

    return str.match(/[aeiou]/gi).length;
  
  }
  
  console.log(count('It is raining heavily'));
