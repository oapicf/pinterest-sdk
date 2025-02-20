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
    public partial class TargetingTemplateAudienceSizingReachEstimate : IEquatable<TargetingTemplateAudienceSizingReachEstimate>
    {
        /// <summary>
        /// Gets or Sets Estimate
        /// </summary>
        /* <example>63492000</example> */
        [DataMember(Name="estimate", EmitDefaultValue=true)]
        public long Estimate { get; set; }

        /// <summary>
        /// Gets or Sets LowerBound
        /// </summary>
        /* <example>47619000</example> */
        [DataMember(Name="lower_bound", EmitDefaultValue=true)]
        public long LowerBound { get; set; }

        /// <summary>
        /// Gets or Sets UpperBound
        /// </summary>
        /* <example>79365000</example> */
        [DataMember(Name="upper_bound", EmitDefaultValue=true)]
        public long UpperBound { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TargetingTemplateAudienceSizingReachEstimate {\n");
            sb.Append("  Estimate: ").Append(Estimate).Append("\n");
            sb.Append("  LowerBound: ").Append(LowerBound).Append("\n");
            sb.Append("  UpperBound: ").Append(UpperBound).Append("\n");
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
            return obj.GetType() == GetType() && Equals((TargetingTemplateAudienceSizingReachEstimate)obj);
        }

        /// <summary>
        /// Returns true if TargetingTemplateAudienceSizingReachEstimate instances are equal
        /// </summary>
        /// <param name="other">Instance of TargetingTemplateAudienceSizingReachEstimate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TargetingTemplateAudienceSizingReachEstimate other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Estimate == other.Estimate ||
                    
                    Estimate.Equals(other.Estimate)
                ) && 
                (
                    LowerBound == other.LowerBound ||
                    
                    LowerBound.Equals(other.LowerBound)
                ) && 
                (
                    UpperBound == other.UpperBound ||
                    
                    UpperBound.Equals(other.UpperBound)
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
                    
                    hashCode = hashCode * 59 + Estimate.GetHashCode();
                    
                    hashCode = hashCode * 59 + LowerBound.GetHashCode();
                    
                    hashCode = hashCode * 59 + UpperBound.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(TargetingTemplateAudienceSizingReachEstimate left, TargetingTemplateAudienceSizingReachEstimate right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(TargetingTemplateAudienceSizingReachEstimate left, TargetingTemplateAudienceSizingReachEstimate right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
