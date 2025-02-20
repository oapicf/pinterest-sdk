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
    public partial class SharedAudienceAccount : IEquatable<SharedAudienceAccount>
    {
        /// <summary>
        /// Account ID (ad account or business ID).
        /// </summary>
        /// <value>Account ID (ad account or business ID).</value>
        /* <example>549755885175</example> */
        [Required]
        [RegularExpression("^\\d+$")]
        [DataMember(Name="account_id", EmitDefaultValue=false)]
        public string AccountId { get; set; }

        /// <summary>
        /// Account name.
        /// </summary>
        /// <value>Account name.</value>
        /* <example>Home Depot USA</example> */
        [Required]
        [DataMember(Name="account_name", EmitDefaultValue=false)]
        public string AccountName { get; set; }


        /// <summary>
        /// account type
        /// </summary>
        /// <value>account type</value>
        [TypeConverter(typeof(CustomEnumConverter<AccountTypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum AccountTypeEnum
        {
            
            /// <summary>
            /// Enum ADACCOUNTEnum for AD_ACCOUNT
            /// </summary>
            [EnumMember(Value = "AD_ACCOUNT")]
            ADACCOUNTEnum = 1,
            
            /// <summary>
            /// Enum BUSINESSACCOUNTEnum for BUSINESS_ACCOUNT
            /// </summary>
            [EnumMember(Value = "BUSINESS_ACCOUNT")]
            BUSINESSACCOUNTEnum = 2
        }

        /// <summary>
        /// account type
        /// </summary>
        /// <value>account type</value>
        [Required]
        [DataMember(Name="account_type", EmitDefaultValue=true)]
        public AccountTypeEnum AccountType { get; set; }

        /// <summary>
        /// Epoch timestamp in seconds for the shared audience event
        /// </summary>
        /// <value>Epoch timestamp in seconds for the shared audience event</value>
        /* <example>1677003860</example> */
        [Required]
        [DataMember(Name="shared_on_timestamp", EmitDefaultValue=true)]
        public int SharedOnTimestamp { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SharedAudienceAccount {\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  AccountName: ").Append(AccountName).Append("\n");
            sb.Append("  AccountType: ").Append(AccountType).Append("\n");
            sb.Append("  SharedOnTimestamp: ").Append(SharedOnTimestamp).Append("\n");
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
            return obj.GetType() == GetType() && Equals((SharedAudienceAccount)obj);
        }

        /// <summary>
        /// Returns true if SharedAudienceAccount instances are equal
        /// </summary>
        /// <param name="other">Instance of SharedAudienceAccount to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SharedAudienceAccount other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AccountId == other.AccountId ||
                    AccountId != null &&
                    AccountId.Equals(other.AccountId)
                ) && 
                (
                    AccountName == other.AccountName ||
                    AccountName != null &&
                    AccountName.Equals(other.AccountName)
                ) && 
                (
                    AccountType == other.AccountType ||
                    
                    AccountType.Equals(other.AccountType)
                ) && 
                (
                    SharedOnTimestamp == other.SharedOnTimestamp ||
                    
                    SharedOnTimestamp.Equals(other.SharedOnTimestamp)
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
                    if (AccountId != null)
                    hashCode = hashCode * 59 + AccountId.GetHashCode();
                    if (AccountName != null)
                    hashCode = hashCode * 59 + AccountName.GetHashCode();
                    
                    hashCode = hashCode * 59 + AccountType.GetHashCode();
                    
                    hashCode = hashCode * 59 + SharedOnTimestamp.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SharedAudienceAccount left, SharedAudienceAccount right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SharedAudienceAccount left, SharedAudienceAccount right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
