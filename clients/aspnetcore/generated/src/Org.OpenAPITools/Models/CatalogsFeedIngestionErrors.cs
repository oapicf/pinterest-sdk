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
    /// 
    /// </summary>
    [DataContract]
    public partial class CatalogsFeedIngestionErrors : IEquatable<CatalogsFeedIngestionErrors>
    {
        /// <summary>
        /// We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
        /// </summary>
        /// <value>We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.</value>
        [DataMember(Name="LINE_LEVEL_INTERNAL_ERROR", EmitDefaultValue=true)]
        public int LINE_LEVEL_INTERNAL_ERROR { get; set; }


        /// <summary>
        /// The product count has decreased by more than 99% compared to the last successful ingestion.
        /// </summary>
        /// <value>The product count has decreased by more than 99% compared to the last successful ingestion.</value>
        
        public enum LARGEPRODUCTCOUNTDECREASEEnum
        {
            
            /// <summary>
            /// Enum _1Enum for 1
            /// </summary>
            
            _1Enum = 1
        }

        /// <summary>
        /// The product count has decreased by more than 99% compared to the last successful ingestion.
        /// </summary>
        /// <value>The product count has decreased by more than 99% compared to the last successful ingestion.</value>
        [DataMember(Name="LARGE_PRODUCT_COUNT_DECREASE", EmitDefaultValue=true)]
        public LARGEPRODUCTCOUNTDECREASEEnum LARGE_PRODUCT_COUNT_DECREASE { get; set; }

        /// <summary>
        /// We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
        /// </summary>
        /// <value>We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.</value>
        [DataMember(Name="ACCOUNT_FLAGGED", EmitDefaultValue=true)]
        public int ACCOUNT_FLAGGED { get; set; }

        /// <summary>
        /// We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
        /// </summary>
        /// <value>We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.</value>
        [DataMember(Name="IMAGE_LEVEL_INTERNAL_ERROR", EmitDefaultValue=true)]
        public int IMAGE_LEVEL_INTERNAL_ERROR { get; set; }

        /// <summary>
        /// Image files are unreadable. Please upload new files to continue.
        /// </summary>
        /// <value>Image files are unreadable. Please upload new files to continue.</value>
        [DataMember(Name="IMAGE_FILE_NOT_ACCESSIBLE", EmitDefaultValue=true)]
        public int IMAGE_FILE_NOT_ACCESSIBLE { get; set; }

        /// <summary>
        /// Image files are unreadable. Please check your link and upload new files to continue.
        /// </summary>
        /// <value>Image files are unreadable. Please check your link and upload new files to continue.</value>
        [DataMember(Name="IMAGE_MALFORMED_URL", EmitDefaultValue=true)]
        public int IMAGE_MALFORMED_URL { get; set; }

        /// <summary>
        /// Image files are unreadable. Please upload new files to continue.
        /// </summary>
        /// <value>Image files are unreadable. Please upload new files to continue.</value>
        [DataMember(Name="IMAGE_FILE_NOT_FOUND", EmitDefaultValue=true)]
        public int IMAGE_FILE_NOT_FOUND { get; set; }

        /// <summary>
        /// Image files are unreadable. Please upload new files to continue.
        /// </summary>
        /// <value>Image files are unreadable. Please upload new files to continue.</value>
        [DataMember(Name="IMAGE_INVALID_FILE", EmitDefaultValue=true)]
        public int IMAGE_INVALID_FILE { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CatalogsFeedIngestionErrors {\n");
            sb.Append("  LINE_LEVEL_INTERNAL_ERROR: ").Append(LINE_LEVEL_INTERNAL_ERROR).Append("\n");
            sb.Append("  LARGE_PRODUCT_COUNT_DECREASE: ").Append(LARGE_PRODUCT_COUNT_DECREASE).Append("\n");
            sb.Append("  ACCOUNT_FLAGGED: ").Append(ACCOUNT_FLAGGED).Append("\n");
            sb.Append("  IMAGE_LEVEL_INTERNAL_ERROR: ").Append(IMAGE_LEVEL_INTERNAL_ERROR).Append("\n");
            sb.Append("  IMAGE_FILE_NOT_ACCESSIBLE: ").Append(IMAGE_FILE_NOT_ACCESSIBLE).Append("\n");
            sb.Append("  IMAGE_MALFORMED_URL: ").Append(IMAGE_MALFORMED_URL).Append("\n");
            sb.Append("  IMAGE_FILE_NOT_FOUND: ").Append(IMAGE_FILE_NOT_FOUND).Append("\n");
            sb.Append("  IMAGE_INVALID_FILE: ").Append(IMAGE_INVALID_FILE).Append("\n");
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
                    LINE_LEVEL_INTERNAL_ERROR == other.LINE_LEVEL_INTERNAL_ERROR ||
                    
                    LINE_LEVEL_INTERNAL_ERROR.Equals(other.LINE_LEVEL_INTERNAL_ERROR)
                ) && 
                (
                    LARGE_PRODUCT_COUNT_DECREASE == other.LARGE_PRODUCT_COUNT_DECREASE ||
                    
                    LARGE_PRODUCT_COUNT_DECREASE.Equals(other.LARGE_PRODUCT_COUNT_DECREASE)
                ) && 
                (
                    ACCOUNT_FLAGGED == other.ACCOUNT_FLAGGED ||
                    
                    ACCOUNT_FLAGGED.Equals(other.ACCOUNT_FLAGGED)
                ) && 
                (
                    IMAGE_LEVEL_INTERNAL_ERROR == other.IMAGE_LEVEL_INTERNAL_ERROR ||
                    
                    IMAGE_LEVEL_INTERNAL_ERROR.Equals(other.IMAGE_LEVEL_INTERNAL_ERROR)
                ) && 
                (
                    IMAGE_FILE_NOT_ACCESSIBLE == other.IMAGE_FILE_NOT_ACCESSIBLE ||
                    
                    IMAGE_FILE_NOT_ACCESSIBLE.Equals(other.IMAGE_FILE_NOT_ACCESSIBLE)
                ) && 
                (
                    IMAGE_MALFORMED_URL == other.IMAGE_MALFORMED_URL ||
                    
                    IMAGE_MALFORMED_URL.Equals(other.IMAGE_MALFORMED_URL)
                ) && 
                (
                    IMAGE_FILE_NOT_FOUND == other.IMAGE_FILE_NOT_FOUND ||
                    
                    IMAGE_FILE_NOT_FOUND.Equals(other.IMAGE_FILE_NOT_FOUND)
                ) && 
                (
                    IMAGE_INVALID_FILE == other.IMAGE_INVALID_FILE ||
                    
                    IMAGE_INVALID_FILE.Equals(other.IMAGE_INVALID_FILE)
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
                    
                    hashCode = hashCode * 59 + LINE_LEVEL_INTERNAL_ERROR.GetHashCode();
                    
                    hashCode = hashCode * 59 + LARGE_PRODUCT_COUNT_DECREASE.GetHashCode();
                    
                    hashCode = hashCode * 59 + ACCOUNT_FLAGGED.GetHashCode();
                    
                    hashCode = hashCode * 59 + IMAGE_LEVEL_INTERNAL_ERROR.GetHashCode();
                    
                    hashCode = hashCode * 59 + IMAGE_FILE_NOT_ACCESSIBLE.GetHashCode();
                    
                    hashCode = hashCode * 59 + IMAGE_MALFORMED_URL.GetHashCode();
                    
                    hashCode = hashCode * 59 + IMAGE_FILE_NOT_FOUND.GetHashCode();
                    
                    hashCode = hashCode * 59 + IMAGE_INVALID_FILE.GetHashCode();
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