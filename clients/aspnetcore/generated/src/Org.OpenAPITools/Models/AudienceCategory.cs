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
    public partial class AudienceCategory : IEquatable<AudienceCategory>
    {
        /// <summary>
        /// Interest unique key (same as ID).
        /// </summary>
        /// <value>Interest unique key (same as ID).</value>
        /* <example>1234567</example> */
        [DataMember(Name="key", EmitDefaultValue=false)]
        public string Key { get; set; }

        /// <summary>
        /// Interest name.
        /// </summary>
        /// <value>Interest name.</value>
        /* <example>travel</example> */
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Interest&#39;s percent of category&#39;s total audience.
        /// </summary>
        /// <value>Interest&#39;s percent of category&#39;s total audience.</value>
        /* <example>0.551</example> */
        [DataMember(Name="ratio", EmitDefaultValue=true)]
        public decimal Ratio { get; set; }

        /// <summary>
        /// Interest affinity index.
        /// </summary>
        /// <value>Interest affinity index.</value>
        /* <example>1.2</example> */
        [DataMember(Name="index", EmitDefaultValue=true)]
        public decimal Index { get; set; }

        /// <summary>
        /// Interest ID.
        /// </summary>
        /// <value>Interest ID.</value>
        /* <example>1234567</example> */
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Subcategory interest distribution
        /// </summary>
        /// <value>Subcategory interest distribution</value>
        [DataMember(Name="subcategories", EmitDefaultValue=false)]
        public List<AudienceSubcategory> Subcategories { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AudienceCategory {\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Ratio: ").Append(Ratio).Append("\n");
            sb.Append("  Index: ").Append(Index).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Subcategories: ").Append(Subcategories).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AudienceCategory)obj);
        }

        /// <summary>
        /// Returns true if AudienceCategory instances are equal
        /// </summary>
        /// <param name="other">Instance of AudienceCategory to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AudienceCategory other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Key == other.Key ||
                    Key != null &&
                    Key.Equals(other.Key)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Ratio == other.Ratio ||
                    
                    Ratio.Equals(other.Ratio)
                ) && 
                (
                    Index == other.Index ||
                    
                    Index.Equals(other.Index)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Subcategories == other.Subcategories ||
                    Subcategories != null &&
                    other.Subcategories != null &&
                    Subcategories.SequenceEqual(other.Subcategories)
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
                    if (Key != null)
                    hashCode = hashCode * 59 + Key.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + Ratio.GetHashCode();
                    
                    hashCode = hashCode * 59 + Index.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Subcategories != null)
                    hashCode = hashCode * 59 + Subcategories.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AudienceCategory left, AudienceCategory right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AudienceCategory left, AudienceCategory right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
