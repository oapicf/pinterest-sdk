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
    /// CatalogsCreativeAssetsProductGroup
    /// </summary>
    [DataContract(Name = "CatalogsCreativeAssetsProductGroup")]
    public partial class CatalogsCreativeAssetsProductGroup : IValidatableObject
    {
        /// <summary>
        /// Defines CatalogType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CatalogTypeEnum
        {
            /// <summary>
            /// Enum CREATIVEASSETS for value: CREATIVE_ASSETS
            /// </summary>
            [EnumMember(Value = "CREATIVE_ASSETS")]
            CREATIVEASSETS = 1
        }


        /// <summary>
        /// Gets or Sets CatalogType
        /// </summary>
        [DataMember(Name = "catalog_type", IsRequired = true, EmitDefaultValue = true)]
        public CatalogTypeEnum CatalogType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsCreativeAssetsProductGroup" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CatalogsCreativeAssetsProductGroup() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsCreativeAssetsProductGroup" /> class.
        /// </summary>
        /// <param name="catalogType">catalogType (required).</param>
        /// <param name="id">ID of the creative assets product group. (required).</param>
        /// <param name="name">Name of creative assets product group.</param>
        /// <param name="description">description.</param>
        /// <param name="filters">filters (required).</param>
        /// <param name="createdAt">Unix timestamp in seconds of when catalog product group was created..</param>
        /// <param name="updatedAt">Unix timestamp in seconds of last time catalog product group was updated..</param>
        /// <param name="catalogId">Catalog id pertaining to the creative assets product group. (required).</param>
        public CatalogsCreativeAssetsProductGroup(CatalogTypeEnum catalogType = default(CatalogTypeEnum), string id = default(string), string name = default(string), string description = default(string), CatalogsCreativeAssetsProductGroupFilters filters = default(CatalogsCreativeAssetsProductGroupFilters), int createdAt = default(int), int updatedAt = default(int), string catalogId = default(string))
        {
            this.CatalogType = catalogType;
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for CatalogsCreativeAssetsProductGroup and cannot be null");
            }
            this.Id = id;
            // to ensure "filters" is required (not null)
            if (filters == null)
            {
                throw new ArgumentNullException("filters is a required property for CatalogsCreativeAssetsProductGroup and cannot be null");
            }
            this.Filters = filters;
            // to ensure "catalogId" is required (not null)
            if (catalogId == null)
            {
                throw new ArgumentNullException("catalogId is a required property for CatalogsCreativeAssetsProductGroup and cannot be null");
            }
            this.CatalogId = catalogId;
            this.Name = name;
            this.Description = description;
            this.CreatedAt = createdAt;
            this.UpdatedAt = updatedAt;
        }

        /// <summary>
        /// ID of the creative assets product group.
        /// </summary>
        /// <value>ID of the creative assets product group.</value>
        /*
        <example>443727193917</example>
        */
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Name of creative assets product group
        /// </summary>
        /// <value>Name of creative assets product group</value>
        /*
        <example>Most Popular</example>
        */
        [DataMember(Name = "name", EmitDefaultValue = false)]
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
        public CatalogsCreativeAssetsProductGroupFilters Filters { get; set; }

        /// <summary>
        /// Unix timestamp in seconds of when catalog product group was created.
        /// </summary>
        /// <value>Unix timestamp in seconds of when catalog product group was created.</value>
        /*
        <example>1621350033000</example>
        */
        [DataMember(Name = "created_at", EmitDefaultValue = false)]
        public int CreatedAt { get; set; }

        /// <summary>
        /// Unix timestamp in seconds of last time catalog product group was updated.
        /// </summary>
        /// <value>Unix timestamp in seconds of last time catalog product group was updated.</value>
        /*
        <example>1622742155000</example>
        */
        [DataMember(Name = "updated_at", EmitDefaultValue = false)]
        public int UpdatedAt { get; set; }

        /// <summary>
        /// Catalog id pertaining to the creative assets product group.
        /// </summary>
        /// <value>Catalog id pertaining to the creative assets product group.</value>
        [DataMember(Name = "catalog_id", IsRequired = true, EmitDefaultValue = true)]
        public string CatalogId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CatalogsCreativeAssetsProductGroup {\n");
            sb.Append("  CatalogType: ").Append(CatalogType).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Filters: ").Append(Filters).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
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
            if (this.Id != null) {
                // Id (string) pattern
                Regex regexId = new Regex(@"^\d+$", RegexOptions.CultureInvariant);
                if (!regexId.Match(this.Id).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Id, must match a pattern of " + regexId, new [] { "Id" });
                }
            }

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
