package hello.proxy.pureproxy.proxy.code;

public class ProxyPetternClient {

    private Subject subject;

    public ProxyPetternClient(Subject subject) {
        this.subject = subject;
    }

    public void execute() {
        subject.operation();
    }
}
