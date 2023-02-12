package task08;

public class notbook {
    String maker;
    Integer ram;
    Integer memory;
    String os;
    String color;

    @Override
    public String toString() {
        return String.format("Производитель-%s, ОЗУ-%d, Память ЖД-%d, Операционная система-%s, Цвет-%s", maker, ram, memory, os, color);
    }

    public String filterRam(int choce){
        if(choce == ram){
            return toString();
        }
        return null;
    }

    public String filterMemory(int choce) {
        if(choce == memory){
            return toString();
        }
        return null;
    }

    public String filterOs(String string) {
        if(string.equals(os)){
            return toString();
        }
        return null;
    }

    public String filterColor(String string) {
        if(string.equals(color)){
            return toString();
        }
        return null;
    }
}
