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
    /// OptimizationGoalMetadataConversionTagV3GoalMetadata
    /// </summary>
    [DataContract(Name = "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata")]
    public partial class OptimizationGoalMetadataConversionTagV3GoalMetadata : IValidatableObject
    {
        /// <summary>
        /// Defines ConversionEvent
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ConversionEventEnum
        {
            /// <summary>
            /// Enum PAGEVISIT for value: PAGE_VISIT
            /// </summary>
            [EnumMember(Value = "PAGE_VISIT")]
            PAGEVISIT = 1,

            /// <summary>
            /// Enum SIGNUP for value: SIGNUP
            /// </summary>
            [EnumMember(Value = "SIGNUP")]
            SIGNUP = 2,

            /// <summary>
            /// Enum CHECKOUT for value: CHECKOUT
            /// </summary>
            [EnumMember(Value = "CHECKOUT")]
            CHECKOUT = 3,

            /// <summary>
            /// Enum CUSTOM for value: CUSTOM
            /// </summary>
            [EnumMember(Value = "CUSTOM")]
            CUSTOM = 4,

            /// <summary>
            /// Enum VIEWCATEGORY for value: VIEW_CATEGORY
            /// </summary>
            [EnumMember(Value = "VIEW_CATEGORY")]
            VIEWCATEGORY = 5,

            /// <summary>
            /// Enum SEARCH for value: SEARCH
            /// </summary>
            [EnumMember(Value = "SEARCH")]
            SEARCH = 6,

            /// <summary>
            /// Enum ADDTOCART for value: ADD_TO_CART
            /// </summary>
            [EnumMember(Value = "ADD_TO_CART")]
            ADDTOCART = 7,

            /// <summary>
            /// Enum WATCHVIDEO for value: WATCH_VIDEO
            /// </summary>
            [EnumMember(Value = "WATCH_VIDEO")]
            WATCHVIDEO = 8,

            /// <summary>
            /// Enum LEAD for value: LEAD
            /// </summary>
            [EnumMember(Value = "LEAD")]
            LEAD = 9,

            /// <summary>
            /// Enum APPINSTALL for value: APP_INSTALL
            /// </summary>
            [EnumMember(Value = "APP_INSTALL")]
            APPINSTALL = 10
        }


        /// <summary>
        /// Gets or Sets ConversionEvent
        /// </summary>
        [DataMember(Name = "conversion_event", EmitDefaultValue = false)]
        public ConversionEventEnum? ConversionEvent { get; set; }
        /// <summary>
        /// Conversion learning model type
        /// </summary>
        /// <value>Conversion learning model type</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum LearningModeTypeEnum
        {
            /// <summary>
            /// Enum NOTACTIVE for value: NOT_ACTIVE
            /// </summary>
            [EnumMember(Value = "NOT_ACTIVE")]
            NOTACTIVE = 1,

            /// <summary>
            /// Enum ACTIVE for value: ACTIVE
            /// </summary>
            [EnumMember(Value = "ACTIVE")]
            ACTIVE = 2
        }


        /// <summary>
        /// Conversion learning model type
        /// </summary>
        /// <value>Conversion learning model type</value>
        /*
        <example>ACTIVE</example>
        */
        [DataMember(Name = "learning_mode_type", EmitDefaultValue = true)]
        public LearningModeTypeEnum? LearningModeType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizationGoalMetadataConversionTagV3GoalMetadata" /> class.
        /// </summary>
        /// <param name="attributionWindows">attributionWindows.</param>
        /// <param name="conversionEvent">conversionEvent.</param>
        /// <param name="conversionTagId">conversionTagId.</param>
        /// <param name="cpaGoalValueInMicroCurrency">cpaGoalValueInMicroCurrency.</param>
        /// <param name="isRoasOptimized">ROAS optimization is not supported.</param>
        /// <param name="learningModeType">Conversion learning model type.</param>
        public OptimizationGoalMetadataConversionTagV3GoalMetadata(OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows attributionWindows = default(OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows), ConversionEventEnum? conversionEvent = default(ConversionEventEnum?), string conversionTagId = default(string), string cpaGoalValueInMicroCurrency = default(string), bool? isRoasOptimized = default(bool?), LearningModeTypeEnum? learningModeType = default(LearningModeTypeEnum?))
        {
            this.AttributionWindows = attributionWindows;
            this.ConversionEvent = conversionEvent;
            this.ConversionTagId = conversionTagId;
            this.CpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
            this.IsRoasOptimized = isRoasOptimized;
            this.LearningModeType = learningModeType;
        }

        /// <summary>
        /// Gets or Sets AttributionWindows
        /// </summary>
        [DataMember(Name = "attribution_windows", EmitDefaultValue = false)]
        public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows AttributionWindows { get; set; }

        /// <summary>
        /// Gets or Sets ConversionTagId
        /// </summary>
        [DataMember(Name = "conversion_tag_id", EmitDefaultValue = false)]
        public string ConversionTagId { get; set; }

        /// <summary>
        /// Gets or Sets CpaGoalValueInMicroCurrency
        /// </summary>
        [DataMember(Name = "cpa_goal_value_in_micro_currency", EmitDefaultValue = false)]
        public string CpaGoalValueInMicroCurrency { get; set; }

        /// <summary>
        /// ROAS optimization is not supported
        /// </summary>
        /// <value>ROAS optimization is not supported</value>
        [DataMember(Name = "is_roas_optimized", EmitDefaultValue = true)]
        public bool? IsRoasOptimized { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizationGoalMetadataConversionTagV3GoalMetadata {\n");
            sb.Append("  AttributionWindows: ").Append(AttributionWindows).Append("\n");
            sb.Append("  ConversionEvent: ").Append(ConversionEvent).Append("\n");
            sb.Append("  ConversionTagId: ").Append(ConversionTagId).Append("\n");
            sb.Append("  CpaGoalValueInMicroCurrency: ").Append(CpaGoalValueInMicroCurrency).Append("\n");
            sb.Append("  IsRoasOptimized: ").Append(IsRoasOptimized).Append("\n");
            sb.Append("  LearningModeType: ").Append(LearningModeType).Append("\n");
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
            if (this.ConversionTagId != null) {
                // ConversionTagId (string) pattern
                Regex regexConversionTagId = new Regex(@"^[0-9]+$", RegexOptions.CultureInvariant);
                if (!regexConversionTagId.Match(this.ConversionTagId).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ConversionTagId, must match a pattern of " + regexConversionTagId, new [] { "ConversionTagId" });
                }
            }

            if (this.CpaGoalValueInMicroCurrency != null) {
                // CpaGoalValueInMicroCurrency (string) pattern
                Regex regexCpaGoalValueInMicroCurrency = new Regex(@"^[0-9]+$", RegexOptions.CultureInvariant);
                if (!regexCpaGoalValueInMicroCurrency.Match(this.CpaGoalValueInMicroCurrency).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for CpaGoalValueInMicroCurrency, must match a pattern of " + regexCpaGoalValueInMicroCurrency, new [] { "CpaGoalValueInMicroCurrency" });
                }
            }

            yield break;
        }
    }

}
