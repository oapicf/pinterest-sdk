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
    /// Request object for updating a product group.
    /// </summary>
    [DataContract]
    public partial class CatalogsProductGroupUpdateRequest :  IEquatable<CatalogsProductGroupUpdateRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsProductGroupUpdateRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CatalogsProductGroupUpdateRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsProductGroupUpdateRequest" /> class.
        /// </summary>
        /// <param name="feedId">Catalog Feed id pertaining to the catalog product group. (required).</param>
        /// <param name="name">name (required).</param>
        /// <param name="description">description.</param>
        /// <param name="filters">filters (required).</param>
        public CatalogsProductGroupUpdateRequest(string feedId = default(string), string name = default(string), string description = default(string), CatalogsProductGroupFilters filters = default(CatalogsProductGroupFilters))
        {
            // to ensure "feedId" is required (not null)
            if (feedId == null)
            {
                throw new InvalidDataException("feedId is a required property for CatalogsProductGroupUpdateRequest and cannot be null");
            }
            else
            {
                this.FeedId = feedId;
            }

            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new InvalidDataException("name is a required property for CatalogsProductGroupUpdateRequest and cannot be null");
            }
            else
            {
                this.Name = name;
            }

            this.Description = description;
            // to ensure "filters" is required (not null)
            if (filters == null)
            {
                throw new InvalidDataException("filters is a required property for CatalogsProductGroupUpdateRequest and cannot be null");
            }
            else
            {
                this.Filters = filters;
            }

            this.Description = description;
        }

        /// <summary>
        /// Catalog Feed id pertaining to the catalog product group.
        /// </summary>
        /// <value>Catalog Feed id pertaining to the catalog product group.</value>
        [DataMember(Name="feed_id", EmitDefaultValue=true)]
        public string FeedId { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name="description", EmitDefaultValue=true)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Filters
        /// </summary>
        [DataMember(Name="filters", EmitDefaultValue=true)]
        public CatalogsProductGroupFilters Filters { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CatalogsProductGroupUpdateRequest {\n");
            sb.Append("  FeedId: ").Append(FeedId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Filters: ").Append(Filters).Append("\n");
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
            return this.Equals(input as CatalogsProductGroupUpdateRequest);
        }

        /// <summary>
        /// Returns true if CatalogsProductGroupUpdateRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of CatalogsProductGroupUpdateRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CatalogsProductGroupUpdateRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.FeedId == input.FeedId ||
                    (this.FeedId != null &&
                    this.FeedId.Equals(input.FeedId))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Filters == input.Filters ||
                    (this.Filters != null &&
                    this.Filters.Equals(input.Filters))
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
                if (this.FeedId != null)
                    hashCode = hashCode * 59 + this.FeedId.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.Filters != null)
                    hashCode = hashCode * 59 + this.Filters.GetHashCode();
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


            // FeedId (string) pattern
            Regex regexFeedId = new Regex(@"^\\d+$", RegexOptions.CultureInvariant);
            if (false == regexFeedId.Match(this.FeedId).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for FeedId, must match a pattern of " + regexFeedId, new [] { "FeedId" });
            }

            yield break;
        }
    }

}