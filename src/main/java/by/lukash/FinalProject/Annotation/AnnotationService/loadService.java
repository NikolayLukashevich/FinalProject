package by.lukash.FinalProject.Annotation.AnnotationService;


import java.util.HashMap;
import java.util.Map;


public class loadService {
    static Map <String, Object> serviceMap = new HashMap<>();

    for(Map.Entry <String, Object> entry : serviceMap.entrySet ()) {
        inspectService(entry.getValue().getClass());
    }


}
