#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri May 27 12:45:12 2022

@author: murugesh
"""

n=input()
x=0
y=0 
d=0
if('START' in n):
    while('STOP' not in n):
        if('LEFT' in n):
            x=x-1
        if('RIGHT' in n):
            x=x+1
        if('UP' in n):
            y=y+1
        if('DOWN' in n):
            y=y-1
        n=input()
    '''
    x=x**2
    y=y**2
    x=pow(x,0.5)
    y=pow(y,0.5)
    '''
    x=abs(x)
    y=abs(y)
    d=x+y
    print(d)