package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PinPromotionSummaryStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdResponseAllOf1  {
  
 /**
  * The ID of the advertiser that this ad belongs to.
  */
  @ApiModelProperty(example = "549755885175", value = "The ID of the advertiser that this ad belongs to.")
  private String adAccountId;

 /**
  * ID of the ad campaign that contains this ad.
  */
  @ApiModelProperty(example = "626735565838", value = "ID of the ad campaign that contains this ad.")
  private String campaignId;

 /**
  * Destination URL template for all items within a collections drawer.
  */
  @ApiModelProperty(value = "Destination URL template for all items within a collections drawer.")
  private String collectionItemsDestinationUrlTemplate;

 /**
  * Pin creation time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1451431341", value = "Pin creation time. Unix timestamp in seconds.")
  private Integer createdTime;

 /**
  * The ID of this ad.
  */
  @ApiModelProperty(example = "687195134316", value = "The ID of this ad.")
  private String id;

public enum RejectedReasonsEnum {

    @JsonProperty("HASHTAGS") HASHTAGS(String.valueOf("HASHTAGS")),
    @JsonProperty("PROMOTIONS_AND_PRICES") PROMOTIONS_AND_PRICES(String.valueOf("PROMOTIONS_AND_PRICES")),
    @JsonProperty("TARGETING") TARGETING(String.valueOf("TARGETING")),
    @JsonProperty("LANDING_PAGE") LANDING_PAGE(String.valueOf("LANDING_PAGE")),
    @JsonProperty("CAPS_AND_SYMBOLS") CAPS_AND_SYMBOLS(String.valueOf("CAPS_AND_SYMBOLS")),
    @JsonProperty("SHOCKING") SHOCKING(String.valueOf("SHOCKING")),
    @JsonProperty("WEIGHT_LOSS") WEIGHT_LOSS(String.valueOf("WEIGHT_LOSS")),
    @JsonProperty("PROHIBITED_PRODUCT") PROHIBITED_PRODUCT(String.valueOf("PROHIBITED_PRODUCT")),
    @JsonProperty("AUTHENTICITY") AUTHENTICITY(String.valueOf("AUTHENTICITY")),
    @JsonProperty("NUDITY") NUDITY(String.valueOf("NUDITY")),
    @JsonProperty("CONFUSING_DESIGN") CONFUSING_DESIGN(String.valueOf("CONFUSING_DESIGN")),
    @JsonProperty("URGENCY") URGENCY(String.valueOf("URGENCY")),
    @JsonProperty("RATINGS") RATINGS(String.valueOf("RATINGS")),
    @JsonProperty("APP") APP(String.valueOf("APP")),
    @JsonProperty("ALCOHOL") ALCOHOL(String.valueOf("ALCOHOL")),
    @JsonProperty("CONTESTS") CONTESTS(String.valueOf("CONTESTS")),
    @JsonProperty("POLITICAL") POLITICAL(String.valueOf("POLITICAL")),
    @JsonProperty("OTHER") OTHER(String.valueOf("OTHER")),
    @JsonProperty("IMAGE") IMAGE(String.valueOf("IMAGE")),
    @JsonProperty("NAR") NAR(String.valueOf("NAR")),
    @JsonProperty("INCONSISTENT") INCONSISTENT(String.valueOf("INCONSISTENT")),
    @JsonProperty("CLICKBAIT") CLICKBAIT(String.valueOf("CLICKBAIT")),
    @JsonProperty("NO_DESCRIPTION") NO_DESCRIPTION(String.valueOf("NO_DESCRIPTION")),
    @JsonProperty("LOW_QUALITY") LOW_QUALITY(String.valueOf("LOW_QUALITY")),
    @JsonProperty("EXAGGERATED_CLAIMS") EXAGGERATED_CLAIMS(String.valueOf("EXAGGERATED_CLAIMS")),
    @JsonProperty("PINTEREST_BRAND") PINTEREST_BRAND(String.valueOf("PINTEREST_BRAND")),
    @JsonProperty("ALCOHOL_NO_SALE") ALCOHOL_NO_SALE(String.valueOf("ALCOHOL_NO_SALE")),
    @JsonProperty("LANDING_PAGE_SPEED") LANDING_PAGE_SPEED(String.valueOf("LANDING_PAGE_SPEED")),
    @JsonProperty("LANDING_PAGE_HARDWALL") LANDING_PAGE_HARDWALL(String.valueOf("LANDING_PAGE_HARDWALL")),
    @JsonProperty("LANDING_PAGE_BROKEN") LANDING_PAGE_BROKEN(String.valueOf("LANDING_PAGE_BROKEN")),
    @JsonProperty("LANDING_PAGE_QUALITY") LANDING_PAGE_QUALITY(String.valueOf("LANDING_PAGE_QUALITY")),
    @JsonProperty("OUT_OF_STOCK") OUT_OF_STOCK(String.valueOf("OUT_OF_STOCK")),
    @JsonProperty("IMAGE_LOW_QUALITY") IMAGE_LOW_QUALITY(String.valueOf("IMAGE_LOW_QUALITY")),
    @JsonProperty("IMAGE_BUSY") IMAGE_BUSY(String.valueOf("IMAGE_BUSY")),
    @JsonProperty("IMAGE_POORLY_EDITED") IMAGE_POORLY_EDITED(String.valueOf("IMAGE_POORLY_EDITED")),
    @JsonProperty("IMAGE_BEFORE_AFTER") IMAGE_BEFORE_AFTER(String.valueOf("IMAGE_BEFORE_AFTER")),
    @JsonProperty("UGC") UGC(String.valueOf("UGC")),
    @JsonProperty("FAKE_BUTTONS") FAKE_BUTTONS(String.valueOf("FAKE_BUTTONS")),
    @JsonProperty("WEAPONS") WEAPONS(String.valueOf("WEAPONS")),
    @JsonProperty("SENSITIVE") SENSITIVE(String.valueOf("SENSITIVE")),
    @JsonProperty("UNACCEPTABLE_BUSINESS") UNACCEPTABLE_BUSINESS(String.valueOf("UNACCEPTABLE_BUSINESS")),
    @JsonProperty("SUSPICIOUS_CLAIMS") SUSPICIOUS_CLAIMS(String.valueOf("SUSPICIOUS_CLAIMS")),
    @JsonProperty("PHARMA") PHARMA(String.valueOf("PHARMA")),
    @JsonProperty("SUSPICIOUS_SUPPLEMENTS") SUSPICIOUS_SUPPLEMENTS(String.valueOf("SUSPICIOUS_SUPPLEMENTS")),
    @JsonProperty("ILLEGAL_RECREATIONAL_DRUG") ILLEGAL_RECREATIONAL_DRUG(String.valueOf("ILLEGAL_RECREATIONAL_DRUG")),
    @JsonProperty("LOW_QUALITY_LANDING_PAGE") LOW_QUALITY_LANDING_PAGE(String.valueOf("LOW_QUALITY_LANDING_PAGE")),
    @JsonProperty("RESTRICTED_HEALTHCARE") RESTRICTED_HEALTHCARE(String.valueOf("RESTRICTED_HEALTHCARE")),
    @JsonProperty("INCONSISTENT_LANG_FR") INCONSISTENT_LANG_FR(String.valueOf("INCONSISTENT_LANG_FR"));

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

 /**
  * Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  */
  @ApiModelProperty(value = "Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".")
  private List<RejectedReasonsEnum> rejectedReasons = null;

 /**
  * Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  */
  @ApiModelProperty(value = "Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".")
  private List<String> rejectionLabels = null;

public enum ReviewStatusEnum {

    @JsonProperty("OTHER") OTHER(String.valueOf("OTHER")),
    @JsonProperty("PENDING") PENDING(String.valueOf("PENDING")),
    @JsonProperty("REJECTED") REJECTED(String.valueOf("REJECTED")),
    @JsonProperty("APPROVED") APPROVED(String.valueOf("APPROVED"));

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

 /**
  * Ad review status
  */
  @ApiModelProperty(example = "PENDING", value = "Ad review status")
  private ReviewStatusEnum reviewStatus;

 /**
  * Always \"ad\".
  */
  @ApiModelProperty(example = "pinpromotion", value = "Always \"ad\".")
  private String type;

 /**
  * Last update time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1451431341", value = "Last update time. Unix timestamp in seconds.")
  private Integer updatedTime;

 /**
  * Ad summary status
  */
  @ApiModelProperty(value = "Ad summary status")
  private PinPromotionSummaryStatus summaryStatus;
 /**
  * The ID of the advertiser that this ad belongs to.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public AdResponseAllOf1 adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * ID of the ad campaign that contains this ad.
  * @return campaignId
  */
  @JsonProperty("campaign_id")
 @Pattern(regexp="^\\d+$")  public String getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
 public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
  public AdResponseAllOf1 campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
  * Destination URL template for all items within a collections drawer.
  * @return collectionItemsDestinationUrlTemplate
  */
  @JsonProperty("collection_items_destination_url_template")
  public String getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }

  /**
   * Sets the <code>collectionItemsDestinationUrlTemplate</code> property.
   */
 public void setCollectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

  /**
   * Sets the <code>collectionItemsDestinationUrlTemplate</code> property.
   */
  public AdResponseAllOf1 collectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
    return this;
  }

 /**
  * Pin creation time. Unix timestamp in seconds.
  * @return createdTime
  */
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
 public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
  public AdResponseAllOf1 createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * The ID of this ad.
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public AdResponseAllOf1 id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
  * @return rejectedReasons
  */
  @JsonProperty("rejected_reasons")
  public List<RejectedReasonsEnum> getRejectedReasons() {
    return rejectedReasons;
  }

  /**
   * Sets the <code>rejectedReasons</code> property.
   */
 public void setRejectedReasons(List<RejectedReasonsEnum> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
  }

  /**
   * Sets the <code>rejectedReasons</code> property.
   */
  public AdResponseAllOf1 rejectedReasons(List<RejectedReasonsEnum> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
    return this;
  }

  /**
   * Adds a new item to the <code>rejectedReasons</code> list.
   */
  public AdResponseAllOf1 addRejectedReasonsItem(RejectedReasonsEnum rejectedReasonsItem) {
    this.rejectedReasons.add(rejectedReasonsItem);
    return this;
  }

 /**
  * Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
  * @return rejectionLabels
  */
  @JsonProperty("rejection_labels")
  public List<String> getRejectionLabels() {
    return rejectionLabels;
  }

  /**
   * Sets the <code>rejectionLabels</code> property.
   */
 public void setRejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
  }

  /**
   * Sets the <code>rejectionLabels</code> property.
   */
  public AdResponseAllOf1 rejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
    return this;
  }

  /**
   * Adds a new item to the <code>rejectionLabels</code> list.
   */
  public AdResponseAllOf1 addRejectionLabelsItem(String rejectionLabelsItem) {
    this.rejectionLabels.add(rejectionLabelsItem);
    return this;
  }

 /**
  * Ad review status
  * @return reviewStatus
  */
  @JsonProperty("review_status")
  public String getReviewStatus() {
    return reviewStatus == null ? null : reviewStatus.value();
  }

  /**
   * Sets the <code>reviewStatus</code> property.
   */
 public void setReviewStatus(ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  /**
   * Sets the <code>reviewStatus</code> property.
   */
  public AdResponseAllOf1 reviewStatus(ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

 /**
  * Always \&quot;ad\&quot;.
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public AdResponseAllOf1 type(String type) {
    this.type = type;
    return this;
  }

 /**
  * Last update time. Unix timestamp in seconds.
  * @return updatedTime
  */
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
 public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
  public AdResponseAllOf1 updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

 /**
  * Ad summary status
  * @return summaryStatus
  */
  @JsonProperty("summary_status")
  public PinPromotionSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  /**
   * Sets the <code>summaryStatus</code> property.
   */
 public void setSummaryStatus(PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  /**
   * Sets the <code>summaryStatus</code> property.
   */
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

