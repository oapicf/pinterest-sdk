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
    /// Request object for creating a hotel product group.
    /// </summary>
    [DataContract(Name = "CatalogsHotelProductGroupCreateRequest")]
    public partial class CatalogsHotelProductGroupCreateRequest : IValidatableObject
    {
        /// <summary>
        /// Defines CatalogType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CatalogTypeEnum
        {
            /// <summary>
            /// Enum HOTEL for value: HOTEL
            /// </summary>
            [EnumMember(Value = "HOTEL")]
            HOTEL = 1
        }


        /// <summary>
        /// Gets or Sets CatalogType
        /// </summary>
        [DataMember(Name = "catalog_type", IsRequired = true, EmitDefaultValue = true)]
        public CatalogTypeEnum CatalogType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsHotelProductGroupCreateRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CatalogsHotelProductGroupCreateRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsHotelProductGroupCreateRequest" /> class.
        /// </summary>
        /// <param name="catalogType">catalogType (required).</param>
        /// <param name="name">name (required).</param>
        /// <param name="description">description.</param>
        /// <param name="filters">filters (required).</param>
        /// <param name="catalogId">Catalog id pertaining to the hotel product group. (required).</param>
        public CatalogsHotelProductGroupCreateRequest(CatalogTypeEnum catalogType = default(CatalogTypeEnum), string name = default(string), string description = default(string), CatalogsHotelProductGroupFilters filters = default(CatalogsHotelProductGroupFilters), string catalogId = default(string))
        {
            this.CatalogType = catalogType;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for CatalogsHotelProductGroupCreateRequest and cannot be null");
            }
            this.Name = name;
            // to ensure "filters" is required (not null)
            if (filters == null)
            {
                throw new ArgumentNullException("filters is a required property for CatalogsHotelProductGroupCreateRequest and cannot be null");
            }
            this.Filters = filters;
            // to ensure "catalogId" is required (not null)
            if (catalogId == null)
            {
                throw new ArgumentNullException("catalogId is a required property for CatalogsHotelProductGroupCreateRequest and cannot be null");
            }
            this.CatalogId = catalogId;
            this.Description = description;
        }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name = "description", EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Filters
        /// </summary>
        [DataMember(Name = "filters", IsRequired = true, EmitDefaultValue = true)]
        public CatalogsHotelProductGroupFilters Filters { get; set; }

        /// <summary>
        /// Catalog id pertaining to the hotel product group.
        /// </summary>
        /// <value>Catalog id pertaining to the hotel product group.</value>
        /*
        <example>2680059592705</example>
        */
        [DataMember(Name = "catalog_id", IsRequired = true, EmitDefaultValue = true)]
        public string CatalogId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CatalogsHotelProductGroupCreateRequest {\n");
            sb.Append("  CatalogType: ").Append(CatalogType).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Filters: ").Append(Filters).Append("\n");
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
