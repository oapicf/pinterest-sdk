/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
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
    public partial class CatalogsFeedIngestionErrors : IEquatable<CatalogsFeedIngestionErrors>
    {
        /// <summary>
        /// Gets or Sets ImageDownloadError
        /// </summary>
        [DataMember(Name="image_download_error", EmitDefaultValue=false)]
        public int ImageDownloadError { get; set; }

        /// <summary>
        /// Gets or Sets ImageDownloadConnectionTimeout
        /// </summary>
        [DataMember(Name="image_download_connection_timeout", EmitDefaultValue=false)]
        public int ImageDownloadConnectionTimeout { get; set; }

        /// <summary>
        /// Gets or Sets ImageFormatUnrecognize
        /// </summary>
        [DataMember(Name="image_format_unrecognize", EmitDefaultValue=false)]
        public int ImageFormatUnrecognize { get; set; }

        /// <summary>
        /// Gets or Sets LineLevelInternalError
        /// </summary>
        [DataMember(Name="line_level_internal_error", EmitDefaultValue=false)]
        public int LineLevelInternalError { get; set; }


        /// <summary>
        /// Gets or Sets LargeProductCountDecrease
        /// </summary>
        
        public enum LargeProductCountDecreaseEnum
        {
            
            /// <summary>
            /// Enum _1Enum for 1
            /// </summary>
            
            _1Enum = 1
        }

        /// <summary>
        /// Gets or Sets LargeProductCountDecrease
        /// </summary>
        [DataMember(Name="large_product_count_decrease", EmitDefaultValue=false)]
        public LargeProductCountDecreaseEnum LargeProductCountDecrease { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CatalogsFeedIngestionErrors {\n");
            sb.Append("  ImageDownloadError: ").Append(ImageDownloadError).Append("\n");
            sb.Append("  ImageDownloadConnectionTimeout: ").Append(ImageDownloadConnectionTimeout).Append("\n");
            sb.Append("  ImageFormatUnrecognize: ").Append(ImageFormatUnrecognize).Append("\n");
            sb.Append("  LineLevelInternalError: ").Append(LineLevelInternalError).Append("\n");
            sb.Append("  LargeProductCountDecrease: ").Append(LargeProductCountDecrease).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
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
            return obj.GetType() == GetType() && Equals((CatalogsFeedIngestionErrors)obj);
        }

        /// <summary>
        /// Returns true if CatalogsFeedIngestionErrors instances are equal
        /// </summary>
        /// <param name="other">Instance of CatalogsFeedIngestionErrors to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CatalogsFeedIngestionErrors other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ImageDownloadError == other.ImageDownloadError ||
                    
                    ImageDownloadError.Equals(other.ImageDownloadError)
                ) && 
                (
                    ImageDownloadConnectionTimeout == other.ImageDownloadConnectionTimeout ||
                    
                    ImageDownloadConnectionTimeout.Equals(other.ImageDownloadConnectionTimeout)
                ) && 
                (
                    ImageFormatUnrecognize == other.ImageFormatUnrecognize ||
                    
                    ImageFormatUnrecognize.Equals(other.ImageFormatUnrecognize)
                ) && 
                (
                    LineLevelInternalError == other.LineLevelInternalError ||
                    
                    LineLevelInternalError.Equals(other.LineLevelInternalError)
                ) && 
                (
                    LargeProductCountDecrease == other.LargeProductCountDecrease ||
                    
                    LargeProductCountDecrease.Equals(other.LargeProductCountDecrease)
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
                    
                    hashCode = hashCode * 59 + ImageDownloadError.GetHashCode();
                    
                    hashCode = hashCode * 59 + ImageDownloadConnectionTimeout.GetHashCode();
                    
                    hashCode = hashCode * 59 + ImageFormatUnrecognize.GetHashCode();
                    
                    hashCode = hashCode * 59 + LineLevelInternalError.GetHashCode();
                    
                    hashCode = hashCode * 59 + LargeProductCountDecrease.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CatalogsFeedIngestionErrors left, CatalogsFeedIngestionErrors right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CatalogsFeedIngestionErrors left, CatalogsFeedIngestionErrors right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}