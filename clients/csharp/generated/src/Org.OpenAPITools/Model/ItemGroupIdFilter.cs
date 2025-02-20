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
    /// ItemGroupIdFilter
    /// </summary>
    [DataContract(Name = "ItemGroupIdFilter")]
    public partial class ItemGroupIdFilter : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ItemGroupIdFilter" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ItemGroupIdFilter() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ItemGroupIdFilter" /> class.
        /// </summary>
        /// <param name="iTEMGROUPID">iTEMGROUPID (required).</param>
        public ItemGroupIdFilter(CatalogsProductGroupMultipleStringCriteria iTEMGROUPID = default(CatalogsProductGroupMultipleStringCriteria))
        {
            // to ensure "iTEMGROUPID" is required (not null)
            if (iTEMGROUPID == null)
            {
                throw new ArgumentNullException("iTEMGROUPID is a required property for ItemGroupIdFilter and cannot be null");
            }
            this.ITEM_GROUP_ID = iTEMGROUPID;
        }

        /// <summary>
        /// Gets or Sets ITEM_GROUP_ID
        /// </summary>
        [DataMember(Name = "ITEM_GROUP_ID", IsRequired = true, EmitDefaultValue = true)]
        public CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ItemGroupIdFilter {\n");
            sb.Append("  ITEM_GROUP_ID: ").Append(ITEM_GROUP_ID).Append("\n");
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
