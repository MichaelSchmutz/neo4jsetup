package com.graph.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class DummyNodeChild {

    @Id
    @GeneratedValue
    private Long id;

    private String make;

    @Relationship(direction = "INCOMING")
    private DummyNodeParent dummyNodeParent;

    public DummyNodeChild(String make, String parent) {
        this.make = make;
        this.dummyNodeParent = new DummyNodeParent(parent);
    }
}
