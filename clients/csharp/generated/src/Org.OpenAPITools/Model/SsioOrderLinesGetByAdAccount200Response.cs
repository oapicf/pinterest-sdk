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
    /// SsioOrderLinesGetByAdAccount200Response
    /// </summary>
    [DataContract(Name = "ssio_order_lines_get_by_ad_account_200_response")]
    public partial class SsioOrderLinesGetByAdAccount200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SsioOrderLinesGetByAdAccount200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SsioOrderLinesGetByAdAccount200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SsioOrderLinesGetByAdAccount200Response" /> class.
        /// </summary>
        /// <param name="items">SSIO order lines by ad acount id (required).</param>
        /// <param name="bookmark">bookmark.</param>
        public SsioOrderLinesGetByAdAccount200Response(List<SSIOOrderLine> items = default(List<SSIOOrderLine>), string bookmark = default(string))
        {
            // to ensure "items" is required (not null)
            if (items == null)
            {
                throw new ArgumentNullException("items is a required property for SsioOrderLinesGetByAdAccount200Response and cannot be null");
            }
            this.Items = items;
            this.Bookmark = bookmark;
        }

        /// <summary>
        /// SSIO order lines by ad acount id
        /// </summary>
        /// <value>SSIO order lines by ad acount id</value>
        [DataMember(Name = "items", IsRequired = true, EmitDefaultValue = true)]
        public List<SSIOOrderLine> Items { get; set; }

        /// <summary>
        /// Gets or Sets Bookmark
        /// </summary>
        [DataMember(Name = "bookmark", EmitDefaultValue = true)]
        public string Bookmark { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SsioOrderLinesGetByAdAccount200Response {\n");
            sb.Append("  Items: ").Append(Items).Append("\n");
            sb.Append("  Bookmark: ").Append(Bookmark).Append("\n");
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