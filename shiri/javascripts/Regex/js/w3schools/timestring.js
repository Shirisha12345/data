function timeString(str)
{
 regexp = /^(2[0-3]|[01]?[0-9]):([0-5]?[0-9]):([0-5]?[0-9])$/;

        if (regexp.test(str))
          {
            return true;
          }
        else
          {
            return false;
          }
}

console.log(timeString("11:35:30"));

console.log(timeString("90:90:90"));
