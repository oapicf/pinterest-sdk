package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A map of filter attributes to their available values.
 */
@ApiModel(description = "A map of filter attributes to their available values.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-31T04:52:33.064583645Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsCreativeAssetsFilterValuesMap   {
  @JsonProperty("custom_label_0")
  private List<String> customLabel0 = null;

  @JsonProperty("custom_label_1")
  private List<String> customLabel1 = null;

  @JsonProperty("custom_label_2")
  private List<String> customLabel2 = null;

  @JsonProperty("custom_label_3")
  private List<String> customLabel3 = null;

  @JsonProperty("custom_label_4")
  private List<String> customLabel4 = null;

  @JsonProperty("google_product_category_0")
  private List<String> googleProductCategory0 = null;

  @JsonProperty("google_product_category_1")
  private List<String> googleProductCategory1 = null;

  @JsonProperty("google_product_category_2")
  private List<String> googleProductCategory2 = null;

  @JsonProperty("google_product_category_3")
  private List<String> googleProductCategory3 = null;

  @JsonProperty("google_product_category_4")
  private List<String> googleProductCategory4 = null;

  @JsonProperty("google_product_category_5")
  private List<String> googleProductCategory5 = null;

  @JsonProperty("google_product_category_6")
  private List<String> googleProductCategory6 = null;

  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    IMAGE("IMAGE"),
    
    VIDEO("VIDEO");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MediaTypeEnum fromValue(String text) {
      for (MediaTypeEnum b : MediaTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("media_type")
  private List<MediaTypeEnum> mediaType = null;

  public CatalogsCreativeAssetsFilterValuesMap customLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

  public CatalogsCreativeAssetsFilterValuesMap addCustomLabel0Item(String customLabel0Item) {
    if (this.customLabel0 == null) {
      this.customLabel0 = new ArrayList<>();
    }
    this.customLabel0.add(customLabel0Item);
    return this;
  }

   /**
   * Get customLabel0
   * @return customLabel0
  **/
  @ApiModelProperty(value = "")
  public List<String> getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public CatalogsCreativeAssetsFilterValuesMap customLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

  public CatalogsCreativeAssetsFilterValuesMap addCustomLabel1Item(String customLabel1Item) {
    if (this.customLabel1 == null) {
      this.customLabel1 = new ArrayList<>();
    }
    this.customLabel1.add(customLabel1Item);
    return this;
  }

   /**
   * Get customLabel1
   * @return customLabel1
  **/
  @ApiModelProperty(value = "")
  public List<String> getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public CatalogsCreativeAssetsFilterValuesMap customLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

  public CatalogsCreativeAssetsFilterValuesMap addCustomLabel2Item(String customLabel2Item) {
    if (this.customLabel2 == null) {
      this.customLabel2 = new ArrayList<>();
    }
    this.customLabel2.add(customLabel2Item);
    return this;
  }

   /**
   * Get customLabel2
   * @return customLabel2
  **/
  @ApiModelProperty(value = "")
  public List<String> getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public CatalogsCreativeAssetsFilterValuesMap customLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

  public CatalogsCreativeAssetsFilterValuesMap addCustomLabel3Item(String customLabel3Item) {
    if (this.customLabel3 == null) {
      this.customLabel3 = new ArrayList<>();
    }
    this.customLabel3.add(customLabel3Item);
    return this;
  }

   /**
   * Get customLabel3
   * @return customLabel3
  **/
  @ApiModelProperty(value = "")
  public List<String> getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public CatalogsCreativeAssetsFilterValuesMap customLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

  public CatalogsCreativeAssetsFilterValuesMap addCustomLabel4Item(String customLabel4Item) {
    if (this.customLabel4 == null) {
      this.customLabel4 = new ArrayList<>();
    }
    this.customLabel4.add(customLabel4Item);
    return this;
  }

   /**
   * Get customLabel4
   * @return customLabel4
  **/
  @ApiModelProperty(value = "")
  public List<String> getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public CatalogsCreativeAssetsFilterValuesMap googleProductCategory0(List<String> googleProductCategory0) {
    this.googleProductCategory0 = googleProductCategory0;
    return this;
  }

  public CatalogsCreativeAssetsFilterValuesMap addGoogleProductCategory0Item(String googleProductCategory0Item) {
    if (this.googleProductCategory0 == null) {
      this.googleProductCategory0 = new ArrayList<>();
    }
    this.googleProductCategory0.add(googleProductCategory0Item);
    return this;
  }

   /**
   * Get googleProductCategory0
   * @return googleProductCategory0
  **/
  @ApiModelProperty(value = "")
  public List<String> getGoogleProductCategory0() {
    return googleProductCategory0;
  }

  public void setGoogleProductCategory0(List<String> googleProductCategory0) {
    this.googleProductCategory0 = googleProductCategory0;
  }

  public CatalogsCreativeAssetsFilterValuesMap googleProductCategory1(List<String> googleProductCategory1) {
    this.googleProductCategory1 = googleProductCategory1;
    return this;
  }

  public CatalogsCreativeAssetsFilterValuesMap addGoogleProductCategory1Item(String googleProductCategory1Item) {
    if (this.googleProductCategory1 == null) {
      this.googleProductCategory1 = new ArrayList<>();
    }
    this.googleProductCategory1.add(googleProductCategory1Item);
    return this;
  }

   /**
   * Get googleProductCategory1
   * @return googleProductCategory1
  **/
  @ApiModelProperty(value = "")
  public List<String> getGoogleProductCategory1() {
    return googleProductCategory1;
  }

  public void setGoogleProductCategory1(List<String> googleProductCategory1) {
    this.googleProductCategory1 = googleProductCategory1;
  }

  public CatalogsCreativeAssetsFilterValuesMap googleProductCategory2(List<String> googleProductCategory2) {
    this.googleProductCategory2 = googleProductCategory2;
    return this;
  }

  public CatalogsCreativeAssetsFilterValuesMap addGoogleProductCategory2Item(String googleProductCategory2Item) {
    if (this.googleProductCategory2 == null) {
      this.googleProductCategory2 = new ArrayList<>();
    }
    this.googleProductCategory2.add(googleProductCategory2Item);
    return this;
  }

   /**
   * Get googleProductCategory2
   * @return googleProductCategory2
  **/
  @ApiModelProperty(value = "")
  public List<String> getGoogleProductCategory2() {
    return googleProductCategory2;
  }

  public void setGoogleProductCategory2(List<String> googleProductCategory2) {
    this.googleProductCategory2 = googleProductCategory2;
  }

  public CatalogsCreativeAssetsFilterValuesMap googleProductCategory3(List<String> googleProductCategory3) {
    this.googleProductCategory3 = googleProductCategory3;
    return this;
  }

  public CatalogsCreativeAssetsFilterValuesMap addGoogleProductCategory3Item(String googleProductCategory3Item) {
    if (this.googleProductCategory3 == null) {
      this.googleProductCategory3 = new ArrayList<>();
    }
    this.googleProductCategory3.add(googleProductCategory3Item);
    return this;
  }

   /**
   * Get googleProductCategory3
   * @return googleProductCategory3
  **/
  @ApiModelProperty(value = "")
  public List<String> getGoogleProductCategory3() {
    return googleProductCategory3;
  }

  public void setGoogleProductCategory3(List<String> googleProductCategory3) {
    this.googleProductCategory3 = googleProductCategory3;
  }

  public CatalogsCreativeAssetsFilterValuesMap googleProductCategory4(List<String> googleProductCategory4) {
    this.googleProductCategory4 = googleProductCategory4;
    return this;
  }

  public CatalogsCreativeAssetsFilterValuesMap addGoogleProductCategory4Item(String googleProductCategory4Item) {
    if (this.googleProductCategory4 == null) {
      this.googleProductCategory4 = new ArrayList<>();
    }
    this.googleProductCategory4.add(googleProductCategory4Item);
    return this;
  }

   /**
   * Get googleProductCategory4
   * @return googleProductCategory4
  **/
  @ApiModelProperty(value = "")
  public List<String> getGoogleProductCategory4() {
    return googleProductCategory4;
  }

  public void setGoogleProductCategory4(List<String> googleProductCategory4) {
    this.googleProductCategory4 = googleProductCategory4;
  }

  public CatalogsCreativeAssetsFilterValuesMap googleProductCategory5(List<String> googleProductCategory5) {
    this.googleProductCategory5 = googleProductCategory5;
    return this;
  }

  public CatalogsCreativeAssetsFilterValuesMap addGoogleProductCategory5Item(String googleProductCategory5Item) {
    if (this.googleProductCategory5 == null) {
      this.googleProductCategory5 = new ArrayList<>();
    }
    this.googleProductCategory5.add(googleProductCategory5Item);
    return this;
  }

   /**
   * Get googleProductCategory5
   * @return googleProductCategory5
  **/
  @ApiModelProperty(value = "")
  public List<String> getGoogleProductCategory5() {
    return googleProductCategory5;
  }

  public void setGoogleProductCategory5(List<String> googleProductCategory5) {
    this.googleProductCategory5 = googleProductCategory5;
  }

  public CatalogsCreativeAssetsFilterValuesMap googleProductCategory6(List<String> googleProductCategory6) {
    this.googleProductCategory6 = googleProductCategory6;
    return this;
  }

  public CatalogsCreativeAssetsFilterValuesMap addGoogleProductCategory6Item(String googleProductCategory6Item) {
    if (this.googleProductCategory6 == null) {
      this.googleProductCategory6 = new ArrayList<>();
    }
    this.googleProductCategory6.add(googleProductCategory6Item);
    return this;
  }

   /**
   * Get googleProductCategory6
   * @return googleProductCategory6
  **/
  @ApiModelProperty(value = "")
  public List<String> getGoogleProductCategory6() {
    return googleProductCategory6;
  }

  public void setGoogleProductCategory6(List<String> googleProductCategory6) {
    this.googleProductCategory6 = googleProductCategory6;
  }

  public CatalogsCreativeAssetsFilterValuesMap mediaType(List<MediaTypeEnum> mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  public CatalogsCreativeAssetsFilterValuesMap addMediaTypeItem(MediaTypeEnum mediaTypeItem) {
    if (this.mediaType == null) {
      this.mediaType = new ArrayList<>();
    }
    this.mediaType.add(mediaTypeItem);
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @ApiModelProperty(value = "")
  public List<MediaTypeEnum> getMediaType() {
    return mediaType;
  }

  public void setMediaType(List<MediaTypeEnum> mediaType) {
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
    return Objects.equals(this.customLabel0, catalogsCreativeAssetsFilterValuesMap.customLabel0) &&
        Objects.equals(this.customLabel1, catalogsCreativeAssetsFilterValuesMap.customLabel1) &&
        Objects.equals(this.customLabel2, catalogsCreativeAssetsFilterValuesMap.customLabel2) &&
        Objects.equals(this.customLabel3, catalogsCreativeAssetsFilterValuesMap.customLabel3) &&
        Objects.equals(this.customLabel4, catalogsCreativeAssetsFilterValuesMap.customLabel4) &&
        Objects.equals(this.googleProductCategory0, catalogsCreativeAssetsFilterValuesMap.googleProductCategory0) &&
        Objects.equals(this.googleProductCategory1, catalogsCreativeAssetsFilterValuesMap.googleProductCategory1) &&
        Objects.equals(this.googleProductCategory2, catalogsCreativeAssetsFilterValuesMap.googleProductCategory2) &&
        Objects.equals(this.googleProductCategory3, catalogsCreativeAssetsFilterValuesMap.googleProductCategory3) &&
        Objects.equals(this.googleProductCategory4, catalogsCreativeAssetsFilterValuesMap.googleProductCategory4) &&
        Objects.equals(this.googleProductCategory5, catalogsCreativeAssetsFilterValuesMap.googleProductCategory5) &&
        Objects.equals(this.googleProductCategory6, catalogsCreativeAssetsFilterValuesMap.googleProductCategory6) &&
        Objects.equals(this.mediaType, catalogsCreativeAssetsFilterValuesMap.mediaType);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

