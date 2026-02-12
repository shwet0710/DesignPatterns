package org.example;

import java.util.ArrayList;
import java.util.List;

public class ResourceManager {
    private static volatile ResourceManager resourceManager = null;
    List<Resource> freeResources = new ArrayList<>();
    List<Resource> inUseResources = new ArrayList<>();
    int INITIAL_SIZE = 3;
    int MAX_SIZE = 5;

    private ResourceManager() {
        for(int i=0;i<INITIAL_SIZE;i++) {
            freeResources.add(new Resource());
        }
    }

    public static ResourceManager getInstance() {
        if(resourceManager==null) {
            synchronized (ResourceManager.class) {
                if(resourceManager==null) {
                    resourceManager = new ResourceManager();
                }
            }
        }
        return resourceManager;
    }

    public synchronized Resource getResources() {
        Resource resource1 = null;
        if(freeResources.isEmpty() && inUseResources.size()<MAX_SIZE) {
            System.out.println("adding in free list");
            freeResources.add(new Resource());
        } else if(freeResources.isEmpty() && inUseResources.size()>=MAX_SIZE) {
            System.out.println("not free");
            return null;
        }
        resource1 = freeResources.remove(freeResources.size()-1);
        inUseResources.add(resource1);
        System.out.println("retrieved from free list and added in inUse list");
        return resource1;
    }

    public synchronized void releaseResource(Resource resource) {
        if(resource!=null) {
            inUseResources.remove(inUseResources.size()-1);
            freeResources.add(resource);
            System.out.println("removed and added in free list");
        } else {
            System.out.println("cannot remove as it is null");
        }
    }

}
