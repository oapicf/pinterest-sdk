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
    /// Object describing an item record
    /// </summary>
    [DataContract]
    public partial class ItemResponse : IEquatable<ItemResponse>
    {
        /// <summary>
        /// Gets or Sets CatalogType
        /// </summary>
        [Required]
        [DataMember(Name="catalog_type", EmitDefaultValue=true)]
        public CatalogsType CatalogType { get; set; }

        /// <summary>
        /// The catalog item id in the merchant namespace
        /// </summary>
        /// <value>The catalog item id in the merchant namespace</value>
        /* <example>DS0294-M</example> */
        [DataMember(Name="item_id", EmitDefaultValue=false)]
        public string ItemId { get; set; }

        /// <summary>
        /// Array with the errors for the item id requested
        /// </summary>
        /// <value>Array with the errors for the item id requested</value>
        [DataMember(Name="errors", EmitDefaultValue=false)]
        public List<ItemValidationEvent> Errors { get; set; }

        /// <summary>
        /// The catalog hotel id in the merchant namespace
        /// </summary>
        /// <value>The catalog hotel id in the merchant namespace</value>
        /* <example>DS0294-M</example> */
        [DataMember(Name="hotel_id", EmitDefaultValue=false)]
        public string HotelId { get; set; }

        /// <summary>
        /// The catalog creative assets id in the merchant namespace
        /// </summary>
        /// <value>The catalog creative assets id in the merchant namespace</value>
        /* <example>DS0294-M</example> */
        [DataMember(Name="creative_assets_id", EmitDefaultValue=false)]
        public string CreativeAssetsId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ItemResponse {\n");
            sb.Append("  CatalogType: ").Append(CatalogType).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  Errors: ").Append(Errors).Append("\n");
            sb.Append("  HotelId: ").Append(HotelId).Append("\n");
            sb.Append("  CreativeAssetsId: ").Append(CreativeAssetsId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ItemResponse)obj);
        }

        /// <summary>
        /// Returns true if ItemResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of ItemResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ItemResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CatalogType == other.CatalogType ||
                    
                    CatalogType.Equals(other.CatalogType)
                ) && 
                (
                    ItemId == other.ItemId ||
                    ItemId != null &&
                    ItemId.Equals(other.ItemId)
                ) && 
                (
                    Errors == other.Errors ||
                    Errors != null &&
                    other.Errors != null &&
                    Errors.SequenceEqual(other.Errors)
                ) && 
                (
                    HotelId == other.HotelId ||
                    HotelId != null &&
                    HotelId.Equals(other.HotelId)
                ) && 
                (
                    CreativeAssetsId == other.CreativeAssetsId ||
                    CreativeAssetsId != null &&
                    CreativeAssetsId.Equals(other.CreativeAssetsId)
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
                    
                    hashCode = hashCode * 59 + CatalogType.GetHashCode();
                    if (ItemId != null)
                    hashCode = hashCode * 59 + ItemId.GetHashCode();
                    if (Errors != null)
                    hashCode = hashCode * 59 + Errors.GetHashCode();
                    if (HotelId != null)
                    hashCode = hashCode * 59 + HotelId.GetHashCode();
                    if (CreativeAssetsId != null)
                    hashCode = hashCode * 59 + CreativeAssetsId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ItemResponse left, ItemResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ItemResponse left, ItemResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
