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
    public partial class BusinessMemberAssetsSummaryProfilesInner : IEquatable<BusinessMemberAssetsSummaryProfilesInner>
    {
        /// <summary>
        /// Unique identifier of a business profile.
        /// </summary>
        /// <value>Unique identifier of a business profile.</value>
        /* <example>383791336903426391</example> */
        [RegularExpression("^\\d+$")]
        [StringLength(20, MinimumLength=1)]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Permission levels member or partner has on an asset.
        /// </summary>
        /// <value>Permission levels member or partner has on an asset.</value>
        /* <example>[&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;]</example> */
        [DataMember(Name="permissions", EmitDefaultValue=false)]
        public List<string> Permissions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BusinessMemberAssetsSummaryProfilesInner {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Permissions: ").Append(Permissions).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BusinessMemberAssetsSummaryProfilesInner)obj);
        }

        /// <summary>
        /// Returns true if BusinessMemberAssetsSummaryProfilesInner instances are equal
        /// </summary>
        /// <param name="other">Instance of BusinessMemberAssetsSummaryProfilesInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BusinessMemberAssetsSummaryProfilesInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Permissions == other.Permissions ||
                    Permissions != null &&
                    other.Permissions != null &&
                    Permissions.SequenceEqual(other.Permissions)
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
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Permissions != null)
                    hashCode = hashCode * 59 + Permissions.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BusinessMemberAssetsSummaryProfilesInner left, BusinessMemberAssetsSummaryProfilesInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BusinessMemberAssetsSummaryProfilesInner left, BusinessMemberAssetsSummaryProfilesInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
