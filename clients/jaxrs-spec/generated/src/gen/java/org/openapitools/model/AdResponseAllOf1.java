package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PinPromotionSummaryStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AdResponse_allOf_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-07T06:42:49.569940Z[Etc/UTC]")public class AdResponseAllOf1   {
  
  private @Valid String adAccountId;
  private @Valid String campaignId;
  private @Valid String collectionItemsDestinationUrlTemplate;
  private @Valid Integer createdTime;
  private @Valid String id;

public enum RejectedReasonsEnum {

    HASHTAGS(String.valueOf("HASHTAGS")), PROMOTIONS_AND_PRICES(String.valueOf("PROMOTIONS_AND_PRICES")), TARGETING(String.valueOf("TARGETING")), LANDING_PAGE(String.valueOf("LANDING_PAGE")), CAPS_AND_SYMBOLS(String.valueOf("CAPS_AND_SYMBOLS")), SHOCKING(String.valueOf("SHOCKING")), WEIGHT_LOSS(String.valueOf("WEIGHT_LOSS")), PROHIBITED_PRODUCT(String.valueOf("PROHIBITED_PRODUCT")), AUTHENTICITY(String.valueOf("AUTHENTICITY")), NUDITY(String.valueOf("NUDITY")), CONFUSING_DESIGN(String.valueOf("CONFUSING_DESIGN")), URGENCY(String.valueOf("URGENCY")), RATINGS(String.valueOf("RATINGS")), APP(String.valueOf("APP")), ALCOHOL(String.valueOf("ALCOHOL")), CONTESTS(String.valueOf("CONTESTS")), POLITICAL(String.valueOf("POLITICAL")), OTHER(String.valueOf("OTHER")), IMAGE(String.valueOf("IMAGE")), NAR(String.valueOf("NAR")), INCONSISTENT(String.valueOf("INCONSISTENT")), CLICKBAIT(String.valueOf("CLICKBAIT")), NO_DESCRIPTION(String.valueOf("NO_DESCRIPTION")), LOW_QUALITY(String.valueOf("LOW_QUALITY")), EXAGGERATED_CLAIMS(String.valueOf("EXAGGERATED_CLAIMS")), PINTEREST_BRAND(String.valueOf("PINTEREST_BRAND")), ALCOHOL_NO_SALE(String.valueOf("ALCOHOL_NO_SALE")), LANDING_PAGE_SPEED(String.valueOf("LANDING_PAGE_SPEED")), LANDING_PAGE_HARDWALL(String.valueOf("LANDING_PAGE_HARDWALL")), LANDING_PAGE_BROKEN(String.valueOf("LANDING_PAGE_BROKEN")), LANDING_PAGE_QUALITY(String.valueOf("LANDING_PAGE_QUALITY")), OUT_OF_STOCK(String.valueOf("OUT_OF_STOCK")), IMAGE_LOW_QUALITY(String.valueOf("IMAGE_LOW_QUALITY")), IMAGE_BUSY(String.valueOf("IMAGE_BUSY")), IMAGE_POORLY_EDITED(String.valueOf("IMAGE_POORLY_EDITED")), IMAGE_BEFORE_AFTER(String.valueOf("IMAGE_BEFORE_AFTER")), UGC(String.valueOf("UGC")), FAKE_BUTTONS(String.valueOf("FAKE_BUTTONS")), WEAPONS(String.valueOf("WEAPONS")), SENSITIVE(String.valueOf("SENSITIVE")), UNACCEPTABLE_BUSINESS(String.valueOf("UNACCEPTABLE_BUSINESS")), SUSPICIOUS_CLAIMS(String.valueOf("SUSPICIOUS_CLAIMS")), PHARMA(String.valueOf("PHARMA")), SUSPICIOUS_SUPPLEMENTS(String.valueOf("SUSPICIOUS_SUPPLEMENTS")), ILLEGAL_RECREATIONAL_DRUG(String.valueOf("ILLEGAL_RECREATIONAL_DRUG")), LOW_QUALITY_LANDING_PAGE(String.valueOf("LOW_QUALITY_LANDING_PAGE")), RESTRICTED_HEALTHCARE(String.valueOf("RESTRICTED_HEALTHCARE")), INCONSISTENT_LANG_FR(String.valueOf("INCONSISTENT_LANG_FR"));


    private String value;

    RejectedReasonsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static RejectedReasonsEnum fromValue(String value) {
        for (RejectedReasonsEnum b : RejectedReasonsEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid List<RejectedReasonsEnum> rejectedReasons = new ArrayList<RejectedReasonsEnum>();
  private @Valid List<String> rejectionLabels = new ArrayList<String>();

public enum ReviewStatusEnum {

    OTHER(String.valueOf("OTHER")), PENDING(String.valueOf("PENDING")), REJECTED(String.valueOf("REJECTED")), APPROVED(String.valueOf("APPROVED"));


    private String value;

    ReviewStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ReviewStatusEnum fromValue(String value) {
        for (ReviewStatusEnum b : ReviewStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid ReviewStatusEnum reviewStatus;
  private @Valid String type;
  private @Valid Integer updatedTime;
  private @Valid PinPromotionSummaryStatus summaryStatus;

  /**
   * The ID of the advertiser that this ad belongs to.
   **/
  public AdResponseAllOf1 adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  

  
  @ApiModelProperty(example = "549755885175", value = "The ID of the advertiser that this ad belongs to.")
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

/**
   * ID of the ad campaign that contains this ad.
   **/
  public AdResponseAllOf1 campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  

  
  @ApiModelProperty(example = "626735565838", value = "ID of the ad campaign that contains this ad.")
  @JsonProperty("campaign_id")
 @Pattern(regexp="^\\d+$")  public String getCampaignId() {
    return campaignId;
  }

  @JsonProperty("campaign_id")
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

/**
   * Destination URL template for all items within a collections drawer.
   **/
  public AdResponseAllOf1 collectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
    return this;
  }

  

  
  @ApiModelProperty(value = "Destination URL template for all items within a collections drawer.")
  @JsonProperty("collection_items_destination_url_template")
  public String getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }

  @JsonProperty("collection_items_destination_url_template")
  public void setCollectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

/**
   * Pin creation time. Unix timestamp in seconds.
   **/
  public AdResponseAllOf1 createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  

  
  @ApiModelProperty(example = "1451431341", value = "Pin creation time. Unix timestamp in seconds.")
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  @JsonProperty("created_time")
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

/**
   * The ID of this ad.
   **/
  public AdResponseAllOf1 id(String id) {
    this.id = id;
    return this;
  }

  

  
  @ApiModelProperty(example = "687195134316", value = "The ID of this ad.")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

/**
   * Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
   **/
  public AdResponseAllOf1 rejectedReasons(List<RejectedReasonsEnum> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
    return this;
  }

  

  
  @ApiModelProperty(value = "Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".")
  @JsonProperty("rejected_reasons")
  public List<RejectedReasonsEnum> getRejectedReasons() {
    return rejectedReasons;
  }

  @JsonProperty("rejected_reasons")
  public void setRejectedReasons(List<RejectedReasonsEnum> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
  }

  public AdResponseAllOf1 addRejectedReasonsItem(RejectedReasonsEnum rejectedReasonsItem) {
    if (this.rejectedReasons == null) {
      this.rejectedReasons = new ArrayList<RejectedReasonsEnum>();
    }

    this.rejectedReasons.add(rejectedReasonsItem);
    return this;
  }

  public AdResponseAllOf1 removeRejectedReasonsItem(RejectedReasonsEnum rejectedReasonsItem) {
    if (rejectedReasonsItem != null && this.rejectedReasons != null) {
      this.rejectedReasons.remove(rejectedReasonsItem);
    }

    return this;
  }
/**
   * Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
   **/
  public AdResponseAllOf1 rejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
    return this;
  }

  

  
  @ApiModelProperty(value = "Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".")
  @JsonProperty("rejection_labels")
  public List<String> getRejectionLabels() {
    return rejectionLabels;
  }

  @JsonProperty("rejection_labels")
  public void setRejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
  }

  public AdResponseAllOf1 addRejectionLabelsItem(String rejectionLabelsItem) {
    if (this.rejectionLabels == null) {
      this.rejectionLabels = new ArrayList<String>();
    }

    this.rejectionLabels.add(rejectionLabelsItem);
    return this;
  }

  public AdResponseAllOf1 removeRejectionLabelsItem(String rejectionLabelsItem) {
    if (rejectionLabelsItem != null && this.rejectionLabels != null) {
      this.rejectionLabels.remove(rejectionLabelsItem);
    }

    return this;
  }
/**
   * Ad review status
   **/
  public AdResponseAllOf1 reviewStatus(ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

  

  
  @ApiModelProperty(example = "PENDING", value = "Ad review status")
  @JsonProperty("review_status")
  public ReviewStatusEnum getReviewStatus() {
    return reviewStatus;
  }

  @JsonProperty("review_status")
  public void setReviewStatus(ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

/**
   * Always \&quot;ad\&quot;.
   **/
  public AdResponseAllOf1 type(String type) {
    this.type = type;
    return this;
  }

  

  
  @ApiModelProperty(example = "pinpromotion", value = "Always \"ad\".")
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

/**
   * Last update time. Unix timestamp in seconds.
   **/
  public AdResponseAllOf1 updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  

  
  @ApiModelProperty(example = "1451431341", value = "Last update time. Unix timestamp in seconds.")
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  @JsonProperty("updated_time")
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

/**
   * Ad summary status
   **/
  public AdResponseAllOf1 summaryStatus(PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

  

  
  @ApiModelProperty(value = "Ad summary status")
  @JsonProperty("summary_status")
  public PinPromotionSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  @JsonProperty("summary_status")
  public void setSummaryStatus(PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdResponseAllOf1 adResponseAllOf1 = (AdResponseAllOf1) o;
    return Objects.equals(this.adAccountId, adResponseAllOf1.adAccountId) &&
        Objects.equals(this.campaignId, adResponseAllOf1.campaignId) &&
        Objects.equals(this.collectionItemsDestinationUrlTemplate, adResponseAllOf1.collectionItemsDestinationUrlTemplate) &&
        Objects.equals(this.createdTime, adResponseAllOf1.createdTime) &&
        Objects.equals(this.id, adResponseAllOf1.id) &&
        Objects.equals(this.rejectedReasons, adResponseAllOf1.rejectedReasons) &&
        Objects.equals(this.rejectionLabels, adResponseAllOf1.rejectionLabels) &&
        Objects.equals(this.reviewStatus, adResponseAllOf1.reviewStatus) &&
        Objects.equals(this.type, adResponseAllOf1.type) &&
        Objects.equals(this.updatedTime, adResponseAllOf1.updatedTime) &&
        Objects.equals(this.summaryStatus, adResponseAllOf1.summaryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, campaignId, collectionItemsDestinationUrlTemplate, createdTime, id, rejectedReasons, rejectionLabels, reviewStatus, type, updatedTime, summaryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdResponseAllOf1 {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    collectionItemsDestinationUrlTemplate: ").append(toIndentedString(collectionItemsDestinationUrlTemplate)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rejectedReasons: ").append(toIndentedString(rejectedReasons)).append("\n");
    sb.append("    rejectionLabels: ").append(toIndentedString(rejectionLabels)).append("\n");
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
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

