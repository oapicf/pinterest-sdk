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
using JsonSubTypes;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;
using System.Reflection;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CatalogsHotelReportParametersReport
    /// </summary>
    [JsonConverter(typeof(CatalogsHotelReportParametersReportJsonConverter))]
    [DataContract(Name = "CatalogsHotelReportParameters_report")]
    public partial class CatalogsHotelReportParametersReport : AbstractOpenAPISchema, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsHotelReportParametersReport" /> class
        /// with the <see cref="CatalogsReportFeedIngestionFilter" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of CatalogsReportFeedIngestionFilter.</param>
        public CatalogsHotelReportParametersReport(CatalogsReportFeedIngestionFilter actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsHotelReportParametersReport" /> class
        /// with the <see cref="CatalogsReportDistributionIssueFilter" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of CatalogsReportDistributionIssueFilter.</param>
        public CatalogsHotelReportParametersReport(CatalogsReportDistributionIssueFilter actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }


        private Object _actualInstance;

        /// <summary>
        /// Gets or Sets ActualInstance
        /// </summary>
        public override Object ActualInstance
        {
            get
            {
                return _actualInstance;
            }
            set
            {
                if (value.GetType() == typeof(CatalogsReportDistributionIssueFilter) || value is CatalogsReportDistributionIssueFilter)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(CatalogsReportFeedIngestionFilter) || value is CatalogsReportFeedIngestionFilter)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: CatalogsReportDistributionIssueFilter, CatalogsReportFeedIngestionFilter");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `CatalogsReportFeedIngestionFilter`. If the actual instance is not `CatalogsReportFeedIngestionFilter`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of CatalogsReportFeedIngestionFilter</returns>
        public CatalogsReportFeedIngestionFilter GetCatalogsReportFeedIngestionFilter()
        {
            return (CatalogsReportFeedIngestionFilter)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `CatalogsReportDistributionIssueFilter`. If the actual instance is not `CatalogsReportDistributionIssueFilter`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of CatalogsReportDistributionIssueFilter</returns>
        public CatalogsReportDistributionIssueFilter GetCatalogsReportDistributionIssueFilter()
        {
            return (CatalogsReportDistributionIssueFilter)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CatalogsHotelReportParametersReport {\n");
            sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
        {
            return JsonConvert.SerializeObject(this.ActualInstance, CatalogsHotelReportParametersReport.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of CatalogsHotelReportParametersReport
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of CatalogsHotelReportParametersReport</returns>
        public static CatalogsHotelReportParametersReport FromJson(string jsonString)
        {
            CatalogsHotelReportParametersReport newCatalogsHotelReportParametersReport = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newCatalogsHotelReportParametersReport;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(CatalogsReportDistributionIssueFilter).GetProperty("AdditionalProperties") == null)
                {
                    newCatalogsHotelReportParametersReport = new CatalogsHotelReportParametersReport(JsonConvert.DeserializeObject<CatalogsReportDistributionIssueFilter>(jsonString, CatalogsHotelReportParametersReport.SerializerSettings));
                }
                else
                {
                    newCatalogsHotelReportParametersReport = new CatalogsHotelReportParametersReport(JsonConvert.DeserializeObject<CatalogsReportDistributionIssueFilter>(jsonString, CatalogsHotelReportParametersReport.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("CatalogsReportDistributionIssueFilter");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into CatalogsReportDistributionIssueFilter: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(CatalogsReportFeedIngestionFilter).GetProperty("AdditionalProperties") == null)
                {
                    newCatalogsHotelReportParametersReport = new CatalogsHotelReportParametersReport(JsonConvert.DeserializeObject<CatalogsReportFeedIngestionFilter>(jsonString, CatalogsHotelReportParametersReport.SerializerSettings));
                }
                else
                {
                    newCatalogsHotelReportParametersReport = new CatalogsHotelReportParametersReport(JsonConvert.DeserializeObject<CatalogsReportFeedIngestionFilter>(jsonString, CatalogsHotelReportParametersReport.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("CatalogsReportFeedIngestionFilter");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into CatalogsReportFeedIngestionFilter: {1}", jsonString, exception.ToString()));
            }

            if (match == 0)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
            }
            else if (match > 1)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` incorrectly matches more than one schema (should be exactly one match): " + String.Join(",", matchedTypes));
            }

            // deserialization is considered successful at this point if no exception has been thrown.
            return newCatalogsHotelReportParametersReport;
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

    /// <summary>
    /// Custom JSON converter for CatalogsHotelReportParametersReport
    /// </summary>
    public class CatalogsHotelReportParametersReportJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(CatalogsHotelReportParametersReport).GetMethod("ToJson").Invoke(value, null)));
        }

        /// <summary>
        /// To convert a JSON string into an object
        /// </summary>
        /// <param name="reader">JSON reader</param>
        /// <param name="objectType">Object type</param>
        /// <param name="existingValue">Existing value</param>
        /// <param name="serializer">JSON Serializer</param>
        /// <returns>The object converted from the JSON string</returns>
        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            switch(reader.TokenType) 
            {
                case JsonToken.StartObject:
                    return CatalogsHotelReportParametersReport.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return CatalogsHotelReportParametersReport.FromJson(JArray.Load(reader).ToString(Formatting.None));
                default:
                    return null;
            }
        }

        /// <summary>
        /// Check if the object can be converted
        /// </summary>
        /// <param name="objectType">Object type</param>
        /// <returns>True if the object can be converted</returns>
        public override bool CanConvert(Type objectType)
        {
            return false;
        }
    }

}
