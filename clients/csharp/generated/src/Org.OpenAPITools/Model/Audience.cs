/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
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
    /// Audience
    /// </summary>
    [DataContract(Name = "Audience")]
    public partial class Audience : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Audience" /> class.
        /// </summary>
        /// <param name="adAccountId">Ad account ID..</param>
        /// <param name="id">Audience ID..</param>
        /// <param name="name">Audience name..</param>
        /// <param name="audienceType">&lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR.</param>
        /// <param name="description">Audience description..</param>
        /// <param name="rule">rule.</param>
        /// <param name="size">Audience size..</param>
        /// <param name="status">Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it..</param>
        /// <param name="type">Always \&quot;audience\&quot;..</param>
        /// <param name="createdTimestamp">Creation time. Unix timestamp in seconds..</param>
        /// <param name="updatedTimestamp">Last update time. Unix timestamp in seconds..</param>
        public Audience(string adAccountId = default(string), string id = default(string), string name = default(string), string audienceType = default(string), string description = default(string), AudienceRule rule = default(AudienceRule), int? size = default(int?), string status = default(string), string type = default(string), int? createdTimestamp = default(int?), int? updatedTimestamp = default(int?))
        {
            this.AdAccountId = adAccountId;
            this.Id = id;
            this.Name = name;
            this.AudienceType = audienceType;
            this.Description = description;
            this.Rule = rule;
            this.Size = size;
            this.Status = status;
            this.Type = type;
            this.CreatedTimestamp = createdTimestamp;
            this.UpdatedTimestamp = updatedTimestamp;
        }

        /// <summary>
        /// Ad account ID.
        /// </summary>
        /// <value>Ad account ID.</value>
        /// <example>549755885175</example>
        [DataMember(Name = "ad_account_id", EmitDefaultValue = false)]
        public string AdAccountId { get; set; }

        /// <summary>
        /// Audience ID.
        /// </summary>
        /// <value>Audience ID.</value>
        /// <example>1234</example>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Audience name.
        /// </summary>
        /// <value>Audience name.</value>
        /// <example>ACME Tools</example>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
        /// </summary>
        /// <value>&lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR</value>
        [DataMember(Name = "audience_type", EmitDefaultValue = false)]
        public string AudienceType { get; set; }

        /// <summary>
        /// Audience description.
        /// </summary>
        /// <value>Audience description.</value>
        /// <example>People who love making quilts.</example>
        [DataMember(Name = "description", EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Rule
        /// </summary>
        [DataMember(Name = "rule", EmitDefaultValue = false)]
        public AudienceRule Rule { get; set; }

        /// <summary>
        /// Audience size.
        /// </summary>
        /// <value>Audience size.</value>
        /// <example>1000</example>
        [DataMember(Name = "size", EmitDefaultValue = true)]
        public int? Size { get; set; }

        /// <summary>
        /// Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
        /// </summary>
        /// <value>Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.</value>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public string Status { get; set; }

        /// <summary>
        /// Always \&quot;audience\&quot;.
        /// </summary>
        /// <value>Always \&quot;audience\&quot;.</value>
        /// <example>audience</example>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Creation time. Unix timestamp in seconds.
        /// </summary>
        /// <value>Creation time. Unix timestamp in seconds.</value>
        /// <example>1451431341</example>
        [DataMember(Name = "created_timestamp", EmitDefaultValue = true)]
        public int? CreatedTimestamp { get; set; }

        /// <summary>
        /// Last update time. Unix timestamp in seconds.
        /// </summary>
        /// <value>Last update time. Unix timestamp in seconds.</value>
        /// <example>1451431341</example>
        [DataMember(Name = "updated_timestamp", EmitDefaultValue = true)]
        public int? UpdatedTimestamp { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Audience {\n");
            sb.Append("  AdAccountId: ").Append(AdAccountId).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  AudienceType: ").Append(AudienceType).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Rule: ").Append(Rule).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  CreatedTimestamp: ").Append(CreatedTimestamp).Append("\n");
            sb.Append("  UpdatedTimestamp: ").Append(UpdatedTimestamp).Append("\n");
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
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            if (this.AdAccountId != null) {
                // AdAccountId (string) pattern
                Regex regexAdAccountId = new Regex(@"^\d+$", RegexOptions.CultureInvariant);
                if (!regexAdAccountId.Match(this.AdAccountId).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AdAccountId, must match a pattern of " + regexAdAccountId, new [] { "AdAccountId" });
                }
            }

            if (this.Id != null) {
                // Id (string) pattern
                Regex regexId = new Regex(@"^\d+$", RegexOptions.CultureInvariant);
                if (!regexId.Match(this.Id).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Id, must match a pattern of " + regexId, new [] { "Id" });
                }
            }

            yield break;
        }
    }

}