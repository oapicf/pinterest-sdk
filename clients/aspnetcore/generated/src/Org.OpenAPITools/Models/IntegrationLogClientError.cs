/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
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
    /// System error details included in the log sent by the client.
    /// </summary>
    [DataContract]
    public partial class IntegrationLogClientError : IEquatable<IntegrationLogClientError>
    {
        /// <summary>
        /// Original cause of the error.
        /// </summary>
        /// <value>Original cause of the error.</value>
        [MaxLength(512)]
        [DataMember(Name="cause", EmitDefaultValue=false)]
        public string Cause { get; set; }

        /// <summary>
        /// Column number in the line of the file that raised the error.
        /// </summary>
        /// <value>Column number in the line of the file that raised the error.</value>
        [DataMember(Name="column_number", EmitDefaultValue=true)]
        public int ColumnNumber { get; set; }

        /// <summary>
        /// Filename where the error happened.
        /// </summary>
        /// <value>Filename where the error happened.</value>
        [MaxLength(256)]
        [DataMember(Name="file_name", EmitDefaultValue=false)]
        public string FileName { get; set; }

        /// <summary>
        /// Line number where the error happened.
        /// </summary>
        /// <value>Line number where the error happened.</value>
        [DataMember(Name="line_number", EmitDefaultValue=true)]
        public int LineNumber { get; set; }

        /// <summary>
        /// Human-readable description of the error.
        /// </summary>
        /// <value>Human-readable description of the error.</value>
        [MaxLength(512)]
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// More detail about the message.
        /// </summary>
        /// <value>More detail about the message.</value>
        [MaxLength(1024)]
        [DataMember(Name="message_detail", EmitDefaultValue=false)]
        public string MessageDetail { get; set; }

        /// <summary>
        /// Filename where the error happened.
        /// </summary>
        /// <value>Filename where the error happened.</value>
        [MaxLength(256)]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Integer that specifies the error code.
        /// </summary>
        /// <value>Integer that specifies the error code.</value>
        [DataMember(Name="number", EmitDefaultValue=true)]
        public int Number { get; set; }

        /// <summary>
        /// Stack trace of where the error happened.
        /// </summary>
        /// <value>Stack trace of where the error happened.</value>
        [DataMember(Name="stack_trace", EmitDefaultValue=false)]
        public string StackTrace { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
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
            return obj.GetType() == GetType() && Equals((IntegrationLogClientError)obj);
        }

        /// <summary>
        /// Returns true if IntegrationLogClientError instances are equal
        /// </summary>
        /// <param name="other">Instance of IntegrationLogClientError to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IntegrationLogClientError other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Cause == other.Cause ||
                    Cause != null &&
                    Cause.Equals(other.Cause)
                ) && 
                (
                    ColumnNumber == other.ColumnNumber ||
                    
                    ColumnNumber.Equals(other.ColumnNumber)
                ) && 
                (
                    FileName == other.FileName ||
                    FileName != null &&
                    FileName.Equals(other.FileName)
                ) && 
                (
                    LineNumber == other.LineNumber ||
                    
                    LineNumber.Equals(other.LineNumber)
                ) && 
                (
                    Message == other.Message ||
                    Message != null &&
                    Message.Equals(other.Message)
                ) && 
                (
                    MessageDetail == other.MessageDetail ||
                    MessageDetail != null &&
                    MessageDetail.Equals(other.MessageDetail)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Number == other.Number ||
                    
                    Number.Equals(other.Number)
                ) && 
                (
                    StackTrace == other.StackTrace ||
                    StackTrace != null &&
                    StackTrace.Equals(other.StackTrace)
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
                    if (Cause != null)
                    hashCode = hashCode * 59 + Cause.GetHashCode();
                    
                    hashCode = hashCode * 59 + ColumnNumber.GetHashCode();
                    if (FileName != null)
                    hashCode = hashCode * 59 + FileName.GetHashCode();
                    
                    hashCode = hashCode * 59 + LineNumber.GetHashCode();
                    if (Message != null)
                    hashCode = hashCode * 59 + Message.GetHashCode();
                    if (MessageDetail != null)
                    hashCode = hashCode * 59 + MessageDetail.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + Number.GetHashCode();
                    if (StackTrace != null)
                    hashCode = hashCode * 59 + StackTrace.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(IntegrationLogClientError left, IntegrationLogClientError right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(IntegrationLogClientError left, IntegrationLogClientError right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}