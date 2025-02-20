/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class CatalogsItemValidationWarnings : IEquatable<CatalogsItemValidationWarnings>
    {
        /// <summary>
        /// Gets or Sets AD_LINK_FORMAT_WARNING
        /// </summary>
        [DataMember(Name="AD_LINK_FORMAT_WARNING", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails AD_LINK_FORMAT_WARNING { get; set; }

        /// <summary>
        /// Gets or Sets AD_LINK_SAME_AS_LINK
        /// </summary>
        [DataMember(Name="AD_LINK_SAME_AS_LINK", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails AD_LINK_SAME_AS_LINK { get; set; }

        /// <summary>
        /// Gets or Sets ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG
        /// </summary>
        [DataMember(Name="ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG { get; set; }

        /// <summary>
        /// Gets or Sets ADDITIONAL_IMAGE_LINK_WARNING
        /// </summary>
        [DataMember(Name="ADDITIONAL_IMAGE_LINK_WARNING", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails ADDITIONAL_IMAGE_LINK_WARNING { get; set; }

        /// <summary>
        /// Gets or Sets ADWORDS_FORMAT_WARNING
        /// </summary>
        [DataMember(Name="ADWORDS_FORMAT_WARNING", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails ADWORDS_FORMAT_WARNING { get; set; }

        /// <summary>
        /// Gets or Sets ADWORDS_SAME_AS_LINK
        /// </summary>
        [DataMember(Name="ADWORDS_SAME_AS_LINK", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails ADWORDS_SAME_AS_LINK { get; set; }

        /// <summary>
        /// Gets or Sets AGE_GROUP_INVALID
        /// </summary>
        [DataMember(Name="AGE_GROUP_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails AGE_GROUP_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets SIZE_SYSTEM_INVALID
        /// </summary>
        [DataMember(Name="SIZE_SYSTEM_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails SIZE_SYSTEM_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets ANDROID_DEEP_LINK_INVALID
        /// </summary>
        [DataMember(Name="ANDROID_DEEP_LINK_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails ANDROID_DEEP_LINK_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets AVAILABILITY_DATE_INVALID
        /// </summary>
        [DataMember(Name="AVAILABILITY_DATE_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails AVAILABILITY_DATE_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets COUNTRY_DOES_NOT_MAP_TO_CURRENCY
        /// </summary>
        [DataMember(Name="COUNTRY_DOES_NOT_MAP_TO_CURRENCY", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails COUNTRY_DOES_NOT_MAP_TO_CURRENCY { get; set; }

        /// <summary>
        /// Gets or Sets CUSTOM_LABEL_LENGTH_TOO_LONG
        /// </summary>
        [DataMember(Name="CUSTOM_LABEL_LENGTH_TOO_LONG", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails CUSTOM_LABEL_LENGTH_TOO_LONG { get; set; }

        /// <summary>
        /// Gets or Sets DESCRIPTION_LENGTH_TOO_LONG
        /// </summary>
        [DataMember(Name="DESCRIPTION_LENGTH_TOO_LONG", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails DESCRIPTION_LENGTH_TOO_LONG { get; set; }

        /// <summary>
        /// Gets or Sets EXPIRATION_DATE_INVALID
        /// </summary>
        [DataMember(Name="EXPIRATION_DATE_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails EXPIRATION_DATE_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets GENDER_INVALID
        /// </summary>
        [DataMember(Name="GENDER_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails GENDER_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets GTIN_INVALID
        /// </summary>
        [DataMember(Name="GTIN_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails GTIN_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets IMAGE_LINK_WARNING
        /// </summary>
        [DataMember(Name="IMAGE_LINK_WARNING", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails IMAGE_LINK_WARNING { get; set; }

        /// <summary>
        /// Gets or Sets IOS_DEEP_LINK_INVALID
        /// </summary>
        [DataMember(Name="IOS_DEEP_LINK_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails IOS_DEEP_LINK_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets IS_BUNDLE_INVALID
        /// </summary>
        [DataMember(Name="IS_BUNDLE_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails IS_BUNDLE_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE
        /// </summary>
        [DataMember(Name="ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE { get; set; }

        /// <summary>
        /// Gets or Sets LINK_FORMAT_WARNING
        /// </summary>
        [DataMember(Name="LINK_FORMAT_WARNING", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails LINK_FORMAT_WARNING { get; set; }

        /// <summary>
        /// Gets or Sets MIN_AD_PRICE_INVALID
        /// </summary>
        [DataMember(Name="MIN_AD_PRICE_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails MIN_AD_PRICE_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets MPN_INVALID
        /// </summary>
        [DataMember(Name="MPN_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails MPN_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets MULTIPACK_INVALID
        /// </summary>
        [DataMember(Name="MULTIPACK_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails MULTIPACK_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets OPTIONAL_CONDITION_INVALID
        /// </summary>
        [DataMember(Name="OPTIONAL_CONDITION_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails OPTIONAL_CONDITION_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets OPTIONAL_CONDITION_MISSING
        /// </summary>
        [DataMember(Name="OPTIONAL_CONDITION_MISSING", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails OPTIONAL_CONDITION_MISSING { get; set; }

        /// <summary>
        /// Gets or Sets OPTIONAL_PRODUCT_CATEGORY_INVALID
        /// </summary>
        [DataMember(Name="OPTIONAL_PRODUCT_CATEGORY_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails OPTIONAL_PRODUCT_CATEGORY_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets OPTIONAL_PRODUCT_CATEGORY_MISSING
        /// </summary>
        [DataMember(Name="OPTIONAL_PRODUCT_CATEGORY_MISSING", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails OPTIONAL_PRODUCT_CATEGORY_MISSING { get; set; }

        /// <summary>
        /// Gets or Sets PRODUCT_CATEGORY_DEPTH_WARNING
        /// </summary>
        [DataMember(Name="PRODUCT_CATEGORY_DEPTH_WARNING", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails PRODUCT_CATEGORY_DEPTH_WARNING { get; set; }

        /// <summary>
        /// Gets or Sets PRODUCT_TYPE_LENGTH_TOO_LONG
        /// </summary>
        [DataMember(Name="PRODUCT_TYPE_LENGTH_TOO_LONG", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails PRODUCT_TYPE_LENGTH_TOO_LONG { get; set; }

        /// <summary>
        /// Gets or Sets SALES_PRICE_INVALID
        /// </summary>
        [DataMember(Name="SALES_PRICE_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails SALES_PRICE_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets SALES_PRICE_TOO_LOW
        /// </summary>
        [DataMember(Name="SALES_PRICE_TOO_LOW", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails SALES_PRICE_TOO_LOW { get; set; }

        /// <summary>
        /// Gets or Sets SALES_PRICE_TOO_HIGH
        /// </summary>
        [DataMember(Name="SALES_PRICE_TOO_HIGH", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails SALES_PRICE_TOO_HIGH { get; set; }

        /// <summary>
        /// Gets or Sets SALE_DATE_INVALID
        /// </summary>
        [DataMember(Name="SALE_DATE_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails SALE_DATE_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets SHIPPING_INVALID
        /// </summary>
        [DataMember(Name="SHIPPING_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails SHIPPING_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets SHIPPING_HEIGHT_INVALID
        /// </summary>
        [DataMember(Name="SHIPPING_HEIGHT_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails SHIPPING_HEIGHT_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets SHIPPING_WEIGHT_INVALID
        /// </summary>
        [DataMember(Name="SHIPPING_WEIGHT_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails SHIPPING_WEIGHT_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets SHIPPING_WIDTH_INVALID
        /// </summary>
        [DataMember(Name="SHIPPING_WIDTH_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails SHIPPING_WIDTH_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets SIZE_TYPE_INVALID
        /// </summary>
        [DataMember(Name="SIZE_TYPE_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails SIZE_TYPE_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets TAX_INVALID
        /// </summary>
        [DataMember(Name="TAX_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails TAX_INVALID { get; set; }

        /// <summary>
        /// Gets or Sets TITLE_LENGTH_TOO_LONG
        /// </summary>
        [DataMember(Name="TITLE_LENGTH_TOO_LONG", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails TITLE_LENGTH_TOO_LONG { get; set; }

        /// <summary>
        /// Gets or Sets TOO_MANY_ADDITIONAL_IMAGE_LINKS
        /// </summary>
        [DataMember(Name="TOO_MANY_ADDITIONAL_IMAGE_LINKS", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails TOO_MANY_ADDITIONAL_IMAGE_LINKS { get; set; }

        /// <summary>
        /// Gets or Sets UTM_SOURCE_AUTO_CORRECTED
        /// </summary>
        [DataMember(Name="UTM_SOURCE_AUTO_CORRECTED", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails UTM_SOURCE_AUTO_CORRECTED { get; set; }

        /// <summary>
        /// Gets or Sets WEIGHT_UNIT_INVALID
        /// </summary>
        [DataMember(Name="WEIGHT_UNIT_INVALID", EmitDefaultValue=false)]
        public CatalogsItemValidationDetails WEIGHT_UNIT_INVALID { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CatalogsItemValidationWarnings {\n");
            sb.Append("  AD_LINK_FORMAT_WARNING: ").Append(AD_LINK_FORMAT_WARNING).Append("\n");
            sb.Append("  AD_LINK_SAME_AS_LINK: ").Append(AD_LINK_SAME_AS_LINK).Append("\n");
            sb.Append("  ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: ").Append(ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG).Append("\n");
            sb.Append("  ADDITIONAL_IMAGE_LINK_WARNING: ").Append(ADDITIONAL_IMAGE_LINK_WARNING).Append("\n");
            sb.Append("  ADWORDS_FORMAT_WARNING: ").Append(ADWORDS_FORMAT_WARNING).Append("\n");
            sb.Append("  ADWORDS_SAME_AS_LINK: ").Append(ADWORDS_SAME_AS_LINK).Append("\n");
            sb.Append("  AGE_GROUP_INVALID: ").Append(AGE_GROUP_INVALID).Append("\n");
            sb.Append("  SIZE_SYSTEM_INVALID: ").Append(SIZE_SYSTEM_INVALID).Append("\n");
            sb.Append("  ANDROID_DEEP_LINK_INVALID: ").Append(ANDROID_DEEP_LINK_INVALID).Append("\n");
            sb.Append("  AVAILABILITY_DATE_INVALID: ").Append(AVAILABILITY_DATE_INVALID).Append("\n");
            sb.Append("  COUNTRY_DOES_NOT_MAP_TO_CURRENCY: ").Append(COUNTRY_DOES_NOT_MAP_TO_CURRENCY).Append("\n");
            sb.Append("  CUSTOM_LABEL_LENGTH_TOO_LONG: ").Append(CUSTOM_LABEL_LENGTH_TOO_LONG).Append("\n");
            sb.Append("  DESCRIPTION_LENGTH_TOO_LONG: ").Append(DESCRIPTION_LENGTH_TOO_LONG).Append("\n");
            sb.Append("  EXPIRATION_DATE_INVALID: ").Append(EXPIRATION_DATE_INVALID).Append("\n");
            sb.Append("  GENDER_INVALID: ").Append(GENDER_INVALID).Append("\n");
            sb.Append("  GTIN_INVALID: ").Append(GTIN_INVALID).Append("\n");
            sb.Append("  IMAGE_LINK_WARNING: ").Append(IMAGE_LINK_WARNING).Append("\n");
            sb.Append("  IOS_DEEP_LINK_INVALID: ").Append(IOS_DEEP_LINK_INVALID).Append("\n");
            sb.Append("  IS_BUNDLE_INVALID: ").Append(IS_BUNDLE_INVALID).Append("\n");
            sb.Append("  ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: ").Append(ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE).Append("\n");
            sb.Append("  LINK_FORMAT_WARNING: ").Append(LINK_FORMAT_WARNING).Append("\n");
            sb.Append("  MIN_AD_PRICE_INVALID: ").Append(MIN_AD_PRICE_INVALID).Append("\n");
            sb.Append("  MPN_INVALID: ").Append(MPN_INVALID).Append("\n");
            sb.Append("  MULTIPACK_INVALID: ").Append(MULTIPACK_INVALID).Append("\n");
            sb.Append("  OPTIONAL_CONDITION_INVALID: ").Append(OPTIONAL_CONDITION_INVALID).Append("\n");
            sb.Append("  OPTIONAL_CONDITION_MISSING: ").Append(OPTIONAL_CONDITION_MISSING).Append("\n");
            sb.Append("  OPTIONAL_PRODUCT_CATEGORY_INVALID: ").Append(OPTIONAL_PRODUCT_CATEGORY_INVALID).Append("\n");
            sb.Append("  OPTIONAL_PRODUCT_CATEGORY_MISSING: ").Append(OPTIONAL_PRODUCT_CATEGORY_MISSING).Append("\n");
            sb.Append("  PRODUCT_CATEGORY_DEPTH_WARNING: ").Append(PRODUCT_CATEGORY_DEPTH_WARNING).Append("\n");
            sb.Append("  PRODUCT_TYPE_LENGTH_TOO_LONG: ").Append(PRODUCT_TYPE_LENGTH_TOO_LONG).Append("\n");
            sb.Append("  SALES_PRICE_INVALID: ").Append(SALES_PRICE_INVALID).Append("\n");
            sb.Append("  SALES_PRICE_TOO_LOW: ").Append(SALES_PRICE_TOO_LOW).Append("\n");
            sb.Append("  SALES_PRICE_TOO_HIGH: ").Append(SALES_PRICE_TOO_HIGH).Append("\n");
            sb.Append("  SALE_DATE_INVALID: ").Append(SALE_DATE_INVALID).Append("\n");
            sb.Append("  SHIPPING_INVALID: ").Append(SHIPPING_INVALID).Append("\n");
            sb.Append("  SHIPPING_HEIGHT_INVALID: ").Append(SHIPPING_HEIGHT_INVALID).Append("\n");
            sb.Append("  SHIPPING_WEIGHT_INVALID: ").Append(SHIPPING_WEIGHT_INVALID).Append("\n");
            sb.Append("  SHIPPING_WIDTH_INVALID: ").Append(SHIPPING_WIDTH_INVALID).Append("\n");
            sb.Append("  SIZE_TYPE_INVALID: ").Append(SIZE_TYPE_INVALID).Append("\n");
            sb.Append("  TAX_INVALID: ").Append(TAX_INVALID).Append("\n");
            sb.Append("  TITLE_LENGTH_TOO_LONG: ").Append(TITLE_LENGTH_TOO_LONG).Append("\n");
            sb.Append("  TOO_MANY_ADDITIONAL_IMAGE_LINKS: ").Append(TOO_MANY_ADDITIONAL_IMAGE_LINKS).Append("\n");
            sb.Append("  UTM_SOURCE_AUTO_CORRECTED: ").Append(UTM_SOURCE_AUTO_CORRECTED).Append("\n");
            sb.Append("  WEIGHT_UNIT_INVALID: ").Append(WEIGHT_UNIT_INVALID).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((CatalogsItemValidationWarnings)obj);
        }

        /// <summary>
        /// Returns true if CatalogsItemValidationWarnings instances are equal
        /// </summary>
        /// <param name="other">Instance of CatalogsItemValidationWarnings to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CatalogsItemValidationWarnings other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AD_LINK_FORMAT_WARNING == other.AD_LINK_FORMAT_WARNING ||
                    AD_LINK_FORMAT_WARNING != null &&
                    AD_LINK_FORMAT_WARNING.Equals(other.AD_LINK_FORMAT_WARNING)
                ) && 
                (
                    AD_LINK_SAME_AS_LINK == other.AD_LINK_SAME_AS_LINK ||
                    AD_LINK_SAME_AS_LINK != null &&
                    AD_LINK_SAME_AS_LINK.Equals(other.AD_LINK_SAME_AS_LINK)
                ) && 
                (
                    ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG == other.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG ||
                    ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG != null &&
                    ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG.Equals(other.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG)
                ) && 
                (
                    ADDITIONAL_IMAGE_LINK_WARNING == other.ADDITIONAL_IMAGE_LINK_WARNING ||
                    ADDITIONAL_IMAGE_LINK_WARNING != null &&
                    ADDITIONAL_IMAGE_LINK_WARNING.Equals(other.ADDITIONAL_IMAGE_LINK_WARNING)
                ) && 
                (
                    ADWORDS_FORMAT_WARNING == other.ADWORDS_FORMAT_WARNING ||
                    ADWORDS_FORMAT_WARNING != null &&
                    ADWORDS_FORMAT_WARNING.Equals(other.ADWORDS_FORMAT_WARNING)
                ) && 
                (
                    ADWORDS_SAME_AS_LINK == other.ADWORDS_SAME_AS_LINK ||
                    ADWORDS_SAME_AS_LINK != null &&
                    ADWORDS_SAME_AS_LINK.Equals(other.ADWORDS_SAME_AS_LINK)
                ) && 
                (
                    AGE_GROUP_INVALID == other.AGE_GROUP_INVALID ||
                    AGE_GROUP_INVALID != null &&
                    AGE_GROUP_INVALID.Equals(other.AGE_GROUP_INVALID)
                ) && 
                (
                    SIZE_SYSTEM_INVALID == other.SIZE_SYSTEM_INVALID ||
                    SIZE_SYSTEM_INVALID != null &&
                    SIZE_SYSTEM_INVALID.Equals(other.SIZE_SYSTEM_INVALID)
                ) && 
                (
                    ANDROID_DEEP_LINK_INVALID == other.ANDROID_DEEP_LINK_INVALID ||
                    ANDROID_DEEP_LINK_INVALID != null &&
                    ANDROID_DEEP_LINK_INVALID.Equals(other.ANDROID_DEEP_LINK_INVALID)
                ) && 
                (
                    AVAILABILITY_DATE_INVALID == other.AVAILABILITY_DATE_INVALID ||
                    AVAILABILITY_DATE_INVALID != null &&
                    AVAILABILITY_DATE_INVALID.Equals(other.AVAILABILITY_DATE_INVALID)
                ) && 
                (
                    COUNTRY_DOES_NOT_MAP_TO_CURRENCY == other.COUNTRY_DOES_NOT_MAP_TO_CURRENCY ||
                    COUNTRY_DOES_NOT_MAP_TO_CURRENCY != null &&
                    COUNTRY_DOES_NOT_MAP_TO_CURRENCY.Equals(other.COUNTRY_DOES_NOT_MAP_TO_CURRENCY)
                ) && 
                (
                    CUSTOM_LABEL_LENGTH_TOO_LONG == other.CUSTOM_LABEL_LENGTH_TOO_LONG ||
                    CUSTOM_LABEL_LENGTH_TOO_LONG != null &&
                    CUSTOM_LABEL_LENGTH_TOO_LONG.Equals(other.CUSTOM_LABEL_LENGTH_TOO_LONG)
                ) && 
                (
                    DESCRIPTION_LENGTH_TOO_LONG == other.DESCRIPTION_LENGTH_TOO_LONG ||
                    DESCRIPTION_LENGTH_TOO_LONG != null &&
                    DESCRIPTION_LENGTH_TOO_LONG.Equals(other.DESCRIPTION_LENGTH_TOO_LONG)
                ) && 
                (
                    EXPIRATION_DATE_INVALID == other.EXPIRATION_DATE_INVALID ||
                    EXPIRATION_DATE_INVALID != null &&
                    EXPIRATION_DATE_INVALID.Equals(other.EXPIRATION_DATE_INVALID)
                ) && 
                (
                    GENDER_INVALID == other.GENDER_INVALID ||
                    GENDER_INVALID != null &&
                    GENDER_INVALID.Equals(other.GENDER_INVALID)
                ) && 
                (
                    GTIN_INVALID == other.GTIN_INVALID ||
                    GTIN_INVALID != null &&
                    GTIN_INVALID.Equals(other.GTIN_INVALID)
                ) && 
                (
                    IMAGE_LINK_WARNING == other.IMAGE_LINK_WARNING ||
                    IMAGE_LINK_WARNING != null &&
                    IMAGE_LINK_WARNING.Equals(other.IMAGE_LINK_WARNING)
                ) && 
                (
                    IOS_DEEP_LINK_INVALID == other.IOS_DEEP_LINK_INVALID ||
                    IOS_DEEP_LINK_INVALID != null &&
                    IOS_DEEP_LINK_INVALID.Equals(other.IOS_DEEP_LINK_INVALID)
                ) && 
                (
                    IS_BUNDLE_INVALID == other.IS_BUNDLE_INVALID ||
                    IS_BUNDLE_INVALID != null &&
                    IS_BUNDLE_INVALID.Equals(other.IS_BUNDLE_INVALID)
                ) && 
                (
                    ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE == other.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE ||
                    ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE != null &&
                    ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE.Equals(other.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE)
                ) && 
                (
                    LINK_FORMAT_WARNING == other.LINK_FORMAT_WARNING ||
                    LINK_FORMAT_WARNING != null &&
                    LINK_FORMAT_WARNING.Equals(other.LINK_FORMAT_WARNING)
                ) && 
                (
                    MIN_AD_PRICE_INVALID == other.MIN_AD_PRICE_INVALID ||
                    MIN_AD_PRICE_INVALID != null &&
                    MIN_AD_PRICE_INVALID.Equals(other.MIN_AD_PRICE_INVALID)
                ) && 
                (
                    MPN_INVALID == other.MPN_INVALID ||
                    MPN_INVALID != null &&
                    MPN_INVALID.Equals(other.MPN_INVALID)
                ) && 
                (
                    MULTIPACK_INVALID == other.MULTIPACK_INVALID ||
                    MULTIPACK_INVALID != null &&
                    MULTIPACK_INVALID.Equals(other.MULTIPACK_INVALID)
                ) && 
                (
                    OPTIONAL_CONDITION_INVALID == other.OPTIONAL_CONDITION_INVALID ||
                    OPTIONAL_CONDITION_INVALID != null &&
                    OPTIONAL_CONDITION_INVALID.Equals(other.OPTIONAL_CONDITION_INVALID)
                ) && 
                (
                    OPTIONAL_CONDITION_MISSING == other.OPTIONAL_CONDITION_MISSING ||
                    OPTIONAL_CONDITION_MISSING != null &&
                    OPTIONAL_CONDITION_MISSING.Equals(other.OPTIONAL_CONDITION_MISSING)
                ) && 
                (
                    OPTIONAL_PRODUCT_CATEGORY_INVALID == other.OPTIONAL_PRODUCT_CATEGORY_INVALID ||
                    OPTIONAL_PRODUCT_CATEGORY_INVALID != null &&
                    OPTIONAL_PRODUCT_CATEGORY_INVALID.Equals(other.OPTIONAL_PRODUCT_CATEGORY_INVALID)
                ) && 
                (
                    OPTIONAL_PRODUCT_CATEGORY_MISSING == other.OPTIONAL_PRODUCT_CATEGORY_MISSING ||
                    OPTIONAL_PRODUCT_CATEGORY_MISSING != null &&
                    OPTIONAL_PRODUCT_CATEGORY_MISSING.Equals(other.OPTIONAL_PRODUCT_CATEGORY_MISSING)
                ) && 
                (
                    PRODUCT_CATEGORY_DEPTH_WARNING == other.PRODUCT_CATEGORY_DEPTH_WARNING ||
                    PRODUCT_CATEGORY_DEPTH_WARNING != null &&
                    PRODUCT_CATEGORY_DEPTH_WARNING.Equals(other.PRODUCT_CATEGORY_DEPTH_WARNING)
                ) && 
                (
                    PRODUCT_TYPE_LENGTH_TOO_LONG == other.PRODUCT_TYPE_LENGTH_TOO_LONG ||
                    PRODUCT_TYPE_LENGTH_TOO_LONG != null &&
                    PRODUCT_TYPE_LENGTH_TOO_LONG.Equals(other.PRODUCT_TYPE_LENGTH_TOO_LONG)
                ) && 
                (
                    SALES_PRICE_INVALID == other.SALES_PRICE_INVALID ||
                    SALES_PRICE_INVALID != null &&
                    SALES_PRICE_INVALID.Equals(other.SALES_PRICE_INVALID)
                ) && 
                (
                    SALES_PRICE_TOO_LOW == other.SALES_PRICE_TOO_LOW ||
                    SALES_PRICE_TOO_LOW != null &&
                    SALES_PRICE_TOO_LOW.Equals(other.SALES_PRICE_TOO_LOW)
                ) && 
                (
                    SALES_PRICE_TOO_HIGH == other.SALES_PRICE_TOO_HIGH ||
                    SALES_PRICE_TOO_HIGH != null &&
                    SALES_PRICE_TOO_HIGH.Equals(other.SALES_PRICE_TOO_HIGH)
                ) && 
                (
                    SALE_DATE_INVALID == other.SALE_DATE_INVALID ||
                    SALE_DATE_INVALID != null &&
                    SALE_DATE_INVALID.Equals(other.SALE_DATE_INVALID)
                ) && 
                (
                    SHIPPING_INVALID == other.SHIPPING_INVALID ||
                    SHIPPING_INVALID != null &&
                    SHIPPING_INVALID.Equals(other.SHIPPING_INVALID)
                ) && 
                (
                    SHIPPING_HEIGHT_INVALID == other.SHIPPING_HEIGHT_INVALID ||
                    SHIPPING_HEIGHT_INVALID != null &&
                    SHIPPING_HEIGHT_INVALID.Equals(other.SHIPPING_HEIGHT_INVALID)
                ) && 
                (
                    SHIPPING_WEIGHT_INVALID == other.SHIPPING_WEIGHT_INVALID ||
                    SHIPPING_WEIGHT_INVALID != null &&
                    SHIPPING_WEIGHT_INVALID.Equals(other.SHIPPING_WEIGHT_INVALID)
                ) && 
                (
                    SHIPPING_WIDTH_INVALID == other.SHIPPING_WIDTH_INVALID ||
                    SHIPPING_WIDTH_INVALID != null &&
                    SHIPPING_WIDTH_INVALID.Equals(other.SHIPPING_WIDTH_INVALID)
                ) && 
                (
                    SIZE_TYPE_INVALID == other.SIZE_TYPE_INVALID ||
                    SIZE_TYPE_INVALID != null &&
                    SIZE_TYPE_INVALID.Equals(other.SIZE_TYPE_INVALID)
                ) && 
                (
                    TAX_INVALID == other.TAX_INVALID ||
                    TAX_INVALID != null &&
                    TAX_INVALID.Equals(other.TAX_INVALID)
                ) && 
                (
                    TITLE_LENGTH_TOO_LONG == other.TITLE_LENGTH_TOO_LONG ||
                    TITLE_LENGTH_TOO_LONG != null &&
                    TITLE_LENGTH_TOO_LONG.Equals(other.TITLE_LENGTH_TOO_LONG)
                ) && 
                (
                    TOO_MANY_ADDITIONAL_IMAGE_LINKS == other.TOO_MANY_ADDITIONAL_IMAGE_LINKS ||
                    TOO_MANY_ADDITIONAL_IMAGE_LINKS != null &&
                    TOO_MANY_ADDITIONAL_IMAGE_LINKS.Equals(other.TOO_MANY_ADDITIONAL_IMAGE_LINKS)
                ) && 
                (
                    UTM_SOURCE_AUTO_CORRECTED == other.UTM_SOURCE_AUTO_CORRECTED ||
                    UTM_SOURCE_AUTO_CORRECTED != null &&
                    UTM_SOURCE_AUTO_CORRECTED.Equals(other.UTM_SOURCE_AUTO_CORRECTED)
                ) && 
                (
                    WEIGHT_UNIT_INVALID == other.WEIGHT_UNIT_INVALID ||
                    WEIGHT_UNIT_INVALID != null &&
                    WEIGHT_UNIT_INVALID.Equals(other.WEIGHT_UNIT_INVALID)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (AD_LINK_FORMAT_WARNING != null)
                    hashCode = hashCode * 59 + AD_LINK_FORMAT_WARNING.GetHashCode();
                    if (AD_LINK_SAME_AS_LINK != null)
                    hashCode = hashCode * 59 + AD_LINK_SAME_AS_LINK.GetHashCode();
                    if (ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG != null)
                    hashCode = hashCode * 59 + ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG.GetHashCode();
                    if (ADDITIONAL_IMAGE_LINK_WARNING != null)
                    hashCode = hashCode * 59 + ADDITIONAL_IMAGE_LINK_WARNING.GetHashCode();
                    if (ADWORDS_FORMAT_WARNING != null)
                    hashCode = hashCode * 59 + ADWORDS_FORMAT_WARNING.GetHashCode();
                    if (ADWORDS_SAME_AS_LINK != null)
                    hashCode = hashCode * 59 + ADWORDS_SAME_AS_LINK.GetHashCode();
                    if (AGE_GROUP_INVALID != null)
                    hashCode = hashCode * 59 + AGE_GROUP_INVALID.GetHashCode();
                    if (SIZE_SYSTEM_INVALID != null)
                    hashCode = hashCode * 59 + SIZE_SYSTEM_INVALID.GetHashCode();
                    if (ANDROID_DEEP_LINK_INVALID != null)
                    hashCode = hashCode * 59 + ANDROID_DEEP_LINK_INVALID.GetHashCode();
                    if (AVAILABILITY_DATE_INVALID != null)
                    hashCode = hashCode * 59 + AVAILABILITY_DATE_INVALID.GetHashCode();
                    if (COUNTRY_DOES_NOT_MAP_TO_CURRENCY != null)
                    hashCode = hashCode * 59 + COUNTRY_DOES_NOT_MAP_TO_CURRENCY.GetHashCode();
                    if (CUSTOM_LABEL_LENGTH_TOO_LONG != null)
                    hashCode = hashCode * 59 + CUSTOM_LABEL_LENGTH_TOO_LONG.GetHashCode();
                    if (DESCRIPTION_LENGTH_TOO_LONG != null)
                    hashCode = hashCode * 59 + DESCRIPTION_LENGTH_TOO_LONG.GetHashCode();
                    if (EXPIRATION_DATE_INVALID != null)
                    hashCode = hashCode * 59 + EXPIRATION_DATE_INVALID.GetHashCode();
                    if (GENDER_INVALID != null)
                    hashCode = hashCode * 59 + GENDER_INVALID.GetHashCode();
                    if (GTIN_INVALID != null)
                    hashCode = hashCode * 59 + GTIN_INVALID.GetHashCode();
                    if (IMAGE_LINK_WARNING != null)
                    hashCode = hashCode * 59 + IMAGE_LINK_WARNING.GetHashCode();
                    if (IOS_DEEP_LINK_INVALID != null)
                    hashCode = hashCode * 59 + IOS_DEEP_LINK_INVALID.GetHashCode();
                    if (IS_BUNDLE_INVALID != null)
                    hashCode = hashCode * 59 + IS_BUNDLE_INVALID.GetHashCode();
                    if (ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE != null)
                    hashCode = hashCode * 59 + ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE.GetHashCode();
                    if (LINK_FORMAT_WARNING != null)
                    hashCode = hashCode * 59 + LINK_FORMAT_WARNING.GetHashCode();
                    if (MIN_AD_PRICE_INVALID != null)
                    hashCode = hashCode * 59 + MIN_AD_PRICE_INVALID.GetHashCode();
                    if (MPN_INVALID != null)
                    hashCode = hashCode * 59 + MPN_INVALID.GetHashCode();
                    if (MULTIPACK_INVALID != null)
                    hashCode = hashCode * 59 + MULTIPACK_INVALID.GetHashCode();
                    if (OPTIONAL_CONDITION_INVALID != null)
                    hashCode = hashCode * 59 + OPTIONAL_CONDITION_INVALID.GetHashCode();
                    if (OPTIONAL_CONDITION_MISSING != null)
                    hashCode = hashCode * 59 + OPTIONAL_CONDITION_MISSING.GetHashCode();
                    if (OPTIONAL_PRODUCT_CATEGORY_INVALID != null)
                    hashCode = hashCode * 59 + OPTIONAL_PRODUCT_CATEGORY_INVALID.GetHashCode();
                    if (OPTIONAL_PRODUCT_CATEGORY_MISSING != null)
                    hashCode = hashCode * 59 + OPTIONAL_PRODUCT_CATEGORY_MISSING.GetHashCode();
                    if (PRODUCT_CATEGORY_DEPTH_WARNING != null)
                    hashCode = hashCode * 59 + PRODUCT_CATEGORY_DEPTH_WARNING.GetHashCode();
                    if (PRODUCT_TYPE_LENGTH_TOO_LONG != null)
                    hashCode = hashCode * 59 + PRODUCT_TYPE_LENGTH_TOO_LONG.GetHashCode();
                    if (SALES_PRICE_INVALID != null)
                    hashCode = hashCode * 59 + SALES_PRICE_INVALID.GetHashCode();
                    if (SALES_PRICE_TOO_LOW != null)
                    hashCode = hashCode * 59 + SALES_PRICE_TOO_LOW.GetHashCode();
                    if (SALES_PRICE_TOO_HIGH != null)
                    hashCode = hashCode * 59 + SALES_PRICE_TOO_HIGH.GetHashCode();
                    if (SALE_DATE_INVALID != null)
                    hashCode = hashCode * 59 + SALE_DATE_INVALID.GetHashCode();
                    if (SHIPPING_INVALID != null)
                    hashCode = hashCode * 59 + SHIPPING_INVALID.GetHashCode();
                    if (SHIPPING_HEIGHT_INVALID != null)
                    hashCode = hashCode * 59 + SHIPPING_HEIGHT_INVALID.GetHashCode();
                    if (SHIPPING_WEIGHT_INVALID != null)
                    hashCode = hashCode * 59 + SHIPPING_WEIGHT_INVALID.GetHashCode();
                    if (SHIPPING_WIDTH_INVALID != null)
                    hashCode = hashCode * 59 + SHIPPING_WIDTH_INVALID.GetHashCode();
                    if (SIZE_TYPE_INVALID != null)
                    hashCode = hashCode * 59 + SIZE_TYPE_INVALID.GetHashCode();
                    if (TAX_INVALID != null)
                    hashCode = hashCode * 59 + TAX_INVALID.GetHashCode();
                    if (TITLE_LENGTH_TOO_LONG != null)
                    hashCode = hashCode * 59 + TITLE_LENGTH_TOO_LONG.GetHashCode();
                    if (TOO_MANY_ADDITIONAL_IMAGE_LINKS != null)
                    hashCode = hashCode * 59 + TOO_MANY_ADDITIONAL_IMAGE_LINKS.GetHashCode();
                    if (UTM_SOURCE_AUTO_CORRECTED != null)
                    hashCode = hashCode * 59 + UTM_SOURCE_AUTO_CORRECTED.GetHashCode();
                    if (WEIGHT_UNIT_INVALID != null)
                    hashCode = hashCode * 59 + WEIGHT_UNIT_INVALID.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CatalogsItemValidationWarnings left, CatalogsItemValidationWarnings right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CatalogsItemValidationWarnings left, CatalogsItemValidationWarnings right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
