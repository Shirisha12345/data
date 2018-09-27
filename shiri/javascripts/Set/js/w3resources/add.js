var x = new Set(['1', '2', '3']);

console.log(x.has('1'));
console.log(x.has('shiri'));

x.add('shiri');
console.log(x.has('shiri'));
