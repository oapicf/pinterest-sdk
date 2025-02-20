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
    /// Metadata for the invite/request.
    /// </summary>
    [DataContract]
    public partial class BaseInviteDataResponseInviteData : IEquatable<BaseInviteDataResponseInviteData>
    {
        /// <summary>
        /// The date and time when the invite/request will expire. Returned in milliseconds.
        /// </summary>
        /// <value>The date and time when the invite/request will expire. Returned in milliseconds.</value>
        /* <example>1709748104775</example> */
        [DataMember(Name="invite_expiration", EmitDefaultValue=true)]
        public int InviteExpiration { get; set; }

        /// <summary>
        /// The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
        /// </summary>
        /// <value>The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.</value>
        /* <example>PENDING</example> */
        [DataMember(Name="invite_status", EmitDefaultValue=false)]
        public string InviteStatus { get; set; }

        /// <summary>
        /// The type of invite. &lt;br&gt;&#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. &lt;br&gt;&#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. &lt;br&gt;&#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.
        /// </summary>
        /// <value>The type of invite. &lt;br&gt;&#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. &lt;br&gt;&#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. &lt;br&gt;&#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.</value>
        /* <example>MEMBER_INVITE</example> */
        [DataMember(Name="invite_type", EmitDefaultValue=false)]
        public string InviteType { get; set; }

        /// <summary>
        /// The date and time the invite/request was last updated. Returned in milliseconds.
        /// </summary>
        /// <value>The date and time the invite/request was last updated. Returned in milliseconds.</value>
        /* <example>1646767577816</example> */
        [DataMember(Name="last_updated_time", EmitDefaultValue=true)]
        public int LastUpdatedTime { get; set; }

        /// <summary>
        /// The date and time the invite/request was sent/created. Returned in milliseconds.
        /// </summary>
        /// <value>The date and time the invite/request was sent/created. Returned in milliseconds.</value>
        /* <example>1646767577816</example> */
        [DataMember(Name="sent_at", EmitDefaultValue=true)]
        public int SentAt { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BaseInviteDataResponseInviteData {\n");
            sb.Append("  InviteExpiration: ").Append(InviteExpiration).Append("\n");
            sb.Append("  InviteStatus: ").Append(InviteStatus).Append("\n");
            sb.Append("  InviteType: ").Append(InviteType).Append("\n");
            sb.Append("  LastUpdatedTime: ").Append(LastUpdatedTime).Append("\n");
            sb.Append("  SentAt: ").Append(SentAt).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BaseInviteDataResponseInviteData)obj);
        }

        /// <summary>
        /// Returns true if BaseInviteDataResponseInviteData instances are equal
        /// </summary>
        /// <param name="other">Instance of BaseInviteDataResponseInviteData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BaseInviteDataResponseInviteData other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    InviteExpiration == other.InviteExpiration ||
                    
                    InviteExpiration.Equals(other.InviteExpiration)
                ) && 
                (
                    InviteStatus == other.InviteStatus ||
                    InviteStatus != null &&
                    InviteStatus.Equals(other.InviteStatus)
                ) && 
                (
                    InviteType == other.InviteType ||
                    InviteType != null &&
                    InviteType.Equals(other.InviteType)
                ) && 
                (
                    LastUpdatedTime == other.LastUpdatedTime ||
                    
                    LastUpdatedTime.Equals(other.LastUpdatedTime)
                ) && 
                (
                    SentAt == other.SentAt ||
                    
                    SentAt.Equals(other.SentAt)
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
                    
                    hashCode = hashCode * 59 + InviteExpiration.GetHashCode();
                    if (InviteStatus != null)
                    hashCode = hashCode * 59 + InviteStatus.GetHashCode();
                    if (InviteType != null)
                    hashCode = hashCode * 59 + InviteType.GetHashCode();
                    
                    hashCode = hashCode * 59 + LastUpdatedTime.GetHashCode();
                    
                    hashCode = hashCode * 59 + SentAt.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BaseInviteDataResponseInviteData left, BaseInviteDataResponseInviteData right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BaseInviteDataResponseInviteData left, BaseInviteDataResponseInviteData right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
