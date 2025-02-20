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
    /// A hotel item to be deleted
    /// </summary>
    [DataContract(Name = "CatalogsDeleteHotelItem")]
    public partial class CatalogsDeleteHotelItem : IValidatableObject
    {
        /// <summary>
        /// Defines Operation
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum OperationEnum
        {
            /// <summary>
            /// Enum DELETE for value: DELETE
            /// </summary>
            [EnumMember(Value = "DELETE")]
            DELETE = 1
        }


        /// <summary>
        /// Gets or Sets Operation
        /// </summary>
        [DataMember(Name = "operation", IsRequired = true, EmitDefaultValue = true)]
        public OperationEnum Operation { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsDeleteHotelItem" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CatalogsDeleteHotelItem() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsDeleteHotelItem" /> class.
        /// </summary>
        /// <param name="hotelId">The catalog hotel id in the merchant namespace (required).</param>
        /// <param name="operation">operation (required).</param>
        public CatalogsDeleteHotelItem(string hotelId = default(string), OperationEnum operation = default(OperationEnum))
        {
            // to ensure "hotelId" is required (not null)
            if (hotelId == null)
            {
                throw new ArgumentNullException("hotelId is a required property for CatalogsDeleteHotelItem and cannot be null");
            }
            this.HotelId = hotelId;
            this.Operation = operation;
        }

        /// <summary>
        /// The catalog hotel id in the merchant namespace
        /// </summary>
        /// <value>The catalog hotel id in the merchant namespace</value>
        /*
        <example>DS0294-M</example>
        */
        [DataMember(Name = "hotel_id", IsRequired = true, EmitDefaultValue = true)]
        public string HotelId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CatalogsDeleteHotelItem {\n");
            sb.Append("  HotelId: ").Append(HotelId).Append("\n");
            sb.Append("  Operation: ").Append(Operation).Append("\n");
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
