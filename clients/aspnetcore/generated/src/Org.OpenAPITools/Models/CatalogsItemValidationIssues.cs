/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
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
    public partial class CatalogsItemValidationIssues : IEquatable<CatalogsItemValidationIssues>
    {
        /// <summary>
        /// Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation.
        /// </summary>
        /// <value>Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation.</value>
        /// <example>0</example>
        [Required]
        [DataMember(Name="item_number", EmitDefaultValue=true)]
        public int ItemNumber { get; set; }

        /// <summary>
        /// The merchant-created unique ID that represents the product.
        /// </summary>
        /// <value>The merchant-created unique ID that represents the product.</value>
        /// <example>DS0294-L</example>
        [Required]
        [DataMember(Name="item_id", EmitDefaultValue=true)]
        public string ItemId { get; set; }

        /// <summary>
        /// Gets or Sets Errors
        /// </summary>
        [Required]
        [DataMember(Name="errors", EmitDefaultValue=false)]
        public CatalogsItemValidationErrors Errors { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [Required]
        [DataMember(Name="warnings", EmitDefaultValue=false)]
        public CatalogsItemValidationWarnings Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CatalogsItemValidationIssues {\n");
            sb.Append("  ItemNumber: ").Append(ItemNumber).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  Errors: ").Append(Errors).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CatalogsItemValidationIssues)obj);
        }

        /// <summary>
        /// Returns true if CatalogsItemValidationIssues instances are equal
        /// </summary>
        /// <param name="other">Instance of CatalogsItemValidationIssues to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CatalogsItemValidationIssues other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ItemNumber == other.ItemNumber ||
                    
                    ItemNumber.Equals(other.ItemNumber)
                ) && 
                (
                    ItemId == other.ItemId ||
                    ItemId != null &&
                    ItemId.Equals(other.ItemId)
                ) && 
                (
                    Errors == other.Errors ||
                    Errors != null &&
                    Errors.Equals(other.Errors)
                ) && 
                (
                    Warnings == other.Warnings ||
                    Warnings != null &&
                    Warnings.Equals(other.Warnings)
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
                    
                    hashCode = hashCode * 59 + ItemNumber.GetHashCode();
                    if (ItemId != null)
                    hashCode = hashCode * 59 + ItemId.GetHashCode();
                    if (Errors != null)
                    hashCode = hashCode * 59 + Errors.GetHashCode();
                    if (Warnings != null)
                    hashCode = hashCode * 59 + Warnings.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CatalogsItemValidationIssues left, CatalogsItemValidationIssues right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CatalogsItemValidationIssues left, CatalogsItemValidationIssues right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}