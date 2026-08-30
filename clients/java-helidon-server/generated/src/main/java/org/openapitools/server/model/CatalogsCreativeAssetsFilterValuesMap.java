package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.MediaType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A map of filter attributes to their available values.
 */
public class CatalogsCreativeAssetsFilterValuesMap   {

    private List<String> customLabel0 = new ArrayList<>();
    private List<String> customLabel1 = new ArrayList<>();
    private List<String> customLabel2 = new ArrayList<>();
    private List<String> customLabel3 = new ArrayList<>();
    private List<String> customLabel4 = new ArrayList<>();
    private List<String> googleProductCategory0 = new ArrayList<>();
    private List<String> googleProductCategory1 = new ArrayList<>();
    private List<String> googleProductCategory2 = new ArrayList<>();
    private List<String> googleProductCategory3 = new ArrayList<>();
    private List<String> googleProductCategory4 = new ArrayList<>();
    private List<String> googleProductCategory5 = new ArrayList<>();
    private List<String> googleProductCategory6 = new ArrayList<>();
    private List<MediaType> mediaType = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CatalogsCreativeAssetsFilterValuesMap() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsCreativeAssetsFilterValuesMap.
     *
     * @param customLabel0 customLabel0
     * @param customLabel1 customLabel1
     * @param customLabel2 customLabel2
     * @param customLabel3 customLabel3
     * @param customLabel4 customLabel4
     * @param googleProductCategory0 googleProductCategory0
     * @param googleProductCategory1 googleProductCategory1
     * @param googleProductCategory2 googleProductCategory2
     * @param googleProductCategory3 googleProductCategory3
     * @param googleProductCategory4 googleProductCategory4
     * @param googleProductCategory5 googleProductCategory5
     * @param googleProductCategory6 googleProductCategory6
     * @param mediaType mediaType
     */
    public CatalogsCreativeAssetsFilterValuesMap(
        List<String> customLabel0, 
        List<String> customLabel1, 
        List<String> customLabel2, 
        List<String> customLabel3, 
        List<String> customLabel4, 
        List<String> googleProductCategory0, 
        List<String> googleProductCategory1, 
        List<String> googleProductCategory2, 
        List<String> googleProductCategory3, 
        List<String> googleProductCategory4, 
        List<String> googleProductCategory5, 
        List<String> googleProductCategory6, 
        List<MediaType> mediaType
    ) {
        this.customLabel0 = customLabel0;
        this.customLabel1 = customLabel1;
        this.customLabel2 = customLabel2;
        this.customLabel3 = customLabel3;
        this.customLabel4 = customLabel4;
        this.googleProductCategory0 = googleProductCategory0;
        this.googleProductCategory1 = googleProductCategory1;
        this.googleProductCategory2 = googleProductCategory2;
        this.googleProductCategory3 = googleProductCategory3;
        this.googleProductCategory4 = googleProductCategory4;
        this.googleProductCategory5 = googleProductCategory5;
        this.googleProductCategory6 = googleProductCategory6;
        this.mediaType = mediaType;
    }



    /**
     * Get customLabel0
     * @return customLabel0
     */
    public List<String> getCustomLabel0() {
        return customLabel0;
    }

    public void setCustomLabel0(List<String> customLabel0) {
        this.customLabel0 = customLabel0;
    }

    /**
     * Get customLabel1
     * @return customLabel1
     */
    public List<String> getCustomLabel1() {
        return customLabel1;
    }

    public void setCustomLabel1(List<String> customLabel1) {
        this.customLabel1 = customLabel1;
    }

    /**
     * Get customLabel2
     * @return customLabel2
     */
    public List<String> getCustomLabel2() {
        return customLabel2;
    }

    public void setCustomLabel2(List<String> customLabel2) {
        this.customLabel2 = customLabel2;
    }

    /**
     * Get customLabel3
     * @return customLabel3
     */
    public List<String> getCustomLabel3() {
        return customLabel3;
    }

