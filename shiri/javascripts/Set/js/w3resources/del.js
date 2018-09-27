var x = new Set(['cat', 'dog', 'ant']);

console.log('size before deletion: ' + x.size);
console.log('deleted "cat" = ' + x.delete('cat'));

console.log('size after deletion: ' + x.size);
console.log('deleted "foo" = ' + x.delete('foo'));

