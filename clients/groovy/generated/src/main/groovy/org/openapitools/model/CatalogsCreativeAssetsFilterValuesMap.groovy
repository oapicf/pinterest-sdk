package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class CatalogsCreativeAssetsFilterValuesMap {
    
    List<String> customLabel0 = new ArrayList<>()
    
    List<String> customLabel1 = new ArrayList<>()
    
    List<String> customLabel2 = new ArrayList<>()
    
    List<String> customLabel3 = new ArrayList<>()
    
    List<String> customLabel4 = new ArrayList<>()
    
    List<String> googleProductCategory0 = new ArrayList<>()
    
    List<String> googleProductCategory1 = new ArrayList<>()
    
    List<String> googleProductCategory2 = new ArrayList<>()
    
    List<String> googleProductCategory3 = new ArrayList<>()
    
    List<String> googleProductCategory4 = new ArrayList<>()
    
    List<String> googleProductCategory5 = new ArrayList<>()
    
    List<String> googleProductCategory6 = new ArrayList<>()

    enum MediaTypeEnum {
    
        IMAGE("IMAGE"),
        
        VIDEO("VIDEO")
    
        private final String value
    
        MediaTypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    List<MediaTypeEnum> mediaType = new ArrayList<>()
}
