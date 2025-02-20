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
    /// BusinessMembersAssetAccessDeleteRequest
    /// </summary>
    [DataContract(Name = "business_members_asset_access_delete_request")]
    public partial class BusinessMembersAssetAccessDeleteRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BusinessMembersAssetAccessDeleteRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected BusinessMembersAssetAccessDeleteRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="BusinessMembersAssetAccessDeleteRequest" /> class.
        /// </summary>
        /// <param name="accesses">List of members asset access to be deleted (required).</param>
        public BusinessMembersAssetAccessDeleteRequest(List<BusinessMembersAssetAccessDeleteRequestAccessesInner> accesses = default(List<BusinessMembersAssetAccessDeleteRequestAccessesInner>))
        {
            // to ensure "accesses" is required (not null)
            if (accesses == null)
            {
                throw new ArgumentNullException("accesses is a required property for BusinessMembersAssetAccessDeleteRequest and cannot be null");
            }
            this.Accesses = accesses;
        }

        /// <summary>
        /// List of members asset access to be deleted
        /// </summary>
        /// <value>List of members asset access to be deleted</value>
        [DataMember(Name = "accesses", IsRequired = true, EmitDefaultValue = true)]
        public List<BusinessMembersAssetAccessDeleteRequestAccessesInner> Accesses { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BusinessMembersAssetAccessDeleteRequest {\n");
            sb.Append("  Accesses: ").Append(Accesses).Append("\n");
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
