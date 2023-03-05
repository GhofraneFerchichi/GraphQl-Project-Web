package com.esprit.graphql;



import javax.servlet.annotation.WebServlet;


import com.coxautodev.graphql.tools.SchemaParser;

import com.esprit.repository.StudentRepository;

import graphql.schema.GraphQLSchema;

import graphql.servlet.SimpleGraphQLServlet;



@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    public GraphQLEndpoint() {
        super(buildSchema());
    }

    private static GraphQLSchema buildSchema() {
        StudentRepository studentRepository = new StudentRepository();
        return SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(new Query(studentRepository), new Mutation(studentRepository))
                .build()
                .makeExecutableSchema();
    }



}
