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
    /// Request object to list products for a given feed_id and product group filter.
    /// </summary>
    [DataContract(Name = "CatalogsListProductsByFeedBasedFilter")]
    public partial class CatalogsListProductsByFeedBasedFilter : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsListProductsByFeedBasedFilter" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CatalogsListProductsByFeedBasedFilter() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsListProductsByFeedBasedFilter" /> class.
        /// </summary>
        /// <param name="feedId">Catalog Feed id pertaining to the catalog product group filter. (required).</param>
        /// <param name="filters">filters (required).</param>
        public CatalogsListProductsByFeedBasedFilter(string feedId = default(string), CatalogsProductGroupFilters filters = default(CatalogsProductGroupFilters))
        {
            // to ensure "feedId" is required (not null)
            if (feedId == null)
            {
                throw new ArgumentNullException("feedId is a required property for CatalogsListProductsByFeedBasedFilter and cannot be null");
            }
            this.FeedId = feedId;
            // to ensure "filters" is required (not null)
            if (filters == null)
            {
                throw new ArgumentNullException("filters is a required property for CatalogsListProductsByFeedBasedFilter and cannot be null");
            }
            this.Filters = filters;
        }

        /// <summary>
        /// Catalog Feed id pertaining to the catalog product group filter.
        /// </summary>
        /// <value>Catalog Feed id pertaining to the catalog product group filter.</value>
        /*
        <example>2680059592705</example>
        */
        [DataMember(Name = "feed_id", IsRequired = true, EmitDefaultValue = true)]
        public string FeedId { get; set; }

        /// <summary>
        /// Gets or Sets Filters
        /// </summary>
        [DataMember(Name = "filters", IsRequired = true, EmitDefaultValue = true)]
        public CatalogsProductGroupFilters Filters { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CatalogsListProductsByFeedBasedFilter {\n");
            sb.Append("  FeedId: ").Append(FeedId).Append("\n");
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
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            if (this.FeedId != null) {
                // FeedId (string) pattern
                Regex regexFeedId = new Regex(@"^\d+$", RegexOptions.CultureInvariant);
                if (!regexFeedId.Match(this.FeedId).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for FeedId, must match a pattern of " + regexFeedId, new [] { "FeedId" });
                }
            }

            yield break;
        }
    }

}
