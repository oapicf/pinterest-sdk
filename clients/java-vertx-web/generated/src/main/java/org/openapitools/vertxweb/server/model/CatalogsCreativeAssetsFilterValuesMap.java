package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MediaType;

/**
 * A map of filter attributes to their available values.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public CatalogsCreativeAssetsFilterValuesMap () {

  }

  public CatalogsCreativeAssetsFilterValuesMap (List<String> customLabel0, List<String> customLabel1, List<String> customLabel2, List<String> customLabel3, List<String> customLabel4, List<String> googleProductCategory0, List<String> googleProductCategory1, List<String> googleProductCategory2, List<String> googleProductCategory3, List<String> googleProductCategory4, List<String> googleProductCategory5, List<String> googleProductCategory6, List<MediaType> mediaType) {
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

    
  @JsonProperty("custom_label_0")
  public List<String> getCustomLabel0() {
    return customLabel0;
  }
  public void setCustomLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
  }

    
  @JsonProperty("custom_label_1")
  public List<String> getCustomLabel1() {
    return customLabel1;
  }
  public void setCustomLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
  }

    
  @JsonProperty("custom_label_2")
  public List<String> getCustomLabel2() {
    return customLabel2;
  }
  public void setCustomLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
  }

    
  @JsonProperty("custom_label_3")
  public List<String> getCustomLabel3() {
    return customLabel3;
  }
  public void setCustomLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
  }

    
  @JsonProperty("custom_label_4")
  public List<String> getCustomLabel4() {
    return customLabel4;
  }
  public void setCustomLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
  }

    
  @JsonProperty("google_product_category_0")
  public List<String> getGoogleProductCategory0() {
    return googleProductCategory0;
  }
  public void setGoogleProductCategory0(List<String> googleProductCategory0) {
    this.googleProductCategory0 = googleProductCategory0;
  }

    
  @JsonProperty("google_product_category_1")
  public List<String> getGoogleProductCategory1() {
    return googleProductCategory1;
  }
  public void setGoogleProductCategory1(List<String> googleProductCategory1) {
    this.googleProductCategory1 = googleProductCategory1;
  }

    
  @JsonProperty("google_product_category_2")
  public List<String> getGoogleProductCategory2() {
    return googleProductCategory2;
  }
  public void setGoogleProductCategory2(List<String> googleProductCategory2) {
    this.googleProductCategory2 = googleProductCategory2;
  }

    
  @JsonProperty("google_product_category_3")
  public List<String> getGoogleProductCategory3() {
    return googleProductCategory3;
  }
  public void setGoogleProductCategory3(List<String> googleProductCategory3) {
    this.googleProductCategory3 = googleProductCategory3;
  }

    
  @JsonProperty("google_product_category_4")
  public List<String> getGoogleProductCategory4() {
    return googleProductCategory4;
  }
  public void setGoogleProductCategory4(List<String> googleProductCategory4) {
    this.googleProductCategory4 = googleProductCategory4;
  }

    
  @JsonProperty("google_product_category_5")
  public List<String> getGoogleProductCategory5() {
    return googleProductCategory5;
  }
  public void setGoogleProductCategory5(List<String> googleProductCategory5) {
    this.googleProductCategory5 = googleProductCategory5;
  }

    
  @JsonProperty("google_product_category_6")
  public List<String> getGoogleProductCategory6() {
    return googleProductCategory6;
  }
  public void setGoogleProductCategory6(List<String> googleProductCategory6) {
    this.googleProductCategory6 = googleProductCategory6;
  }

    
  @JsonProperty("media_type")
  public List<MediaType> getMediaType() {
    return mediaType;
  }
  public void setMediaType(List<MediaType> mediaType) {
    this.mediaType = mediaType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsFilterValuesMap catalogsCreativeAssetsFilterValuesMap = (CatalogsCreativeAssetsFilterValuesMap) o;
    return Objects.equals(customLabel0, catalogsCreativeAssetsFilterValuesMap.customLabel0) &&
        Objects.equals(customLabel1, catalogsCreativeAssetsFilterValuesMap.customLabel1) &&
        Objects.equals(customLabel2, catalogsCreativeAssetsFilterValuesMap.customLabel2) &&
        Objects.equals(customLabel3, catalogsCreativeAssetsFilterValuesMap.customLabel3) &&
        Objects.equals(customLabel4, catalogsCreativeAssetsFilterValuesMap.customLabel4) &&
        Objects.equals(googleProductCategory0, catalogsCreativeAssetsFilterValuesMap.googleProductCategory0) &&
        Objects.equals(googleProductCategory1, catalogsCreativeAssetsFilterValuesMap.googleProductCategory1) &&
        Objects.equals(googleProductCategory2, catalogsCreativeAssetsFilterValuesMap.googleProductCategory2) &&
        Objects.equals(googleProductCategory3, catalogsCreativeAssetsFilterValuesMap.googleProductCategory3) &&
        Objects.equals(googleProductCategory4, catalogsCreativeAssetsFilterValuesMap.googleProductCategory4) &&
        Objects.equals(googleProductCategory5, catalogsCreativeAssetsFilterValuesMap.googleProductCategory5) &&
        Objects.equals(googleProductCategory6, catalogsCreativeAssetsFilterValuesMap.googleProductCategory6) &&
        Objects.equals(mediaType, catalogsCreativeAssetsFilterValuesMap.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, googleProductCategory0, googleProductCategory1, googleProductCategory2, googleProductCategory3, googleProductCategory4, googleProductCategory5, googleProductCategory6, mediaType);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
