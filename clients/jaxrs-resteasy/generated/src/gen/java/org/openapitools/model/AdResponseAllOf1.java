package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PinPromotionSummaryStatus;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-07-01T12:00:58.963610Z[Etc/UTC]")
public class AdResponseAllOf1   {
  
  private String adAccountId;
  private String campaignId;
  private String collectionItemsDestinationUrlTemplate;
  private Integer createdTime;
  private String id;

  /**
   * ad disapproval reasons
   */
  public enum RejectedReasonsEnum {
    HASHTAGS("HASHTAGS"),

        PROMOTIONS_AND_PRICES("PROMOTIONS_AND_PRICES"),

        TARGETING("TARGETING"),

        LANDING_PAGE("LANDING_PAGE"),

        CAPS_AND_SYMBOLS("CAPS_AND_SYMBOLS"),

        SHOCKING("SHOCKING"),

        WEIGHT_LOSS("WEIGHT_LOSS"),

        PROHIBITED_PRODUCT("PROHIBITED_PRODUCT"),

        AUTHENTICITY("AUTHENTICITY"),

        NUDITY("NUDITY"),

        CONFUSING_DESIGN("CONFUSING_DESIGN"),

        URGENCY("URGENCY"),

        RATINGS("RATINGS"),

        APP("APP"),

        ALCOHOL("ALCOHOL"),

        CONTESTS("CONTESTS"),

        POLITICAL("POLITICAL"),

        OTHER("OTHER"),

        IMAGE("IMAGE"),

        NAR("NAR"),

        INCONSISTENT("INCONSISTENT"),

        CLICKBAIT("CLICKBAIT"),

        NO_DESCRIPTION("NO_DESCRIPTION"),

        LOW_QUALITY("LOW_QUALITY"),

        EXAGGERATED_CLAIMS("EXAGGERATED_CLAIMS"),

        PINTEREST_BRAND("PINTEREST_BRAND"),

        ALCOHOL_NO_SALE("ALCOHOL_NO_SALE"),

        LANDING_PAGE_SPEED("LANDING_PAGE_SPEED"),

        LANDING_PAGE_HARDWALL("LANDING_PAGE_HARDWALL"),

        LANDING_PAGE_BROKEN("LANDING_PAGE_BROKEN"),

        LANDING_PAGE_QUALITY("LANDING_PAGE_QUALITY"),

        OUT_OF_STOCK("OUT_OF_STOCK"),

        IMAGE_LOW_QUALITY("IMAGE_LOW_QUALITY"),

        IMAGE_BUSY("IMAGE_BUSY"),

        IMAGE_POORLY_EDITED("IMAGE_POORLY_EDITED"),

        IMAGE_BEFORE_AFTER("IMAGE_BEFORE_AFTER"),

        UGC("UGC"),

        FAKE_BUTTONS("FAKE_BUTTONS"),

        WEAPONS("WEAPONS"),

        SENSITIVE("SENSITIVE"),

        UNACCEPTABLE_BUSINESS("UNACCEPTABLE_BUSINESS"),

        SUSPICIOUS_CLAIMS("SUSPICIOUS_CLAIMS"),

        PHARMA("PHARMA"),

        SUSPICIOUS_SUPPLEMENTS("SUSPICIOUS_SUPPLEMENTS"),

        ILLEGAL_RECREATIONAL_DRUG("ILLEGAL_RECREATIONAL_DRUG"),

        LOW_QUALITY_LANDING_PAGE("LOW_QUALITY_LANDING_PAGE"),

        RESTRICTED_HEALTHCARE("RESTRICTED_HEALTHCARE"),

        INCONSISTENT_LANG_FR("INCONSISTENT_LANG_FR");
    private String value;

    RejectedReasonsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<RejectedReasonsEnum> rejectedReasons = new ArrayList<RejectedReasonsEnum>();
  private List<String> rejectionLabels = new ArrayList<String>();

  /**
   * Ad review status
   */
  public enum ReviewStatusEnum {
    OTHER("OTHER"),

        PENDING("PENDING"),

        REJECTED("REJECTED"),

        APPROVED("APPROVED");
    private String value;

    ReviewStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ReviewStatusEnum reviewStatus;
  private String type;
  private Integer updatedTime;
  private PinPromotionSummaryStatus summaryStatus;

  /**
   * The ID of the advertiser that this ad belongs to.
   **/
  
  @ApiModelProperty(example = "549755885175", value = "The ID of the advertiser that this ad belongs to.")
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * ID of the ad campaign that contains this ad.
   **/
  
  @ApiModelProperty(example = "626735565838", value = "ID of the ad campaign that contains this ad.")
  @JsonProperty("campaign_id")
 @Pattern(regexp="^\\d+$")  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Destination URL template for all items within a collections drawer.
   **/
  
  @ApiModelProperty(value = "Destination URL template for all items within a collections drawer.")
  @JsonProperty("collection_items_destination_url_template")
  public String getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }
  public void setCollectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

  /**
   * Pin creation time. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(example = "1451431341", value = "Pin creation time. Unix timestamp in seconds.")
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * The ID of this ad.
   **/
  
  @ApiModelProperty(example = "687195134316", value = "The ID of this ad.")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
   **/
  
  @ApiModelProperty(value = "Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".")
  @JsonProperty("rejected_reasons")
  public List<RejectedReasonsEnum> getRejectedReasons() {
    return rejectedReasons;
  }
  public void setRejectedReasons(List<RejectedReasonsEnum> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
  }

  /**
   * Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
   **/
  
  @ApiModelProperty(value = "Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".")
  @JsonProperty("rejection_labels")
  public List<String> getRejectionLabels() {
    return rejectionLabels;
  }
  public void setRejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
  }

  /**
   * Ad review status
   **/
  
  @ApiModelProperty(example = "PENDING", value = "Ad review status")
  @JsonProperty("review_status")
  public ReviewStatusEnum getReviewStatus() {
    return reviewStatus;
  }
  public void setReviewStatus(ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  /**
   * Always \&quot;ad\&quot;.
   **/
  
  @ApiModelProperty(example = "pinpromotion", value = "Always \"ad\".")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Last update time. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(example = "1451431341", value = "Last update time. Unix timestamp in seconds.")
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Ad summary status
   **/
  
  @ApiModelProperty(value = "Ad summary status")
  @JsonProperty("summary_status")
  public PinPromotionSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }
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
    return Objects.equals(adAccountId, adResponseAllOf1.adAccountId) &&
        Objects.equals(campaignId, adResponseAllOf1.campaignId) &&
        Objects.equals(collectionItemsDestinationUrlTemplate, adResponseAllOf1.collectionItemsDestinationUrlTemplate) &&
        Objects.equals(createdTime, adResponseAllOf1.createdTime) &&
        Objects.equals(id, adResponseAllOf1.id) &&
        Objects.equals(rejectedReasons, adResponseAllOf1.rejectedReasons) &&
        Objects.equals(rejectionLabels, adResponseAllOf1.rejectionLabels) &&
        Objects.equals(reviewStatus, adResponseAllOf1.reviewStatus) &&
        Objects.equals(type, adResponseAllOf1.type) &&
        Objects.equals(updatedTime, adResponseAllOf1.updatedTime) &&
        Objects.equals(summaryStatus, adResponseAllOf1.summaryStatus);
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

