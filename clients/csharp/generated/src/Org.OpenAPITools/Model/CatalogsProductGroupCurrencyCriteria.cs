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
    /// A currency filter. This filter cannot be negated
    /// </summary>
    [DataContract(Name = "CatalogsProductGroupCurrencyCriteria")]
    public partial class CatalogsProductGroupCurrencyCriteria : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Values
        /// </summary>
        [DataMember(Name = "values", IsRequired = true, EmitDefaultValue = true)]
        public NonNullableCatalogsCurrency Values { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsProductGroupCurrencyCriteria" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CatalogsProductGroupCurrencyCriteria() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsProductGroupCurrencyCriteria" /> class.
        /// </summary>
        /// <param name="values">values (required).</param>
        /// <param name="negated">negated (default to false).</param>
        public CatalogsProductGroupCurrencyCriteria(NonNullableCatalogsCurrency values = default(NonNullableCatalogsCurrency), bool negated = false)
        {
            this.Values = values;
            this.Negated = negated;
        }

        /// <summary>
        /// Gets or Sets Negated
        /// </summary>
        [DataMember(Name = "negated", EmitDefaultValue = true)]
        public bool Negated { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CatalogsProductGroupCurrencyCriteria {\n");
            sb.Append("  Values: ").Append(Values).Append("\n");
            sb.Append("  Negated: ").Append(Negated).Append("\n");
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
