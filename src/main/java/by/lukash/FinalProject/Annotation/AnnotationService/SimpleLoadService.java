package by.lukash.FinalProject.Annotation.AnnotationService;

import by.lukash.FinalProject.Annotation.Annotation.Init;
import by.lukash.FinalProject.Annotation.Annotation.Service;

@Service(name = "Simple", lazyload = false)
public class SimpleLoadService {
    @Init(name = "init Simple Load Service")
    public void initService() {
        System.out.println("SimpleLoadService.initService() initialization begin");
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
