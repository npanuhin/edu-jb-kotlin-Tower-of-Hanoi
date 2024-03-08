```
                               Tower of Hanoi Game                                
Enter moves as "{from} {to}", where "from" and "to" are stack numbers (1, 2, or 3)
Example: 1 3                                                                      
----------------------------------------------------------------------------------
Enter the number of disks or press Enter for the default amount of "3"): 3

  █     │     │  
 ███    │     │  
█████   │     │  
──┴── ──┴── ──┴──
  1     2     3  
Enter move ({from} {to}): 1 3

  │     │     │  
 ███    │     │  
█████   │     █  
──┴── ──┴── ──┴──
  1     2     3  
Enter move ({from} {to}): 1 2

  │     │     │  
  │     │     │  
█████  ███    █  
──┴── ──┴── ──┴──
  1     2     3  
Enter move ({from} {to}): 3 2

  │     │     │  
  │     █     │  
█████  ███    │  
──┴── ──┴── ──┴──
  1     2     3  
Enter move ({from} {to}): 1 3

  │     │     │  
  │     █     │  
  │    ███  █████
──┴── ──┴── ──┴──
  1     2     3  
Enter move ({from} {to}): 2 1

  │     │     │  
  │     │     │  
  █    ███  █████
──┴── ──┴── ──┴──
  1     2     3  
Enter move ({from} {to}): 2 3

  │     │     │  
  │     │    ███ 
  █     │   █████
──┴── ──┴── ──┴──
  1     2     3  
Enter move ({from} {to}): 1 3

  │     │     █  
  │     │    ███ 
  │     │   █████
──┴── ──┴── ──┴──
  1     2     3  
Congratulations! You have completed the Tower of Hanoi :)
```
