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
    /// A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
    /// </summary>
    [DataContract]
    public partial class OauthAccessTokenResponseEverlastingRefresh : OauthAccessTokenResponse, IEquatable<OauthAccessTokenResponseEverlastingRefresh>
    {
        /// <summary>
        /// Gets or Sets RefreshToken
        /// </summary>
        [Required]
        [DataMember(Name="refresh_token", EmitDefaultValue=false)]
        public string RefreshToken { get; set; }

        /// <summary>
        /// Gets or Sets RefreshTokenExpiresIn
        /// </summary>
        [Required]
        [DataMember(Name="refresh_token_expires_in", EmitDefaultValue=true)]
        public int RefreshTokenExpiresIn { get; set; }

        /// <summary>
        /// Gets or Sets RefreshTokenExpiresAt
        /// </summary>
        [Required]
        [DataMember(Name="refresh_token_expires_at", EmitDefaultValue=true)]
        public int RefreshTokenExpiresAt { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OauthAccessTokenResponseEverlastingRefresh {\n");
            sb.Append("  RefreshToken: ").Append(RefreshToken).Append("\n");
            sb.Append("  RefreshTokenExpiresIn: ").Append(RefreshTokenExpiresIn).Append("\n");
            sb.Append("  RefreshTokenExpiresAt: ").Append(RefreshTokenExpiresAt).Append("\n");
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
            return obj.GetType() == GetType() && Equals((OauthAccessTokenResponseEverlastingRefresh)obj);
        }

        /// <summary>
        /// Returns true if OauthAccessTokenResponseEverlastingRefresh instances are equal
        /// </summary>
        /// <param name="other">Instance of OauthAccessTokenResponseEverlastingRefresh to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OauthAccessTokenResponseEverlastingRefresh other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    RefreshToken == other.RefreshToken ||
                    RefreshToken != null &&
                    RefreshToken.Equals(other.RefreshToken)
                ) && 
                (
                    RefreshTokenExpiresIn == other.RefreshTokenExpiresIn ||
                    
                    RefreshTokenExpiresIn.Equals(other.RefreshTokenExpiresIn)
                ) && 
                (
                    RefreshTokenExpiresAt == other.RefreshTokenExpiresAt ||
                    
                    RefreshTokenExpiresAt.Equals(other.RefreshTokenExpiresAt)
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
                    if (RefreshToken != null)
                    hashCode = hashCode * 59 + RefreshToken.GetHashCode();
                    
                    hashCode = hashCode * 59 + RefreshTokenExpiresIn.GetHashCode();
                    
                    hashCode = hashCode * 59 + RefreshTokenExpiresAt.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(OauthAccessTokenResponseEverlastingRefresh left, OauthAccessTokenResponseEverlastingRefresh right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(OauthAccessTokenResponseEverlastingRefresh left, OauthAccessTokenResponseEverlastingRefresh right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}