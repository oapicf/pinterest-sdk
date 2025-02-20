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
    /// A successful OAuth client token response for the client token flow.
    /// </summary>
    [DataContract]
    public partial class OauthAccessTokenResponseClientCredentials : IEquatable<OauthAccessTokenResponseClientCredentials>
    {

        /// <summary>
        /// Gets or Sets ResponseType
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<ResponseTypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ResponseTypeEnum
        {
            
            /// <summary>
            /// Enum AuthorizationCodeEnum for authorization_code
            /// </summary>
            [EnumMember(Value = "authorization_code")]
            AuthorizationCodeEnum = 1,
            
            /// <summary>
            /// Enum RefreshTokenEnum for refresh_token
            /// </summary>
            [EnumMember(Value = "refresh_token")]
            RefreshTokenEnum = 2,
            
            /// <summary>
            /// Enum ClientCredentialsEnum for client_credentials
            /// </summary>
            [EnumMember(Value = "client_credentials")]
            ClientCredentialsEnum = 3
        }

        /// <summary>
        /// Gets or Sets ResponseType
        /// </summary>
        [DataMember(Name="response_type", EmitDefaultValue=true)]
        public ResponseTypeEnum ResponseType { get; set; }

        /// <summary>
        /// Gets or Sets AccessToken
        /// </summary>
        [Required]
        [DataMember(Name="access_token", EmitDefaultValue=false)]
        public string AccessToken { get; set; }

        /// <summary>
        /// Gets or Sets TokenType
        /// </summary>
        [Required]
        [DataMember(Name="token_type", EmitDefaultValue=false)]
        public string TokenType { get; set; } = "bearer";

        /// <summary>
        /// Gets or Sets ExpiresIn
        /// </summary>
        [Required]
        [DataMember(Name="expires_in", EmitDefaultValue=true)]
        public int ExpiresIn { get; set; }

        /// <summary>
        /// Gets or Sets Scope
        /// </summary>
        [Required]
        [DataMember(Name="scope", EmitDefaultValue=false)]
        public string Scope { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OauthAccessTokenResponseClientCredentials {\n");
            sb.Append("  ResponseType: ").Append(ResponseType).Append("\n");
            sb.Append("  AccessToken: ").Append(AccessToken).Append("\n");
            sb.Append("  TokenType: ").Append(TokenType).Append("\n");
            sb.Append("  ExpiresIn: ").Append(ExpiresIn).Append("\n");
            sb.Append("  Scope: ").Append(Scope).Append("\n");
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
            return obj.GetType() == GetType() && Equals((OauthAccessTokenResponseClientCredentials)obj);
        }

        /// <summary>
        /// Returns true if OauthAccessTokenResponseClientCredentials instances are equal
        /// </summary>
        /// <param name="other">Instance of OauthAccessTokenResponseClientCredentials to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OauthAccessTokenResponseClientCredentials other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ResponseType == other.ResponseType ||
                    
                    ResponseType.Equals(other.ResponseType)
                ) && 
                (
                    AccessToken == other.AccessToken ||
                    AccessToken != null &&
                    AccessToken.Equals(other.AccessToken)
                ) && 
                (
                    TokenType == other.TokenType ||
                    TokenType != null &&
                    TokenType.Equals(other.TokenType)
                ) && 
                (
                    ExpiresIn == other.ExpiresIn ||
                    
                    ExpiresIn.Equals(other.ExpiresIn)
                ) && 
                (
                    Scope == other.Scope ||
                    Scope != null &&
                    Scope.Equals(other.Scope)
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
                    
                    hashCode = hashCode * 59 + ResponseType.GetHashCode();
                    if (AccessToken != null)
                    hashCode = hashCode * 59 + AccessToken.GetHashCode();
                    if (TokenType != null)
                    hashCode = hashCode * 59 + TokenType.GetHashCode();
                    
                    hashCode = hashCode * 59 + ExpiresIn.GetHashCode();
                    if (Scope != null)
                    hashCode = hashCode * 59 + Scope.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(OauthAccessTokenResponseClientCredentials left, OauthAccessTokenResponseClientCredentials right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(OauthAccessTokenResponseClientCredentials left, OauthAccessTokenResponseClientCredentials right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
