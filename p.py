n=int(input("Enter a Number:"))
l=1
a=3
s1=[]
s2=0
if n==1:
    print('A')
elif n==2:
    print('A')
    print('C',end=' ')
    print('B')
else:
    print('A')
    print('C',end=' ')
    print('B')
    for i in range(2,n+1):
            l=l+i
            for j in range(a+1,l+1):
                
                if i%2==0:
                    ch=chr((j+64)-(s2*26))
                    s1.append(ch)
                else:
                    print(chr((j+64)-(s2*26)),end=' ')
                if j%26==0:
                    s2=s2+1
            if i>2 and i%2==0:
                s1.reverse()
                for r in s1:
                    print(r,end=' ')
                s1=[]
            a=l
            if i==2:
                continue
            print()
        