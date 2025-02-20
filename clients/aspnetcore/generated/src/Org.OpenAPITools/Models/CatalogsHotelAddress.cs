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
    public partial class CatalogsHotelAddress : IEquatable<CatalogsHotelAddress>
    {
        /// <summary>
        /// Primary street address of hotel.
        /// </summary>
        /// <value>Primary street address of hotel.</value>
        [DataMember(Name="addr1", EmitDefaultValue=false)]
        public string Addr1 { get; set; }

        /// <summary>
        /// City where the hotel is located.
        /// </summary>
        /// <value>City where the hotel is located.</value>
        [DataMember(Name="city", EmitDefaultValue=false)]
        public string City { get; set; }

        /// <summary>
        /// State, county, province, where the hotel is located.
        /// </summary>
        /// <value>State, county, province, where the hotel is located.</value>
        [DataMember(Name="region", EmitDefaultValue=false)]
        public string Region { get; set; }

        /// <summary>
        /// Country where the hotel is located.
        /// </summary>
        /// <value>Country where the hotel is located.</value>
        [DataMember(Name="country", EmitDefaultValue=false)]
        public string Country { get; set; }

        /// <summary>
        /// Required for countries with a postal code system. Postal or zip code of the hotel.
        /// </summary>
        /// <value>Required for countries with a postal code system. Postal or zip code of the hotel.</value>
        [DataMember(Name="postal_code", EmitDefaultValue=false)]
        public string PostalCode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CatalogsHotelAddress {\n");
            sb.Append("  Addr1: ").Append(Addr1).Append("\n");
            sb.Append("  City: ").Append(City).Append("\n");
            sb.Append("  Region: ").Append(Region).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  PostalCode: ").Append(PostalCode).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CatalogsHotelAddress)obj);
        }

        /// <summary>
        /// Returns true if CatalogsHotelAddress instances are equal
        /// </summary>
        /// <param name="other">Instance of CatalogsHotelAddress to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CatalogsHotelAddress other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Addr1 == other.Addr1 ||
                    Addr1 != null &&
                    Addr1.Equals(other.Addr1)
                ) && 
                (
                    City == other.City ||
                    City != null &&
                    City.Equals(other.City)
                ) && 
                (
                    Region == other.Region ||
                    Region != null &&
                    Region.Equals(other.Region)
                ) && 
                (
                    Country == other.Country ||
                    Country != null &&
                    Country.Equals(other.Country)
                ) && 
                (
                    PostalCode == other.PostalCode ||
                    PostalCode != null &&
                    PostalCode.Equals(other.PostalCode)
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
                    if (Addr1 != null)
                    hashCode = hashCode * 59 + Addr1.GetHashCode();
                    if (City != null)
                    hashCode = hashCode * 59 + City.GetHashCode();
                    if (Region != null)
                    hashCode = hashCode * 59 + Region.GetHashCode();
                    if (Country != null)
                    hashCode = hashCode * 59 + Country.GetHashCode();
                    if (PostalCode != null)
                    hashCode = hashCode * 59 + PostalCode.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CatalogsHotelAddress left, CatalogsHotelAddress right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CatalogsHotelAddress left, CatalogsHotelAddress right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
