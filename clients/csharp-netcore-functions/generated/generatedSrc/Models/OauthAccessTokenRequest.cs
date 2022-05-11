/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using JsonSubTypes;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Models
{
    /// <summary>
    /// Describes the valid schema for possible OAuth access token requests.
    /// </summary>
    [DataContract(Name = "OauthAccessTokenRequest")]
    [JsonConverter(typeof(JsonSubtypes), "GrantType")]
    [JsonSubtypes.KnownSubType(typeof(OauthAccessTokenRequestCode), "OauthAccessTokenRequestCode")]
    [JsonSubtypes.KnownSubType(typeof(OauthAccessTokenRequestRefresh), "OauthAccessTokenRequestRefresh")]
    [JsonSubtypes.KnownSubType(typeof(OauthAccessTokenRequestCode), "authorization_code")]
    [JsonSubtypes.KnownSubType(typeof(OauthAccessTokenRequestRefresh), "refresh_token")]
    public partial class OauthAccessTokenRequest : IEquatable<OauthAccessTokenRequest>, IValidatableObject
    {
        /// <summary>
        /// Defines GrantType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum GrantTypeEnum
        {
            /// <summary>
            /// Enum AuthorizationCode for value: authorization_code
            /// </summary>
            [EnumMember(Value = "authorization_code")]
            AuthorizationCode = 1,

            /// <summary>
            /// Enum RefreshToken for value: refresh_token
            /// </summary>
            [EnumMember(Value = "refresh_token")]
            RefreshToken = 2

        }


        /// <summary>
        /// Gets or Sets GrantType
        /// </summary>
        [DataMember(Name = "grant_type", IsRequired = true, EmitDefaultValue = false)]
        public GrantTypeEnum GrantType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="OauthAccessTokenRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OauthAccessTokenRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OauthAccessTokenRequest" /> class.
        /// </summary>
        /// <param name="grantType">grantType (required).</param>
        public OauthAccessTokenRequest(GrantTypeEnum grantType = default(GrantTypeEnum))
        {
            this.GrantType = grantType;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OauthAccessTokenRequest {\n");
            sb.Append("  GrantType: ").Append(GrantType).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as OauthAccessTokenRequest);
        }

        /// <summary>
        /// Returns true if OauthAccessTokenRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of OauthAccessTokenRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OauthAccessTokenRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.GrantType == input.GrantType ||
                    this.GrantType.Equals(input.GrantType)
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
                int hashCode = 41;
                hashCode = hashCode * 59 + this.GrantType.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            return this.BaseValidate(validationContext);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        protected IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> BaseValidate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}