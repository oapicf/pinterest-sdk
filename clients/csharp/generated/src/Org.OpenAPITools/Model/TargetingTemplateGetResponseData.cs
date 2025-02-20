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
    /// TargetingTemplateGetResponseData
    /// </summary>
    [DataContract(Name = "TargetingTemplateGetResponseData")]
    public partial class TargetingTemplateGetResponseData : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets PlacementGroup
        /// </summary>
        [DataMember(Name = "placement_group", EmitDefaultValue = false)]
        public PlacementGroupType? PlacementGroup { get; set; }
        /// <summary>
        /// Indicate targeting template is active or Deleted
        /// </summary>
        /// <value>Indicate targeting template is active or Deleted</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusEnum
        {
            /// <summary>
            /// Enum ACTIVE for value: ACTIVE
            /// </summary>
            [EnumMember(Value = "ACTIVE")]
            ACTIVE = 1,

            /// <summary>
            /// Enum DELETED for value: DELETED
            /// </summary>
            [EnumMember(Value = "DELETED")]
            DELETED = 2
        }


        /// <summary>
        /// Indicate targeting template is active or Deleted
        /// </summary>
        /// <value>Indicate targeting template is active or Deleted</value>
        /*
        <example>ACTIVE</example>
        */
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public StatusEnum? Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="TargetingTemplateGetResponseData" /> class.
        /// </summary>
        /// <param name="name">targeting template name.</param>
        /// <param name="autoTargetingEnabled">Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. (default to true).</param>
        /// <param name="targetingAttributes">targetingAttributes.</param>
        /// <param name="placementGroup">placementGroup.</param>
        /// <param name="keywords">keywords.</param>
        /// <param name="trackingUrls">trackingUrls.</param>
        /// <param name="id">Targeting template ID..</param>
        /// <param name="createdTime">Targeting template created time. Unix timestamp in seconds..</param>
        /// <param name="updatedTime">Targeting template updated time.Unix timestamp in seconds..</param>
        /// <param name="adAccountId">The ID of the advertiser that this targeting template belongs to..</param>
        /// <param name="status">Indicate targeting template is active or Deleted (default to StatusEnum.ACTIVE).</param>
        /// <param name="sizing">sizing.</param>
        /// <param name="valid">Inform if the targeting template is valid (ex. would be false if has revoked audience).</param>
        public TargetingTemplateGetResponseData(string name = default(string), bool autoTargetingEnabled = true, TargetingSpec targetingAttributes = default(TargetingSpec), PlacementGroupType? placementGroup = default(PlacementGroupType?), List<TargetingTemplateKeyword> keywords = default(List<TargetingTemplateKeyword>), TrackingUrls trackingUrls = default(TrackingUrls), string id = default(string), int createdTime = default(int), int updatedTime = default(int), string adAccountId = default(string), StatusEnum? status = StatusEnum.ACTIVE, TargetingTemplateAudienceSizing sizing = default(TargetingTemplateAudienceSizing), bool? valid = default(bool?))
        {
            this.Name = name;
            this.AutoTargetingEnabled = autoTargetingEnabled;
            this.TargetingAttributes = targetingAttributes;
            this.PlacementGroup = placementGroup;
            this.Keywords = keywords;
            this.TrackingUrls = trackingUrls;
            this.Id = id;
            this.CreatedTime = createdTime;
            this.UpdatedTime = updatedTime;
            this.AdAccountId = adAccountId;
            this.Status = status;
            this.Sizing = sizing;
            this.Valid = valid;
        }

        /// <summary>
        /// targeting template name
        /// </summary>
        /// <value>targeting template name</value>
        /*
        <example>Gaming</example>
        */
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
        /// </summary>
        /// <value>Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.</value>
        [DataMember(Name = "auto_targeting_enabled", EmitDefaultValue = true)]
        public bool AutoTargetingEnabled { get; set; }

        /// <summary>
        /// Gets or Sets TargetingAttributes
        /// </summary>
        [DataMember(Name = "targeting_attributes", EmitDefaultValue = false)]
        public TargetingSpec TargetingAttributes { get; set; }

        /// <summary>
        /// Gets or Sets Keywords
        /// </summary>
        /*
        <example>[{value&#x3D;cats, match_type&#x3D;EXACT_NEGATIVE}]</example>
        */
        [DataMember(Name = "keywords", EmitDefaultValue = false)]
        public List<TargetingTemplateKeyword> Keywords { get; set; }

        /// <summary>
        /// Gets or Sets TrackingUrls
        /// </summary>
        [DataMember(Name = "tracking_urls", EmitDefaultValue = true)]
        public TrackingUrls TrackingUrls { get; set; }

        /// <summary>
        /// Targeting template ID.
        /// </summary>
        /// <value>Targeting template ID.</value>
        /*
        <example>643</example>
        */
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Targeting template created time. Unix timestamp in seconds.
        /// </summary>
        /// <value>Targeting template created time. Unix timestamp in seconds.</value>
        /*
        <example>1432744744</example>
        */
        [DataMember(Name = "created_time", EmitDefaultValue = false)]
        public int CreatedTime { get; set; }

        /// <summary>
        /// Targeting template updated time.Unix timestamp in seconds.
        /// </summary>
        /// <value>Targeting template updated time.Unix timestamp in seconds.</value>
        /*
        <example>1432744744</example>
        */
        [DataMember(Name = "updated_time", EmitDefaultValue = false)]
        public int UpdatedTime { get; set; }

        /// <summary>
        /// The ID of the advertiser that this targeting template belongs to.
        /// </summary>
        /// <value>The ID of the advertiser that this targeting template belongs to.</value>
        /*
        <example>549755885175</example>
        */
        [DataMember(Name = "ad_account_id", EmitDefaultValue = false)]
        public string AdAccountId { get; set; }

        /// <summary>
        /// Gets or Sets Sizing
        /// </summary>
        [DataMember(Name = "sizing", EmitDefaultValue = true)]
        public TargetingTemplateAudienceSizing Sizing { get; set; }

        /// <summary>
        /// Inform if the targeting template is valid (ex. would be false if has revoked audience)
        /// </summary>
        /// <value>Inform if the targeting template is valid (ex. would be false if has revoked audience)</value>
        /*
        <example>true</example>
        */
        [DataMember(Name = "valid", EmitDefaultValue = true)]
        public bool? Valid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TargetingTemplateGetResponseData {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  AutoTargetingEnabled: ").Append(AutoTargetingEnabled).Append("\n");
            sb.Append("  TargetingAttributes: ").Append(TargetingAttributes).Append("\n");
            sb.Append("  PlacementGroup: ").Append(PlacementGroup).Append("\n");
            sb.Append("  Keywords: ").Append(Keywords).Append("\n");
            sb.Append("  TrackingUrls: ").Append(TrackingUrls).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  CreatedTime: ").Append(CreatedTime).Append("\n");
            sb.Append("  UpdatedTime: ").Append(UpdatedTime).Append("\n");
            sb.Append("  AdAccountId: ").Append(AdAccountId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Sizing: ").Append(Sizing).Append("\n");
            sb.Append("  Valid: ").Append(Valid).Append("\n");
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
            if (this.Id != null) {
                // Id (string) pattern
                Regex regexId = new Regex(@"^\d+$", RegexOptions.CultureInvariant);
                if (!regexId.Match(this.Id).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Id, must match a pattern of " + regexId, new [] { "Id" });
                }
            }

            if (this.AdAccountId != null) {
                // AdAccountId (string) pattern
                Regex regexAdAccountId = new Regex(@"^\d+$", RegexOptions.CultureInvariant);
                if (!regexAdAccountId.Match(this.AdAccountId).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AdAccountId, must match a pattern of " + regexAdAccountId, new [] { "AdAccountId" });
                }
            }

            yield break;
        }
    }

}
