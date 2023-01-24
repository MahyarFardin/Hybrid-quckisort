# this part is used for plotting

import matplotlib.pyplot as plt
plt.rcParams["figure.figsize"] = (10,5)

plt.scatter(a,b) 
plt.xlabel("k")
plt.ylabel("Quicksort / New algorithm")
plt.savefig("result.png")