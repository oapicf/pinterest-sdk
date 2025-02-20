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
    /// An exception object if there is an error performing the action. Will only be provided if there is an error.
    /// </summary>
    [DataContract]
    public partial class InviteExceptionResponse : IEquatable<InviteExceptionResponse>
    {
        /// <summary>
        /// Unique identifier of the invite/request.
        /// </summary>
        /// <value>Unique identifier of the invite/request.</value>
        /* <example>383791336903426391</example> */
        [RegularExpression("^\\d+$")]
        [DataMember(Name="invite_or_request_id", EmitDefaultValue=true)]
        public string InviteOrRequestId { get; set; }

        /// <summary>
        /// Error code associated with the error in performing the action on the invite/request.
        /// </summary>
        /// <value>Error code associated with the error in performing the action on the invite/request.</value>
        /* <example>403</example> */
        [DataMember(Name="code", EmitDefaultValue=true)]
        public int Code { get; set; }

        /// <summary>
        /// Error message associated with the error in performing the action on the invite/request.
        /// </summary>
        /// <value>Error message associated with the error in performing the action on the invite/request.</value>
        /* <example>You hit the maximum number of pending invites allowed.</example> */
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// A list of users&#39; usernames or emails OR a list of partner ids that caused the error.
        /// </summary>
        /// <value>A list of users&#39; usernames or emails OR a list of partner ids that caused the error.</value>
        /* <example>[&quot;businessMember0101&quot;,&quot;business+member@business.com&quot;]</example> */
        [DataMember(Name="users_or_partner_ids", EmitDefaultValue=true)]
        public List<string> UsersOrPartnerIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InviteExceptionResponse {\n");
            sb.Append("  InviteOrRequestId: ").Append(InviteOrRequestId).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  UsersOrPartnerIds: ").Append(UsersOrPartnerIds).Append("\n");
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
            return obj.GetType() == GetType() && Equals((InviteExceptionResponse)obj);
        }

        /// <summary>
        /// Returns true if InviteExceptionResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of InviteExceptionResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InviteExceptionResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    InviteOrRequestId == other.InviteOrRequestId ||
                    InviteOrRequestId != null &&
                    InviteOrRequestId.Equals(other.InviteOrRequestId)
                ) && 
                (
                    Code == other.Code ||
                    
                    Code.Equals(other.Code)
                ) && 
                (
                    Message == other.Message ||
                    Message != null &&
                    Message.Equals(other.Message)
                ) && 
                (
                    UsersOrPartnerIds == other.UsersOrPartnerIds ||
                    UsersOrPartnerIds != null &&
                    other.UsersOrPartnerIds != null &&
                    UsersOrPartnerIds.SequenceEqual(other.UsersOrPartnerIds)
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
                    if (InviteOrRequestId != null)
                    hashCode = hashCode * 59 + InviteOrRequestId.GetHashCode();
                    
                    hashCode = hashCode * 59 + Code.GetHashCode();
                    if (Message != null)
                    hashCode = hashCode * 59 + Message.GetHashCode();
                    if (UsersOrPartnerIds != null)
                    hashCode = hashCode * 59 + UsersOrPartnerIds.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(InviteExceptionResponse left, InviteExceptionResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(InviteExceptionResponse left, InviteExceptionResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
