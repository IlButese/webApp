package index;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("test") //mangai test
public class Test {
	@GET//rispondo alle get
	//annotazioni la @ cambaire comportamento codice senza doverlo scrivere direttamente
	@Path("{name}")//e vede il name ed è un parametro tra {}
	public String test(@PathParam("name") String name) {
		return "Ciao " + name.toUpperCase();
	}
	//le annoazioni ti dicono questa classe verr autilizzata per un uso specifico
} 