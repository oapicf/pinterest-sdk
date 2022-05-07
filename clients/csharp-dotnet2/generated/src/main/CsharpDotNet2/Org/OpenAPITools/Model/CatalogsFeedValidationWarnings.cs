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
  public class CatalogsFeedValidationWarnings {
    /// <summary>
    /// Gets or Sets TitleLengthTooLong
    /// </summary>
    [DataMember(Name="title_length_too_long", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "title_length_too_long")]
    public int? TitleLengthTooLong { get; set; }

    /// <summary>
    /// Gets or Sets DescriptionLengthTooLong
    /// </summary>
    [DataMember(Name="description_length_too_long", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description_length_too_long")]
    public int? DescriptionLengthTooLong { get; set; }

    /// <summary>
    /// Gets or Sets GenderInvalid
    /// </summary>
    [DataMember(Name="gender_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "gender_invalid")]
    public int? GenderInvalid { get; set; }

    /// <summary>
    /// Gets or Sets AgeGroupInvalid
    /// </summary>
    [DataMember(Name="age_group_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "age_group_invalid")]
    public int? AgeGroupInvalid { get; set; }

    /// <summary>
    /// Gets or Sets SizeTypeInvalid
    /// </summary>
    [DataMember(Name="size_type_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "size_type_invalid")]
    public int? SizeTypeInvalid { get; set; }

    /// <summary>
    /// Gets or Sets LinkFormatWarning
    /// </summary>
    [DataMember(Name="link_format_warning", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link_format_warning")]
    public int? LinkFormatWarning { get; set; }

    /// <summary>
    /// Gets or Sets DuplicateProducts
    /// </summary>
    [DataMember(Name="duplicate_products", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "duplicate_products")]
    public int? DuplicateProducts { get; set; }

    /// <summary>
    /// Gets or Sets DuplicateLinks
    /// </summary>
    [DataMember(Name="duplicate_links", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "duplicate_links")]
    public int? DuplicateLinks { get; set; }

    /// <summary>
    /// Gets or Sets SalesPriceInvalid
    /// </summary>
    [DataMember(Name="sales_price_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sales_price_invalid")]
    public int? SalesPriceInvalid { get; set; }

    /// <summary>
    /// Gets or Sets ProductCategoryDepthWarning
    /// </summary>
    [DataMember(Name="product_category_depth_warning", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "product_category_depth_warning")]
    public int? ProductCategoryDepthWarning { get; set; }

    /// <summary>
    /// Gets or Sets AdwordsSameAsLink
    /// </summary>
    [DataMember(Name="adwords_same_as_link", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "adwords_same_as_link")]
    public int? AdwordsSameAsLink { get; set; }

    /// <summary>
    /// Gets or Sets DuplicateHeaders
    /// </summary>
    [DataMember(Name="duplicate_headers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "duplicate_headers")]
    public int? DuplicateHeaders { get; set; }

    /// <summary>
    /// Gets or Sets FetchSameSignature
    /// </summary>
    [DataMember(Name="fetch_same_signature", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fetch_same_signature")]
    public int? FetchSameSignature { get; set; }

    /// <summary>
    /// Gets or Sets AdwordsFormatWarning
    /// </summary>
    [DataMember(Name="adwords_format_warning", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "adwords_format_warning")]
    public int? AdwordsFormatWarning { get; set; }

    /// <summary>
    /// Gets or Sets AdditionalImageLinkWarning
    /// </summary>
    [DataMember(Name="additional_image_link_warning", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "additional_image_link_warning")]
    public int? AdditionalImageLinkWarning { get; set; }

    /// <summary>
    /// Gets or Sets ImageLinkWarning
    /// </summary>
    [DataMember(Name="image_link_warning", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "image_link_warning")]
    public int? ImageLinkWarning { get; set; }

    /// <summary>
    /// Gets or Sets ShippingInvalid
    /// </summary>
    [DataMember(Name="shipping_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "shipping_invalid")]
    public int? ShippingInvalid { get; set; }

    /// <summary>
    /// Gets or Sets TaxInvalid
    /// </summary>
    [DataMember(Name="tax_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tax_invalid")]
    public int? TaxInvalid { get; set; }

    /// <summary>
    /// Gets or Sets ShippingWeightInvalid
    /// </summary>
    [DataMember(Name="shipping_weight_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "shipping_weight_invalid")]
    public int? ShippingWeightInvalid { get; set; }

    /// <summary>
    /// Gets or Sets ExpirationDateInvalid
    /// </summary>
    [DataMember(Name="expiration_date_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "expiration_date_invalid")]
    public int? ExpirationDateInvalid { get; set; }

    /// <summary>
    /// Gets or Sets AvailabilityDateInvalid
    /// </summary>
    [DataMember(Name="availability_date_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "availability_date_invalid")]
    public int? AvailabilityDateInvalid { get; set; }

    /// <summary>
    /// Gets or Sets SaleDateInvalid
    /// </summary>
    [DataMember(Name="sale_date_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sale_date_invalid")]
    public int? SaleDateInvalid { get; set; }

    /// <summary>
    /// Gets or Sets WeightUnitInvalid
    /// </summary>
    [DataMember(Name="weight_unit_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "weight_unit_invalid")]
    public int? WeightUnitInvalid { get; set; }

    /// <summary>
    /// Gets or Sets IsBundleInvalid
    /// </summary>
    [DataMember(Name="is_bundle_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_bundle_invalid")]
    public int? IsBundleInvalid { get; set; }

    /// <summary>
    /// Gets or Sets UpdatedTimeInvalid
    /// </summary>
    [DataMember(Name="updated_time_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "updated_time_invalid")]
    public int? UpdatedTimeInvalid { get; set; }

    /// <summary>
    /// Gets or Sets CustomLabelLengthTooLong
    /// </summary>
    [DataMember(Name="custom_label_length_too_long", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "custom_label_length_too_long")]
    public int? CustomLabelLengthTooLong { get; set; }

    /// <summary>
    /// Gets or Sets ProductTypeLengthTooLong
    /// </summary>
    [DataMember(Name="product_type_length_too_long", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "product_type_length_too_long")]
    public int? ProductTypeLengthTooLong { get; set; }

    /// <summary>
    /// Gets or Sets TooManyAdditionalImageLinks
    /// </summary>
    [DataMember(Name="too_many_additional_image_links", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "too_many_additional_image_links")]
    public int? TooManyAdditionalImageLinks { get; set; }

    /// <summary>
    /// Gets or Sets MultipackInvalid
    /// </summary>
    [DataMember(Name="multipack_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "multipack_invalid")]
    public int? MultipackInvalid { get; set; }

    /// <summary>
    /// Gets or Sets IndexedProductCountLargeDelta
    /// </summary>
    [DataMember(Name="indexed_product_count_large_delta", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "indexed_product_count_large_delta")]
    public int? IndexedProductCountLargeDelta { get; set; }

    /// <summary>
    /// Gets or Sets ItemAdditionalImageDownloadFailure
    /// </summary>
    [DataMember(Name="item_additional_image_download_failure", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "item_additional_image_download_failure")]
    public int? ItemAdditionalImageDownloadFailure { get; set; }

    /// <summary>
    /// Gets or Sets OptionalProductCategoryMissing
    /// </summary>
    [DataMember(Name="optional_product_category_missing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "optional_product_category_missing")]
    public int? OptionalProductCategoryMissing { get; set; }

    /// <summary>
    /// Gets or Sets OptionalProductCategoryInvalid
    /// </summary>
    [DataMember(Name="optional_product_category_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "optional_product_category_invalid")]
    public int? OptionalProductCategoryInvalid { get; set; }

    /// <summary>
    /// Gets or Sets OptionalConditionMissing
    /// </summary>
    [DataMember(Name="optional_condition_missing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "optional_condition_missing")]
    public int? OptionalConditionMissing { get; set; }

    /// <summary>
    /// Gets or Sets OptionalConditionInvalid
    /// </summary>
    [DataMember(Name="optional_condition_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "optional_condition_invalid")]
    public int? OptionalConditionInvalid { get; set; }

    /// <summary>
    /// Gets or Sets IosDeepLinkInvalid
    /// </summary>
    [DataMember(Name="ios_deep_link_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ios_deep_link_invalid")]
    public int? IosDeepLinkInvalid { get; set; }

    /// <summary>
    /// Gets or Sets AndroidDeepLinkInvalid
    /// </summary>
    [DataMember(Name="android_deep_link_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "android_deep_link_invalid")]
    public int? AndroidDeepLinkInvalid { get; set; }

    /// <summary>
    /// Gets or Sets AvailabilityNormalized
    /// </summary>
    [DataMember(Name="availability_normalized", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "availability_normalized")]
    public int? AvailabilityNormalized { get; set; }

    /// <summary>
    /// Gets or Sets ConditionNormalized
    /// </summary>
    [DataMember(Name="condition_normalized", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "condition_normalized")]
    public int? ConditionNormalized { get; set; }

    /// <summary>
    /// Gets or Sets GenderNormalized
    /// </summary>
    [DataMember(Name="gender_normalized", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "gender_normalized")]
    public int? GenderNormalized { get; set; }

    /// <summary>
    /// Gets or Sets SizeTypeNormalized
    /// </summary>
    [DataMember(Name="size_type_normalized", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "size_type_normalized")]
    public int? SizeTypeNormalized { get; set; }

    /// <summary>
    /// Gets or Sets AgeGroupNormalized
    /// </summary>
    [DataMember(Name="age_group_normalized", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "age_group_normalized")]
    public int? AgeGroupNormalized { get; set; }

    /// <summary>
    /// Gets or Sets UtmSourceAutoCorrected
    /// </summary>
    [DataMember(Name="utm_source_auto_corrected", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "utm_source_auto_corrected")]
    public int? UtmSourceAutoCorrected { get; set; }

    /// <summary>
    /// Gets or Sets CountryDoesNotMapToCurrency
    /// </summary>
    [DataMember(Name="country_does_not_map_to_currency", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "country_does_not_map_to_currency")]
    public int? CountryDoesNotMapToCurrency { get; set; }

    /// <summary>
    /// Gets or Sets MinAdPriceInvalid
    /// </summary>
    [DataMember(Name="min_ad_price_invalid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "min_ad_price_invalid")]
    public int? MinAdPriceInvalid { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CatalogsFeedValidationWarnings {\n");
      sb.Append("  TitleLengthTooLong: ").Append(TitleLengthTooLong).Append("\n");
      sb.Append("  DescriptionLengthTooLong: ").Append(DescriptionLengthTooLong).Append("\n");
      sb.Append("  GenderInvalid: ").Append(GenderInvalid).Append("\n");
      sb.Append("  AgeGroupInvalid: ").Append(AgeGroupInvalid).Append("\n");
      sb.Append("  SizeTypeInvalid: ").Append(SizeTypeInvalid).Append("\n");
      sb.Append("  LinkFormatWarning: ").Append(LinkFormatWarning).Append("\n");
      sb.Append("  DuplicateProducts: ").Append(DuplicateProducts).Append("\n");
      sb.Append("  DuplicateLinks: ").Append(DuplicateLinks).Append("\n");
      sb.Append("  SalesPriceInvalid: ").Append(SalesPriceInvalid).Append("\n");
      sb.Append("  ProductCategoryDepthWarning: ").Append(ProductCategoryDepthWarning).Append("\n");
      sb.Append("  AdwordsSameAsLink: ").Append(AdwordsSameAsLink).Append("\n");
      sb.Append("  DuplicateHeaders: ").Append(DuplicateHeaders).Append("\n");
      sb.Append("  FetchSameSignature: ").Append(FetchSameSignature).Append("\n");
      sb.Append("  AdwordsFormatWarning: ").Append(AdwordsFormatWarning).Append("\n");
      sb.Append("  AdditionalImageLinkWarning: ").Append(AdditionalImageLinkWarning).Append("\n");
      sb.Append("  ImageLinkWarning: ").Append(ImageLinkWarning).Append("\n");
      sb.Append("  ShippingInvalid: ").Append(ShippingInvalid).Append("\n");
      sb.Append("  TaxInvalid: ").Append(TaxInvalid).Append("\n");
      sb.Append("  ShippingWeightInvalid: ").Append(ShippingWeightInvalid).Append("\n");
      sb.Append("  ExpirationDateInvalid: ").Append(ExpirationDateInvalid).Append("\n");
      sb.Append("  AvailabilityDateInvalid: ").Append(AvailabilityDateInvalid).Append("\n");
      sb.Append("  SaleDateInvalid: ").Append(SaleDateInvalid).Append("\n");
      sb.Append("  WeightUnitInvalid: ").Append(WeightUnitInvalid).Append("\n");
      sb.Append("  IsBundleInvalid: ").Append(IsBundleInvalid).Append("\n");
      sb.Append("  UpdatedTimeInvalid: ").Append(UpdatedTimeInvalid).Append("\n");
      sb.Append("  CustomLabelLengthTooLong: ").Append(CustomLabelLengthTooLong).Append("\n");
      sb.Append("  ProductTypeLengthTooLong: ").Append(ProductTypeLengthTooLong).Append("\n");
      sb.Append("  TooManyAdditionalImageLinks: ").Append(TooManyAdditionalImageLinks).Append("\n");
      sb.Append("  MultipackInvalid: ").Append(MultipackInvalid).Append("\n");
      sb.Append("  IndexedProductCountLargeDelta: ").Append(IndexedProductCountLargeDelta).Append("\n");
      sb.Append("  ItemAdditionalImageDownloadFailure: ").Append(ItemAdditionalImageDownloadFailure).Append("\n");
      sb.Append("  OptionalProductCategoryMissing: ").Append(OptionalProductCategoryMissing).Append("\n");
      sb.Append("  OptionalProductCategoryInvalid: ").Append(OptionalProductCategoryInvalid).Append("\n");
      sb.Append("  OptionalConditionMissing: ").Append(OptionalConditionMissing).Append("\n");
      sb.Append("  OptionalConditionInvalid: ").Append(OptionalConditionInvalid).Append("\n");
      sb.Append("  IosDeepLinkInvalid: ").Append(IosDeepLinkInvalid).Append("\n");
      sb.Append("  AndroidDeepLinkInvalid: ").Append(AndroidDeepLinkInvalid).Append("\n");
      sb.Append("  AvailabilityNormalized: ").Append(AvailabilityNormalized).Append("\n");
      sb.Append("  ConditionNormalized: ").Append(ConditionNormalized).Append("\n");
      sb.Append("  GenderNormalized: ").Append(GenderNormalized).Append("\n");
      sb.Append("  SizeTypeNormalized: ").Append(SizeTypeNormalized).Append("\n");
      sb.Append("  AgeGroupNormalized: ").Append(AgeGroupNormalized).Append("\n");
      sb.Append("  UtmSourceAutoCorrected: ").Append(UtmSourceAutoCorrected).Append("\n");
      sb.Append("  CountryDoesNotMapToCurrency: ").Append(CountryDoesNotMapToCurrency).Append("\n");
      sb.Append("  MinAdPriceInvalid: ").Append(MinAdPriceInvalid).Append("\n");
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
