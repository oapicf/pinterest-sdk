/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ConversionEventsDataInner
    /// </summary>
    [DataContract(Name = "ConversionEvents_data_inner")]
    public partial class ConversionEventsDataInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConversionEventsDataInner" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ConversionEventsDataInner() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ConversionEventsDataInner" /> class.
        /// </summary>
        /// <param name="eventName">&lt;p&gt;The type of the user event. Please use the right event_name otherwise the event won&#39;t be accepted and show up correctly in reports.   &lt;ul&gt;   &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;custom&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;lead&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;search&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;signup&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt;  (required).</param>
        /// <param name="actionSource">&lt;p&gt;   The source indicating where the conversion event occurred.   &lt;ul&gt;     &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;web&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;offline&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt;  (required).</param>
        /// <param name="eventTime">The time when the event happened. Unix timestamp in seconds. (required).</param>
        /// <param name="eventId">A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. (required).</param>
        /// <param name="eventSourceUrl">URL of the web conversion event..</param>
        /// <param name="optOut">When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device..</param>
        /// <param name="partnerName">The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’.</param>
        /// <param name="userData">userData (required).</param>
        /// <param name="customData">customData.</param>
        /// <param name="appId">The app store app ID..</param>
        /// <param name="appName">Name of the app..</param>
        /// <param name="appVersion">Version of the app..</param>
        /// <param name="deviceBrand">Brand of the user device..</param>
        /// <param name="deviceCarrier">User device&#39;s mobile carrier..</param>
        /// <param name="deviceModel">Model of the user device..</param>
        /// <param name="deviceType">Type of the user device..</param>
        /// <param name="osVersion">Version of the device operating system..</param>
        /// <param name="wifi">Whether the event occurred when the user device was connected to wifi..</param>
        /// <param name="language">Two-character ISO-639-1 language code indicating the user&#39;s language..</param>
        public ConversionEventsDataInner(string eventName = default(string), string actionSource = default(string), long eventTime = default(long), string eventId = default(string), string eventSourceUrl = default(string), bool optOut = default(bool), string partnerName = default(string), ConversionEventsUserData userData = default(ConversionEventsUserData), ConversionEventsDataInnerCustomData customData = default(ConversionEventsDataInnerCustomData), string appId = default(string), string appName = default(string), string appVersion = default(string), string deviceBrand = default(string), string deviceCarrier = default(string), string deviceModel = default(string), string deviceType = default(string), string osVersion = default(string), bool wifi = default(bool), string language = default(string))
        {
            // to ensure "eventName" is required (not null)
            if (eventName == null)
            {
                throw new ArgumentNullException("eventName is a required property for ConversionEventsDataInner and cannot be null");
            }
            this.EventName = eventName;
            // to ensure "actionSource" is required (not null)
            if (actionSource == null)
            {
                throw new ArgumentNullException("actionSource is a required property for ConversionEventsDataInner and cannot be null");
            }
            this.ActionSource = actionSource;
            this.EventTime = eventTime;
            // to ensure "eventId" is required (not null)
            if (eventId == null)
            {
                throw new ArgumentNullException("eventId is a required property for ConversionEventsDataInner and cannot be null");
            }
            this.EventId = eventId;
            // to ensure "userData" is required (not null)
            if (userData == null)
            {
                throw new ArgumentNullException("userData is a required property for ConversionEventsDataInner and cannot be null");
            }
            this.UserData = userData;
            this.EventSourceUrl = eventSourceUrl;
            this.OptOut = optOut;
            this.PartnerName = partnerName;
            this.CustomData = customData;
            this.AppId = appId;
            this.AppName = appName;
            this.AppVersion = appVersion;
            this.DeviceBrand = deviceBrand;
            this.DeviceCarrier = deviceCarrier;
            this.DeviceModel = deviceModel;
            this.DeviceType = deviceType;
            this.OsVersion = osVersion;
            this.Wifi = wifi;
            this.Language = language;
        }

        /// <summary>
        /// &lt;p&gt;The type of the user event. Please use the right event_name otherwise the event won&#39;t be accepted and show up correctly in reports.   &lt;ul&gt;   &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;custom&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;lead&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;search&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;signup&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt; 
        /// </summary>
        /// <value>&lt;p&gt;The type of the user event. Please use the right event_name otherwise the event won&#39;t be accepted and show up correctly in reports.   &lt;ul&gt;   &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;custom&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;lead&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;search&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;signup&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt; </value>
        /*
        <example>checkout</example>
        */
        [DataMember(Name = "event_name", IsRequired = true, EmitDefaultValue = true)]
        public string EventName { get; set; }

        /// <summary>
        /// &lt;p&gt;   The source indicating where the conversion event occurred.   &lt;ul&gt;     &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;web&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;offline&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt; 
        /// </summary>
        /// <value>&lt;p&gt;   The source indicating where the conversion event occurred.   &lt;ul&gt;     &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;web&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;offline&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt; </value>
        /*
        <example>app_ios</example>
        */
        [DataMember(Name = "action_source", IsRequired = true, EmitDefaultValue = true)]
        public string ActionSource { get; set; }

        /// <summary>
        /// The time when the event happened. Unix timestamp in seconds.
        /// </summary>
        /// <value>The time when the event happened. Unix timestamp in seconds.</value>
        /*
        <example>1451431341</example>
        */
        [DataMember(Name = "event_time", IsRequired = true, EmitDefaultValue = true)]
        public long EventTime { get; set; }

        /// <summary>
        /// A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
        /// </summary>
        /// <value>A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.</value>
        /*
        <example>eventId0001</example>
        */
        [DataMember(Name = "event_id", IsRequired = true, EmitDefaultValue = true)]
        public string EventId { get; set; }

        /// <summary>
        /// URL of the web conversion event.
        /// </summary>
        /// <value>URL of the web conversion event.</value>
        /*
        <example>https://www.my-clothing-shop.org/</example>
        */
        [DataMember(Name = "event_source_url", EmitDefaultValue = true)]
        public string EventSourceUrl { get; set; }

        /// <summary>
        /// When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
        /// </summary>
        /// <value>When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.</value>
        /*
        <example>false</example>
        */
        [DataMember(Name = "opt_out", EmitDefaultValue = true)]
        public bool OptOut { get; set; }

        /// <summary>
        /// The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’
        /// </summary>
        /// <value>The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’</value>
        /*
        <example>ss-partnername</example>
        */
        [DataMember(Name = "partner_name", EmitDefaultValue = true)]
        public string PartnerName { get; set; }

        /// <summary>
        /// Gets or Sets UserData
        /// </summary>
        [DataMember(Name = "user_data", IsRequired = true, EmitDefaultValue = true)]
        public ConversionEventsUserData UserData { get; set; }

        /// <summary>
        /// Gets or Sets CustomData
        /// </summary>
        [DataMember(Name = "custom_data", EmitDefaultValue = false)]
        public ConversionEventsDataInnerCustomData CustomData { get; set; }

        /// <summary>
        /// The app store app ID.
        /// </summary>
        /// <value>The app store app ID.</value>
        /*
        <example>429047995</example>
        */
        [DataMember(Name = "app_id", EmitDefaultValue = true)]
        public string AppId { get; set; }

        /// <summary>
        /// Name of the app.
        /// </summary>
        /// <value>Name of the app.</value>
        /*
        <example>Pinterest</example>
        */
        [DataMember(Name = "app_name", EmitDefaultValue = true)]
        public string AppName { get; set; }

        /// <summary>
        /// Version of the app.
        /// </summary>
        /// <value>Version of the app.</value>
        /*
        <example>7.9</example>
        */
        [DataMember(Name = "app_version", EmitDefaultValue = true)]
        public string AppVersion { get; set; }

        /// <summary>
        /// Brand of the user device.
        /// </summary>
        /// <value>Brand of the user device.</value>
        /*
        <example>Apple</example>
        */
        [DataMember(Name = "device_brand", EmitDefaultValue = true)]
        public string DeviceBrand { get; set; }

        /// <summary>
        /// User device&#39;s mobile carrier.
        /// </summary>
        /// <value>User device&#39;s mobile carrier.</value>
        /*
        <example>T-Mobile</example>
        */
        [DataMember(Name = "device_carrier", EmitDefaultValue = true)]
        public string DeviceCarrier { get; set; }

        /// <summary>
        /// Model of the user device.
        /// </summary>
        /// <value>Model of the user device.</value>
        /*
        <example>iPhone X</example>
        */
        [DataMember(Name = "device_model", EmitDefaultValue = true)]
        public string DeviceModel { get; set; }

        /// <summary>
        /// Type of the user device.
        /// </summary>
        /// <value>Type of the user device.</value>
        /*
        <example>iPhone</example>
        */
        [DataMember(Name = "device_type", EmitDefaultValue = true)]
        public string DeviceType { get; set; }

        /// <summary>
        /// Version of the device operating system.
        /// </summary>
        /// <value>Version of the device operating system.</value>
        /*
        <example>12.1.4</example>
        */
        [DataMember(Name = "os_version", EmitDefaultValue = true)]
        public string OsVersion { get; set; }

        /// <summary>
        /// Whether the event occurred when the user device was connected to wifi.
        /// </summary>
        /// <value>Whether the event occurred when the user device was connected to wifi.</value>
        /*
        <example>false</example>
        */
        [DataMember(Name = "wifi", EmitDefaultValue = true)]
        public bool Wifi { get; set; }

        /// <summary>
        /// Two-character ISO-639-1 language code indicating the user&#39;s language.
        /// </summary>
        /// <value>Two-character ISO-639-1 language code indicating the user&#39;s language.</value>
        /*
        <example>en</example>
        */
        [DataMember(Name = "language", EmitDefaultValue = true)]
        public string Language { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ConversionEventsDataInner {\n");
            sb.Append("  EventName: ").Append(EventName).Append("\n");
            sb.Append("  ActionSource: ").Append(ActionSource).Append("\n");
            sb.Append("  EventTime: ").Append(EventTime).Append("\n");
            sb.Append("  EventId: ").Append(EventId).Append("\n");
            sb.Append("  EventSourceUrl: ").Append(EventSourceUrl).Append("\n");
            sb.Append("  OptOut: ").Append(OptOut).Append("\n");
            sb.Append("  PartnerName: ").Append(PartnerName).Append("\n");
            sb.Append("  UserData: ").Append(UserData).Append("\n");
            sb.Append("  CustomData: ").Append(CustomData).Append("\n");
            sb.Append("  AppId: ").Append(AppId).Append("\n");
            sb.Append("  AppName: ").Append(AppName).Append("\n");
            sb.Append("  AppVersion: ").Append(AppVersion).Append("\n");
            sb.Append("  DeviceBrand: ").Append(DeviceBrand).Append("\n");
            sb.Append("  DeviceCarrier: ").Append(DeviceCarrier).Append("\n");
            sb.Append("  DeviceModel: ").Append(DeviceModel).Append("\n");
            sb.Append("  DeviceType: ").Append(DeviceType).Append("\n");
            sb.Append("  OsVersion: ").Append(OsVersion).Append("\n");
            sb.Append("  Wifi: ").Append(Wifi).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
