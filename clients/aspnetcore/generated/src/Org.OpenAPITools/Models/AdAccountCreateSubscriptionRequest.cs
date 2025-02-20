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
    public partial class AdAccountCreateSubscriptionRequest : IEquatable<AdAccountCreateSubscriptionRequest>
    {
        /// <summary>
        /// Standard HTTPS webhook URL.
        /// </summary>
        /// <value>Standard HTTPS webhook URL.</value>
        /* <example>https://webhook.example.com/xyz</example> */
        [Required]
        [DataMember(Name="webhook_url", EmitDefaultValue=false)]
        public string WebhookUrl { get; set; }

        /// <summary>
        /// Lead form ID.
        /// </summary>
        /// <value>Lead form ID.</value>
        /* <example>383791336903426390</example> */
        [RegularExpression("^\\d+$")]
        [DataMember(Name="lead_form_id", EmitDefaultValue=false)]
        public string LeadFormId { get; set; }

        /// <summary>
        /// Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
        /// </summary>
        /// <value>Partner access token. Only for clients that requires authentication. We recommend to avoid this param.</value>
        [DataMember(Name="partner_access_token", EmitDefaultValue=false)]
        public string PartnerAccessToken { get; set; }

        /// <summary>
        /// Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
        /// </summary>
        /// <value>Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.</value>
        [DataMember(Name="partner_refresh_token", EmitDefaultValue=false)]
        public string PartnerRefreshToken { get; set; }

        /// <summary>
        /// Gets or Sets PartnerMetadata
        /// </summary>
        [DataMember(Name="partner_metadata", EmitDefaultValue=false)]
        public AdAccountCreateSubscriptionRequestPartnerMetadata PartnerMetadata { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AdAccountCreateSubscriptionRequest {\n");
            sb.Append("  WebhookUrl: ").Append(WebhookUrl).Append("\n");
            sb.Append("  LeadFormId: ").Append(LeadFormId).Append("\n");
            sb.Append("  PartnerAccessToken: ").Append(PartnerAccessToken).Append("\n");
            sb.Append("  PartnerRefreshToken: ").Append(PartnerRefreshToken).Append("\n");
            sb.Append("  PartnerMetadata: ").Append(PartnerMetadata).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AdAccountCreateSubscriptionRequest)obj);
        }

        /// <summary>
        /// Returns true if AdAccountCreateSubscriptionRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of AdAccountCreateSubscriptionRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdAccountCreateSubscriptionRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    WebhookUrl == other.WebhookUrl ||
                    WebhookUrl != null &&
                    WebhookUrl.Equals(other.WebhookUrl)
                ) && 
                (
                    LeadFormId == other.LeadFormId ||
                    LeadFormId != null &&
                    LeadFormId.Equals(other.LeadFormId)
                ) && 
                (
                    PartnerAccessToken == other.PartnerAccessToken ||
                    PartnerAccessToken != null &&
                    PartnerAccessToken.Equals(other.PartnerAccessToken)
                ) && 
                (
                    PartnerRefreshToken == other.PartnerRefreshToken ||
                    PartnerRefreshToken != null &&
                    PartnerRefreshToken.Equals(other.PartnerRefreshToken)
                ) && 
                (
                    PartnerMetadata == other.PartnerMetadata ||
                    PartnerMetadata != null &&
                    PartnerMetadata.Equals(other.PartnerMetadata)
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
                    if (WebhookUrl != null)
                    hashCode = hashCode * 59 + WebhookUrl.GetHashCode();
                    if (LeadFormId != null)
                    hashCode = hashCode * 59 + LeadFormId.GetHashCode();
                    if (PartnerAccessToken != null)
                    hashCode = hashCode * 59 + PartnerAccessToken.GetHashCode();
                    if (PartnerRefreshToken != null)
                    hashCode = hashCode * 59 + PartnerRefreshToken.GetHashCode();
                    if (PartnerMetadata != null)
                    hashCode = hashCode * 59 + PartnerMetadata.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AdAccountCreateSubscriptionRequest left, AdAccountCreateSubscriptionRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AdAccountCreateSubscriptionRequest left, AdAccountCreateSubscriptionRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
