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
    /// Request object for creating a retail feed.
    /// </summary>
    [DataContract(Name = "CatalogsRetailFeedsCreateRequest")]
    public partial class CatalogsRetailFeedsCreateRequest : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets DefaultCurrency
        /// </summary>
        [DataMember(Name = "default_currency", EmitDefaultValue = true)]
        public NullableCurrency? DefaultCurrency { get; set; }

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
        /// Gets or Sets DefaultCountry
        /// </summary>
        [DataMember(Name = "default_country", IsRequired = true, EmitDefaultValue = true)]
        public Country DefaultCountry { get; set; }

        /// <summary>
        /// Gets or Sets DefaultAvailability
        /// </summary>
        [DataMember(Name = "default_availability", EmitDefaultValue = true)]
        public ProductAvailabilityType? DefaultAvailability { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public CatalogsStatus? Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsRetailFeedsCreateRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CatalogsRetailFeedsCreateRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsRetailFeedsCreateRequest" /> class.
        /// </summary>
        /// <param name="defaultCurrency">defaultCurrency.</param>
        /// <param name="name">A human-friendly name associated to a given feed. (required).</param>
        /// <param name="format">format (required).</param>
        /// <param name="defaultLocale">defaultLocale (required).</param>
        /// <param name="credentials">credentials.</param>
        /// <param name="location">The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. (required).</param>
        /// <param name="preferredProcessingSchedule">preferredProcessingSchedule.</param>
        /// <param name="catalogType">catalogType (required).</param>
        /// <param name="defaultCountry">defaultCountry (required).</param>
        /// <param name="defaultAvailability">defaultAvailability.</param>
        /// <param name="status">status.</param>
        public CatalogsRetailFeedsCreateRequest(NullableCurrency? defaultCurrency = default(NullableCurrency?), string name = default(string), CatalogsFormat format = default(CatalogsFormat), CatalogsFeedsCreateRequestDefaultLocale defaultLocale = default(CatalogsFeedsCreateRequestDefaultLocale), CatalogsFeedCredentials credentials = default(CatalogsFeedCredentials), string location = default(string), CatalogsFeedProcessingSchedule preferredProcessingSchedule = default(CatalogsFeedProcessingSchedule), CatalogsType catalogType = default(CatalogsType), Country defaultCountry = default(Country), ProductAvailabilityType? defaultAvailability = default(ProductAvailabilityType?), CatalogsStatus? status = default(CatalogsStatus?))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for CatalogsRetailFeedsCreateRequest and cannot be null");
            }
            this.Name = name;
            this.Format = format;
            // to ensure "defaultLocale" is required (not null)
            if (defaultLocale == null)
            {
                throw new ArgumentNullException("defaultLocale is a required property for CatalogsRetailFeedsCreateRequest and cannot be null");
            }
            this.DefaultLocale = defaultLocale;
            // to ensure "location" is required (not null)
            if (location == null)
            {
                throw new ArgumentNullException("location is a required property for CatalogsRetailFeedsCreateRequest and cannot be null");
            }
            this.Location = location;
            this.CatalogType = catalogType;
            this.DefaultCountry = defaultCountry;
            this.DefaultCurrency = defaultCurrency;
            this.Credentials = credentials;
            this.PreferredProcessingSchedule = preferredProcessingSchedule;
            this.DefaultAvailability = defaultAvailability;
            this.Status = status;
        }

        /// <summary>
        /// A human-friendly name associated to a given feed.
        /// </summary>
        /// <value>A human-friendly name associated to a given feed.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets DefaultLocale
        /// </summary>
        [DataMember(Name = "default_locale", IsRequired = true, EmitDefaultValue = true)]
        public CatalogsFeedsCreateRequestDefaultLocale DefaultLocale { get; set; }

        /// <summary>
        /// Gets or Sets Credentials
        /// </summary>
        [DataMember(Name = "credentials", EmitDefaultValue = true)]
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
        [DataMember(Name = "preferred_processing_schedule", EmitDefaultValue = true)]
        public CatalogsFeedProcessingSchedule PreferredProcessingSchedule { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CatalogsRetailFeedsCreateRequest {\n");
            sb.Append("  DefaultCurrency: ").Append(DefaultCurrency).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Format: ").Append(Format).Append("\n");
            sb.Append("  DefaultLocale: ").Append(DefaultLocale).Append("\n");
            sb.Append("  Credentials: ").Append(Credentials).Append("\n");
            sb.Append("  Location: ").Append(Location).Append("\n");
            sb.Append("  PreferredProcessingSchedule: ").Append(PreferredProcessingSchedule).Append("\n");
            sb.Append("  CatalogType: ").Append(CatalogType).Append("\n");
            sb.Append("  DefaultCountry: ").Append(DefaultCountry).Append("\n");
            sb.Append("  DefaultAvailability: ").Append(DefaultAvailability).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
            if (this.Location != null) {
                // Location (string) pattern
                Regex regexLocation = new Regex(@"^(http|https|ftp|sftp)://", RegexOptions.CultureInvariant);
                if (!regexLocation.Match(this.Location).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Location, must match a pattern of " + regexLocation, new [] { "Location" });
                }
            }

            yield break;
        }
    }

}
