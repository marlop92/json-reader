package pl.mlopatka.model;

public class Upper {

    private String name;
    private Inner inner;

    public Upper() {
    }

    public Upper(String name, Inner inner) {
        this.name = name;
        this.inner = inner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inner getInner() {
        return inner;
    }

    public void setInner(Inner inner) {
        this.inner = inner;
    }

    @Override
    public String toString() {
        return "Upper{" +
                "name='" + name + '\'' +
                ", inner=" + inner +
                '}';
    }
}
