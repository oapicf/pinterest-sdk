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
    public partial class ProductGroupAnalyticsResponseInner : IEquatable<ProductGroupAnalyticsResponseInner>
    {
        /// <summary>
        /// The ID of the product group that this metrics belongs to.
        /// </summary>
        /// <value>The ID of the product group that this metrics belongs to.</value>
        [Required]
        [RegularExpression("^\\d+$")]
        [DataMember(Name="PRODUCT_GROUP_ID", EmitDefaultValue=false)]
        public string PRODUCT_GROUP_ID { get; set; }

        /// <summary>
        /// Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
        /// </summary>
        /// <value>Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)</value>
        [DataMember(Name="DATE", EmitDefaultValue=false)]
        public DateTime DATE { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProductGroupAnalyticsResponseInner {\n");
            sb.Append("  PRODUCT_GROUP_ID: ").Append(PRODUCT_GROUP_ID).Append("\n");
            sb.Append("  DATE: ").Append(DATE).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ProductGroupAnalyticsResponseInner)obj);
        }

        /// <summary>
        /// Returns true if ProductGroupAnalyticsResponseInner instances are equal
        /// </summary>
        /// <param name="other">Instance of ProductGroupAnalyticsResponseInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProductGroupAnalyticsResponseInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    PRODUCT_GROUP_ID == other.PRODUCT_GROUP_ID ||
                    PRODUCT_GROUP_ID != null &&
                    PRODUCT_GROUP_ID.Equals(other.PRODUCT_GROUP_ID)
                ) && 
                (
                    DATE == other.DATE ||
                    DATE != null &&
                    DATE.Equals(other.DATE)
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
                    if (PRODUCT_GROUP_ID != null)
                    hashCode = hashCode * 59 + PRODUCT_GROUP_ID.GetHashCode();
                    if (DATE != null)
                    hashCode = hashCode * 59 + DATE.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ProductGroupAnalyticsResponseInner left, ProductGroupAnalyticsResponseInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ProductGroupAnalyticsResponseInner left, ProductGroupAnalyticsResponseInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}