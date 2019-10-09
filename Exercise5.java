// ping and baffle start calling each other in an endless fashion.
// Eventually (after about 2000 method calls on the stack), 
// Java will get tired of this and cause a stack overflow
// error.