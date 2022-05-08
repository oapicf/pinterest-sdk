/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// FeedFields
    /// </summary>
    [DataContract]
    public partial class FeedFields :  IEquatable<FeedFields>, IValidatableObject
    {
        /// <summary>
        /// Gets or Sets DefaultCountry
        /// </summary>
        [DataMember(Name="default_country", EmitDefaultValue=true)]
        public Country DefaultCountry { get; set; }
        /// <summary>
        /// Gets or Sets DefaultAvailability
        /// </summary>
        [DataMember(Name="default_availability", EmitDefaultValue=true)]
        public ProductAvailabilityType DefaultAvailability { get; set; }
        /// <summary>
        /// Gets or Sets DefaultCurrency
        /// </summary>
        [DataMember(Name="default_currency", EmitDefaultValue=true)]
        public NullableCurrency DefaultCurrency { get; set; }
        /// <summary>
        /// Gets or Sets Format
        /// </summary>
        [DataMember(Name="format", EmitDefaultValue=true)]
        public CatalogsFormat Format { get; set; }
        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=true)]
        public CatalogsStatus Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="FeedFields" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FeedFields() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FeedFields" /> class.
        /// </summary>
        /// <param name="defaultCountry">defaultCountry (required).</param>
        /// <param name="defaultAvailability">defaultAvailability (required).</param>
        /// <param name="defaultCurrency">defaultCurrency (required).</param>
        /// <param name="name">A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. (required).</param>
        /// <param name="format">format (required).</param>
        /// <param name="defaultLocale">The locale used within a feed for product descriptions. (required).</param>
        /// <param name="credentials">credentials (required).</param>
        /// <param name="location">The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. (required).</param>
        /// <param name="preferredProcessingSchedule">preferredProcessingSchedule (required).</param>
        /// <param name="status">status (required).</param>
        public FeedFields(Country defaultCountry = default(Country), ProductAvailabilityType defaultAvailability = default(ProductAvailabilityType), NullableCurrency defaultCurrency = default(NullableCurrency), string name = default(string), CatalogsFormat format = default(CatalogsFormat), string defaultLocale = default(string), CatalogsFeedCredentials credentials = default(CatalogsFeedCredentials), string location = default(string), CatalogsFeedProcessingSchedule preferredProcessingSchedule = default(CatalogsFeedProcessingSchedule), CatalogsStatus status = default(CatalogsStatus))
        {
            // to ensure "defaultCountry" is required (not null)
            if (defaultCountry == null)
            {
                throw new InvalidDataException("defaultCountry is a required property for FeedFields and cannot be null");
            }
            else
            {
                this.DefaultCountry = defaultCountry;
            }

            // to ensure "defaultAvailability" is required (not null)
            if (defaultAvailability == null)
            {
                throw new InvalidDataException("defaultAvailability is a required property for FeedFields and cannot be null");
            }
            else
            {
                this.DefaultAvailability = defaultAvailability;
            }

            this.DefaultAvailability = defaultAvailability;
            // to ensure "defaultCurrency" is required (not null)
            if (defaultCurrency == null)
            {
                throw new InvalidDataException("defaultCurrency is a required property for FeedFields and cannot be null");
            }
            else
            {
                this.DefaultCurrency = defaultCurrency;
            }

            this.DefaultCurrency = defaultCurrency;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new InvalidDataException("name is a required property for FeedFields and cannot be null");
            }
            else
            {
                this.Name = name;
            }

            this.Name = name;
            // to ensure "format" is required (not null)
            if (format == null)
            {
                throw new InvalidDataException("format is a required property for FeedFields and cannot be null");
            }
            else
            {
                this.Format = format;
            }

            // to ensure "defaultLocale" is required (not null)
            if (defaultLocale == null)
            {
                throw new InvalidDataException("defaultLocale is a required property for FeedFields and cannot be null");
            }
            else
            {
                this.DefaultLocale = defaultLocale;
            }

            // to ensure "credentials" is required (not null)
            if (credentials == null)
            {
                throw new InvalidDataException("credentials is a required property for FeedFields and cannot be null");
            }
            else
            {
                this.Credentials = credentials;
            }

            this.Credentials = credentials;
            // to ensure "location" is required (not null)
            if (location == null)
            {
                throw new InvalidDataException("location is a required property for FeedFields and cannot be null");
            }
            else
            {
                this.Location = location;
            }

            // to ensure "preferredProcessingSchedule" is required (not null)
            if (preferredProcessingSchedule == null)
            {
                throw new InvalidDataException("preferredProcessingSchedule is a required property for FeedFields and cannot be null");
            }
            else
            {
                this.PreferredProcessingSchedule = preferredProcessingSchedule;
            }

            this.PreferredProcessingSchedule = preferredProcessingSchedule;
            // to ensure "status" is required (not null)
            if (status == null)
            {
                throw new InvalidDataException("status is a required property for FeedFields and cannot be null");
            }
            else
            {
                this.Status = status;
            }

        }




        /// <summary>
        /// A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
        /// </summary>
        /// <value>A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.</value>
        [DataMember(Name="name", EmitDefaultValue=true)]
        public string Name { get; set; }


        /// <summary>
        /// The locale used within a feed for product descriptions.
        /// </summary>
        /// <value>The locale used within a feed for product descriptions.</value>
        [DataMember(Name="default_locale", EmitDefaultValue=true)]
        public string DefaultLocale { get; set; }

        /// <summary>
        /// Gets or Sets Credentials
        /// </summary>
        [DataMember(Name="credentials", EmitDefaultValue=true)]
        public CatalogsFeedCredentials Credentials { get; set; }

        /// <summary>
        /// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
        /// </summary>
        /// <value>The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.</value>
        [DataMember(Name="location", EmitDefaultValue=true)]
        public string Location { get; set; }

        /// <summary>
        /// Gets or Sets PreferredProcessingSchedule
        /// </summary>
        [DataMember(Name="preferred_processing_schedule", EmitDefaultValue=true)]
        public CatalogsFeedProcessingSchedule PreferredProcessingSchedule { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FeedFields {\n");
            sb.Append("  DefaultCountry: ").Append(DefaultCountry).Append("\n");
            sb.Append("  DefaultAvailability: ").Append(DefaultAvailability).Append("\n");
            sb.Append("  DefaultCurrency: ").Append(DefaultCurrency).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Format: ").Append(Format).Append("\n");
            sb.Append("  DefaultLocale: ").Append(DefaultLocale).Append("\n");
            sb.Append("  Credentials: ").Append(Credentials).Append("\n");
            sb.Append("  Location: ").Append(Location).Append("\n");
            sb.Append("  PreferredProcessingSchedule: ").Append(PreferredProcessingSchedule).Append("\n");
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
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as FeedFields);
        }

        /// <summary>
        /// Returns true if FeedFields instances are equal
        /// </summary>
        /// <param name="input">Instance of FeedFields to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FeedFields input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DefaultCountry == input.DefaultCountry ||
                    (this.DefaultCountry != null &&
                    this.DefaultCountry.Equals(input.DefaultCountry))
                ) && 
                (
                    this.DefaultAvailability == input.DefaultAvailability ||
                    (this.DefaultAvailability != null &&
                    this.DefaultAvailability.Equals(input.DefaultAvailability))
                ) && 
                (
                    this.DefaultCurrency == input.DefaultCurrency ||
                    (this.DefaultCurrency != null &&
                    this.DefaultCurrency.Equals(input.DefaultCurrency))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Format == input.Format ||
                    (this.Format != null &&
                    this.Format.Equals(input.Format))
                ) && 
                (
                    this.DefaultLocale == input.DefaultLocale ||
                    (this.DefaultLocale != null &&
                    this.DefaultLocale.Equals(input.DefaultLocale))
                ) && 
                (
                    this.Credentials == input.Credentials ||
                    (this.Credentials != null &&
                    this.Credentials.Equals(input.Credentials))
                ) && 
                (
                    this.Location == input.Location ||
                    (this.Location != null &&
                    this.Location.Equals(input.Location))
                ) && 
                (
                    this.PreferredProcessingSchedule == input.PreferredProcessingSchedule ||
                    (this.PreferredProcessingSchedule != null &&
                    this.PreferredProcessingSchedule.Equals(input.PreferredProcessingSchedule))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.DefaultCountry != null)
                    hashCode = hashCode * 59 + this.DefaultCountry.GetHashCode();
                if (this.DefaultAvailability != null)
                    hashCode = hashCode * 59 + this.DefaultAvailability.GetHashCode();
                if (this.DefaultCurrency != null)
                    hashCode = hashCode * 59 + this.DefaultCurrency.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Format != null)
                    hashCode = hashCode * 59 + this.Format.GetHashCode();
                if (this.DefaultLocale != null)
                    hashCode = hashCode * 59 + this.DefaultLocale.GetHashCode();
                if (this.Credentials != null)
                    hashCode = hashCode * 59 + this.Credentials.GetHashCode();
                if (this.Location != null)
                    hashCode = hashCode * 59 + this.Location.GetHashCode();
                if (this.PreferredProcessingSchedule != null)
                    hashCode = hashCode * 59 + this.PreferredProcessingSchedule.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                return hashCode;
            }
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