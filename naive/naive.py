import numpy as np
from sklearn.naive_bayes import GaussianNB

# Pip install matplotlib
# Pip install numpy
# Pip install pandas
# Pip install scikit-learn
# Define the Tennis dataset
# Format: Outlook, Temperature, Humidity, Windy, PlayTennis
# 0: Sunny, 1: Overcast, 2: Rainy
# 0: Cool, 1: Mild, 2: Hot
# 0: Normal, 1: High
# 0: False, 1: True
# 0: No, 1: Yes
tennis_data = np.array(
    [
        [0, 0, 0, 0, 1],
        [0, 0, 0, 1, 1],
        [1, 0, 0, 0, 1],
        [2, 1, 0, 0, 1],
        [2, 2, 1, 0, 1],
        [2, 2, 1, 1, 0],
        [1, 2, 1, 1, 1],
        [0, 1, 0, 0, 0],
        [0, 2, 1, 0, 1],
        [2, 1, 1, 0, 1],
        [0, 1, 1, 1, 1],
        [1, 1, 0, 1, 1],
        [1, 0, 1, 0, 1],
        [2, 1, 0, 1, 0],
    ]
)


# Features: Outlook, Temperature, Humidity, Windy
X = tennis_data[:, :-1]
# Target: PlayTennis
y = tennis_data[:, -1]


# Train the Naive Bayes classifier
clf = GaussianNB()
clf.fit(X, y)


# Take user input for weather conditions
print("\nEnter weather conditions:")
outlook = int(input("\nOutlook (0: Sunny, 1: Overcast, 2: Rainy): "))
temperature = int(input("\nTemperature (0: Cool, 1: Mild, 2: Hot): "))
humidity = int(input("\nHumidity (0: Normal, 1: High): "))
windy = int(input("\nWindy (0: False, 1: True): "))


# Predict whether to play tennis
user_input = np.array([[outlook, temperature, humidity, windy]])
predicted_play = clf.predict(user_input)


# Display the prediction
play_decision = "Yes" if predicted_play == 1 else "No"
print("\nPredicted decision to play cricket:", play_decision)