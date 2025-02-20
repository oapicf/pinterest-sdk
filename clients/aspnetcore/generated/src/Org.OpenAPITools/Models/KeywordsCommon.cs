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
    public partial class KeywordsCommon : IEquatable<KeywordsCommon>
    {
        /// <summary>
        /// &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
        /// </summary>
        /// <value>&lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.</value>
        [DataMember(Name="bid", EmitDefaultValue=true)]
        public int? Bid { get; set; }

        /// <summary>
        /// Gets or Sets MatchType
        /// </summary>
        [Required]
        [DataMember(Name="match_type", EmitDefaultValue=true)]
        public MatchTypeResponse? MatchType { get; set; }

        /// <summary>
        /// Keyword value (120 chars max).
        /// </summary>
        /// <value>Keyword value (120 chars max).</value>
        [Required]
        [DataMember(Name="value", EmitDefaultValue=false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class KeywordsCommon {\n");
            sb.Append("  Bid: ").Append(Bid).Append("\n");
            sb.Append("  MatchType: ").Append(MatchType).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return obj.GetType() == GetType() && Equals((KeywordsCommon)obj);
        }

        /// <summary>
        /// Returns true if KeywordsCommon instances are equal
        /// </summary>
        /// <param name="other">Instance of KeywordsCommon to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KeywordsCommon other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Bid == other.Bid ||
                    Bid != null &&
                    Bid.Equals(other.Bid)
                ) && 
                (
                    MatchType == other.MatchType ||
                    
                    MatchType.Equals(other.MatchType)
                ) && 
                (
                    Value == other.Value ||
                    Value != null &&
                    Value.Equals(other.Value)
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
                    if (Bid != null)
                    hashCode = hashCode * 59 + Bid.GetHashCode();
                    
                    hashCode = hashCode * 59 + MatchType.GetHashCode();
                    if (Value != null)
                    hashCode = hashCode * 59 + Value.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(KeywordsCommon left, KeywordsCommon right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(KeywordsCommon left, KeywordsCommon right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
