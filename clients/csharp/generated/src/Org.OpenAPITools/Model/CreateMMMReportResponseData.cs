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
    /// CreateMMMReportResponseData
    /// </summary>
    [DataContract(Name = "CreateMMMReportResponseData")]
    public partial class CreateMMMReportResponseData : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets ReportStatus
        /// </summary>
        [DataMember(Name = "report_status", EmitDefaultValue = false)]
        public BulkReportingJobStatus? ReportStatus { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateMMMReportResponseData" /> class.
        /// </summary>
        /// <param name="reportStatus">reportStatus.</param>
        /// <param name="token">token.</param>
        /// <param name="message">message.</param>
        /// <param name="status">status.</param>
        public CreateMMMReportResponseData(BulkReportingJobStatus? reportStatus = default(BulkReportingJobStatus?), string token = default(string), string message = default(string), string status = default(string))
        {
            this.ReportStatus = reportStatus;
            this.Token = token;
            this.Message = message;
            this.Status = status;
        }

        /// <summary>
        /// Gets or Sets Token
        /// </summary>
        [DataMember(Name = "token", EmitDefaultValue = false)]
        public string Token { get; set; }

        /// <summary>
        /// Gets or Sets Message
        /// </summary>
        [DataMember(Name = "message", EmitDefaultValue = true)]
        public string Message { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        /*
        <example>success</example>
        */
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public string Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateMMMReportResponseData {\n");
            sb.Append("  ReportStatus: ").Append(ReportStatus).Append("\n");
            sb.Append("  Token: ").Append(Token).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
