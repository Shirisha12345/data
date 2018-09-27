function prog1(str)
{
 regexp = /^[a-z0-9_]+/i;
  
        if (regexp.test(str))
          {
            return true;
          }
        else
          {
            return false;
          }
}

console.log(prog1('12-133'));

console.log(prog1('100_23'));
