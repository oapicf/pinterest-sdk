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
    /// Schema describing the response when a log has invalid fields.
    /// </summary>
    [DataContract]
    public partial class IntegrationLogsInvalidLogResponse : IEquatable<IntegrationLogsInvalidLogResponse>
    {
        /// <summary>
        /// Gets or Sets RejectedLogs
        /// </summary>
        [DataMember(Name="rejected_logs", EmitDefaultValue=false)]
        public List<IntegrationLogsInvalidLogResponseRejectedLogsInner> RejectedLogs { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IntegrationLogsInvalidLogResponse {\n");
            sb.Append("  RejectedLogs: ").Append(RejectedLogs).Append("\n");
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
            return obj.GetType() == GetType() && Equals((IntegrationLogsInvalidLogResponse)obj);
        }

        /// <summary>
        /// Returns true if IntegrationLogsInvalidLogResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of IntegrationLogsInvalidLogResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IntegrationLogsInvalidLogResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    RejectedLogs == other.RejectedLogs ||
                    RejectedLogs != null &&
                    other.RejectedLogs != null &&
                    RejectedLogs.SequenceEqual(other.RejectedLogs)
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
                    if (RejectedLogs != null)
                    hashCode = hashCode * 59 + RejectedLogs.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(IntegrationLogsInvalidLogResponse left, IntegrationLogsInvalidLogResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(IntegrationLogsInvalidLogResponse left, IntegrationLogsInvalidLogResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}