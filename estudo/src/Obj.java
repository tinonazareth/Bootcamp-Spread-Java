public class Obj {
    Integer num;
    public void setNum(Integer num){
        this.num = num;
    }

    public Obj(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}
