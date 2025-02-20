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
    /// Pin with video.
    /// </summary>
    [DataContract]
    public partial class PinMediaWithVideo : PinMedia, IEquatable<PinMediaWithVideo>
    {
        /// <summary>
        /// Gets or Sets Images
        /// </summary>
        [DataMember(Name="images", EmitDefaultValue=false)]
        public PinMediaWithImageAllOfImages Images { get; set; }

        /// <summary>
        /// Gets or Sets CoverImageUrl
        /// </summary>
        [DataMember(Name="cover_image_url", EmitDefaultValue=false)]
        public string CoverImageUrl { get; set; }

        /// <summary>
        /// Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps.
        /// </summary>
        /// <value>Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps.</value>
        [DataMember(Name="video_url", EmitDefaultValue=true)]
        public string VideoUrl { get; set; }

        /// <summary>
        /// Duration (in milliseconds)
        /// </summary>
        /// <value>Duration (in milliseconds)</value>
        [DataMember(Name="duration", EmitDefaultValue=true)]
        public decimal Duration { get; set; }

        /// <summary>
        /// Height (in pixels)
        /// </summary>
        /// <value>Height (in pixels)</value>
        [DataMember(Name="height", EmitDefaultValue=true)]
        public int Height { get; set; }

        /// <summary>
        /// Width (in pixels)
        /// </summary>
        /// <value>Width (in pixels)</value>
        [DataMember(Name="width", EmitDefaultValue=true)]
        public int Width { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PinMediaWithVideo {\n");
            sb.Append("  Images: ").Append(Images).Append("\n");
            sb.Append("  CoverImageUrl: ").Append(CoverImageUrl).Append("\n");
            sb.Append("  VideoUrl: ").Append(VideoUrl).Append("\n");
            sb.Append("  Duration: ").Append(Duration).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PinMediaWithVideo)obj);
        }

        /// <summary>
        /// Returns true if PinMediaWithVideo instances are equal
        /// </summary>
        /// <param name="other">Instance of PinMediaWithVideo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PinMediaWithVideo other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Images == other.Images ||
                    Images != null &&
                    Images.Equals(other.Images)
                ) && 
                (
                    CoverImageUrl == other.CoverImageUrl ||
                    CoverImageUrl != null &&
                    CoverImageUrl.Equals(other.CoverImageUrl)
                ) && 
                (
                    VideoUrl == other.VideoUrl ||
                    VideoUrl != null &&
                    VideoUrl.Equals(other.VideoUrl)
                ) && 
                (
                    Duration == other.Duration ||
                    
                    Duration.Equals(other.Duration)
                ) && 
                (
                    Height == other.Height ||
                    
                    Height.Equals(other.Height)
                ) && 
                (
                    Width == other.Width ||
                    
                    Width.Equals(other.Width)
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
                    if (Images != null)
                    hashCode = hashCode * 59 + Images.GetHashCode();
                    if (CoverImageUrl != null)
                    hashCode = hashCode * 59 + CoverImageUrl.GetHashCode();
                    if (VideoUrl != null)
                    hashCode = hashCode * 59 + VideoUrl.GetHashCode();
                    
                    hashCode = hashCode * 59 + Duration.GetHashCode();
                    
                    hashCode = hashCode * 59 + Height.GetHashCode();
                    
                    hashCode = hashCode * 59 + Width.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PinMediaWithVideo left, PinMediaWithVideo right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PinMediaWithVideo left, PinMediaWithVideo right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
