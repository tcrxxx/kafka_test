
## Comandos Úteis

### docker 

Mostra todos os containeres rodando

	docker container ls --all
	
Para todos os containeres
	
	docker stop $(docker ps -a -q)
	
Remove todos os containeres

	docker rm $(docker ps -a -q)	
	
### docker-compose	

docker-compose up -d

### Install Offset Explorer IDE

1) chmod +x offsetexplorer.sh

2) ./offsetexplorer.sh

----------------------------------------------------------------------------------

## Chamadas de teste

```shell
curl --header "Content-Type: application/json" \
  --request GET \
  --data '{"username":"xyz","password":"xyz"}' \
  http://localhost:8080/kafka/send
```
