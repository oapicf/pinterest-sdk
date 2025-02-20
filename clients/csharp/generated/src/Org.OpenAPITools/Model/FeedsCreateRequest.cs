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
using System.Reflection;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// FeedsCreateRequest
    /// </summary>
    [JsonConverter(typeof(FeedsCreateRequestJsonConverter))]
    [DataContract(Name = "feeds_create_request")]
    public partial class FeedsCreateRequest : AbstractOpenAPISchema, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FeedsCreateRequest" /> class
        /// with the <see cref="CatalogsVerticalFeedsCreateRequest" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of CatalogsVerticalFeedsCreateRequest.</param>
        public FeedsCreateRequest(CatalogsVerticalFeedsCreateRequest actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FeedsCreateRequest" /> class
        /// with the <see cref="CatalogsFeedsCreateRequest" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of CatalogsFeedsCreateRequest.</param>
        public FeedsCreateRequest(CatalogsFeedsCreateRequest actualInstance)
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
                if (value.GetType() == typeof(CatalogsFeedsCreateRequest) || value is CatalogsFeedsCreateRequest)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(CatalogsVerticalFeedsCreateRequest) || value is CatalogsVerticalFeedsCreateRequest)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: CatalogsFeedsCreateRequest, CatalogsVerticalFeedsCreateRequest");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `CatalogsVerticalFeedsCreateRequest`. If the actual instance is not `CatalogsVerticalFeedsCreateRequest`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of CatalogsVerticalFeedsCreateRequest</returns>
        public CatalogsVerticalFeedsCreateRequest GetCatalogsVerticalFeedsCreateRequest()
        {
            return (CatalogsVerticalFeedsCreateRequest)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `CatalogsFeedsCreateRequest`. If the actual instance is not `CatalogsFeedsCreateRequest`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of CatalogsFeedsCreateRequest</returns>
        public CatalogsFeedsCreateRequest GetCatalogsFeedsCreateRequest()
        {
            return (CatalogsFeedsCreateRequest)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FeedsCreateRequest {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, FeedsCreateRequest.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of FeedsCreateRequest
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of FeedsCreateRequest</returns>
        public static FeedsCreateRequest FromJson(string jsonString)
        {
            FeedsCreateRequest newFeedsCreateRequest = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newFeedsCreateRequest;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(CatalogsFeedsCreateRequest).GetProperty("AdditionalProperties") == null)
                {
                    newFeedsCreateRequest = new FeedsCreateRequest(JsonConvert.DeserializeObject<CatalogsFeedsCreateRequest>(jsonString, FeedsCreateRequest.SerializerSettings));
                }
                else
                {
                    newFeedsCreateRequest = new FeedsCreateRequest(JsonConvert.DeserializeObject<CatalogsFeedsCreateRequest>(jsonString, FeedsCreateRequest.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("CatalogsFeedsCreateRequest");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into CatalogsFeedsCreateRequest: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(CatalogsVerticalFeedsCreateRequest).GetProperty("AdditionalProperties") == null)
                {
                    newFeedsCreateRequest = new FeedsCreateRequest(JsonConvert.DeserializeObject<CatalogsVerticalFeedsCreateRequest>(jsonString, FeedsCreateRequest.SerializerSettings));
                }
                else
                {
                    newFeedsCreateRequest = new FeedsCreateRequest(JsonConvert.DeserializeObject<CatalogsVerticalFeedsCreateRequest>(jsonString, FeedsCreateRequest.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("CatalogsVerticalFeedsCreateRequest");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into CatalogsVerticalFeedsCreateRequest: {1}", jsonString, exception.ToString()));
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
            return newFeedsCreateRequest;
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
    /// Custom JSON converter for FeedsCreateRequest
    /// </summary>
    public class FeedsCreateRequestJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(FeedsCreateRequest).GetMethod("ToJson").Invoke(value, null)));
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
                    return FeedsCreateRequest.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return FeedsCreateRequest.FromJson(JArray.Load(reader).ToString(Formatting.None));
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
