/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
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
    /// AdsAnalyticsGetAsyncResponse
    /// </summary>
    [DataContract(Name = "AdsAnalyticsGetAsyncResponse")]
    public partial class AdsAnalyticsGetAsyncResponse : IEquatable<AdsAnalyticsGetAsyncResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AdsAnalyticsGetAsyncResponse" /> class.
        /// </summary>
        /// <param name="reportStatus">reportStatus.</param>
        /// <param name="url">url.</param>
        /// <param name="size">size.</param>
        public AdsAnalyticsGetAsyncResponse(string reportStatus = default(string), string url = default(string), decimal? size = default(decimal?))
        {
            this.ReportStatus = reportStatus;
            this.Url = url;
            this.Size = size;
        }

        /// <summary>
        /// Gets or Sets ReportStatus
        /// </summary>
        [DataMember(Name = "report_status", EmitDefaultValue = false)]
        public string ReportStatus { get; set; }

        /// <summary>
        /// Gets or Sets Url
        /// </summary>
        [DataMember(Name = "url", EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// Gets or Sets Size
        /// </summary>
        [DataMember(Name = "size", EmitDefaultValue = true)]
        public decimal? Size { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AdsAnalyticsGetAsyncResponse {\n");
            sb.Append("  ReportStatus: ").Append(ReportStatus).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
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
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AdsAnalyticsGetAsyncResponse);
        }

        /// <summary>
        /// Returns true if AdsAnalyticsGetAsyncResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of AdsAnalyticsGetAsyncResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdsAnalyticsGetAsyncResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ReportStatus == input.ReportStatus ||
                    (this.ReportStatus != null &&
                    this.ReportStatus.Equals(input.ReportStatus))
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.Size == input.Size ||
                    (this.Size != null &&
                    this.Size.Equals(input.Size))
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
                int hashCode = 41;
                if (this.ReportStatus != null)
                {
                    hashCode = (hashCode * 59) + this.ReportStatus.GetHashCode();
                }
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                if (this.Size != null)
                {
                    hashCode = (hashCode * 59) + this.Size.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}