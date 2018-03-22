package com.graph.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class DummyNodeParent {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Relationship(type="owns")
    private DummyNodeChild dummyNodeChild;

    public DummyNodeParent(String name) {
        this.name = name;
    }

    public void setChild(DummyNodeChild child) {
        this.dummyNodeChild = child;
    }
}
