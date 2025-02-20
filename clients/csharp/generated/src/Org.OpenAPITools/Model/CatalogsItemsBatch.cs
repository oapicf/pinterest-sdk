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
    /// Object describing the catalogs items batch
    /// </summary>
    [JsonConverter(typeof(CatalogsItemsBatchJsonConverter))]
    [DataContract(Name = "CatalogsItemsBatch")]
    public partial class CatalogsItemsBatch : AbstractOpenAPISchema, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsItemsBatch" /> class
        /// with the <see cref="CatalogsRetailItemsBatch" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of CatalogsRetailItemsBatch.</param>
        public CatalogsItemsBatch(CatalogsRetailItemsBatch actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsItemsBatch" /> class
        /// with the <see cref="CatalogsHotelItemsBatch" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of CatalogsHotelItemsBatch.</param>
        public CatalogsItemsBatch(CatalogsHotelItemsBatch actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsItemsBatch" /> class
        /// with the <see cref="CatalogsCreativeAssetsItemsBatch" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of CatalogsCreativeAssetsItemsBatch.</param>
        public CatalogsItemsBatch(CatalogsCreativeAssetsItemsBatch actualInstance)
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
                if (value.GetType() == typeof(CatalogsCreativeAssetsItemsBatch) || value is CatalogsCreativeAssetsItemsBatch)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(CatalogsHotelItemsBatch) || value is CatalogsHotelItemsBatch)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(CatalogsRetailItemsBatch) || value is CatalogsRetailItemsBatch)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: CatalogsCreativeAssetsItemsBatch, CatalogsHotelItemsBatch, CatalogsRetailItemsBatch");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `CatalogsRetailItemsBatch`. If the actual instance is not `CatalogsRetailItemsBatch`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of CatalogsRetailItemsBatch</returns>
        public CatalogsRetailItemsBatch GetCatalogsRetailItemsBatch()
        {
            return (CatalogsRetailItemsBatch)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `CatalogsHotelItemsBatch`. If the actual instance is not `CatalogsHotelItemsBatch`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of CatalogsHotelItemsBatch</returns>
        public CatalogsHotelItemsBatch GetCatalogsHotelItemsBatch()
        {
            return (CatalogsHotelItemsBatch)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `CatalogsCreativeAssetsItemsBatch`. If the actual instance is not `CatalogsCreativeAssetsItemsBatch`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of CatalogsCreativeAssetsItemsBatch</returns>
        public CatalogsCreativeAssetsItemsBatch GetCatalogsCreativeAssetsItemsBatch()
        {
            return (CatalogsCreativeAssetsItemsBatch)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CatalogsItemsBatch {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, CatalogsItemsBatch.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of CatalogsItemsBatch
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of CatalogsItemsBatch</returns>
        public static CatalogsItemsBatch FromJson(string jsonString)
        {
            CatalogsItemsBatch newCatalogsItemsBatch = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newCatalogsItemsBatch;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(CatalogsCreativeAssetsItemsBatch).GetProperty("AdditionalProperties") == null)
                {
                    newCatalogsItemsBatch = new CatalogsItemsBatch(JsonConvert.DeserializeObject<CatalogsCreativeAssetsItemsBatch>(jsonString, CatalogsItemsBatch.SerializerSettings));
                }
                else
                {
                    newCatalogsItemsBatch = new CatalogsItemsBatch(JsonConvert.DeserializeObject<CatalogsCreativeAssetsItemsBatch>(jsonString, CatalogsItemsBatch.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("CatalogsCreativeAssetsItemsBatch");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into CatalogsCreativeAssetsItemsBatch: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(CatalogsHotelItemsBatch).GetProperty("AdditionalProperties") == null)
                {
                    newCatalogsItemsBatch = new CatalogsItemsBatch(JsonConvert.DeserializeObject<CatalogsHotelItemsBatch>(jsonString, CatalogsItemsBatch.SerializerSettings));
                }
                else
                {
                    newCatalogsItemsBatch = new CatalogsItemsBatch(JsonConvert.DeserializeObject<CatalogsHotelItemsBatch>(jsonString, CatalogsItemsBatch.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("CatalogsHotelItemsBatch");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into CatalogsHotelItemsBatch: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(CatalogsRetailItemsBatch).GetProperty("AdditionalProperties") == null)
                {
                    newCatalogsItemsBatch = new CatalogsItemsBatch(JsonConvert.DeserializeObject<CatalogsRetailItemsBatch>(jsonString, CatalogsItemsBatch.SerializerSettings));
                }
                else
                {
                    newCatalogsItemsBatch = new CatalogsItemsBatch(JsonConvert.DeserializeObject<CatalogsRetailItemsBatch>(jsonString, CatalogsItemsBatch.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("CatalogsRetailItemsBatch");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into CatalogsRetailItemsBatch: {1}", jsonString, exception.ToString()));
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
            return newCatalogsItemsBatch;
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
    /// Custom JSON converter for CatalogsItemsBatch
    /// </summary>
    public class CatalogsItemsBatchJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(CatalogsItemsBatch).GetMethod("ToJson").Invoke(value, null)));
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
                    return CatalogsItemsBatch.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return CatalogsItemsBatch.FromJson(JArray.Load(reader).ToString(Formatting.None));
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
