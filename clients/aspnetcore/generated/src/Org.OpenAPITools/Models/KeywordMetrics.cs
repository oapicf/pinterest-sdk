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
    /// Keyword metrics JSON
    /// </summary>
    [DataContract]
    public partial class KeywordMetrics : IEquatable<KeywordMetrics>
    {
        /// <summary>
        /// Average cost per click
        /// </summary>
        /// <value>Average cost per click</value>
        /* <example>100000</example> */
        [DataMember(Name="avg_cpc_in_micro_currency", EmitDefaultValue=true)]
        public decimal AvgCpcInMicroCurrency { get; set; }

        /// <summary>
        /// Keyword&#39;s search frequency. This value is based on keyword frequency in pepsi client response
        /// </summary>
        /// <value>Keyword&#39;s search frequency. This value is based on keyword frequency in pepsi client response</value>
        /* <example>5M+</example> */
        [DataMember(Name="keyword_query_volume", EmitDefaultValue=false)]
        public string KeywordQueryVolume { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class KeywordMetrics {\n");
            sb.Append("  AvgCpcInMicroCurrency: ").Append(AvgCpcInMicroCurrency).Append("\n");
            sb.Append("  KeywordQueryVolume: ").Append(KeywordQueryVolume).Append("\n");
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
            return obj.GetType() == GetType() && Equals((KeywordMetrics)obj);
        }

        /// <summary>
        /// Returns true if KeywordMetrics instances are equal
        /// </summary>
        /// <param name="other">Instance of KeywordMetrics to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KeywordMetrics other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AvgCpcInMicroCurrency == other.AvgCpcInMicroCurrency ||
                    
                    AvgCpcInMicroCurrency.Equals(other.AvgCpcInMicroCurrency)
                ) && 
                (
                    KeywordQueryVolume == other.KeywordQueryVolume ||
                    KeywordQueryVolume != null &&
                    KeywordQueryVolume.Equals(other.KeywordQueryVolume)
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
                    
                    hashCode = hashCode * 59 + AvgCpcInMicroCurrency.GetHashCode();
                    if (KeywordQueryVolume != null)
                    hashCode = hashCode * 59 + KeywordQueryVolume.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(KeywordMetrics left, KeywordMetrics right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(KeywordMetrics left, KeywordMetrics right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
