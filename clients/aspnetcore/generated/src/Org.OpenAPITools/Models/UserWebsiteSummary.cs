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
    public partial class UserWebsiteSummary : IEquatable<UserWebsiteSummary>
    {
        /// <summary>
        /// Website with path or domain only
        /// </summary>
        /// <value>Website with path or domain only</value>
        /* <example>mysite.test</example> */
        [DataMember(Name="website", EmitDefaultValue=false)]
        public string Website { get; set; }

        /// <summary>
        /// Status of the verification process
        /// </summary>
        /// <value>Status of the verification process</value>
        /* <example>success</example> */
        [DataMember(Name="status", EmitDefaultValue=false)]
        public string Status { get; set; }

        /// <summary>
        /// UTC timestamp when the verification happened - sometimes missing
        /// </summary>
        /// <value>UTC timestamp when the verification happened - sometimes missing</value>
        /* <example>2022-12-14T21:03:01.602000</example> */
        [DataMember(Name="verified_at", EmitDefaultValue=false)]
        public string VerifiedAt { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserWebsiteSummary {\n");
            sb.Append("  Website: ").Append(Website).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  VerifiedAt: ").Append(VerifiedAt).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UserWebsiteSummary)obj);
        }

        /// <summary>
        /// Returns true if UserWebsiteSummary instances are equal
        /// </summary>
        /// <param name="other">Instance of UserWebsiteSummary to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserWebsiteSummary other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Website == other.Website ||
                    Website != null &&
                    Website.Equals(other.Website)
                ) && 
                (
                    Status == other.Status ||
                    Status != null &&
                    Status.Equals(other.Status)
                ) && 
                (
                    VerifiedAt == other.VerifiedAt ||
                    VerifiedAt != null &&
                    VerifiedAt.Equals(other.VerifiedAt)
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
                    if (Website != null)
                    hashCode = hashCode * 59 + Website.GetHashCode();
                    if (Status != null)
                    hashCode = hashCode * 59 + Status.GetHashCode();
                    if (VerifiedAt != null)
                    hashCode = hashCode * 59 + VerifiedAt.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UserWebsiteSummary left, UserWebsiteSummary right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UserWebsiteSummary left, UserWebsiteSummary right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
