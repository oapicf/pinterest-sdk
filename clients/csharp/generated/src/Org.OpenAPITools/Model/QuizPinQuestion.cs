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
    /// A specific quiz inquiry.
    /// </summary>
    [DataContract(Name = "QuizPinQuestion")]
    public partial class QuizPinQuestion : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="QuizPinQuestion" /> class.
        /// </summary>
        /// <param name="questionId">questionId.</param>
        /// <param name="questionText">questionText.</param>
        /// <param name="options">options.</param>
        public QuizPinQuestion(decimal questionId = default(decimal), string questionText = default(string), List<QuizPinOption> options = default(List<QuizPinOption>))
        {
            this.QuestionId = questionId;
            this.QuestionText = questionText;
            this.Options = options;
        }

        /// <summary>
        /// Gets or Sets QuestionId
        /// </summary>
        [DataMember(Name = "question_id", EmitDefaultValue = false)]
        public decimal QuestionId { get; set; }

        /// <summary>
        /// Gets or Sets QuestionText
        /// </summary>
        [DataMember(Name = "question_text", EmitDefaultValue = false)]
        public string QuestionText { get; set; }

        /// <summary>
        /// Gets or Sets Options
        /// </summary>
        [DataMember(Name = "options", EmitDefaultValue = false)]
        public List<QuizPinOption> Options { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class QuizPinQuestion {\n");
            sb.Append("  QuestionId: ").Append(QuestionId).Append("\n");
            sb.Append("  QuestionText: ").Append(QuestionText).Append("\n");
            sb.Append("  Options: ").Append(Options).Append("\n");
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
