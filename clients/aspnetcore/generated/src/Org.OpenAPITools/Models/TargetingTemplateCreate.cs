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
    public partial class TargetingTemplateCreate : IEquatable<TargetingTemplateCreate>
    {
        /// <summary>
        /// Name of targeting template.
        /// </summary>
        /// <value>Name of targeting template.</value>
        /* <example>Gaming</example> */
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
        /// </summary>
        /// <value>Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.</value>
        [DataMember(Name="auto_targeting_enabled", EmitDefaultValue=true)]
        public bool AutoTargetingEnabled { get; set; } = true;

        /// <summary>
        /// Gets or Sets TargetingAttributes
        /// </summary>
        [Required]
        [DataMember(Name="targeting_attributes", EmitDefaultValue=false)]
        public TargetingSpec TargetingAttributes { get; set; }

        /// <summary>
        /// Gets or Sets PlacementGroup
        /// </summary>
        [DataMember(Name="placement_group", EmitDefaultValue=true)]
        public PlacementGroupType PlacementGroup { get; set; }

        /// <summary>
        /// Gets or Sets Keywords
        /// </summary>
        /* <example>[{value&#x3D;cats, match_type&#x3D;EXACT_NEGATIVE}]</example> */
        [DataMember(Name="keywords", EmitDefaultValue=false)]
        public List<TargetingTemplateKeyword> Keywords { get; set; }

        /// <summary>
        /// Gets or Sets TrackingUrls
        /// </summary>
        [DataMember(Name="tracking_urls", EmitDefaultValue=true)]
        public TrackingUrls TrackingUrls { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TargetingTemplateCreate {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  AutoTargetingEnabled: ").Append(AutoTargetingEnabled).Append("\n");
            sb.Append("  TargetingAttributes: ").Append(TargetingAttributes).Append("\n");
            sb.Append("  PlacementGroup: ").Append(PlacementGroup).Append("\n");
            sb.Append("  Keywords: ").Append(Keywords).Append("\n");
            sb.Append("  TrackingUrls: ").Append(TrackingUrls).Append("\n");
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
            return obj.GetType() == GetType() && Equals((TargetingTemplateCreate)obj);
        }

        /// <summary>
        /// Returns true if TargetingTemplateCreate instances are equal
        /// </summary>
        /// <param name="other">Instance of TargetingTemplateCreate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TargetingTemplateCreate other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    AutoTargetingEnabled == other.AutoTargetingEnabled ||
                    
                    AutoTargetingEnabled.Equals(other.AutoTargetingEnabled)
                ) && 
                (
                    TargetingAttributes == other.TargetingAttributes ||
                    TargetingAttributes != null &&
                    TargetingAttributes.Equals(other.TargetingAttributes)
                ) && 
                (
                    PlacementGroup == other.PlacementGroup ||
                    
                    PlacementGroup.Equals(other.PlacementGroup)
                ) && 
                (
                    Keywords == other.Keywords ||
                    Keywords != null &&
                    other.Keywords != null &&
                    Keywords.SequenceEqual(other.Keywords)
                ) && 
                (
                    TrackingUrls == other.TrackingUrls ||
                    TrackingUrls != null &&
                    TrackingUrls.Equals(other.TrackingUrls)
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
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + AutoTargetingEnabled.GetHashCode();
                    if (TargetingAttributes != null)
                    hashCode = hashCode * 59 + TargetingAttributes.GetHashCode();
                    
                    hashCode = hashCode * 59 + PlacementGroup.GetHashCode();
                    if (Keywords != null)
                    hashCode = hashCode * 59 + Keywords.GetHashCode();
                    if (TrackingUrls != null)
                    hashCode = hashCode * 59 + TrackingUrls.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(TargetingTemplateCreate left, TargetingTemplateCreate right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(TargetingTemplateCreate left, TargetingTemplateCreate right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
