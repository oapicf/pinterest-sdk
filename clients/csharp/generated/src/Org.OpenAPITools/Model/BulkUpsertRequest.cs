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
    /// Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
    /// </summary>
    [DataContract(Name = "BulkUpsertRequest")]
    public partial class BulkUpsertRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BulkUpsertRequest" /> class.
        /// </summary>
        /// <param name="create">create.</param>
        /// <param name="update">update.</param>
        public BulkUpsertRequest(BulkUpsertRequestCreate create = default(BulkUpsertRequestCreate), BulkUpsertRequestUpdate update = default(BulkUpsertRequestUpdate))
        {
            this.Create = create;
            this.Update = update;
        }

        /// <summary>
        /// Gets or Sets Create
        /// </summary>
        [DataMember(Name = "create", EmitDefaultValue = false)]
        public BulkUpsertRequestCreate Create { get; set; }

        /// <summary>
        /// Gets or Sets Update
        /// </summary>
        [DataMember(Name = "update", EmitDefaultValue = false)]
        public BulkUpsertRequestUpdate Update { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BulkUpsertRequest {\n");
            sb.Append("  Create: ").Append(Create).Append("\n");
            sb.Append("  Update: ").Append(Update).Append("\n");
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
