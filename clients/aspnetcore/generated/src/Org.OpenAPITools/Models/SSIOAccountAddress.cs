/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
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
    public partial class SSIOAccountAddress : IEquatable<SSIOAccountAddress>
    {
        /// <summary>
        /// Address display
        /// </summary>
        /// <value>Address display</value>
        /// <example>475 Brannan Street, San Francisco, CA 94103</example>
        [DataMember(Name="display", EmitDefaultValue=false)]
        public string Display { get; set; }

        /// <summary>
        /// Purpose for which the address is used, usually Billing or Businness
        /// </summary>
        /// <value>Purpose for which the address is used, usually Billing or Businness</value>
        /// <example>Billing</example>
        [DataMember(Name="purpose", EmitDefaultValue=false)]
        public string Purpose { get; set; }

        /// <summary>
        /// Salesforce id for address
        /// </summary>
        /// <value>Salesforce id for address</value>
        /// <example>a1C1N000004MUrLUAW</example>
        [DataMember(Name="address_id", EmitDefaultValue=false)]
        public string AddressId { get; set; }

        /// <summary>
        /// Legal entity for this insertion order
        /// </summary>
        /// <value>Legal entity for this insertion order</value>
        /// <example>PIN US OU</example>
        [DataMember(Name="order_legal_entity", EmitDefaultValue=false)]
        public string OrderLegalEntity { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SSIOAccountAddress {\n");
            sb.Append("  Display: ").Append(Display).Append("\n");
            sb.Append("  Purpose: ").Append(Purpose).Append("\n");
            sb.Append("  AddressId: ").Append(AddressId).Append("\n");
            sb.Append("  OrderLegalEntity: ").Append(OrderLegalEntity).Append("\n");
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
            return obj.GetType() == GetType() && Equals((SSIOAccountAddress)obj);
        }

        /// <summary>
        /// Returns true if SSIOAccountAddress instances are equal
        /// </summary>
        /// <param name="other">Instance of SSIOAccountAddress to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SSIOAccountAddress other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Display == other.Display ||
                    Display != null &&
                    Display.Equals(other.Display)
                ) && 
                (
                    Purpose == other.Purpose ||
                    Purpose != null &&
                    Purpose.Equals(other.Purpose)
                ) && 
                (
                    AddressId == other.AddressId ||
                    AddressId != null &&
                    AddressId.Equals(other.AddressId)
                ) && 
                (
                    OrderLegalEntity == other.OrderLegalEntity ||
                    OrderLegalEntity != null &&
                    OrderLegalEntity.Equals(other.OrderLegalEntity)
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
                    if (Display != null)
                    hashCode = hashCode * 59 + Display.GetHashCode();
                    if (Purpose != null)
                    hashCode = hashCode * 59 + Purpose.GetHashCode();
                    if (AddressId != null)
                    hashCode = hashCode * 59 + AddressId.GetHashCode();
                    if (OrderLegalEntity != null)
                    hashCode = hashCode * 59 + OrderLegalEntity.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SSIOAccountAddress left, SSIOAccountAddress right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SSIOAccountAddress left, SSIOAccountAddress right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}