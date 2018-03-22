import com.graph.client.Neo4jSessionFactory;
import com.graph.domain.DummyNodeChild;
import com.graph.domain.DummyNodeParent;
import org.neo4j.ogm.session.Session;

public class Example {

    private Example() {

        Neo4jSessionFactory factory = Neo4jSessionFactory.getInstance();

        Session session = factory.getNeo4jSession();

        DummyNodeChild tesla = new DummyNodeChild("tesla", "modelS");
        DummyNodeParent baeldung = new DummyNodeParent("baeldung");

        baeldung.setChild(tesla);
        session.save(baeldung);
    }

    public static void main( String... args ) {
        new Example();
    }
}