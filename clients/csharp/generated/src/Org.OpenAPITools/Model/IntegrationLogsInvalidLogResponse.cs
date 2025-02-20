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
    /// Schema describing the response when a log has invalid fields.
    /// </summary>
    [DataContract(Name = "IntegrationLogsInvalidLogResponse")]
    public partial class IntegrationLogsInvalidLogResponse : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IntegrationLogsInvalidLogResponse" /> class.
        /// </summary>
        /// <param name="rejectedLogs">rejectedLogs.</param>
        public IntegrationLogsInvalidLogResponse(List<IntegrationLogsInvalidLogResponseRejectedLogsInner> rejectedLogs = default(List<IntegrationLogsInvalidLogResponseRejectedLogsInner>))
        {
            this.RejectedLogs = rejectedLogs;
        }

        /// <summary>
        /// Gets or Sets RejectedLogs
        /// </summary>
        [DataMember(Name = "rejected_logs", EmitDefaultValue = false)]
        public List<IntegrationLogsInvalidLogResponseRejectedLogsInner> RejectedLogs { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IntegrationLogsInvalidLogResponse {\n");
            sb.Append("  RejectedLogs: ").Append(RejectedLogs).Append("\n");
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
