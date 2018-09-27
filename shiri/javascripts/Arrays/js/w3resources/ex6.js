const num=12458096;
const str = num.toString();
const result = [str[0]];
  console.log(result);
for(var x=1; x<str.length; x++)
  {
    if((str[x-1]%2 === 0)&&(str[x]%2 === 0))
     {
      result.push('-', str[x]);
     }
    else
     {
      result.push(str[x]);
     }
  }
console.log(result.join(''));
