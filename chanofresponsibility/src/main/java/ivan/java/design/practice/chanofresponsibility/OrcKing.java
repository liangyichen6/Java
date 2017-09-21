package ivan.java.design.practice.chanofresponsibility;

public class OrcKing {

	RequestHandler chain;

	public OrcKing() {
		this.buildChain();
	}

	private void buildChain() {
		chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
	}

	public void makeRequest(Request req) {
		chain.handleRequest(req);
	}
}
