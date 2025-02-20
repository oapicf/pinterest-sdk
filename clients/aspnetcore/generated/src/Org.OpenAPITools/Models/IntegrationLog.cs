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
    /// Schema for log sent from an integration application.
    /// </summary>
    [DataContract]
    public partial class IntegrationLog : IEquatable<IntegrationLog>
    {
        /// <summary>
        /// Timestamp in milliseconds of when the log was executed at the client.
        /// </summary>
        /// <value>Timestamp in milliseconds of when the log was executed at the client.</value>
        [Required]
        [DataMember(Name="client_timestamp", EmitDefaultValue=true)]
        public int ClientTimestamp { get; set; }


        /// <summary>
        /// Log event type
        /// </summary>
        /// <value>Log event type</value>
        [TypeConverter(typeof(CustomEnumConverter<EventTypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum EventTypeEnum
        {
            
            /// <summary>
            /// Enum APPEnum for APP
            /// </summary>
            [EnumMember(Value = "APP")]
            APPEnum = 1,
            
            /// <summary>
            /// Enum APIEnum for API
            /// </summary>
            [EnumMember(Value = "API")]
            APIEnum = 2
        }

        /// <summary>
        /// Log event type
        /// </summary>
        /// <value>Log event type</value>
        [Required]
        [DataMember(Name="event_type", EmitDefaultValue=true)]
        public EventTypeEnum EventType { get; set; }


        /// <summary>
        /// Log level type
        /// </summary>
        /// <value>Log level type</value>
        [TypeConverter(typeof(CustomEnumConverter<LogLevelEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum LogLevelEnum
        {
            
            /// <summary>
            /// Enum INFOEnum for INFO
            /// </summary>
            [EnumMember(Value = "INFO")]
            INFOEnum = 1,
            
            /// <summary>
            /// Enum WARNEnum for WARN
            /// </summary>
            [EnumMember(Value = "WARN")]
            WARNEnum = 2,
            
            /// <summary>
            /// Enum ERROREnum for ERROR
            /// </summary>
            [EnumMember(Value = "ERROR")]
            ERROREnum = 3
        }

        /// <summary>
        /// Log level type
        /// </summary>
        /// <value>Log level type</value>
        [Required]
        [DataMember(Name="log_level", EmitDefaultValue=true)]
        public LogLevelEnum LogLevel { get; set; }

        /// <summary>
        /// Gets or Sets ExternalBusinessId
        /// </summary>
        [MaxLength(2048)]
        [DataMember(Name="external_business_id", EmitDefaultValue=true)]
        public string ExternalBusinessId { get; set; }

        /// <summary>
        /// Gets or Sets AdvertiserId
        /// </summary>
        [MaxLength(128)]
        [DataMember(Name="advertiser_id", EmitDefaultValue=true)]
        public string AdvertiserId { get; set; }

        /// <summary>
        /// Gets or Sets MerchantId
        /// </summary>
        [MaxLength(128)]
        [DataMember(Name="merchant_id", EmitDefaultValue=true)]
        public string MerchantId { get; set; }

        /// <summary>
        /// Gets or Sets TagId
        /// </summary>
        [MaxLength(128)]
        [DataMember(Name="tag_id", EmitDefaultValue=true)]
        public string TagId { get; set; }

        /// <summary>
        /// Gets or Sets FeedProfileId
        /// </summary>
        [MaxLength(128)]
        [DataMember(Name="feed_profile_id", EmitDefaultValue=true)]
        public string FeedProfileId { get; set; }

        /// <summary>
        /// Explanation of the event that occured.
        /// </summary>
        /// <value>Explanation of the event that occured.</value>
        [MaxLength(2048)]
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// Version number of the integration application.
        /// </summary>
        /// <value>Version number of the integration application.</value>
        [MaxLength(20)]
        [DataMember(Name="app_version_number", EmitDefaultValue=false)]
        public string AppVersionNumber { get; set; }

        /// <summary>
        /// Version number of the platform the integration application is running on.
        /// </summary>
        /// <value>Version number of the platform the integration application is running on.</value>
        [MaxLength(20)]
        [DataMember(Name="platform_version_number", EmitDefaultValue=false)]
        public string PlatformVersionNumber { get; set; }

        /// <summary>
        /// Gets or Sets Error
        /// </summary>
        [DataMember(Name="error", EmitDefaultValue=false)]
        public IntegrationLogClientError Error { get; set; }

        /// <summary>
        /// Gets or Sets Request
        /// </summary>
        [DataMember(Name="request", EmitDefaultValue=false)]
        public IntegrationLogClientRequest Request { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IntegrationLog {\n");
            sb.Append("  ClientTimestamp: ").Append(ClientTimestamp).Append("\n");
            sb.Append("  EventType: ").Append(EventType).Append("\n");
            sb.Append("  LogLevel: ").Append(LogLevel).Append("\n");
            sb.Append("  ExternalBusinessId: ").Append(ExternalBusinessId).Append("\n");
            sb.Append("  AdvertiserId: ").Append(AdvertiserId).Append("\n");
            sb.Append("  MerchantId: ").Append(MerchantId).Append("\n");
            sb.Append("  TagId: ").Append(TagId).Append("\n");
            sb.Append("  FeedProfileId: ").Append(FeedProfileId).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  AppVersionNumber: ").Append(AppVersionNumber).Append("\n");
            sb.Append("  PlatformVersionNumber: ").Append(PlatformVersionNumber).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
            sb.Append("  Request: ").Append(Request).Append("\n");
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
            return obj.GetType() == GetType() && Equals((IntegrationLog)obj);
        }

        /// <summary>
        /// Returns true if IntegrationLog instances are equal
        /// </summary>
        /// <param name="other">Instance of IntegrationLog to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IntegrationLog other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ClientTimestamp == other.ClientTimestamp ||
                    
                    ClientTimestamp.Equals(other.ClientTimestamp)
                ) && 
                (
                    EventType == other.EventType ||
                    
                    EventType.Equals(other.EventType)
                ) && 
                (
                    LogLevel == other.LogLevel ||
                    
                    LogLevel.Equals(other.LogLevel)
                ) && 
                (
                    ExternalBusinessId == other.ExternalBusinessId ||
                    ExternalBusinessId != null &&
                    ExternalBusinessId.Equals(other.ExternalBusinessId)
                ) && 
                (
                    AdvertiserId == other.AdvertiserId ||
                    AdvertiserId != null &&
                    AdvertiserId.Equals(other.AdvertiserId)
                ) && 
                (
                    MerchantId == other.MerchantId ||
                    MerchantId != null &&
                    MerchantId.Equals(other.MerchantId)
                ) && 
                (
                    TagId == other.TagId ||
                    TagId != null &&
                    TagId.Equals(other.TagId)
                ) && 
                (
                    FeedProfileId == other.FeedProfileId ||
                    FeedProfileId != null &&
                    FeedProfileId.Equals(other.FeedProfileId)
                ) && 
                (
                    Message == other.Message ||
                    Message != null &&
                    Message.Equals(other.Message)
                ) && 
                (
                    AppVersionNumber == other.AppVersionNumber ||
                    AppVersionNumber != null &&
                    AppVersionNumber.Equals(other.AppVersionNumber)
                ) && 
                (
                    PlatformVersionNumber == other.PlatformVersionNumber ||
                    PlatformVersionNumber != null &&
                    PlatformVersionNumber.Equals(other.PlatformVersionNumber)
                ) && 
                (
                    Error == other.Error ||
                    Error != null &&
                    Error.Equals(other.Error)
                ) && 
                (
                    Request == other.Request ||
                    Request != null &&
                    Request.Equals(other.Request)
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
                    
                    hashCode = hashCode * 59 + ClientTimestamp.GetHashCode();
                    
                    hashCode = hashCode * 59 + EventType.GetHashCode();
                    
                    hashCode = hashCode * 59 + LogLevel.GetHashCode();
                    if (ExternalBusinessId != null)
                    hashCode = hashCode * 59 + ExternalBusinessId.GetHashCode();
                    if (AdvertiserId != null)
                    hashCode = hashCode * 59 + AdvertiserId.GetHashCode();
                    if (MerchantId != null)
                    hashCode = hashCode * 59 + MerchantId.GetHashCode();
                    if (TagId != null)
                    hashCode = hashCode * 59 + TagId.GetHashCode();
                    if (FeedProfileId != null)
                    hashCode = hashCode * 59 + FeedProfileId.GetHashCode();
                    if (Message != null)
                    hashCode = hashCode * 59 + Message.GetHashCode();
                    if (AppVersionNumber != null)
                    hashCode = hashCode * 59 + AppVersionNumber.GetHashCode();
                    if (PlatformVersionNumber != null)
                    hashCode = hashCode * 59 + PlatformVersionNumber.GetHashCode();
                    if (Error != null)
                    hashCode = hashCode * 59 + Error.GetHashCode();
                    if (Request != null)
                    hashCode = hashCode * 59 + Request.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(IntegrationLog left, IntegrationLog right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(IntegrationLog left, IntegrationLog right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
