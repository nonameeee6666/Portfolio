#!/bin/bash
date=$(date)
echo "Script 1: Exibirá a atualização das partições, relação de usuários logados, data e a hora e salvará em um arquivo"
echo "Script 2: Verificará qual é o maior número entre 2 informados e sua soma, irá salvar o resultado no local informado"
read -p "Escolha o script 1 ou 2: " opt

if [ $opt = 2 ]; then
        read -p "Digite o arquivo a ser criado: " loca
        read -p "Digite o 1° num: " num1
        read -p "Digite o 2° num: " num2
	if [$num1 -gt $num2]; then
		res=$(num1)
	fi
	if [$num2 -gt $num1]; then
		res=$(num2)
	fi
	res2=$((num1 + num2))
        fras=$(echo "O maior número entre $num1 + $num2 é $res e sua soma é $res2. O resultado foi gravado em $loca em $date")
        echo $fras
        echo $fras >> $loca
fi

if [ $opt = 1 ]; then
        stat=$(df -h)
	whoam=$(whoami)
	date=$(date)
	read -p "Digite o arquivo a ser criado: " loca
	fras1=$(echo "Status da atualização das partições: $stat")
	fras2=$(echo "Relação de usuários logados: $whoam")
	fras3=$(echo "Data e hora: $date")
	fras4=$(echo "O resultado foi gravado em $loca")
        echo $fras1
	echo $fras2
	echo $fras3
	echo $fras4
	fras=$($fras1$fras2$fras3$fras4)
        echo $fras >> $loca
fi
