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
    /// Catalogs Retail Feed object
    /// </summary>
    [DataContract(Name = "CatalogsRetailFeed")]
    public partial class CatalogsRetailFeed : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Format
        /// </summary>
        [DataMember(Name = "format", IsRequired = true, EmitDefaultValue = true)]
        public CatalogsFormat Format { get; set; }

        /// <summary>
        /// Gets or Sets CatalogType
        /// </summary>
        [DataMember(Name = "catalog_type", IsRequired = true, EmitDefaultValue = true)]
        public CatalogsType CatalogType { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public CatalogsStatus Status { get; set; }

        /// <summary>
        /// Gets or Sets DefaultCurrency
        /// </summary>
        [DataMember(Name = "default_currency", IsRequired = true, EmitDefaultValue = true)]
        public NullableCurrency DefaultCurrency { get; set; }

        /// <summary>
        /// Gets or Sets DefaultCountry
        /// </summary>
        [DataMember(Name = "default_country", IsRequired = true, EmitDefaultValue = true)]
        public Country DefaultCountry { get; set; }

        /// <summary>
        /// Gets or Sets DefaultAvailability
        /// </summary>
        [DataMember(Name = "default_availability", IsRequired = true, EmitDefaultValue = true)]
        public ProductAvailabilityType DefaultAvailability { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsRetailFeed" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CatalogsRetailFeed() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsRetailFeed" /> class.
        /// </summary>
        /// <param name="createdAt">createdAt.</param>
        /// <param name="id">id.</param>
        /// <param name="updatedAt">updatedAt.</param>
        /// <param name="name">A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. (required).</param>
        /// <param name="format">format (required).</param>
        /// <param name="catalogType">catalogType (required).</param>
        /// <param name="credentials">credentials (required).</param>
        /// <param name="location">The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. (required).</param>
        /// <param name="preferredProcessingSchedule">preferredProcessingSchedule (required).</param>
        /// <param name="status">status (required).</param>
        /// <param name="defaultCurrency">defaultCurrency (required).</param>
        /// <param name="defaultLocale">The locale used within a feed for product descriptions. (required).</param>
        /// <param name="defaultCountry">defaultCountry (required).</param>
        /// <param name="defaultAvailability">defaultAvailability (required).</param>
        public CatalogsRetailFeed(DateTime createdAt = default(DateTime), string id = default(string), DateTime updatedAt = default(DateTime), string name = default(string), CatalogsFormat format = default(CatalogsFormat), CatalogsType catalogType = default(CatalogsType), CatalogsFeedCredentials credentials = default(CatalogsFeedCredentials), string location = default(string), CatalogsFeedProcessingSchedule preferredProcessingSchedule = default(CatalogsFeedProcessingSchedule), CatalogsStatus status = default(CatalogsStatus), NullableCurrency defaultCurrency = default(NullableCurrency), string defaultLocale = default(string), Country defaultCountry = default(Country), ProductAvailabilityType defaultAvailability = default(ProductAvailabilityType))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for CatalogsRetailFeed and cannot be null");
            }
            this.Name = name;
            this.Format = format;
            this.CatalogType = catalogType;
            // to ensure "credentials" is required (not null)
            if (credentials == null)
            {
                throw new ArgumentNullException("credentials is a required property for CatalogsRetailFeed and cannot be null");
            }
            this.Credentials = credentials;
            // to ensure "location" is required (not null)
            if (location == null)
            {
                throw new ArgumentNullException("location is a required property for CatalogsRetailFeed and cannot be null");
            }
            this.Location = location;
            // to ensure "preferredProcessingSchedule" is required (not null)
            if (preferredProcessingSchedule == null)
            {
                throw new ArgumentNullException("preferredProcessingSchedule is a required property for CatalogsRetailFeed and cannot be null");
            }
            this.PreferredProcessingSchedule = preferredProcessingSchedule;
            this.Status = status;
            this.DefaultCurrency = defaultCurrency;
            // to ensure "defaultLocale" is required (not null)
            if (defaultLocale == null)
            {
                throw new ArgumentNullException("defaultLocale is a required property for CatalogsRetailFeed and cannot be null");
            }
            this.DefaultLocale = defaultLocale;
            this.DefaultCountry = defaultCountry;
            this.DefaultAvailability = defaultAvailability;
            this.CreatedAt = createdAt;
            this.Id = id;
            this.UpdatedAt = updatedAt;
        }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        /// <example>2022-03-14T15:15:22Z</example>
        [DataMember(Name = "created_at", EmitDefaultValue = false)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets UpdatedAt
        /// </summary>
        /// <example>2022-03-14T15:16:34Z</example>
        [DataMember(Name = "updated_at", EmitDefaultValue = false)]
        public DateTime UpdatedAt { get; set; }

        /// <summary>
        /// A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
        /// </summary>
        /// <value>A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Credentials
        /// </summary>
        [DataMember(Name = "credentials", IsRequired = true, EmitDefaultValue = true)]
        public CatalogsFeedCredentials Credentials { get; set; }

        /// <summary>
        /// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
        /// </summary>
        /// <value>The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.</value>
        [DataMember(Name = "location", IsRequired = true, EmitDefaultValue = true)]
        public string Location { get; set; }

        /// <summary>
        /// Gets or Sets PreferredProcessingSchedule
        /// </summary>
        [DataMember(Name = "preferred_processing_schedule", IsRequired = true, EmitDefaultValue = true)]
        public CatalogsFeedProcessingSchedule PreferredProcessingSchedule { get; set; }

        /// <summary>
        /// The locale used within a feed for product descriptions.
        /// </summary>
        /// <value>The locale used within a feed for product descriptions.</value>
        /// <example>en-US</example>
        [DataMember(Name = "default_locale", IsRequired = true, EmitDefaultValue = true)]
        public string DefaultLocale { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CatalogsRetailFeed {\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Format: ").Append(Format).Append("\n");
            sb.Append("  CatalogType: ").Append(CatalogType).Append("\n");
            sb.Append("  Credentials: ").Append(Credentials).Append("\n");
            sb.Append("  Location: ").Append(Location).Append("\n");
            sb.Append("  PreferredProcessingSchedule: ").Append(PreferredProcessingSchedule).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  DefaultCurrency: ").Append(DefaultCurrency).Append("\n");
            sb.Append("  DefaultLocale: ").Append(DefaultLocale).Append("\n");
            sb.Append("  DefaultCountry: ").Append(DefaultCountry).Append("\n");
            sb.Append("  DefaultAvailability: ").Append(DefaultAvailability).Append("\n");
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