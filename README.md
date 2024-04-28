# Othman_Benmalek_Systemes-Distribuees_TP3
# Hospital APP 

## Partie 1 :
La Création d'une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA avec les fonctionnalités suivantes :

### Afficher les patients:
   -Créer un fichier html et afficher la liste des patients avec bootstrap + thymeleaf :
![1)Créer un fichier html et afficher la liste des patients avec bootstrap + thymleaf](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/c95ebabf-3425-4f7a-b1f7-5a2bcdb1cb25)
   -Résultat :
![1-1)Résultat ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/a73e382e-3a72-4241-849f-134bd3b3ddf5)
   -Table de patients dans H2 DB :
   
![1-2)Table de patients dans H2 DB](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/7853119f-9d64-4722-a366-437fa29ba48b)

### Faire la pagination:
   -Patient Controller : 
   
![4)Patient controller for pagination ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/7f389708-97c8-4478-a163-d7c78faa4c6c)

   -Code HTML :

![4-1)Pagination code html ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/f19b43f1-001c-4fd9-a3d8-104081dda12e)

   -Resultat :
   
![4-2)Pagination resultat](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/5aac1365-31be-4013-aff4-8dea8624e224)

### Chercher les patients:
   -Modifier le fichier PatientRepository :
   
![5-0)Modifier PatientRepository ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/ed3330d8-f8bb-4dda-a335-786d26cf83c3)

   -Modifier le code HTML :
   
![5)Modifier le fichier patient html](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/882de00d-70f9-49c4-8db6-76827a16cee5)

   -Resultat de recherche :

   ![5-1)Rechercher un patient](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/cb010d6a-f7ee-403b-a761-0d9a81c179cb)


### Supprimer un patient:

   -Ajout du bouton delete :
   
![6)Ajout du bouton delete](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/e101073f-e65d-450f-bfff-fb9004dfdfa2)

   -On veut supprimer le patient qui a l'id 31:

![6-1)on veut supprimer le numero 31](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/142217d4-fbce-423f-921f-addd02e9639a)

   -Après Suppression :
   
![6-2)Après suppression](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/d70ab101-5940-4395-8044-414552fbe6ce)

### Faire des améliorations supplémentaires:
   -Amélioration en utilisant les icones Bootstrap :

![7)Amelioration en utilisant les icones bootstrap ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/c542cd33-d31e-4eee-8031-0dd03084227d)



## Partie 2 :

### Créer une page template
  -Ajout de la page template1 :
  
![1)Ajoute de la page template 1 html](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/83d43391-17f1-4325-b50b-ca4f404f6252)

  -Résultat avec la navbar :
  
![1-1)Résultat avec le navbar](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/f9d88fa3-c69b-4953-ab2b-576604da33b3)

  
### Faire la validation des formulaires

  -Formulaire pour ajouter un patient :
  
![2-1)Formulaire pour ajouter un patient](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/ed9a34c9-6080-4cdf-8085-ad917fb67705)


  -On veut modifier les infos du patient d'id 1:
  
![3)Edit patient bouton (avant)](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/589bf743-85ed-4624-972e-d66331cad51b)


  -Formulaire pour modifier les infos d'un patient :

  ![3-1)Edit patient 1 ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/ea081a88-7baf-472f-92ae-6d3698fb3550)

  -Après modification :

  ![3-2)Après modification ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/77314845-b15c-4031-9d30-ed2d353038c6)




## Partie 3 :Sécurité avec Spring security 
   # InMemory Authentication :

   -Après ajout de spring starter security (on recoit un mdp dans la console):
![1)Après ajout direct de spring starter security (on recoit un mdp dans la console)](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/74c45f90-e563-46d6-a9bb-c938c8870074)


   -Création de SecurityConfig:

![2)Creation de SecurityConfig](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/0e281ce7-1a5e-4785-9cac-f611c861994a)

   -on n'a pas l'accès car on n'a pas encore ajouté les users et les admins (+ on n'a pas donné l'accès à eux): 

![2-1)Not authorized to access ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/72ac7610-7f23-4a5d-a67b-58f155db77ac)

   -Un user authentifié :

![3)Un user authentifié ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/521af64e-ac6a-45f3-aba3-840742d070a5)

   -Lorsque un user essaie de supprimer ou modifier un patient :

![3-1)Lorsque un user essaie de supprimer ou modifier un patient](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/7bce9f39-9467-488b-9797-4870ddd27a18)

   -La vue de l'admin :

![4-1)Vue de l'admin ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/ba9f5987-b662-4d4c-9526-c8851078d16f)

   -La vue de l'user :

![4-2)Vue d'un user](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/2330a8a0-57bb-4d4c-a8bf-aac07b3fb75b)

   -Après améliorations , si un user tente de faire des actions d'admin :

![5)Si un user veut editer un patient ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/d7a32709-023e-46a5-b9fa-87513f0731e5)

   -Changement de la page Login et autoriser l'accès à bootstrap :

![6)Changer la login page et autoriser bootstrap ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/48334797-6031-4560-8802-26cfb7cdd057)

   -Nouvelle Login page :

![6-1)Nouvelle login page ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/3cf488b8-ecac-43df-a455-a3d583ae0ec9)

# JDBC Authentication:

   
   -Copier les commandes de création de nouvelles tables à partir de ce fichier dans les dépandances :
   
![1-1)Copier les commandes de création de nouvelles tables à partir de ce fichier dans les dépandances](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/26eb076e-69dd-4663-a0bf-089322eff59e)

   -Résultat :
![1-2)Résultat dans DB](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/a90cba2f-347d-4baf-ae23-028e789acf73)


 -Utiliser JDBC userdetails manager pour gérer les users et admin 
 
![2)Utiliser JDBC userdetails manager pour gérer les users et admin](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/9506e7ba-1180-4df3-8b55-ced54285d72b)

 -Table de users  :

 ![2-1)Résultat ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/a856975e-5b4e-4150-b102-6140b0f668f7)

-Table de authorities :

![2-2)Résultat dans la table authorities](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/1ee0e3c9-abd2-4dc3-a827-6ead42158e17)

-Tests d'authentifications :

![3-1)TEST](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/54c899b6-5a82-44a7-8a51-bb9e9a96d95c)

![3-2)TEST ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/1908a5ac-1b29-4cca-83be-e082049efa73)

![3-3)TEST 2](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/715d39b3-467e-4b88-8fcc-0e60d779737b)

![3-4)TEST 2](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribues_TP3/assets/159661363/fede04d3-6481-4906-a272-fe7d25cf9fb9)

 
