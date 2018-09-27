var x = new Set();
x.add(1);
x.add('shiri');
x.add({ foo: 'bar' });

for (var item of x) {
  console.log(item);
}
