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
    /// An item to be created
    /// </summary>
    [DataContract(Name = "CatalogsCreateRetailItem")]
    public partial class CatalogsCreateRetailItem : IValidatableObject
    {
        /// <summary>
        /// Defines Operation
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum OperationEnum
        {
            /// <summary>
            /// Enum CREATE for value: CREATE
            /// </summary>
            [EnumMember(Value = "CREATE")]
            CREATE = 1
        }


        /// <summary>
        /// Gets or Sets Operation
        /// </summary>
        [DataMember(Name = "operation", IsRequired = true, EmitDefaultValue = true)]
        public OperationEnum Operation { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsCreateRetailItem" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CatalogsCreateRetailItem() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsCreateRetailItem" /> class.
        /// </summary>
        /// <param name="itemId">The catalog item id in the merchant namespace (required).</param>
        /// <param name="operation">operation (required).</param>
        /// <param name="attributes">attributes (required).</param>
        public CatalogsCreateRetailItem(string itemId = default(string), OperationEnum operation = default(OperationEnum), ItemAttributesRequest attributes = default(ItemAttributesRequest))
        {
            // to ensure "itemId" is required (not null)
            if (itemId == null)
            {
                throw new ArgumentNullException("itemId is a required property for CatalogsCreateRetailItem and cannot be null");
            }
            this.ItemId = itemId;
            this.Operation = operation;
            // to ensure "attributes" is required (not null)
            if (attributes == null)
            {
                throw new ArgumentNullException("attributes is a required property for CatalogsCreateRetailItem and cannot be null");
            }
            this.Attributes = attributes;
        }

        /// <summary>
        /// The catalog item id in the merchant namespace
        /// </summary>
        /// <value>The catalog item id in the merchant namespace</value>
        /*
        <example>DS0294-M</example>
        */
        [DataMember(Name = "item_id", IsRequired = true, EmitDefaultValue = true)]
        public string ItemId { get; set; }

        /// <summary>
        /// Gets or Sets Attributes
        /// </summary>
        [DataMember(Name = "attributes", IsRequired = true, EmitDefaultValue = true)]
        public ItemAttributesRequest Attributes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CatalogsCreateRetailItem {\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  Operation: ").Append(Operation).Append("\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
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
