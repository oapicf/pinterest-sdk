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
    public partial class CustomLabel4Filter : IEquatable<CustomLabel4Filter>
    {
        /// <summary>
        /// Gets or Sets CUSTOMLABEL4
        /// </summary>
        [Required]
        [DataMember(Name="CUSTOM_LABEL_4", EmitDefaultValue=false)]
        public CatalogsProductGroupMultipleStringCriteria CUSTOMLABEL4 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CustomLabel4Filter {\n");
            sb.Append("  CUSTOMLABEL4: ").Append(CUSTOMLABEL4).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CustomLabel4Filter)obj);
        }

        /// <summary>
        /// Returns true if CustomLabel4Filter instances are equal
        /// </summary>
        /// <param name="other">Instance of CustomLabel4Filter to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CustomLabel4Filter other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CUSTOMLABEL4 == other.CUSTOMLABEL4 ||
                    CUSTOMLABEL4 != null &&
                    CUSTOMLABEL4.Equals(other.CUSTOMLABEL4)
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
                    if (CUSTOMLABEL4 != null)
                    hashCode = hashCode * 59 + CUSTOMLABEL4.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CustomLabel4Filter left, CustomLabel4Filter right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CustomLabel4Filter left, CustomLabel4Filter right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
