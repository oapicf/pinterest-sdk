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
    /// Response for lead data test API.
    /// </summary>
    [DataContract(Name = "LeadFormTestResponse")]
    public partial class LeadFormTestResponse : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LeadFormTestResponse" /> class.
        /// </summary>
        /// <param name="subscriptionId">Subscription ID..</param>
        public LeadFormTestResponse(string subscriptionId = default(string))
        {
            this.SubscriptionId = subscriptionId;
        }

        /// <summary>
        /// Subscription ID.
        /// </summary>
        /// <value>Subscription ID.</value>
        /*
        <example>8078432025948590686</example>
        */
        [DataMember(Name = "subscription_id", EmitDefaultValue = false)]
        public string SubscriptionId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class LeadFormTestResponse {\n");
            sb.Append("  SubscriptionId: ").Append(SubscriptionId).Append("\n");
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
            if (this.SubscriptionId != null) {
                // SubscriptionId (string) pattern
                Regex regexSubscriptionId = new Regex(@"^\d+$", RegexOptions.CultureInvariant);
                if (!regexSubscriptionId.Match(this.SubscriptionId).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for SubscriptionId, must match a pattern of " + regexSubscriptionId, new [] { "SubscriptionId" });
                }
            }

            yield break;
        }
    }

}
