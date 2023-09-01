package ru.geekbrains.lesson1.store3D.models;

import java.util.ArrayList;
import java.util.List;

public class Scene {

    //TODO: Доработать в рамках ДР - выполнено

    private int id;

    private List<PoligonalModel> models= new ArrayList<>();

    private List<Flash> flashes = new ArrayList<>();
    private  List<Camera> cameras = new ArrayList<>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Scene(int id, List<PoligonalModel> models, List<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.cameras = cameras;
    }

    public int getId() {
        return id;
    }

    public List<PoligonalModel> getModels() {
        return models;
    }

    public List<Flash> getFlashes() {
        return flashes;
    }

    public List<Camera> getCameras() {
        return cameras;
    }

    public boolean method1(int id){
        return true;
    }

    public List<Flash> method2(List<Flash> flashes1, List<Flash> flashes2){
        List<Flash> outFlashes  = new ArrayList<>();
        return outFlashes;
    }


}
