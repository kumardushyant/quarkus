package org.acme.quarkus.greeting.deployment;

import org.acme.quarkus.greeting.GreetingServlet;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.undertow.deployment.ServletBuildItem;

class QuarkusGreetingProcessor {

    private static final String FEATURE = "quarkus-greeting";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    ServletBuildItem createServlet() { 
      System.out.println("******* QuarkusGreetingProcessor : createServlet BuildStep ********");
      ServletBuildItem servletBuildItem = ServletBuildItem.builder("greeting", GreetingServlet.class.getName())
        .addMapping("/hello")
        .build(); 
      return servletBuildItem;
    }


}
