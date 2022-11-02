package com.example.demo;


import java.io.OutputStream;

import org.apache.jena.rdf.model.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    Model model = JenaEngine.readModel("data/electroSEBMAK.owl");





    @GetMapping("/chaud")
    @CrossOrigin(origins = "http://localhost:3000")
    public String afficherAliment() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_chaud.txt");
//            OutputStream res2 =  JenaEngine.executeQueryFile(inferedModel, "data/query_OrigineVegetale.txt");
//            OutputStream res3 =  JenaEngine.executeQueryFile(inferedModel, "data/query_Liquide.txt");

//            String res = res1.toString() + res2.toString() + res3.toString() ;

            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }
    @GetMapping("/froid")
    @CrossOrigin(origins = "http://localhost:3000")
    public String afficherFroid() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_froid.txt");
//            OutputStream res2 =  JenaEngine.executeQueryFile(inferedModel, "data/query_OrigineVegetale.txt");
//            OutputStream res3 =  JenaEngine.executeQueryFile(inferedModel, "data/query_Liquide.txt");

//            String res = res1.toString() + res2.toString() + res3.toString() ;

            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }






    @GetMapping("/recette")
    @CrossOrigin(origins = "http://localhost:3000")
    public String afficherRecette() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_recette.txt");
            System.out.println(res);


            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }


    @GetMapping("/liquide")
    @CrossOrigin(origins = "http://localhost:3000")
    public String afficherLiquide() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_Liquide.txt");
            System.out.println(res);


            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }



    @GetMapping("/animal")
    @CrossOrigin(origins = "http://localhost:3000")
    public String afficherAnimal() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_OrigineAnimal.txt");
            System.out.println(res);


            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }



    @GetMapping("/vegetal")
    @CrossOrigin(origins = "http://localhost:3000")
    public String afficherVegetal() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_OrigineVegetale.txt");
            System.out.println(res);


            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }



    @GetMapping("/plat")
    @CrossOrigin(origins = "http://localhost:3000")
    public String afficherPlat() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_Plat.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }


    @GetMapping("/ingredient")
    @CrossOrigin(origins = "http://localhost:3000")
    public String afficherIngredient() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_Ingredient.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }

    @GetMapping("/difficulte")
    @CrossOrigin(origins = "http://localhost:3000")
    public String afficherDifficulte() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_Difficulte.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }

    @GetMapping("/boutiques")
    @CrossOrigin(origins = "http://localhost:3000")
    public String getBoutiques() {
        if (model != null) {
            model.getNsPrefixURI("");
            Model inferredModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");
            OutputStream res =  JenaEngine.executeQueryFile(inferredModel, "data/query_boutique.txt");
            if(res != null) {
                System.out.println(res);
                return res.toString();
            }
            else {
                return ("No entities");
            }
        } else {
            return ("Error when reading model from ontology");
        }
    }

    @GetMapping("/drive-in")
    @CrossOrigin(origins = "http://localhost:3000")
    public String getDriveIn() {
        if (model != null) {
            model.getNsPrefixURI("");
            Model inferredModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");
            OutputStream res =  JenaEngine.executeQueryFile(inferredModel, "data/query_drive-in.txt");
            if(res != null) {
                System.out.println(res);
                return res.toString();
            }
            else {
                return ("No entities");
            }
        } else {
            return ("Error when reading model from ontology");
        }
    }

    @GetMapping("/superette")
    @CrossOrigin(origins = "http://localhost:3000")
    public String getSuperette() {
        if (model != null) {
            model.getNsPrefixURI("");
            Model inferredModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");
            OutputStream res =  JenaEngine.executeQueryFile(inferredModel, "data/query_superette.txt");
            if(res != null) {
                System.out.println(res);
                return res.toString();
            }
            else {
                return ("No entities");
            }
        } else {
            return ("Error when reading model from ontology");
        }
    }


}
