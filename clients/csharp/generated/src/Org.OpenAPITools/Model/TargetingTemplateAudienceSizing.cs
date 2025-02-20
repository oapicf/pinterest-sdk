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
    /// Gets an audience size estimate for a set of given targeting spec data. &lt;p&gt;Returns:&lt;/p&gt; An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. 
    /// </summary>
    [DataContract(Name = "TargetingTemplateAudienceSizing")]
    public partial class TargetingTemplateAudienceSizing : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TargetingTemplateAudienceSizing" /> class.
        /// </summary>
        /// <param name="reachEstimate">reachEstimate.</param>
        public TargetingTemplateAudienceSizing(TargetingTemplateAudienceSizingReachEstimate reachEstimate = default(TargetingTemplateAudienceSizingReachEstimate))
        {
            this.ReachEstimate = reachEstimate;
        }

        /// <summary>
        /// Gets or Sets ReachEstimate
        /// </summary>
        [DataMember(Name = "reach_estimate", EmitDefaultValue = false)]
        public TargetingTemplateAudienceSizingReachEstimate ReachEstimate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TargetingTemplateAudienceSizing {\n");
            sb.Append("  ReachEstimate: ").Append(ReachEstimate).Append("\n");
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
