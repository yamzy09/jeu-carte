# Titre de projet

Jeu-carte

## Description

ce projet est un API REST d'un  jeu  de carte pour un test technique chez atexo.


### Clone de projet 

```
git clone https://github.com/yamzy09/jeu-carte.git
git checkout master
```

### Execution du programme

* il faut faire un build 
* ensuite lancé le projet 
```
mvn clean install
mvn spring-boot:run
```

## Documentation et Swagger

la documentation du l'API est accessible via swagger 
```
http://localhost:8080/swagger-ui.html#
```
## EndPoints
- **GET  :**     /api/v1/jeucarte/carte : cet  endpoint permet de  tirer une main avec un objet qui contient la main à son état initiale et un deuxiéme objet avec son état trié.

- **Curl**
```
curl -X GET "http://localhost:8080/api/v1/jeucarte/carte" -H "accept: application/json"

```

- **Request URL**
```
http://localhost:8080/api/v1/jeucarte/carte
```

## Image Docker
le projet existe sous format d'image docker il suffit de faire un pull et un run pour pouvoir le testé dans un containeur 
```
docker pull ramzy09/jeu-carte:0.0.1
docker run -d -p 8080:8080 ramzy09/jeu-carte:0.0.1
```
## Auteur

* Ramzi GAIDI
* mail : ramzi.gaidi@gmail.com
* linkedIn: https://www.linkedin.com/in/ramzi-gaidi/

## Version History

* 0.0.1-SNAPSHOT
    * version initiale 
