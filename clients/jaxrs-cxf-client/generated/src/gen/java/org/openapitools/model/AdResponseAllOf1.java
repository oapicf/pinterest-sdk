package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PinPromotionSummaryStatus;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AdResponseAllOf1  {
  
  @ApiModelProperty(example = "549755885175", value = "The ID of the advertiser that this ad belongs to.")
 /**
   * The ID of the advertiser that this ad belongs to.
  **/
  private String adAccountId;

  @ApiModelProperty(example = "626735565838", value = "ID of the ad campaign that contains this ad.")
 /**
   * ID of the ad campaign that contains this ad.
  **/
  private String campaignId;

  @ApiModelProperty(value = "Destination URL template for all items within a collections drawer.")
 /**
   * Destination URL template for all items within a collections drawer.
  **/
  private String collectionItemsDestinationUrlTemplate;

  @ApiModelProperty(example = "1451431341", value = "Pin creation time. Unix timestamp in seconds.")
 /**
   * Pin creation time. Unix timestamp in seconds.
  **/
  private Integer createdTime;

  @ApiModelProperty(example = "687195134316", value = "The ID of this ad.")
 /**
   * The ID of this ad.
  **/
  private String id;

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
    public String toString() {
        return String.valueOf(value);
    }

    public static RejectedReasonsEnum fromValue(String value) {
        for (RejectedReasonsEnum b : RejectedReasonsEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".")
 /**
   * Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  **/
  private List<RejectedReasonsEnum> rejectedReasons = null;

  @ApiModelProperty(value = "Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".")
 /**
   * Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  **/
  private List<String> rejectionLabels = null;

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
    public String toString() {
        return String.valueOf(value);
    }

    public static ReviewStatusEnum fromValue(String value) {
        for (ReviewStatusEnum b : ReviewStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "PENDING", value = "Ad review status")
 /**
   * Ad review status
  **/
  private ReviewStatusEnum reviewStatus;

  @ApiModelProperty(example = "pinpromotion", value = "Always \"ad\".")
 /**
   * Always \"ad\".
  **/
  private String type;

  @ApiModelProperty(example = "1451431341", value = "Last update time. Unix timestamp in seconds.")
 /**
   * Last update time. Unix timestamp in seconds.
  **/
  private Integer updatedTime;

  @ApiModelProperty(value = "Ad summary status")
 /**
   * Ad summary status
  **/
  private PinPromotionSummaryStatus summaryStatus;
 /**
   * The ID of the advertiser that this ad belongs to.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdResponseAllOf1 adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * ID of the ad campaign that contains this ad.
   * @return campaignId
  **/
  @JsonProperty("campaign_id")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public AdResponseAllOf1 campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
   * Destination URL template for all items within a collections drawer.
   * @return collectionItemsDestinationUrlTemplate
  **/
  @JsonProperty("collection_items_destination_url_template")
  public String getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }

  public void setCollectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

  public AdResponseAllOf1 collectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
    return this;
  }

 /**
   * Pin creation time. Unix timestamp in seconds.
   * @return createdTime
  **/
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public AdResponseAllOf1 createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
   * The ID of this ad.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdResponseAllOf1 id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
   * @return rejectedReasons
  **/
  @JsonProperty("rejected_reasons")
  public List<RejectedReasonsEnum> getRejectedReasons() {
    return rejectedReasons;
  }

  public void setRejectedReasons(List<RejectedReasonsEnum> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
  }

  public AdResponseAllOf1 rejectedReasons(List<RejectedReasonsEnum> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
    return this;
  }

  public AdResponseAllOf1 addRejectedReasonsItem(RejectedReasonsEnum rejectedReasonsItem) {
    this.rejectedReasons.add(rejectedReasonsItem);
    return this;
  }

 /**
   * Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
   * @return rejectionLabels
  **/
  @JsonProperty("rejection_labels")
  public List<String> getRejectionLabels() {
    return rejectionLabels;
  }

  public void setRejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
  }

  public AdResponseAllOf1 rejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
    return this;
  }

  public AdResponseAllOf1 addRejectionLabelsItem(String rejectionLabelsItem) {
    this.rejectionLabels.add(rejectionLabelsItem);
    return this;
  }

 /**
   * Ad review status
   * @return reviewStatus
  **/
  @JsonProperty("review_status")
  public String getReviewStatus() {
    if (reviewStatus == null) {
      return null;
    }
    return reviewStatus.value();
  }

  public void setReviewStatus(ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  public AdResponseAllOf1 reviewStatus(ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

 /**
   * Always \&quot;ad\&quot;.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AdResponseAllOf1 type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTime
  **/
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public AdResponseAllOf1 updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

 /**
   * Ad summary status
   * @return summaryStatus
  **/
  @JsonProperty("summary_status")
  public PinPromotionSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public void setSummaryStatus(PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public AdResponseAllOf1 summaryStatus(PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

