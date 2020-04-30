package by.lukash.FinalProject.Annotation.AnnotationService;

import by.lukash.FinalProject.Annotation.Annotation.Init;
import by.lukash.FinalProject.Annotation.Annotation.Service;

import java.lang.reflect.Method;

public class inspectService {
    public static void inspectService(Class<?> service) {
        if (service.isAnnotationPresent(Service.class)) {
            Service annotationsService = service.getAnnotation(Service.class);
            System.out.println(annotationsService.toString());

            Method[] methods = service.getMethods();
            for (Method method : methods){
                if (method.isAnnotationPresent(Init.class)){
                    System.out.println("[INFO] @Init is present on method" + method);
                } else {
                    System.out.println("[WARNING] @Init not found on method = " + method);
                }
            }
        }
    }
}
