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
    /// Object describing an item bid option upsert operation
    /// </summary>
    [DataContract]
    public partial class AdvancedAuctionItemsSubmitUpsertRecord : IEquatable<AdvancedAuctionItemsSubmitUpsertRecord>
    {
        /// <summary>
        /// The catalog retail item id in the merchant namespace
        /// </summary>
        /// <value>The catalog retail item id in the merchant namespace</value>
        /* <example>DS0294-M</example> */
        [Required]
        [DataMember(Name="item_id", EmitDefaultValue=false)]
        public string ItemId { get; set; }

        /// <summary>
        /// Gets or Sets Country
        /// </summary>
        [Required]
        [DataMember(Name="country", EmitDefaultValue=true)]
        public Country Country { get; set; }

        /// <summary>
        /// Gets or Sets Language
        /// </summary>
        [Required]
        [DataMember(Name="language", EmitDefaultValue=true)]
        public Language Language { get; set; }

        /// <summary>
        /// Gets or Sets BidOptions
        /// </summary>
        [Required]
        [DataMember(Name="bid_options", EmitDefaultValue=false)]
        public AdvancedAuctionBidOptions BidOptions { get; set; }

        /// <summary>
        /// The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;.
        /// </summary>
        /// <value>The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;.</value>
        /* <example>[&quot;BID&quot;,&quot;APP_TYPE_BID_MULTIPLIER_SET&quot;]</example> */
        [Required]
        [DataMember(Name="update_mask", EmitDefaultValue=true)]
        public List<UpdateMaskBidOptionField> UpdateMask { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AdvancedAuctionItemsSubmitUpsertRecord {\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
            sb.Append("  BidOptions: ").Append(BidOptions).Append("\n");
            sb.Append("  UpdateMask: ").Append(UpdateMask).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AdvancedAuctionItemsSubmitUpsertRecord)obj);
        }

        /// <summary>
        /// Returns true if AdvancedAuctionItemsSubmitUpsertRecord instances are equal
        /// </summary>
        /// <param name="other">Instance of AdvancedAuctionItemsSubmitUpsertRecord to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdvancedAuctionItemsSubmitUpsertRecord other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ItemId == other.ItemId ||
                    ItemId != null &&
                    ItemId.Equals(other.ItemId)
                ) && 
                (
                    Country == other.Country ||
                    
                    Country.Equals(other.Country)
                ) && 
                (
                    Language == other.Language ||
                    
                    Language.Equals(other.Language)
                ) && 
                (
                    BidOptions == other.BidOptions ||
                    BidOptions != null &&
                    BidOptions.Equals(other.BidOptions)
                ) && 
                (
                    UpdateMask == other.UpdateMask ||
                    UpdateMask != null &&
                    other.UpdateMask != null &&
                    UpdateMask.SequenceEqual(other.UpdateMask)
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
                    if (ItemId != null)
                    hashCode = hashCode * 59 + ItemId.GetHashCode();
                    
                    hashCode = hashCode * 59 + Country.GetHashCode();
                    
                    hashCode = hashCode * 59 + Language.GetHashCode();
                    if (BidOptions != null)
                    hashCode = hashCode * 59 + BidOptions.GetHashCode();
                    if (UpdateMask != null)
                    hashCode = hashCode * 59 + UpdateMask.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AdvancedAuctionItemsSubmitUpsertRecord left, AdvancedAuctionItemsSubmitUpsertRecord right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AdvancedAuctionItemsSubmitUpsertRecord left, AdvancedAuctionItemsSubmitUpsertRecord right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
