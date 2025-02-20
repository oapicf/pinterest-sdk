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
    public partial class BidFloor : IEquatable<BidFloor>
    {
        /// <summary>
        /// A list of bid floors in micro currency. For example, [100000, 200000]
        /// </summary>
        /// <value>A list of bid floors in micro currency. For example, [100000, 200000]</value>
        /* <example>[100000,200000]</example> */
        [DataMember(Name="bid_floors", EmitDefaultValue=false)]
        public List<int> BidFloors { get; set; }

        /// <summary>
        /// Always the string &#39;bidfloor&#39;
        /// </summary>
        /// <value>Always the string &#39;bidfloor&#39;</value>
        /* <example>bidfloor</example> */
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; } = "bidfloor";

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BidFloor {\n");
            sb.Append("  BidFloors: ").Append(BidFloors).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BidFloor)obj);
        }

        /// <summary>
        /// Returns true if BidFloor instances are equal
        /// </summary>
        /// <param name="other">Instance of BidFloor to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BidFloor other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    BidFloors == other.BidFloors ||
                    BidFloors != null &&
                    other.BidFloors != null &&
                    BidFloors.SequenceEqual(other.BidFloors)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
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
                    if (BidFloors != null)
                    hashCode = hashCode * 59 + BidFloors.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BidFloor left, BidFloor right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BidFloor left, BidFloor right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
