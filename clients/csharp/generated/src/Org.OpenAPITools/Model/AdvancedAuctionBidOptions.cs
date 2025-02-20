/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
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
    /// Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).
    /// </summary>
    [DataContract(Name = "AdvancedAuctionBidOptions")]
    public partial class AdvancedAuctionBidOptions : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AdvancedAuctionBidOptions" /> class.
        /// </summary>
        /// <param name="bidInMicroCurrency">Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group&#39;s &#x60;bid_in_micro_currency&#x60;..</param>
        /// <param name="appTypeMultipliers">appTypeMultipliers.</param>
        /// <param name="placementMultipliers">placementMultipliers.</param>
        public AdvancedAuctionBidOptions(long? bidInMicroCurrency = default(long?), AppTypeMultipliers appTypeMultipliers = default(AppTypeMultipliers), PlacementMultipliers placementMultipliers = default(PlacementMultipliers))
        {
            this.BidInMicroCurrency = bidInMicroCurrency;
            this.AppTypeMultipliers = appTypeMultipliers;
            this.PlacementMultipliers = placementMultipliers;
        }

        /// <summary>
        /// Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group&#39;s &#x60;bid_in_micro_currency&#x60;.
        /// </summary>
        /// <value>Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group&#39;s &#x60;bid_in_micro_currency&#x60;.</value>
        /*
        <example>5000000</example>
        */
        [DataMember(Name = "bid_in_micro_currency", EmitDefaultValue = true)]
        public long? BidInMicroCurrency { get; set; }

        /// <summary>
        /// Gets or Sets AppTypeMultipliers
        /// </summary>
        [DataMember(Name = "app_type_multipliers", EmitDefaultValue = true)]
        public AppTypeMultipliers AppTypeMultipliers { get; set; }

        /// <summary>
        /// Gets or Sets PlacementMultipliers
        /// </summary>
        [DataMember(Name = "placement_multipliers", EmitDefaultValue = true)]
        public PlacementMultipliers PlacementMultipliers { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AdvancedAuctionBidOptions {\n");
            sb.Append("  BidInMicroCurrency: ").Append(BidInMicroCurrency).Append("\n");
            sb.Append("  AppTypeMultipliers: ").Append(AppTypeMultipliers).Append("\n");
            sb.Append("  PlacementMultipliers: ").Append(PlacementMultipliers).Append("\n");
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
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
