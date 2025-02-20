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
    /// System error details included in the log sent by the client.
    /// </summary>
    [DataContract(Name = "IntegrationLogClientError")]
    public partial class IntegrationLogClientError : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IntegrationLogClientError" /> class.
        /// </summary>
        /// <param name="cause">Original cause of the error..</param>
        /// <param name="columnNumber">Column number in the line of the file that raised the error..</param>
        /// <param name="fileName">Filename where the error happened..</param>
        /// <param name="lineNumber">Line number where the error happened..</param>
        /// <param name="message">Human-readable description of the error..</param>
        /// <param name="messageDetail">More detail about the message..</param>
        /// <param name="name">Filename where the error happened..</param>
        /// <param name="number">Integer that specifies the error code..</param>
        /// <param name="stackTrace">Stack trace of where the error happened..</param>
        public IntegrationLogClientError(string cause = default(string), int columnNumber = default(int), string fileName = default(string), int lineNumber = default(int), string message = default(string), string messageDetail = default(string), string name = default(string), int number = default(int), string stackTrace = default(string))
        {
            this.Cause = cause;
            this.ColumnNumber = columnNumber;
            this.FileName = fileName;
            this.LineNumber = lineNumber;
            this.Message = message;
            this.MessageDetail = messageDetail;
            this.Name = name;
            this.Number = number;
            this.StackTrace = stackTrace;
        }

        /// <summary>
        /// Original cause of the error.
        /// </summary>
        /// <value>Original cause of the error.</value>
        [DataMember(Name = "cause", EmitDefaultValue = false)]
        public string Cause { get; set; }

        /// <summary>
        /// Column number in the line of the file that raised the error.
        /// </summary>
        /// <value>Column number in the line of the file that raised the error.</value>
        [DataMember(Name = "column_number", EmitDefaultValue = false)]
        public int ColumnNumber { get; set; }

        /// <summary>
        /// Filename where the error happened.
        /// </summary>
        /// <value>Filename where the error happened.</value>
        [DataMember(Name = "file_name", EmitDefaultValue = false)]
        public string FileName { get; set; }

        /// <summary>
        /// Line number where the error happened.
        /// </summary>
        /// <value>Line number where the error happened.</value>
        [DataMember(Name = "line_number", EmitDefaultValue = false)]
        public int LineNumber { get; set; }

        /// <summary>
        /// Human-readable description of the error.
        /// </summary>
        /// <value>Human-readable description of the error.</value>
        [DataMember(Name = "message", EmitDefaultValue = false)]
        public string Message { get; set; }

        /// <summary>
        /// More detail about the message.
        /// </summary>
        /// <value>More detail about the message.</value>
        [DataMember(Name = "message_detail", EmitDefaultValue = false)]
        public string MessageDetail { get; set; }

        /// <summary>
        /// Filename where the error happened.
        /// </summary>
        /// <value>Filename where the error happened.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Integer that specifies the error code.
        /// </summary>
        /// <value>Integer that specifies the error code.</value>
        [DataMember(Name = "number", EmitDefaultValue = false)]
        public int Number { get; set; }

        /// <summary>
        /// Stack trace of where the error happened.
        /// </summary>
        /// <value>Stack trace of where the error happened.</value>
        [DataMember(Name = "stack_trace", EmitDefaultValue = false)]
        public string StackTrace { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IntegrationLogClientError {\n");
            sb.Append("  Cause: ").Append(Cause).Append("\n");
            sb.Append("  ColumnNumber: ").Append(ColumnNumber).Append("\n");
            sb.Append("  FileName: ").Append(FileName).Append("\n");
            sb.Append("  LineNumber: ").Append(LineNumber).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  MessageDetail: ").Append(MessageDetail).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Number: ").Append(Number).Append("\n");
            sb.Append("  StackTrace: ").Append(StackTrace).Append("\n");
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
            // Cause (string) maxLength
            if (this.Cause != null && this.Cause.Length > 512)
            {
                yield return new ValidationResult("Invalid value for Cause, length must be less than 512.", new [] { "Cause" });
            }

            // FileName (string) maxLength
            if (this.FileName != null && this.FileName.Length > 256)
            {
                yield return new ValidationResult("Invalid value for FileName, length must be less than 256.", new [] { "FileName" });
            }

            // Message (string) maxLength
            if (this.Message != null && this.Message.Length > 512)
            {
                yield return new ValidationResult("Invalid value for Message, length must be less than 512.", new [] { "Message" });
            }

            // MessageDetail (string) maxLength
            if (this.MessageDetail != null && this.MessageDetail.Length > 1024)
            {
                yield return new ValidationResult("Invalid value for MessageDetail, length must be less than 1024.", new [] { "MessageDetail" });
            }

            // Name (string) maxLength
            if (this.Name != null && this.Name.Length > 256)
            {
                yield return new ValidationResult("Invalid value for Name, length must be less than 256.", new [] { "Name" });
            }

            yield break;
        }
    }

}
