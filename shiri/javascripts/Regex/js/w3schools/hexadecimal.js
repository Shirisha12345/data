function hexadecimal(str)
{
 regexp = /[0-9a-fA-F]+$/;
  
        if (regexp.test(str))
          {
            return true;
          }
        else
          {
            return false;
          }
}

console.log(hexadecimal("ffffff"));

console.log(hexadecimal("fz500"));
