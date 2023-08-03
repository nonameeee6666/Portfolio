#!/bin/bash
opt2="sim"
while [ $opt2 != "não" ] 
do
opt=0
echo "Script 1: Exibirá toda a tabuada de um número informado"
echo "Script 2: Exibirá todos os números pares inferiores até 0 de um número informado"
echo "Script 3: Exibirá o fatorial de um número informado"
read -p "Escolha um script de 1 a 3: " opt
if [ $opt -eq 1 ]; then
read -p "Digite a tabuada: " val
val2=($val)
echo "-----------TABUADA-----------"
for i in $(seq 1 10)
do
	val2=$(($val*$i))
		echo $i " x " $val " = " $val2
done

elif [ $opt -eq 2 ]; then
	read -p "Digite um número: " val
	par=$(($val % 2))
echo "-----------NÚMEROS PARES INFERIORES-----------"
	if [ $par -eq 0 ]; then

		while [ $val -ne 0 ]
		do
			val=$(($val - 2))
			echo $val
		done
	else
		val=$(($val - 1))
	
		echo $val
		while [ $val -ne 0 ]
		do
			val=$(($val - 2))
			echo $val
		done
	fi

elif [ $opt -eq 3 ]; then
	read -p "Digite um número: " val
	fat=0
	echo "-----------NÚMEROS FATORIAIS-----------"
	for i in $(seq 1 $val)
	do
		i2=$(($i + 1))
		fat2=$(($fat + ($i*$i2)))
	done
	echo $fat2
fi
read -p "Deseja repetir o programa? [sim ou não] " opt2
echo ""
done
