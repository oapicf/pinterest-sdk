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
    /// RelatedTerms
    /// </summary>
    [DataContract(Name = "RelatedTerms")]
    public partial class RelatedTerms : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RelatedTerms" /> class.
        /// </summary>
        /// <param name="id">First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot;.</param>
        /// <param name="relatedTermCount">Total number of related terms returned.</param>
        /// <param name="relatedTermsList">The id of the advertiser..</param>
        public RelatedTerms(string id = default(string), int relatedTermCount = default(int), List<RelatedTermsRelatedTermsListInner> relatedTermsList = default(List<RelatedTermsRelatedTermsListInner>))
        {
            this.Id = id;
            this.RelatedTermCount = relatedTermCount;
            this.RelatedTermsList = relatedTermsList;
        }

        /// <summary>
        /// First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot;
        /// </summary>
        /// <value>First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot;</value>
        /*
        <example>clothes</example>
        */
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Total number of related terms returned
        /// </summary>
        /// <value>Total number of related terms returned</value>
        /*
        <example>2</example>
        */
        [DataMember(Name = "related_term_count", EmitDefaultValue = false)]
        public int RelatedTermCount { get; set; }

        /// <summary>
        /// The id of the advertiser.
        /// </summary>
        /// <value>The id of the advertiser.</value>
        [DataMember(Name = "related_terms_list", EmitDefaultValue = false)]
        public List<RelatedTermsRelatedTermsListInner> RelatedTermsList { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RelatedTerms {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  RelatedTermCount: ").Append(RelatedTermCount).Append("\n");
            sb.Append("  RelatedTermsList: ").Append(RelatedTermsList).Append("\n");
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
            yield break;
        }
    }

}
