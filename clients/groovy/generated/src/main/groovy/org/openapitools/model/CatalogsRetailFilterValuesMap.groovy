package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class CatalogsRetailFilterValuesMap {
    
    List<String> adImageTags = new ArrayList<>()
    
    List<String> adVideoTags = new ArrayList<>()

    enum AvailabilityEnum {
    
        IN_STOCK("IN_STOCK"),
        
        OUT_OF_STOCK("OUT_OF_STOCK"),
        
        PREORDER("PREORDER"),
        
        UNAVAILABLE("UNAVAILABLE")
    
        private final String value
    
        AvailabilityEnum(String value) {
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

    
    List<AvailabilityEnum> availability = new ArrayList<>()
    
    List<String> brand = new ArrayList<>()

    enum ConditionEnum {
    
        NEW("NEW"),
        
        USED("USED"),
        
        REFURBISHED("REFURBISHED")
    
        private final String value
    
        ConditionEnum(String value) {
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

    
    List<ConditionEnum> condition = new ArrayList<>()
    
    List<String> customLabel0 = new ArrayList<>()
    
    List<String> customLabel1 = new ArrayList<>()
    
    List<String> customLabel2 = new ArrayList<>()
    
    List<String> customLabel3 = new ArrayList<>()
    
    List<String> customLabel4 = new ArrayList<>()

    enum GenderEnum {
    
        FEMALE("FEMALE"),
        
        MALE("MALE"),
        
        UNISEX("UNISEX")
    
        private final String value
    
        GenderEnum(String value) {
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

    
    List<GenderEnum> gender = new ArrayList<>()
    
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
    
    List<String> productType0 = new ArrayList<>()
    
    List<String> productType1 = new ArrayList<>()
    
    List<String> productType2 = new ArrayList<>()
    
    List<String> productType3 = new ArrayList<>()
    
    List<String> productType4 = new ArrayList<>()
}
