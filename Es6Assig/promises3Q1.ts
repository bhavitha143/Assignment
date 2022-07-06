[23:13] Ashwini, Challandula
const p1 = 45
const p2 = 56
Promise.all([p1, p2]).then((results) => {
  const total = results.reduce((p, c) => p + c);
  console.log(`Results: ${results}`);
  console.log(`Total: ${total}`);
});

