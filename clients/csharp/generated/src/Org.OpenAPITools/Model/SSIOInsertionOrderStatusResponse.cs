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
    /// SSIOInsertionOrderStatusResponse
    /// </summary>
    [DataContract(Name = "SSIOInsertionOrderStatusResponse")]
    public partial class SSIOInsertionOrderStatusResponse : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SSIOInsertionOrderStatusResponse" /> class.
        /// </summary>
        /// <param name="pinOrderId">Salesforce order id.</param>
        /// <param name="status">Salesforce insertion order status.</param>
        /// <param name="creationTime">Salesforce insertion order creation time.</param>
        public SSIOInsertionOrderStatusResponse(string pinOrderId = default(string), string status = default(string), string creationTime = default(string))
        {
            this.PinOrderId = pinOrderId;
            this.Status = status;
            this.CreationTime = creationTime;
        }

        /// <summary>
        /// Salesforce order id
        /// </summary>
        /// <value>Salesforce order id</value>
        /// <example>0Q01N0000015hekSAB</example>
        [DataMember(Name = "pin_order_id", EmitDefaultValue = false)]
        public string PinOrderId { get; set; }

        /// <summary>
        /// Salesforce insertion order status
        /// </summary>
        /// <value>Salesforce insertion order status</value>
        /// <example>Approved</example>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public string Status { get; set; }

        /// <summary>
        /// Salesforce insertion order creation time
        /// </summary>
        /// <value>Salesforce insertion order creation time</value>
        /// <example>2017-06-21T23:11:11.000Z</example>
        [DataMember(Name = "creation_time", EmitDefaultValue = true)]
        public string CreationTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SSIOInsertionOrderStatusResponse {\n");
            sb.Append("  PinOrderId: ").Append(PinOrderId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  CreationTime: ").Append(CreationTime).Append("\n");
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
            yield break;
        }
    }

}