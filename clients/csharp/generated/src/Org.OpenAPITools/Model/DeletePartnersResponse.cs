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
    /// An object with a list of partners that were deleted.
    /// </summary>
    [DataContract(Name = "DeletePartnersResponse")]
    public partial class DeletePartnersResponse : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DeletePartnersResponse" /> class.
        /// </summary>
        /// <param name="deletedPartners">List of partners whose business partnership have been terminated..</param>
        public DeletePartnersResponse(List<string> deletedPartners = default(List<string>))
        {
            this.DeletedPartners = deletedPartners;
        }

        /// <summary>
        /// List of partners whose business partnership have been terminated.
        /// </summary>
        /// <value>List of partners whose business partnership have been terminated.</value>
        /*
        <example>[&quot;809944451643622187&quot;,&quot;383791336903426391&quot;]</example>
        */
        [DataMember(Name = "deleted_partners", EmitDefaultValue = false)]
        public List<string> DeletedPartners { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DeletePartnersResponse {\n");
            sb.Append("  DeletedPartners: ").Append(DeletedPartners).Append("\n");
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
