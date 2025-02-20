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
    /// PinMediaWithImageAllOfImages
    /// </summary>
    [DataContract(Name = "PinMediaWithImage_allOf_images")]
    public partial class PinMediaWithImageAllOfImages : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PinMediaWithImageAllOfImages" /> class.
        /// </summary>
        /// <param name="var150x150">var150x150.</param>
        /// <param name="var400x300">var400x300.</param>
        /// <param name="var600x">var600x.</param>
        /// <param name="var1200x">var1200x.</param>
        public PinMediaWithImageAllOfImages(Object var150x150 = default(Object), Object var400x300 = default(Object), Object var600x = default(Object), Object var1200x = default(Object))
        {
            this.Var150x150 = var150x150;
            this.Var400x300 = var400x300;
            this.Var600x = var600x;
            this.Var1200x = var1200x;
        }

        /// <summary>
        /// Gets or Sets Var150x150
        /// </summary>
        [DataMember(Name = "150x150", EmitDefaultValue = false)]
        public Object Var150x150 { get; set; }

        /// <summary>
        /// Gets or Sets Var400x300
        /// </summary>
        [DataMember(Name = "400x300", EmitDefaultValue = false)]
        public Object Var400x300 { get; set; }

        /// <summary>
        /// Gets or Sets Var600x
        /// </summary>
        [DataMember(Name = "600x", EmitDefaultValue = false)]
        public Object Var600x { get; set; }

        /// <summary>
        /// Gets or Sets Var1200x
        /// </summary>
        [DataMember(Name = "1200x", EmitDefaultValue = false)]
        public Object Var1200x { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PinMediaWithImageAllOfImages {\n");
            sb.Append("  Var150x150: ").Append(Var150x150).Append("\n");
            sb.Append("  Var400x300: ").Append(Var400x300).Append("\n");
            sb.Append("  Var600x: ").Append(Var600x).Append("\n");
            sb.Append("  Var1200x: ").Append(Var1200x).Append("\n");
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
