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
    /// Board fields for updates
    /// </summary>
    [DataContract]
    public partial class BoardUpdate : IEquatable<BoardUpdate>
    {
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        /* <example>Summer Recipes</example> */
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        /* <example>My favorite summer recipes</example> */
        [DataMember(Name="description", EmitDefaultValue=true)]
        public string Description { get; set; }


        /// <summary>
        /// Gets or Sets Privacy
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<PrivacyEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum PrivacyEnum
        {
            
            /// <summary>
            /// Enum PUBLICEnum for PUBLIC
            /// </summary>
            [EnumMember(Value = "PUBLIC")]
            PUBLICEnum = 1,
            
            /// <summary>
            /// Enum SECRETEnum for SECRET
            /// </summary>
            [EnumMember(Value = "SECRET")]
            SECRETEnum = 2
        }

        /// <summary>
        /// Gets or Sets Privacy
        /// </summary>
        [DataMember(Name="privacy", EmitDefaultValue=true)]
        public PrivacyEnum Privacy { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BoardUpdate {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Privacy: ").Append(Privacy).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BoardUpdate)obj);
        }

        /// <summary>
        /// Returns true if BoardUpdate instances are equal
        /// </summary>
        /// <param name="other">Instance of BoardUpdate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BoardUpdate other)
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
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    Privacy == other.Privacy ||
                    
                    Privacy.Equals(other.Privacy)
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
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    
                    hashCode = hashCode * 59 + Privacy.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BoardUpdate left, BoardUpdate right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BoardUpdate left, BoardUpdate right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
