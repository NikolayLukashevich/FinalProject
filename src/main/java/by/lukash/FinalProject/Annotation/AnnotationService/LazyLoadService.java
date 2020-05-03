package by.lukash.FinalProject.Annotation.AnnotationService;

import by.lukash.FinalProject.Annotation.Annotation.Init;
import by.lukash.FinalProject.Annotation.Annotation.Service;

@Service(name = "Lazy", lazyload = true)
public class LazyLoadService {
    @Init(name = "init Lazy Load Service")
    public void initService (){
        System.out.println("LazyLoadService.initService() initialization begin");
    }
    @Override
    public String toString () {
        return this.getClass().getName();
    }
}
