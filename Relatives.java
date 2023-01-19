package JavaThree;

import java.util.ArrayList;


public class Relatives {
    protected ArrayList<Person> children;
    protected ArrayList<Person> brothers;
    protected ArrayList<Person> sisters;

    {
        children = null;
        brothers = null;
        sisters = null;
    }

    public Relatives() {
        super();
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    public ArrayList<Person> getBrothers() {
        return brothers;
    }

    public void setBrothers(ArrayList<Person> brothers) {
        this.brothers = brothers;
    }

    public ArrayList<Person> getSisters() {
        return sisters;
    }

    public void setSisters(ArrayList<Person> sisters) {
        this.sisters = sisters;
    }
}