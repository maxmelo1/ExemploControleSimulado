import matplotlib.pyplot as plt
import numpy as np

import pandas as pd

sinal = pd.read_csv('erro.csv', names=['Erro'])

plt.ylabel('Valor do erro')
plt.xlabel('Amostras')
plt.plot(sinal)
plt.show()
