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
    /// Media upload details
    /// </summary>
    [DataContract]
    public partial class MediaUploadDetails : IEquatable<MediaUploadDetails>
    {
        /// <summary>
        /// Gets or Sets MediaId
        /// </summary>
        [RegularExpression("^\\d+$")]
        [DataMember(Name="media_id", EmitDefaultValue=false)]
        public string MediaId { get; set; }

        /// <summary>
        /// Gets or Sets MediaType
        /// </summary>
        [DataMember(Name="media_type", EmitDefaultValue=true)]
        public MediaUploadType MediaType { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=true)]
        public MediaUploadStatus Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaUploadDetails {\n");
            sb.Append("  MediaId: ").Append(MediaId).Append("\n");
            sb.Append("  MediaType: ").Append(MediaType).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
            return obj.GetType() == GetType() && Equals((MediaUploadDetails)obj);
        }

        /// <summary>
        /// Returns true if MediaUploadDetails instances are equal
        /// </summary>
        /// <param name="other">Instance of MediaUploadDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaUploadDetails other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    MediaId == other.MediaId ||
                    MediaId != null &&
                    MediaId.Equals(other.MediaId)
                ) && 
                (
                    MediaType == other.MediaType ||
                    
                    MediaType.Equals(other.MediaType)
                ) && 
                (
                    Status == other.Status ||
                    
                    Status.Equals(other.Status)
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
                    if (MediaId != null)
                    hashCode = hashCode * 59 + MediaId.GetHashCode();
                    
                    hashCode = hashCode * 59 + MediaType.GetHashCode();
                    
                    hashCode = hashCode * 59 + Status.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(MediaUploadDetails left, MediaUploadDetails right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(MediaUploadDetails left, MediaUploadDetails right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}