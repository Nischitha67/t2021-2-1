l=[]
print("Enter list size")
n=int(input())
print("Enter list values")
for i in range(0,n):
    l.append(int(input()))
s={1:n}
count=0
for i in range (2,10):
    count=0
    for j in range (1,n):
        if((l[j]%i)==0):
         count=count+1
    s.update({i:count})
print(s)
