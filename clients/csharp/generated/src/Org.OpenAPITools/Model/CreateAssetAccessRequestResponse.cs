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
    /// CreateAssetAccessRequestResponse
    /// </summary>
    [DataContract(Name = "CreateAssetAccessRequestResponse")]
    public partial class CreateAssetAccessRequestResponse : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateAssetAccessRequestResponse" /> class.
        /// </summary>
        /// <param name="exceptions">A list of errors associated with the asset access requests. Will be returned if there is an error..</param>
        /// <param name="invites">invites.</param>
        public CreateAssetAccessRequestResponse(List<CreateAssetAccessRequestErrorMessageInner> exceptions = default(List<CreateAssetAccessRequestErrorMessageInner>), Dictionary<string, string> invites = default(Dictionary<string, string>))
        {
            this.Exceptions = exceptions;
            this.Invites = invites;
        }

        /// <summary>
        /// A list of errors associated with the asset access requests. Will be returned if there is an error.
        /// </summary>
        /// <value>A list of errors associated with the asset access requests. Will be returned if there is an error.</value>
        [DataMember(Name = "exceptions", EmitDefaultValue = true)]
        public List<CreateAssetAccessRequestErrorMessageInner> Exceptions { get; set; }

        /// <summary>
        /// Gets or Sets Invites
        /// </summary>
        /*
        <example>{&quot;766456567741825556&quot;:&quot;5349280584552211583&quot;,&quot;733242520489967216&quot;:&quot;5349280584552211845&quot;}</example>
        */
        [DataMember(Name = "invites", EmitDefaultValue = true)]
        public Dictionary<string, string> Invites { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateAssetAccessRequestResponse {\n");
            sb.Append("  Exceptions: ").Append(Exceptions).Append("\n");
            sb.Append("  Invites: ").Append(Invites).Append("\n");
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
