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
    /// Request to create test data for lead data test API.
    /// </summary>
    [DataContract]
    public partial class LeadFormTestRequest : IEquatable<LeadFormTestRequest>
    {
        /// <summary>
        /// Test lead answers. Should follow the creation order.
        /// </summary>
        /// <value>Test lead answers. Should follow the creation order.</value>
        /* <example>[&quot;John&quot;,&quot;Doe&quot;,&quot;abc@email.com&quot;,&quot;987654321&quot;]</example> */
        [Required]
        [DataMember(Name="answers", EmitDefaultValue=false)]
        public List<string> Answers { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LeadFormTestRequest {\n");
            sb.Append("  Answers: ").Append(Answers).Append("\n");
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
            return obj.GetType() == GetType() && Equals((LeadFormTestRequest)obj);
        }

        /// <summary>
        /// Returns true if LeadFormTestRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of LeadFormTestRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LeadFormTestRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Answers == other.Answers ||
                    Answers != null &&
                    other.Answers != null &&
                    Answers.SequenceEqual(other.Answers)
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
                    if (Answers != null)
                    hashCode = hashCode * 59 + Answers.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(LeadFormTestRequest left, LeadFormTestRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(LeadFormTestRequest left, LeadFormTestRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
