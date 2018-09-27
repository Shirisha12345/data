var map1 = new Map();

map1.set('a', 'apple');
map1.set('b', 'ball');
map1.set('c', 'cat');

console.log(map1.size);

 map1.delete('a');
 map1.set('k','kitchen');
var k= map1.keys();
console.log(k.next().value);
console.log(k.next().value);
console.log(k.next().value);

var p=map1.values();
console.log(p.next().value);
console.log(p.next().value);
console.log(p.next().value);


var itera=map1[Symbol.iterator]();
for (var item of itera) {
    console.log(item);
  }
  console.log(map1.has("k"));
  console.log(map1.has("aaaa"));
