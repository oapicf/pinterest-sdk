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
    public partial class ConversionApiResponseEventsInner : IEquatable<ConversionApiResponseEventsInner>
    {

        /// <summary>
        /// Whether the event was processed successfully.
        /// </summary>
        /// <value>Whether the event was processed successfully.</value>
        [TypeConverter(typeof(CustomEnumConverter<StatusEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum StatusEnum
        {
            
            /// <summary>
            /// Enum FailedEnum for failed
            /// </summary>
            [EnumMember(Value = "failed")]
            FailedEnum = 1,
            
            /// <summary>
            /// Enum ProcessedEnum for processed
            /// </summary>
            [EnumMember(Value = "processed")]
            ProcessedEnum = 2
        }

        /// <summary>
        /// Whether the event was processed successfully.
        /// </summary>
        /// <value>Whether the event was processed successfully.</value>
        /* <example>processed</example> */
        [Required]
        [DataMember(Name="status", EmitDefaultValue=true)]
        public StatusEnum Status { get; set; }

        /// <summary>
        /// Error message containing more information about why the event failed to be processed.
        /// </summary>
        /// <value>Error message containing more information about why the event failed to be processed.</value>
        [DataMember(Name="error_message", EmitDefaultValue=true)]
        public string ErrorMessage { get; set; }

        /// <summary>
        /// Warning messages about any fields in the event which are not standard. These are not critical to event processing.
        /// </summary>
        /// <value>Warning messages about any fields in the event which are not standard. These are not critical to event processing.</value>
        [DataMember(Name="warning_message", EmitDefaultValue=true)]
        public string WarningMessage { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConversionApiResponseEventsInner {\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  ErrorMessage: ").Append(ErrorMessage).Append("\n");
            sb.Append("  WarningMessage: ").Append(WarningMessage).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ConversionApiResponseEventsInner)obj);
        }

        /// <summary>
        /// Returns true if ConversionApiResponseEventsInner instances are equal
        /// </summary>
        /// <param name="other">Instance of ConversionApiResponseEventsInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConversionApiResponseEventsInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Status == other.Status ||
                    
                    Status.Equals(other.Status)
                ) && 
                (
                    ErrorMessage == other.ErrorMessage ||
                    ErrorMessage != null &&
                    ErrorMessage.Equals(other.ErrorMessage)
                ) && 
                (
                    WarningMessage == other.WarningMessage ||
                    WarningMessage != null &&
                    WarningMessage.Equals(other.WarningMessage)
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
                    
                    hashCode = hashCode * 59 + Status.GetHashCode();
                    if (ErrorMessage != null)
                    hashCode = hashCode * 59 + ErrorMessage.GetHashCode();
                    if (WarningMessage != null)
                    hashCode = hashCode * 59 + WarningMessage.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ConversionApiResponseEventsInner left, ConversionApiResponseEventsInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ConversionApiResponseEventsInner left, ConversionApiResponseEventsInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
