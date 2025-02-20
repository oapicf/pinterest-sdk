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
    /// An object containing the permissions a you/your business partner has on the asset.
    /// </summary>
    [DataContract]
    public partial class GetPartnerAssetsResponse : IEquatable<GetPartnerAssetsResponse>
    {
        /// <summary>
        /// Unique identifier of a business asset.
        /// </summary>
        /// <value>Unique identifier of a business asset.</value>
        /* <example>549755885175</example> */
        [RegularExpression("^\\d+$")]
        [StringLength(20, MinimumLength=1)]
        [DataMember(Name="asset_id", EmitDefaultValue=false)]
        public string AssetId { get; set; }

        /// <summary>
        /// Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
        /// </summary>
        /// <value>Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.</value>
        /* <example>AD_ACCOUNT</example> */
        [DataMember(Name="asset_type", EmitDefaultValue=false)]
        public string AssetType { get; set; }

        /// <summary>
        /// The permissions you or your partner has on the asset. If partner_type&#x3D;INTERNAL, the permission levels are for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the permission levels are for the access you have to the partner&#39;s business asset.
        /// </summary>
        /// <value>The permissions you or your partner has on the asset. If partner_type&#x3D;INTERNAL, the permission levels are for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the permission levels are for the access you have to the partner&#39;s business asset.</value>
        /* <example>[&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;]</example> */
        [DataMember(Name="permissions", EmitDefaultValue=false)]
        public List<string> Permissions { get; set; }

        /// <summary>
        /// Gets or Sets AssetGroupInfo
        /// </summary>
        [DataMember(Name="asset_group_info", EmitDefaultValue=false)]
        public AssetGroupBinding AssetGroupInfo { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GetPartnerAssetsResponse {\n");
            sb.Append("  AssetId: ").Append(AssetId).Append("\n");
            sb.Append("  AssetType: ").Append(AssetType).Append("\n");
            sb.Append("  Permissions: ").Append(Permissions).Append("\n");
            sb.Append("  AssetGroupInfo: ").Append(AssetGroupInfo).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GetPartnerAssetsResponse)obj);
        }

        /// <summary>
        /// Returns true if GetPartnerAssetsResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of GetPartnerAssetsResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetPartnerAssetsResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AssetId == other.AssetId ||
                    AssetId != null &&
                    AssetId.Equals(other.AssetId)
                ) && 
                (
                    AssetType == other.AssetType ||
                    AssetType != null &&
                    AssetType.Equals(other.AssetType)
                ) && 
                (
                    Permissions == other.Permissions ||
                    Permissions != null &&
                    other.Permissions != null &&
                    Permissions.SequenceEqual(other.Permissions)
                ) && 
                (
                    AssetGroupInfo == other.AssetGroupInfo ||
                    AssetGroupInfo != null &&
                    AssetGroupInfo.Equals(other.AssetGroupInfo)
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
                    if (AssetId != null)
                    hashCode = hashCode * 59 + AssetId.GetHashCode();
                    if (AssetType != null)
                    hashCode = hashCode * 59 + AssetType.GetHashCode();
                    if (Permissions != null)
                    hashCode = hashCode * 59 + Permissions.GetHashCode();
                    if (AssetGroupInfo != null)
                    hashCode = hashCode * 59 + AssetGroupInfo.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GetPartnerAssetsResponse left, GetPartnerAssetsResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GetPartnerAssetsResponse left, GetPartnerAssetsResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
