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
    /// Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
    /// </summary>
    [DataContract]
    public partial class ConversionEventsUserData : IEquatable<ConversionEventsUserData>
    {
        /// <summary>
        /// Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
        /// </summary>
        /// <value>Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.</value>
        /* <example>[&quot;45df139772a81b6011bdc1c9cc3d1cb408fc0b10ec0c5cb9d4d4e107f0ddc49d&quot;]</example> */
        [DataMember(Name="ph", EmitDefaultValue=false)]
        public List<string> Ph { get; set; }

        /// <summary>
        /// Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. The string should be in the UTF-8 format.
        /// </summary>
        /// <value>Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. The string should be in the UTF-8 format.</value>
        /* <example>[&quot;0d248e82c62c9386878327d491c762a002152d42ab2c391a31c44d9f62675ddf&quot;]</example> */
        [DataMember(Name="ge", EmitDefaultValue=false)]
        public List<string> Ge { get; set; }

        /// <summary>
        /// Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
        /// </summary>
        /// <value>Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. The string should be in the UTF-8 format.</value>
        /* <example>[&quot;d4426a0086d10f12ad265539ae8d54221dc67786053d511407204b76e99d7739&quot;]</example> */
        [DataMember(Name="db", EmitDefaultValue=false)]
        public List<string> Db { get; set; }

        /// <summary>
        /// Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
        /// </summary>
        /// <value>Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.</value>
        /* <example>[&quot;7e546b3aa43f989dd359672e6c3409d4f9d4e8f155ae1e9b90ee060985468c19&quot;]</example> */
        [DataMember(Name="ln", EmitDefaultValue=false)]
        public List<string> Ln { get; set; }

        /// <summary>
        /// Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
        /// </summary>
        /// <value>Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.</value>
        /* <example>[&quot;ec1e6a072231703f1bc41429052fff8c00a7e0c6aaec2e7107241ca8f3ceb6b2&quot;]</example> */
        [DataMember(Name="fn", EmitDefaultValue=false)]
        public List<string> Fn { get; set; }

        /// <summary>
        /// Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
        /// </summary>
        /// <value>Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.</value>
        /* <example>[&quot;4ac01a129bfd10385c9278c2cf2c46fac5ab57350841234f587c8522a2e4ce36&quot;]</example> */
        [DataMember(Name="ct", EmitDefaultValue=false)]
        public List<string> Ct { get; set; }

        /// <summary>
        /// Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
        /// </summary>
        /// <value>Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.</value>
        /* <example>[&quot;49a6d05b8e4b516656e464271d9dd38d0a7e0142f7f49546f4dabd2720cafc34&quot;]</example> */
        [DataMember(Name="st", EmitDefaultValue=false)]
        public List<string> St { get; set; }

        /// <summary>
        /// Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
        /// </summary>
        /// <value>Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.</value>
        /* <example>[&quot;fd5f56b40a79a385708428e7b32ab996a681080a166a2206e750eb4819186145&quot;]</example> */
        [DataMember(Name="zp", EmitDefaultValue=false)]
        public List<string> Zp { get; set; }

        /// <summary>
        /// Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. The string should be in the UTF-8 format.
        /// </summary>
        /// <value>Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. The string should be in the UTF-8 format.</value>
        /* <example>[&quot;9b202ecbc6d45c6d8901d989a918878397a3eb9d00e8f48022fc051b19d21a1d&quot;]</example> */
        [DataMember(Name="country", EmitDefaultValue=false)]
        public List<string> Country { get; set; }

        /// <summary>
        /// Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
        /// </summary>
        /// <value>Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.</value>
        /* <example>[&quot;6a7a73766627eb611720883d5a11cc62b5bfee237b00a6658d78c50032ec4aee&quot;]</example> */
        [DataMember(Name="external_id", EmitDefaultValue=false)]
        public List<string> ExternalId { get; set; }

        /// <summary>
        /// The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
        /// </summary>
        /// <value>The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.</value>
        /* <example>dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv</example> */
        [DataMember(Name="click_id", EmitDefaultValue=true)]
        public string ClickId { get; set; }

        /// <summary>
        /// A unique identifier of visitors&#39; information defined by third party partners. e.g RampID
        /// </summary>
        /// <value>A unique identifier of visitors&#39; information defined by third party partners. e.g RampID</value>
        /* <example>BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc</example> */
        [DataMember(Name="partner_id", EmitDefaultValue=true)]
        public string PartnerId { get; set; }

        /// <summary>
        /// Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
        /// </summary>
        /// <value>Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.</value>
        /* <example>[411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8, 09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969]</example> */
        [Required]
        [DataMember(Name="em", EmitDefaultValue=false)]
        public List<string> Em { get; set; }

        /// <summary>
        /// Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
        /// </summary>
        /// <value>Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.</value>
        /* <example>[0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1, 837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46]</example> */
        [Required]
        [DataMember(Name="hashed_maids", EmitDefaultValue=false)]
        public List<string> HashedMaids { get; set; }

        /// <summary>
        /// The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
        /// </summary>
        /// <value>The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.</value>
        /* <example>216.3.128.12</example> */
        [Required]
        [DataMember(Name="client_ip_address", EmitDefaultValue=false)]
        public string ClientIpAddress { get; set; }

        /// <summary>
        /// The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
        /// </summary>
        /// <value>The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.</value>
        /* <example>Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36</example> */
        [Required]
        [DataMember(Name="client_user_agent", EmitDefaultValue=false)]
        public string ClientUserAgent { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConversionEventsUserData {\n");
            sb.Append("  Ph: ").Append(Ph).Append("\n");
            sb.Append("  Ge: ").Append(Ge).Append("\n");
            sb.Append("  Db: ").Append(Db).Append("\n");
            sb.Append("  Ln: ").Append(Ln).Append("\n");
            sb.Append("  Fn: ").Append(Fn).Append("\n");
            sb.Append("  Ct: ").Append(Ct).Append("\n");
            sb.Append("  St: ").Append(St).Append("\n");
            sb.Append("  Zp: ").Append(Zp).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  ExternalId: ").Append(ExternalId).Append("\n");
            sb.Append("  ClickId: ").Append(ClickId).Append("\n");
            sb.Append("  PartnerId: ").Append(PartnerId).Append("\n");
            sb.Append("  Em: ").Append(Em).Append("\n");
            sb.Append("  HashedMaids: ").Append(HashedMaids).Append("\n");
            sb.Append("  ClientIpAddress: ").Append(ClientIpAddress).Append("\n");
            sb.Append("  ClientUserAgent: ").Append(ClientUserAgent).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ConversionEventsUserData)obj);
        }

        /// <summary>
        /// Returns true if ConversionEventsUserData instances are equal
        /// </summary>
        /// <param name="other">Instance of ConversionEventsUserData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConversionEventsUserData other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Ph == other.Ph ||
                    Ph != null &&
                    other.Ph != null &&
                    Ph.SequenceEqual(other.Ph)
                ) && 
                (
                    Ge == other.Ge ||
                    Ge != null &&
                    other.Ge != null &&
                    Ge.SequenceEqual(other.Ge)
                ) && 
                (
                    Db == other.Db ||
                    Db != null &&
                    other.Db != null &&
                    Db.SequenceEqual(other.Db)
                ) && 
                (
                    Ln == other.Ln ||
                    Ln != null &&
                    other.Ln != null &&
                    Ln.SequenceEqual(other.Ln)
                ) && 
                (
                    Fn == other.Fn ||
                    Fn != null &&
                    other.Fn != null &&
                    Fn.SequenceEqual(other.Fn)
                ) && 
                (
                    Ct == other.Ct ||
                    Ct != null &&
                    other.Ct != null &&
                    Ct.SequenceEqual(other.Ct)
                ) && 
                (
                    St == other.St ||
                    St != null &&
                    other.St != null &&
                    St.SequenceEqual(other.St)
                ) && 
                (
                    Zp == other.Zp ||
                    Zp != null &&
                    other.Zp != null &&
                    Zp.SequenceEqual(other.Zp)
                ) && 
                (
                    Country == other.Country ||
                    Country != null &&
                    other.Country != null &&
                    Country.SequenceEqual(other.Country)
                ) && 
                (
                    ExternalId == other.ExternalId ||
                    ExternalId != null &&
                    other.ExternalId != null &&
                    ExternalId.SequenceEqual(other.ExternalId)
                ) && 
                (
                    ClickId == other.ClickId ||
                    ClickId != null &&
                    ClickId.Equals(other.ClickId)
                ) && 
                (
                    PartnerId == other.PartnerId ||
                    PartnerId != null &&
                    PartnerId.Equals(other.PartnerId)
                ) && 
                (
                    Em == other.Em ||
                    Em != null &&
                    other.Em != null &&
                    Em.SequenceEqual(other.Em)
                ) && 
                (
                    HashedMaids == other.HashedMaids ||
                    HashedMaids != null &&
                    other.HashedMaids != null &&
                    HashedMaids.SequenceEqual(other.HashedMaids)
                ) && 
                (
                    ClientIpAddress == other.ClientIpAddress ||
                    ClientIpAddress != null &&
                    ClientIpAddress.Equals(other.ClientIpAddress)
                ) && 
                (
                    ClientUserAgent == other.ClientUserAgent ||
                    ClientUserAgent != null &&
                    ClientUserAgent.Equals(other.ClientUserAgent)
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
                    if (Ph != null)
                    hashCode = hashCode * 59 + Ph.GetHashCode();
                    if (Ge != null)
                    hashCode = hashCode * 59 + Ge.GetHashCode();
                    if (Db != null)
                    hashCode = hashCode * 59 + Db.GetHashCode();
                    if (Ln != null)
                    hashCode = hashCode * 59 + Ln.GetHashCode();
                    if (Fn != null)
                    hashCode = hashCode * 59 + Fn.GetHashCode();
                    if (Ct != null)
                    hashCode = hashCode * 59 + Ct.GetHashCode();
                    if (St != null)
                    hashCode = hashCode * 59 + St.GetHashCode();
                    if (Zp != null)
                    hashCode = hashCode * 59 + Zp.GetHashCode();
                    if (Country != null)
                    hashCode = hashCode * 59 + Country.GetHashCode();
                    if (ExternalId != null)
                    hashCode = hashCode * 59 + ExternalId.GetHashCode();
                    if (ClickId != null)
                    hashCode = hashCode * 59 + ClickId.GetHashCode();
                    if (PartnerId != null)
                    hashCode = hashCode * 59 + PartnerId.GetHashCode();
                    if (Em != null)
                    hashCode = hashCode * 59 + Em.GetHashCode();
                    if (HashedMaids != null)
                    hashCode = hashCode * 59 + HashedMaids.GetHashCode();
                    if (ClientIpAddress != null)
                    hashCode = hashCode * 59 + ClientIpAddress.GetHashCode();
                    if (ClientUserAgent != null)
                    hashCode = hashCode * 59 + ClientUserAgent.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ConversionEventsUserData left, ConversionEventsUserData right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ConversionEventsUserData left, ConversionEventsUserData right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
