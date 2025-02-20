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
    /// UpdatePartnerResultsResponseArrayItemsInner
    /// </summary>
    [DataContract(Name = "UpdatePartnerResultsResponseArray_items_inner")]
    public partial class UpdatePartnerResultsResponseArrayItemsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UpdatePartnerResultsResponseArrayItemsInner" /> class.
        /// </summary>
        /// <param name="exception">exception.</param>
        /// <param name="memberOrPartnerId">memberOrPartnerId.</param>
        public UpdatePartnerResultsResponseArrayItemsInner(BusinessAccessError exception = default(BusinessAccessError), string memberOrPartnerId = default(string))
        {
            this.Exception = exception;
            this.MemberOrPartnerId = memberOrPartnerId;
        }

        /// <summary>
        /// Gets or Sets Exception
        /// </summary>
        [DataMember(Name = "exception", EmitDefaultValue = true)]
        public BusinessAccessError Exception { get; set; }

        /// <summary>
        /// Gets or Sets MemberOrPartnerId
        /// </summary>
        /*
        <example>1234567890123</example>
        */
        [DataMember(Name = "member_or_partner_id", EmitDefaultValue = true)]
        public string MemberOrPartnerId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class UpdatePartnerResultsResponseArrayItemsInner {\n");
            sb.Append("  Exception: ").Append(Exception).Append("\n");
            sb.Append("  MemberOrPartnerId: ").Append(MemberOrPartnerId).Append("\n");
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
            // MemberOrPartnerId (string) maxLength
            if (this.MemberOrPartnerId != null && this.MemberOrPartnerId.Length > 18)
            {
                yield return new ValidationResult("Invalid value for MemberOrPartnerId, length must be less than 18.", new [] { "MemberOrPartnerId" });
            }

            if (this.MemberOrPartnerId != null) {
                // MemberOrPartnerId (string) pattern
                Regex regexMemberOrPartnerId = new Regex(@"^\d+$", RegexOptions.CultureInvariant);
                if (!regexMemberOrPartnerId.Match(this.MemberOrPartnerId).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MemberOrPartnerId, must match a pattern of " + regexMemberOrPartnerId, new [] { "MemberOrPartnerId" });
                }
            }

            yield break;
        }
    }

}
