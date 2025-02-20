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
    public partial class ConversionEventResponse : IEquatable<ConversionEventResponse>
    {
        /// <summary>
        /// Gets or Sets ConversionEvent
        /// </summary>
        [DataMember(Name="conversion_event", EmitDefaultValue=true)]
        public ConversionTagType ConversionEvent { get; set; }

        /// <summary>
        /// Id of the tag.
        /// </summary>
        /// <value>Id of the tag.</value>
        /* <example>2614324385652</example> */
        [RegularExpression("^\\d+$")]
        [DataMember(Name="conversion_tag_id", EmitDefaultValue=false)]
        public string ConversionTagId { get; set; }

        /// <summary>
        /// Id of the ad account.
        /// </summary>
        /// <value>Id of the ad account.</value>
        /* <example>549757463328</example> */
        [RegularExpression("^\\d+$")]
        [DataMember(Name="ad_account_id", EmitDefaultValue=false)]
        public string AdAccountId { get; set; }

        /// <summary>
        /// Creation date in epoch format.
        /// </summary>
        /// <value>Creation date in epoch format.</value>
        /* <example>1564768710</example> */
        [DataMember(Name="created_time", EmitDefaultValue=true)]
        public int CreatedTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConversionEventResponse {\n");
            sb.Append("  ConversionEvent: ").Append(ConversionEvent).Append("\n");
            sb.Append("  ConversionTagId: ").Append(ConversionTagId).Append("\n");
            sb.Append("  AdAccountId: ").Append(AdAccountId).Append("\n");
            sb.Append("  CreatedTime: ").Append(CreatedTime).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ConversionEventResponse)obj);
        }

        /// <summary>
        /// Returns true if ConversionEventResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of ConversionEventResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConversionEventResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ConversionEvent == other.ConversionEvent ||
                    
                    ConversionEvent.Equals(other.ConversionEvent)
                ) && 
                (
                    ConversionTagId == other.ConversionTagId ||
                    ConversionTagId != null &&
                    ConversionTagId.Equals(other.ConversionTagId)
                ) && 
                (
                    AdAccountId == other.AdAccountId ||
                    AdAccountId != null &&
                    AdAccountId.Equals(other.AdAccountId)
                ) && 
                (
                    CreatedTime == other.CreatedTime ||
                    
                    CreatedTime.Equals(other.CreatedTime)
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
                    
                    hashCode = hashCode * 59 + ConversionEvent.GetHashCode();
                    if (ConversionTagId != null)
                    hashCode = hashCode * 59 + ConversionTagId.GetHashCode();
                    if (AdAccountId != null)
                    hashCode = hashCode * 59 + AdAccountId.GetHashCode();
                    
                    hashCode = hashCode * 59 + CreatedTime.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ConversionEventResponse left, ConversionEventResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ConversionEventResponse left, ConversionEventResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
