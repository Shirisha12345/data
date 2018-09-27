function alphaNum(str)
{
 regexp = /^[A-Za-z0-9]+$/;
  
        if (regexp.test(str))
          {
            return true;
          }
        else
          {
            return false;
          }
}

console.log(alphaNum("37828sad"));

console.log(alphaNum("3243#$sew"));
