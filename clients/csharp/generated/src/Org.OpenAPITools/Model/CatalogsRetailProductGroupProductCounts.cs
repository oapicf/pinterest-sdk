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
    /// Product counts for a Retail CatalogsProductGroup
    /// </summary>
    [DataContract(Name = "CatalogsRetailProductGroupProductCounts")]
    public partial class CatalogsRetailProductGroupProductCounts : IValidatableObject
    {
        /// <summary>
        /// Defines CatalogType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CatalogTypeEnum
        {
            /// <summary>
            /// Enum RETAIL for value: RETAIL
            /// </summary>
            [EnumMember(Value = "RETAIL")]
            RETAIL = 1
        }


        /// <summary>
        /// Gets or Sets CatalogType
        /// </summary>
        [DataMember(Name = "catalog_type", IsRequired = true, EmitDefaultValue = true)]
        public CatalogTypeEnum CatalogType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsRetailProductGroupProductCounts" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CatalogsRetailProductGroupProductCounts() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsRetailProductGroupProductCounts" /> class.
        /// </summary>
        /// <param name="catalogType">catalogType (required).</param>
        /// <param name="inStock">inStock (required).</param>
        /// <param name="outOfStock">outOfStock (required).</param>
        /// <param name="preorder">preorder (required).</param>
        /// <param name="total">total (required).</param>
        /// <param name="videos">videos.</param>
        public CatalogsRetailProductGroupProductCounts(CatalogTypeEnum catalogType = default(CatalogTypeEnum), decimal inStock = default(decimal), decimal outOfStock = default(decimal), decimal preorder = default(decimal), decimal total = default(decimal), decimal videos = default(decimal))
        {
            this.CatalogType = catalogType;
            this.InStock = inStock;
            this.OutOfStock = outOfStock;
            this.Preorder = preorder;
            this.Total = total;
            this.Videos = videos;
        }

        /// <summary>
        /// Gets or Sets InStock
        /// </summary>
        [DataMember(Name = "in_stock", IsRequired = true, EmitDefaultValue = true)]
        public decimal InStock { get; set; }

        /// <summary>
        /// Gets or Sets OutOfStock
        /// </summary>
        [DataMember(Name = "out_of_stock", IsRequired = true, EmitDefaultValue = true)]
        public decimal OutOfStock { get; set; }

        /// <summary>
        /// Gets or Sets Preorder
        /// </summary>
        [DataMember(Name = "preorder", IsRequired = true, EmitDefaultValue = true)]
        public decimal Preorder { get; set; }

        /// <summary>
        /// Gets or Sets Total
        /// </summary>
        [DataMember(Name = "total", IsRequired = true, EmitDefaultValue = true)]
        public decimal Total { get; set; }

        /// <summary>
        /// Gets or Sets Videos
        /// </summary>
        [DataMember(Name = "videos", EmitDefaultValue = false)]
        public decimal Videos { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CatalogsRetailProductGroupProductCounts {\n");
            sb.Append("  CatalogType: ").Append(CatalogType).Append("\n");
            sb.Append("  InStock: ").Append(InStock).Append("\n");
            sb.Append("  OutOfStock: ").Append(OutOfStock).Append("\n");
            sb.Append("  Preorder: ").Append(Preorder).Append("\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
            sb.Append("  Videos: ").Append(Videos).Append("\n");
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
            // InStock (decimal) minimum
            if (this.InStock < (decimal)0)
            {
                yield return new ValidationResult("Invalid value for InStock, must be a value greater than or equal to 0.", new [] { "InStock" });
            }

            // OutOfStock (decimal) minimum
            if (this.OutOfStock < (decimal)0)
            {
                yield return new ValidationResult("Invalid value for OutOfStock, must be a value greater than or equal to 0.", new [] { "OutOfStock" });
            }

            // Preorder (decimal) minimum
            if (this.Preorder < (decimal)0)
            {
                yield return new ValidationResult("Invalid value for Preorder, must be a value greater than or equal to 0.", new [] { "Preorder" });
            }

            // Total (decimal) minimum
            if (this.Total < (decimal)0)
            {
                yield return new ValidationResult("Invalid value for Total, must be a value greater than or equal to 0.", new [] { "Total" });
            }

            // Videos (decimal) minimum
            if (this.Videos < (decimal)0)
            {
                yield return new ValidationResult("Invalid value for Videos, must be a value greater than or equal to 0.", new [] { "Videos" });
            }

            yield break;
        }
    }

}
