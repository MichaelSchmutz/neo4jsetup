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

        baeldung.setCar(tesla);
        session.save(baeldung);
    }


//    private void printGreeting() {
//        try ( Session session = driver.session() )
//        {
//            String greeting = session.writeTransaction( new TransactionWork<String>()
//            {
//                @Override
//                public String execute( Transaction tx )
//                {
//                    StatementResult result = tx.run( "CREATE (a:Greeting) " +
//                                    "SET a.message = $message " +
//                                    "RETURN a.message + ', from node ' + id(a)",
//                            parameters( "message", "hello, world") );
//                    return result.single().get( 0 ).asString();
//                }
//            } );
//            System.out.println( greeting );
//        }
//    }

    public static void main( String... args ) {
        Example greeter = new Example();
    }
}