    public void setCustomLabel3(List<String> customLabel3) {
        this.customLabel3 = customLabel3;
    }

    /**
     * Get customLabel4
     * @return customLabel4
     */
    public List<String> getCustomLabel4() {
        return customLabel4;
    }

    public void setCustomLabel4(List<String> customLabel4) {
        this.customLabel4 = customLabel4;
    }

    /**
     * Get googleProductCategory0
     * @return googleProductCategory0
     */
    public List<String> getGoogleProductCategory0() {
        return googleProductCategory0;
    }

    public void setGoogleProductCategory0(List<String> googleProductCategory0) {
        this.googleProductCategory0 = googleProductCategory0;
    }

    /**
     * Get googleProductCategory1
     * @return googleProductCategory1
     */
    public List<String> getGoogleProductCategory1() {
        return googleProductCategory1;
    }

    public void setGoogleProductCategory1(List<String> googleProductCategory1) {
        this.googleProductCategory1 = googleProductCategory1;
    }

    /**
     * Get googleProductCategory2
     * @return googleProductCategory2
     */
    public List<String> getGoogleProductCategory2() {
        return googleProductCategory2;
    }

    public void setGoogleProductCategory2(List<String> googleProductCategory2) {
        this.googleProductCategory2 = googleProductCategory2;
    }

    /**
     * Get googleProductCategory3
     * @return googleProductCategory3
     */
    public List<String> getGoogleProductCategory3() {
        return googleProductCategory3;
    }

    public void setGoogleProductCategory3(List<String> googleProductCategory3) {
        this.googleProductCategory3 = googleProductCategory3;
    }

    /**
     * Get googleProductCategory4
     * @return googleProductCategory4
     */
    public List<String> getGoogleProductCategory4() {
        return googleProductCategory4;
    }

    public void setGoogleProductCategory4(List<String> googleProductCategory4) {
        this.googleProductCategory4 = googleProductCategory4;
    }

    /**
     * Get googleProductCategory5
     * @return googleProductCategory5
     */
    public List<String> getGoogleProductCategory5() {
        return googleProductCategory5;
    }

    public void setGoogleProductCategory5(List<String> googleProductCategory5) {
        this.googleProductCategory5 = googleProductCategory5;
    }

    /**
     * Get googleProductCategory6
     * @return googleProductCategory6
     */
    public List<String> getGoogleProductCategory6() {
        return googleProductCategory6;
    }

    public void setGoogleProductCategory6(List<String> googleProductCategory6) {
        this.googleProductCategory6 = googleProductCategory6;
    }

    /**
     * Get mediaType
     * @return mediaType
     */
    public List<MediaType> getMediaType() {
        return mediaType;
    }

    public void setMediaType(List<MediaType> mediaType) {
        this.mediaType = mediaType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsCreativeAssetsFilterValuesMap {\n");
        
        sb.append("    customLabel0: ").append(toIndentedString(customLabel0)).append("\n");
        sb.append("    customLabel1: ").append(toIndentedString(customLabel1)).append("\n");
        sb.append("    customLabel2: ").append(toIndentedString(customLabel2)).append("\n");
        sb.append("    customLabel3: ").append(toIndentedString(customLabel3)).append("\n");
        sb.append("    customLabel4: ").append(toIndentedString(customLabel4)).append("\n");
        sb.append("    googleProductCategory0: ").append(toIndentedString(googleProductCategory0)).append("\n");
        sb.append("    googleProductCategory1: ").append(toIndentedString(googleProductCategory1)).append("\n");
        sb.append("    googleProductCategory2: ").append(toIndentedString(googleProductCategory2)).append("\n");
        sb.append("    googleProductCategory3: ").append(toIndentedString(googleProductCategory3)).append("\n");
        sb.append("    googleProductCategory4: ").append(toIndentedString(googleProductCategory4)).append("\n");
        sb.append("    googleProductCategory5: ").append(toIndentedString(googleProductCategory5)).append("\n");
        sb.append("    googleProductCategory6: ").append(toIndentedString(googleProductCategory6)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

