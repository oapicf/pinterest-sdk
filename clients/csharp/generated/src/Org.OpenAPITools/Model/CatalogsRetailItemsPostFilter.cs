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
    /// CatalogsRetailItemsPostFilter
    /// </summary>
    [DataContract(Name = "CatalogsRetailItemsPostFilter")]
    public partial class CatalogsRetailItemsPostFilter : IValidatableObject
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
        /// Initializes a new instance of the <see cref="CatalogsRetailItemsPostFilter" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CatalogsRetailItemsPostFilter() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsRetailItemsPostFilter" /> class.
        /// </summary>
        /// <param name="catalogType">catalogType (required).</param>
        /// <param name="itemIds">itemIds (required).</param>
        /// <param name="catalogId">Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog.</param>
        public CatalogsRetailItemsPostFilter(CatalogTypeEnum catalogType = default(CatalogTypeEnum), List<string> itemIds = default(List<string>), string catalogId = default(string))
        {
            this.CatalogType = catalogType;
            // to ensure "itemIds" is required (not null)
            if (itemIds == null)
            {
                throw new ArgumentNullException("itemIds is a required property for CatalogsRetailItemsPostFilter and cannot be null");
            }
            this.ItemIds = itemIds;
            this.CatalogId = catalogId;
        }

        /// <summary>
        /// Gets or Sets ItemIds
        /// </summary>
        [DataMember(Name = "item_ids", IsRequired = true, EmitDefaultValue = true)]
        public List<string> ItemIds { get; set; }

        /// <summary>
        /// Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
        /// </summary>
        /// <value>Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog</value>
        [DataMember(Name = "catalog_id", EmitDefaultValue = false)]
        public string CatalogId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CatalogsRetailItemsPostFilter {\n");
            sb.Append("  CatalogType: ").Append(CatalogType).Append("\n");
            sb.Append("  ItemIds: ").Append(ItemIds).Append("\n");
            sb.Append("  CatalogId: ").Append(CatalogId).Append("\n");
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
            if (this.CatalogId != null) {
                // CatalogId (string) pattern
                Regex regexCatalogId = new Regex(@"^\d+$", RegexOptions.CultureInvariant);
                if (!regexCatalogId.Match(this.CatalogId).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for CatalogId, must match a pattern of " + regexCatalogId, new [] { "CatalogId" });
                }
            }

            yield break;
        }
    }

}
