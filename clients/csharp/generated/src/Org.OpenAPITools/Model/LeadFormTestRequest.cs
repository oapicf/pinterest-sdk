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
    /// Request to create test data for lead data test API.
    /// </summary>
    [DataContract(Name = "LeadFormTestRequest")]
    public partial class LeadFormTestRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LeadFormTestRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected LeadFormTestRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="LeadFormTestRequest" /> class.
        /// </summary>
        /// <param name="answers">Test lead answers. Should follow the creation order. (required).</param>
        public LeadFormTestRequest(List<string> answers = default(List<string>))
        {
            // to ensure "answers" is required (not null)
            if (answers == null)
            {
                throw new ArgumentNullException("answers is a required property for LeadFormTestRequest and cannot be null");
            }
            this.Answers = answers;
        }

        /// <summary>
        /// Test lead answers. Should follow the creation order.
        /// </summary>
        /// <value>Test lead answers. Should follow the creation order.</value>
        /// <example>[&quot;John&quot;,&quot;Doe&quot;,&quot;abc@email.com&quot;,&quot;987654321&quot;]</example>
        [DataMember(Name = "answers", IsRequired = true, EmitDefaultValue = true)]
        public List<string> Answers { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class LeadFormTestRequest {\n");
            sb.Append("  Answers: ").Append(Answers).Append("\n");
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