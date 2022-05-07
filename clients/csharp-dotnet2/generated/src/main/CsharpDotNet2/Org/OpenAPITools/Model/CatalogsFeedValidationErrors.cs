using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class CatalogsFeedValidationErrors {
    /// <summary>
    /// Gets or Sets FetchError
    /// </summary>
    [DataMember(Name="fetch_error", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fetch_error")]
    public int? FetchError { get; set; }

    /// <summary>
    /// Gets or Sets FetchInactiveFeedError
    /// </summary>
    [DataMember(Name="fetch_inactive_feed_error", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fetch_inactive_feed_error")]
    public int? FetchInactiveFeedError { get; set; }

    /// <summary>
    /// Gets or Sets EncodingError
    /// </summary>
    [DataMember(Name="encoding_error", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "encoding_error")]
    public int? EncodingError { get; set; }

    /// <summary>
    /// Gets or Sets DelimiterError
    /// </summary>
    [DataMember(Name="delimiter_error", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "delimiter_error")]
    public int? DelimiterError { get; set; }

    /// <summary>
    /// Gets or Sets RequiredColumnsMissing
    /// </summary>
    [DataMember(Name="required_columns_missing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "required_columns_missing")]
    public int? RequiredColumnsMissing { get; set; }

    /// <summary>
    /// Gets or Sets ImageLinkInvalid
    /// </summary>
    [DataMember(Name="image_link_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "image_link_invalid")]
    public int? ImageLinkInvalid { get; set; }

    /// <summary>
    /// Gets or Sets ItemidMissing
    /// </summary>
    [DataMember(Name="itemid_missing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "itemid_missing")]
    public int? ItemidMissing { get; set; }

    /// <summary>
    /// Gets or Sets TitleMissing
    /// </summary>
    [DataMember(Name="title_missing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "title_missing")]
    public int? TitleMissing { get; set; }

    /// <summary>
    /// Gets or Sets DescriptionMissing
    /// </summary>
    [DataMember(Name="description_missing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description_missing")]
    public int? DescriptionMissing { get; set; }

    /// <summary>
    /// Gets or Sets ProductCategoryInvalid
    /// </summary>
    [DataMember(Name="product_category_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "product_category_invalid")]
    public int? ProductCategoryInvalid { get; set; }

    /// <summary>
    /// Gets or Sets ProductLinkMissing
    /// </summary>
    [DataMember(Name="product_link_missing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "product_link_missing")]
    public int? ProductLinkMissing { get; set; }

    /// <summary>
    /// Gets or Sets ImageLinkMissing
    /// </summary>
    [DataMember(Name="image_link_missing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "image_link_missing")]
    public int? ImageLinkMissing { get; set; }

    /// <summary>
    /// Gets or Sets AvailabilityInvalid
    /// </summary>
    [DataMember(Name="availability_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "availability_invalid")]
    public int? AvailabilityInvalid { get; set; }

    /// <summary>
    /// Gets or Sets ProductPriceInvalid
    /// </summary>
    [DataMember(Name="product_price_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "product_price_invalid")]
    public int? ProductPriceInvalid { get; set; }

    /// <summary>
    /// Gets or Sets LinkFormatInvalid
    /// </summary>
    [DataMember(Name="link_format_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link_format_invalid")]
    public int? LinkFormatInvalid { get; set; }

    /// <summary>
    /// Gets or Sets ParseLineError
    /// </summary>
    [DataMember(Name="parse_line_error", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "parse_line_error")]
    public int? ParseLineError { get; set; }

    /// <summary>
    /// Gets or Sets AdwordsFormatInvalid
    /// </summary>
    [DataMember(Name="adwords_format_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "adwords_format_invalid")]
    public int? AdwordsFormatInvalid { get; set; }

    /// <summary>
    /// Gets or Sets ProductCategoryMissing
    /// </summary>
    [DataMember(Name="product_category_missing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "product_category_missing")]
    public int? ProductCategoryMissing { get; set; }

    /// <summary>
    /// Gets or Sets InternalServiceError
    /// </summary>
    [DataMember(Name="internal_service_error", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "internal_service_error")]
    public int? InternalServiceError { get; set; }

    /// <summary>
    /// Gets or Sets NoVerifiedDomain
    /// </summary>
    [DataMember(Name="no_verified_domain", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "no_verified_domain")]
    public int? NoVerifiedDomain { get; set; }

    /// <summary>
    /// Gets or Sets AdultInvalid
    /// </summary>
    [DataMember(Name="adult_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "adult_invalid")]
    public int? AdultInvalid { get; set; }

    /// <summary>
    /// Gets or Sets InvalidDomain
    /// </summary>
    [DataMember(Name="invalid_domain", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "invalid_domain")]
    public int? InvalidDomain { get; set; }

    /// <summary>
    /// Gets or Sets FeedLengthTooLong
    /// </summary>
    [DataMember(Name="feed_length_too_long", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "feed_length_too_long")]
    public int? FeedLengthTooLong { get; set; }

    /// <summary>
    /// Gets or Sets LinkLengthTooLong
    /// </summary>
    [DataMember(Name="link_length_too_long", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link_length_too_long")]
    public int? LinkLengthTooLong { get; set; }

    /// <summary>
    /// Gets or Sets MalformedXml
    /// </summary>
    [DataMember(Name="malformed_xml", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "malformed_xml")]
    public int? MalformedXml { get; set; }

    /// <summary>
    /// Gets or Sets RedirectInvalid
    /// </summary>
    [DataMember(Name="redirect_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "redirect_invalid")]
    public int? RedirectInvalid { get; set; }

    /// <summary>
    /// Gets or Sets PriceMissing
    /// </summary>
    [DataMember(Name="price_missing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "price_missing")]
    public int? PriceMissing { get; set; }

    /// <summary>
    /// Gets or Sets FeedTooSmall
    /// </summary>
    [DataMember(Name="feed_too_small", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "feed_too_small")]
    public int? FeedTooSmall { get; set; }

    /// <summary>
    /// Gets or Sets ConditionInvalid
    /// </summary>
    [DataMember(Name="condition_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "condition_invalid")]
    public int? ConditionInvalid { get; set; }

    /// <summary>
    /// Gets or Sets ShopifyNoProducts
    /// </summary>
    [DataMember(Name="shopify_no_products", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "shopify_no_products")]
    public int? ShopifyNoProducts { get; set; }

    /// <summary>
    /// Gets or Sets MaxItemsPerItemGroupExceeded
    /// </summary>
    [DataMember(Name="max_items_per_item_group_exceeded", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "max_items_per_item_group_exceeded")]
    public int? MaxItemsPerItemGroupExceeded { get; set; }

    /// <summary>
    /// Gets or Sets ItemMainImageDownloadFailure
    /// </summary>
    [DataMember(Name="item_main_image_download_failure", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "item_main_image_download_failure")]
    public int? ItemMainImageDownloadFailure { get; set; }

    /// <summary>
    /// Gets or Sets PinjoinContentUnsafe
    /// </summary>
    [DataMember(Name="pinjoin_content_unsafe", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pinjoin_content_unsafe")]
    public int? PinjoinContentUnsafe { get; set; }

    /// <summary>
    /// Gets or Sets BlocklistedImageSignature
    /// </summary>
    [DataMember(Name="blocklisted_image_signature", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "blocklisted_image_signature")]
    public int? BlocklistedImageSignature { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CatalogsFeedValidationErrors {\n");
      sb.Append("  FetchError: ").Append(FetchError).Append("\n");
      sb.Append("  FetchInactiveFeedError: ").Append(FetchInactiveFeedError).Append("\n");
      sb.Append("  EncodingError: ").Append(EncodingError).Append("\n");
      sb.Append("  DelimiterError: ").Append(DelimiterError).Append("\n");
      sb.Append("  RequiredColumnsMissing: ").Append(RequiredColumnsMissing).Append("\n");
      sb.Append("  ImageLinkInvalid: ").Append(ImageLinkInvalid).Append("\n");
      sb.Append("  ItemidMissing: ").Append(ItemidMissing).Append("\n");
      sb.Append("  TitleMissing: ").Append(TitleMissing).Append("\n");
      sb.Append("  DescriptionMissing: ").Append(DescriptionMissing).Append("\n");
      sb.Append("  ProductCategoryInvalid: ").Append(ProductCategoryInvalid).Append("\n");
      sb.Append("  ProductLinkMissing: ").Append(ProductLinkMissing).Append("\n");
      sb.Append("  ImageLinkMissing: ").Append(ImageLinkMissing).Append("\n");
      sb.Append("  AvailabilityInvalid: ").Append(AvailabilityInvalid).Append("\n");
      sb.Append("  ProductPriceInvalid: ").Append(ProductPriceInvalid).Append("\n");
      sb.Append("  LinkFormatInvalid: ").Append(LinkFormatInvalid).Append("\n");
      sb.Append("  ParseLineError: ").Append(ParseLineError).Append("\n");
      sb.Append("  AdwordsFormatInvalid: ").Append(AdwordsFormatInvalid).Append("\n");
      sb.Append("  ProductCategoryMissing: ").Append(ProductCategoryMissing).Append("\n");
      sb.Append("  InternalServiceError: ").Append(InternalServiceError).Append("\n");
      sb.Append("  NoVerifiedDomain: ").Append(NoVerifiedDomain).Append("\n");
      sb.Append("  AdultInvalid: ").Append(AdultInvalid).Append("\n");
      sb.Append("  InvalidDomain: ").Append(InvalidDomain).Append("\n");
      sb.Append("  FeedLengthTooLong: ").Append(FeedLengthTooLong).Append("\n");
      sb.Append("  LinkLengthTooLong: ").Append(LinkLengthTooLong).Append("\n");
      sb.Append("  MalformedXml: ").Append(MalformedXml).Append("\n");
      sb.Append("  RedirectInvalid: ").Append(RedirectInvalid).Append("\n");
      sb.Append("  PriceMissing: ").Append(PriceMissing).Append("\n");
      sb.Append("  FeedTooSmall: ").Append(FeedTooSmall).Append("\n");
      sb.Append("  ConditionInvalid: ").Append(ConditionInvalid).Append("\n");
      sb.Append("  ShopifyNoProducts: ").Append(ShopifyNoProducts).Append("\n");
      sb.Append("  MaxItemsPerItemGroupExceeded: ").Append(MaxItemsPerItemGroupExceeded).Append("\n");
      sb.Append("  ItemMainImageDownloadFailure: ").Append(ItemMainImageDownloadFailure).Append("\n");
      sb.Append("  PinjoinContentUnsafe: ").Append(PinjoinContentUnsafe).Append("\n");
      sb.Append("  BlocklistedImageSignature: ").Append(BlocklistedImageSignature).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

}
}
