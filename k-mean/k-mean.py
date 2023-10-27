import pandas as pd
import matplotlib.pyplot as plt


# Reading the database
data = pd.read_csv('cluster.csv')


print("\n")
# Printing the data
print(data.head())


plt.title('K-means Algorithm')


plt.scatter(data['Longitude'],data['Latitude'])
plt.xlim(-180,180)
plt.ylim(-90,90)


# Adding the legends
plt.show()