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
    /// GoogleProductCategory4Filter
    /// </summary>
    [DataContract(Name = "GoogleProductCategory4Filter")]
    public partial class GoogleProductCategory4Filter : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GoogleProductCategory4Filter" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected GoogleProductCategory4Filter() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="GoogleProductCategory4Filter" /> class.
        /// </summary>
        /// <param name="gOOGLEPRODUCTCATEGORY4">gOOGLEPRODUCTCATEGORY4 (required).</param>
        public GoogleProductCategory4Filter(CatalogsProductGroupMultipleStringListCriteria gOOGLEPRODUCTCATEGORY4 = default(CatalogsProductGroupMultipleStringListCriteria))
        {
            // to ensure "gOOGLEPRODUCTCATEGORY4" is required (not null)
            if (gOOGLEPRODUCTCATEGORY4 == null)
            {
                throw new ArgumentNullException("gOOGLEPRODUCTCATEGORY4 is a required property for GoogleProductCategory4Filter and cannot be null");
            }
            this.GOOGLEPRODUCTCATEGORY4 = gOOGLEPRODUCTCATEGORY4;
        }

        /// <summary>
        /// Gets or Sets GOOGLEPRODUCTCATEGORY4
        /// </summary>
        [DataMember(Name = "GOOGLE_PRODUCT_CATEGORY_4", IsRequired = true, EmitDefaultValue = true)]
        public CatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY4 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GoogleProductCategory4Filter {\n");
            sb.Append("  GOOGLEPRODUCTCATEGORY4: ").Append(GOOGLEPRODUCTCATEGORY4).Append("\n");
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