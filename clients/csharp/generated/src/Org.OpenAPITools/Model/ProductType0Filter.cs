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
    /// ProductType0Filter
    /// </summary>
    [DataContract(Name = "ProductType0Filter")]
    public partial class ProductType0Filter : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ProductType0Filter" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ProductType0Filter() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ProductType0Filter" /> class.
        /// </summary>
        /// <param name="pRODUCTTYPE0">pRODUCTTYPE0 (required).</param>
        public ProductType0Filter(CatalogsProductGroupMultipleStringListCriteria pRODUCTTYPE0 = default(CatalogsProductGroupMultipleStringListCriteria))
        {
            // to ensure "pRODUCTTYPE0" is required (not null)
            if (pRODUCTTYPE0 == null)
            {
                throw new ArgumentNullException("pRODUCTTYPE0 is a required property for ProductType0Filter and cannot be null");
            }
            this.PRODUCTTYPE0 = pRODUCTTYPE0;
        }

        /// <summary>
        /// Gets or Sets PRODUCTTYPE0
        /// </summary>
        [DataMember(Name = "PRODUCT_TYPE_0", IsRequired = true, EmitDefaultValue = true)]
        public CatalogsProductGroupMultipleStringListCriteria PRODUCTTYPE0 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ProductType0Filter {\n");
            sb.Append("  PRODUCTTYPE0: ").Append(PRODUCTTYPE0).Append("\n");
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