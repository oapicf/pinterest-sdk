/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Creation fields
    /// </summary>
    [DataContract(Name = "AdResponse_allOf")]
    public partial class AdResponseAllOf : IEquatable<AdResponseAllOf>, IValidatableObject
    {
        /// <summary>
        /// Ad creative type enum
        /// </summary>
        /// <value>Ad creative type enum</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CreativeTypeEnum
        {
            /// <summary>
            /// Enum REGULAR for value: REGULAR
            /// </summary>
            [EnumMember(Value = "REGULAR")]
            REGULAR = 1,

            /// <summary>
            /// Enum VIDEO for value: VIDEO
            /// </summary>
            [EnumMember(Value = "VIDEO")]
            VIDEO = 2,

            /// <summary>
            /// Enum SHOPPING for value: SHOPPING
            /// </summary>
            [EnumMember(Value = "SHOPPING")]
            SHOPPING = 3,

            /// <summary>
            /// Enum CAROUSEL for value: CAROUSEL
            /// </summary>
            [EnumMember(Value = "CAROUSEL")]
            CAROUSEL = 4,

            /// <summary>
            /// Enum MAXVIDEO for value: MAX_VIDEO
            /// </summary>
            [EnumMember(Value = "MAX_VIDEO")]
            MAXVIDEO = 5,

            /// <summary>
            /// Enum SHOPTHEPIN for value: SHOP_THE_PIN
            /// </summary>
            [EnumMember(Value = "SHOP_THE_PIN")]
            SHOPTHEPIN = 6,

            /// <summary>
            /// Enum STORY for value: STORY
            /// </summary>
            [EnumMember(Value = "STORY")]
            STORY = 7

        }


        /// <summary>
        /// Ad creative type enum
        /// </summary>
        /// <value>Ad creative type enum</value>
        [DataMember(Name = "creative_type", EmitDefaultValue = false)]
        public CreativeTypeEnum? CreativeType { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public EntityStatus? Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="AdResponseAllOf" /> class.
        /// </summary>
        /// <param name="adGroupId">ID of the ad group that contains the ad..</param>
        /// <param name="androidDeepLink">Deep link URL for Android devices. Not currently available. Using this field will generate an error..</param>
        /// <param name="carouselAndroidDeepLinks">Comma-separated deep links for the carousel pin on Android..</param>
        /// <param name="carouselDestinationUrls">Comma-separated destination URLs for the carousel pin to promote..</param>
        /// <param name="carouselIosDeepLinks">Comma-separated deep links for the carousel pin on iOS..</param>
        /// <param name="clickTrackingUrl">Tracking url for the ad clicks..</param>
        /// <param name="creativeType">Ad creative type enum.</param>
        /// <param name="destinationUrl">Destination URL..</param>
        /// <param name="iosDeepLink">Deep link URL for iOS devices. Not currently available. Using this field will generate an error..</param>
        /// <param name="isPinDeleted">Is original pin deleted?.</param>
        /// <param name="isRemovable">Is pin repinnable?.</param>
        /// <param name="name">Name of the ad - 255 chars max..</param>
        /// <param name="pinId">Pin ID..</param>
        /// <param name="status">status.</param>
        /// <param name="trackingUrls">trackingUrls.</param>
        /// <param name="viewTrackingUrl">Tracking URL for ad impressions..</param>
        public AdResponseAllOf(string adGroupId = default(string), string androidDeepLink = default(string), List<string> carouselAndroidDeepLinks = default(List<string>), List<string> carouselDestinationUrls = default(List<string>), List<string> carouselIosDeepLinks = default(List<string>), string clickTrackingUrl = default(string), CreativeTypeEnum? creativeType = default(CreativeTypeEnum?), string destinationUrl = default(string), string iosDeepLink = default(string), bool isPinDeleted = default(bool), bool isRemovable = default(bool), string name = default(string), string pinId = default(string), EntityStatus? status = default(EntityStatus?), TrackingUrls trackingUrls = default(TrackingUrls), string viewTrackingUrl = default(string))
        {
            this.AdGroupId = adGroupId;
            this.AndroidDeepLink = androidDeepLink;
            this.CarouselAndroidDeepLinks = carouselAndroidDeepLinks;
            this.CarouselDestinationUrls = carouselDestinationUrls;
            this.CarouselIosDeepLinks = carouselIosDeepLinks;
            this.ClickTrackingUrl = clickTrackingUrl;
            this.CreativeType = creativeType;
            this.DestinationUrl = destinationUrl;
            this.IosDeepLink = iosDeepLink;
            this.IsPinDeleted = isPinDeleted;
            this.IsRemovable = isRemovable;
            this.Name = name;
            this.PinId = pinId;
            this.Status = status;
            this.TrackingUrls = trackingUrls;
            this.ViewTrackingUrl = viewTrackingUrl;
        }

        /// <summary>
        /// ID of the ad group that contains the ad.
        /// </summary>
        /// <value>ID of the ad group that contains the ad.</value>
        [DataMember(Name = "ad_group_id", EmitDefaultValue = false)]
        public string AdGroupId { get; set; }

        /// <summary>
        /// Deep link URL for Android devices. Not currently available. Using this field will generate an error.
        /// </summary>
        /// <value>Deep link URL for Android devices. Not currently available. Using this field will generate an error.</value>
        [DataMember(Name = "android_deep_link", EmitDefaultValue = true)]
        public string AndroidDeepLink { get; set; }

        /// <summary>
        /// Comma-separated deep links for the carousel pin on Android.
        /// </summary>
        /// <value>Comma-separated deep links for the carousel pin on Android.</value>
        [DataMember(Name = "carousel_android_deep_links", EmitDefaultValue = true)]
        public List<string> CarouselAndroidDeepLinks { get; set; }

        /// <summary>
        /// Comma-separated destination URLs for the carousel pin to promote.
        /// </summary>
        /// <value>Comma-separated destination URLs for the carousel pin to promote.</value>
        [DataMember(Name = "carousel_destination_urls", EmitDefaultValue = true)]
        public List<string> CarouselDestinationUrls { get; set; }

        /// <summary>
        /// Comma-separated deep links for the carousel pin on iOS.
        /// </summary>
        /// <value>Comma-separated deep links for the carousel pin on iOS.</value>
        [DataMember(Name = "carousel_ios_deep_links", EmitDefaultValue = true)]
        public List<string> CarouselIosDeepLinks { get; set; }

        /// <summary>
        /// Tracking url for the ad clicks.
        /// </summary>
        /// <value>Tracking url for the ad clicks.</value>
        [DataMember(Name = "click_tracking_url", EmitDefaultValue = true)]
        public string ClickTrackingUrl { get; set; }

        /// <summary>
        /// Destination URL.
        /// </summary>
        /// <value>Destination URL.</value>
        [DataMember(Name = "destination_url", EmitDefaultValue = true)]
        public string DestinationUrl { get; set; }

        /// <summary>
        /// Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
        /// </summary>
        /// <value>Deep link URL for iOS devices. Not currently available. Using this field will generate an error.</value>
        [DataMember(Name = "ios_deep_link", EmitDefaultValue = true)]
        public string IosDeepLink { get; set; }

        /// <summary>
        /// Is original pin deleted?
        /// </summary>
        /// <value>Is original pin deleted?</value>
        [DataMember(Name = "is_pin_deleted", EmitDefaultValue = true)]
        public bool IsPinDeleted { get; set; }

        /// <summary>
        /// Is pin repinnable?
        /// </summary>
        /// <value>Is pin repinnable?</value>
        [DataMember(Name = "is_removable", EmitDefaultValue = true)]
        public bool IsRemovable { get; set; }

        /// <summary>
        /// Name of the ad - 255 chars max.
        /// </summary>
        /// <value>Name of the ad - 255 chars max.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Pin ID.
        /// </summary>
        /// <value>Pin ID.</value>
        [DataMember(Name = "pin_id", EmitDefaultValue = false)]
        public string PinId { get; set; }

        /// <summary>
        /// Gets or Sets TrackingUrls
        /// </summary>
        [DataMember(Name = "tracking_urls", EmitDefaultValue = true)]
        public TrackingUrls TrackingUrls { get; set; }

        /// <summary>
        /// Tracking URL for ad impressions.
        /// </summary>
        /// <value>Tracking URL for ad impressions.</value>
        [DataMember(Name = "view_tracking_url", EmitDefaultValue = true)]
        public string ViewTrackingUrl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AdResponseAllOf {\n");
            sb.Append("  AdGroupId: ").Append(AdGroupId).Append("\n");
            sb.Append("  AndroidDeepLink: ").Append(AndroidDeepLink).Append("\n");
            sb.Append("  CarouselAndroidDeepLinks: ").Append(CarouselAndroidDeepLinks).Append("\n");
            sb.Append("  CarouselDestinationUrls: ").Append(CarouselDestinationUrls).Append("\n");
            sb.Append("  CarouselIosDeepLinks: ").Append(CarouselIosDeepLinks).Append("\n");
            sb.Append("  ClickTrackingUrl: ").Append(ClickTrackingUrl).Append("\n");
            sb.Append("  CreativeType: ").Append(CreativeType).Append("\n");
            sb.Append("  DestinationUrl: ").Append(DestinationUrl).Append("\n");
            sb.Append("  IosDeepLink: ").Append(IosDeepLink).Append("\n");
            sb.Append("  IsPinDeleted: ").Append(IsPinDeleted).Append("\n");
            sb.Append("  IsRemovable: ").Append(IsRemovable).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  PinId: ").Append(PinId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  TrackingUrls: ").Append(TrackingUrls).Append("\n");
            sb.Append("  ViewTrackingUrl: ").Append(ViewTrackingUrl).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AdResponseAllOf);
        }

        /// <summary>
        /// Returns true if AdResponseAllOf instances are equal
        /// </summary>
        /// <param name="input">Instance of AdResponseAllOf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdResponseAllOf input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AdGroupId == input.AdGroupId ||
                    (this.AdGroupId != null &&
                    this.AdGroupId.Equals(input.AdGroupId))
                ) && 
                (
                    this.AndroidDeepLink == input.AndroidDeepLink ||
                    (this.AndroidDeepLink != null &&
                    this.AndroidDeepLink.Equals(input.AndroidDeepLink))
                ) && 
                (
                    this.CarouselAndroidDeepLinks == input.CarouselAndroidDeepLinks ||
                    this.CarouselAndroidDeepLinks != null &&
                    input.CarouselAndroidDeepLinks != null &&
                    this.CarouselAndroidDeepLinks.SequenceEqual(input.CarouselAndroidDeepLinks)
                ) && 
                (
                    this.CarouselDestinationUrls == input.CarouselDestinationUrls ||
                    this.CarouselDestinationUrls != null &&
                    input.CarouselDestinationUrls != null &&
                    this.CarouselDestinationUrls.SequenceEqual(input.CarouselDestinationUrls)
                ) && 
                (
                    this.CarouselIosDeepLinks == input.CarouselIosDeepLinks ||
                    this.CarouselIosDeepLinks != null &&
                    input.CarouselIosDeepLinks != null &&
                    this.CarouselIosDeepLinks.SequenceEqual(input.CarouselIosDeepLinks)
                ) && 
                (
                    this.ClickTrackingUrl == input.ClickTrackingUrl ||
                    (this.ClickTrackingUrl != null &&
                    this.ClickTrackingUrl.Equals(input.ClickTrackingUrl))
                ) && 
                (
                    this.CreativeType == input.CreativeType ||
                    this.CreativeType.Equals(input.CreativeType)
                ) && 
                (
                    this.DestinationUrl == input.DestinationUrl ||
                    (this.DestinationUrl != null &&
                    this.DestinationUrl.Equals(input.DestinationUrl))
                ) && 
                (
                    this.IosDeepLink == input.IosDeepLink ||
                    (this.IosDeepLink != null &&
                    this.IosDeepLink.Equals(input.IosDeepLink))
                ) && 
                (
                    this.IsPinDeleted == input.IsPinDeleted ||
                    this.IsPinDeleted.Equals(input.IsPinDeleted)
                ) && 
                (
                    this.IsRemovable == input.IsRemovable ||
                    this.IsRemovable.Equals(input.IsRemovable)
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.PinId == input.PinId ||
                    (this.PinId != null &&
                    this.PinId.Equals(input.PinId))
                ) && 
                (
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
                ) && 
                (
                    this.TrackingUrls == input.TrackingUrls ||
                    (this.TrackingUrls != null &&
                    this.TrackingUrls.Equals(input.TrackingUrls))
                ) && 
                (
                    this.ViewTrackingUrl == input.ViewTrackingUrl ||
                    (this.ViewTrackingUrl != null &&
                    this.ViewTrackingUrl.Equals(input.ViewTrackingUrl))
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
                int hashCode = 41;
                if (this.AdGroupId != null)
                {
                    hashCode = (hashCode * 59) + this.AdGroupId.GetHashCode();
                }
                if (this.AndroidDeepLink != null)
                {
                    hashCode = (hashCode * 59) + this.AndroidDeepLink.GetHashCode();
                }
                if (this.CarouselAndroidDeepLinks != null)
                {
                    hashCode = (hashCode * 59) + this.CarouselAndroidDeepLinks.GetHashCode();
                }
                if (this.CarouselDestinationUrls != null)
                {
                    hashCode = (hashCode * 59) + this.CarouselDestinationUrls.GetHashCode();
                }
                if (this.CarouselIosDeepLinks != null)
                {
                    hashCode = (hashCode * 59) + this.CarouselIosDeepLinks.GetHashCode();
                }
                if (this.ClickTrackingUrl != null)
                {
                    hashCode = (hashCode * 59) + this.ClickTrackingUrl.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.CreativeType.GetHashCode();
                if (this.DestinationUrl != null)
                {
                    hashCode = (hashCode * 59) + this.DestinationUrl.GetHashCode();
                }
                if (this.IosDeepLink != null)
                {
                    hashCode = (hashCode * 59) + this.IosDeepLink.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsPinDeleted.GetHashCode();
                hashCode = (hashCode * 59) + this.IsRemovable.GetHashCode();
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.PinId != null)
                {
                    hashCode = (hashCode * 59) + this.PinId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Status.GetHashCode();
                if (this.TrackingUrls != null)
                {
                    hashCode = (hashCode * 59) + this.TrackingUrls.GetHashCode();
                }
                if (this.ViewTrackingUrl != null)
                {
                    hashCode = (hashCode * 59) + this.ViewTrackingUrl.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            // AdGroupId (string) pattern
            Regex regexAdGroupId = new Regex(@"^\\d+$", RegexOptions.CultureInvariant);
            if (false == regexAdGroupId.Match(this.AdGroupId).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AdGroupId, must match a pattern of " + regexAdGroupId, new [] { "AdGroupId" });
            }

            // PinId (string) pattern
            Regex regexPinId = new Regex(@"^\\d+$", RegexOptions.CultureInvariant);
            if (false == regexPinId.Match(this.PinId).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PinId, must match a pattern of " + regexPinId, new [] { "PinId" });
            }

            yield break;
        }
    }

}