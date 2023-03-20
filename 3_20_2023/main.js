function redundant(someString) {
    return () => someString;
}

const f1 = redundant("apple");
const f2 = redundant("pear");
const f3 = redundant("");

function main() {
    console.log(f1());
    console.log(f2());
    console.log(f3());  
}

main();
