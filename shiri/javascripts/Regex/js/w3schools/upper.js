function upper(str)
{
   regexp = /^[A-Z]/;
   if (regexp.test(str))
    {
      console.log("first character is uppercase");
    } 
    else
    {
      console.log("first character is not uppercase");
    }
}
upper('Apple');
