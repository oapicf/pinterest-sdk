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
    /// Product counts for a CatalogsProductGroup
    /// </summary>
    [JsonConverter(typeof(CatalogsProductGroupProductCountsVerticalJsonConverter))]
    [DataContract(Name = "CatalogsProductGroupProductCountsVertical")]
    public partial class CatalogsProductGroupProductCountsVertical : AbstractOpenAPISchema, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsProductGroupProductCountsVertical" /> class
        /// with the <see cref="CatalogsRetailProductGroupProductCounts" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of CatalogsRetailProductGroupProductCounts.</param>
        public CatalogsProductGroupProductCountsVertical(CatalogsRetailProductGroupProductCounts actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsProductGroupProductCountsVertical" /> class
        /// with the <see cref="CatalogsHotelProductGroupProductCounts" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of CatalogsHotelProductGroupProductCounts.</param>
        public CatalogsProductGroupProductCountsVertical(CatalogsHotelProductGroupProductCounts actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsProductGroupProductCountsVertical" /> class
        /// with the <see cref="CatalogsCreativeAssetsProductGroupProductCounts" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of CatalogsCreativeAssetsProductGroupProductCounts.</param>
        public CatalogsProductGroupProductCountsVertical(CatalogsCreativeAssetsProductGroupProductCounts actualInstance)
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
                if (value.GetType() == typeof(CatalogsCreativeAssetsProductGroupProductCounts) || value is CatalogsCreativeAssetsProductGroupProductCounts)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(CatalogsHotelProductGroupProductCounts) || value is CatalogsHotelProductGroupProductCounts)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(CatalogsRetailProductGroupProductCounts) || value is CatalogsRetailProductGroupProductCounts)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: CatalogsCreativeAssetsProductGroupProductCounts, CatalogsHotelProductGroupProductCounts, CatalogsRetailProductGroupProductCounts");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `CatalogsRetailProductGroupProductCounts`. If the actual instance is not `CatalogsRetailProductGroupProductCounts`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of CatalogsRetailProductGroupProductCounts</returns>
        public CatalogsRetailProductGroupProductCounts GetCatalogsRetailProductGroupProductCounts()
        {
            return (CatalogsRetailProductGroupProductCounts)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `CatalogsHotelProductGroupProductCounts`. If the actual instance is not `CatalogsHotelProductGroupProductCounts`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of CatalogsHotelProductGroupProductCounts</returns>
        public CatalogsHotelProductGroupProductCounts GetCatalogsHotelProductGroupProductCounts()
        {
            return (CatalogsHotelProductGroupProductCounts)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `CatalogsCreativeAssetsProductGroupProductCounts`. If the actual instance is not `CatalogsCreativeAssetsProductGroupProductCounts`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of CatalogsCreativeAssetsProductGroupProductCounts</returns>
        public CatalogsCreativeAssetsProductGroupProductCounts GetCatalogsCreativeAssetsProductGroupProductCounts()
        {
            return (CatalogsCreativeAssetsProductGroupProductCounts)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CatalogsProductGroupProductCountsVertical {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, CatalogsProductGroupProductCountsVertical.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of CatalogsProductGroupProductCountsVertical
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of CatalogsProductGroupProductCountsVertical</returns>
        public static CatalogsProductGroupProductCountsVertical FromJson(string jsonString)
        {
            CatalogsProductGroupProductCountsVertical newCatalogsProductGroupProductCountsVertical = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newCatalogsProductGroupProductCountsVertical;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(CatalogsCreativeAssetsProductGroupProductCounts).GetProperty("AdditionalProperties") == null)
                {
                    newCatalogsProductGroupProductCountsVertical = new CatalogsProductGroupProductCountsVertical(JsonConvert.DeserializeObject<CatalogsCreativeAssetsProductGroupProductCounts>(jsonString, CatalogsProductGroupProductCountsVertical.SerializerSettings));
                }
                else
                {
                    newCatalogsProductGroupProductCountsVertical = new CatalogsProductGroupProductCountsVertical(JsonConvert.DeserializeObject<CatalogsCreativeAssetsProductGroupProductCounts>(jsonString, CatalogsProductGroupProductCountsVertical.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("CatalogsCreativeAssetsProductGroupProductCounts");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into CatalogsCreativeAssetsProductGroupProductCounts: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(CatalogsHotelProductGroupProductCounts).GetProperty("AdditionalProperties") == null)
                {
                    newCatalogsProductGroupProductCountsVertical = new CatalogsProductGroupProductCountsVertical(JsonConvert.DeserializeObject<CatalogsHotelProductGroupProductCounts>(jsonString, CatalogsProductGroupProductCountsVertical.SerializerSettings));
                }
                else
                {
                    newCatalogsProductGroupProductCountsVertical = new CatalogsProductGroupProductCountsVertical(JsonConvert.DeserializeObject<CatalogsHotelProductGroupProductCounts>(jsonString, CatalogsProductGroupProductCountsVertical.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("CatalogsHotelProductGroupProductCounts");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into CatalogsHotelProductGroupProductCounts: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(CatalogsRetailProductGroupProductCounts).GetProperty("AdditionalProperties") == null)
                {
                    newCatalogsProductGroupProductCountsVertical = new CatalogsProductGroupProductCountsVertical(JsonConvert.DeserializeObject<CatalogsRetailProductGroupProductCounts>(jsonString, CatalogsProductGroupProductCountsVertical.SerializerSettings));
                }
                else
                {
                    newCatalogsProductGroupProductCountsVertical = new CatalogsProductGroupProductCountsVertical(JsonConvert.DeserializeObject<CatalogsRetailProductGroupProductCounts>(jsonString, CatalogsProductGroupProductCountsVertical.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("CatalogsRetailProductGroupProductCounts");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into CatalogsRetailProductGroupProductCounts: {1}", jsonString, exception.ToString()));
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
            return newCatalogsProductGroupProductCountsVertical;
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
    /// Custom JSON converter for CatalogsProductGroupProductCountsVertical
    /// </summary>
    public class CatalogsProductGroupProductCountsVerticalJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(CatalogsProductGroupProductCountsVertical).GetMethod("ToJson").Invoke(value, null)));
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
                    return CatalogsProductGroupProductCountsVertical.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return CatalogsProductGroupProductCountsVertical.FromJson(JArray.Load(reader).ToString(Formatting.None));
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
