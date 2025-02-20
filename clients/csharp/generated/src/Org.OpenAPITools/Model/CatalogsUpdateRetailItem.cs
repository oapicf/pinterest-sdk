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
    /// An item to be updated
    /// </summary>
    [DataContract(Name = "CatalogsUpdateRetailItem")]
    public partial class CatalogsUpdateRetailItem : IValidatableObject
    {
        /// <summary>
        /// Defines Operation
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum OperationEnum
        {
            /// <summary>
            /// Enum UPDATE for value: UPDATE
            /// </summary>
            [EnumMember(Value = "UPDATE")]
            UPDATE = 1
        }


        /// <summary>
        /// Gets or Sets Operation
        /// </summary>
        [DataMember(Name = "operation", IsRequired = true, EmitDefaultValue = true)]
        public OperationEnum Operation { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsUpdateRetailItem" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CatalogsUpdateRetailItem() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsUpdateRetailItem" /> class.
        /// </summary>
        /// <param name="itemId">The catalog item id in the merchant namespace (required).</param>
        /// <param name="operation">operation (required).</param>
        /// <param name="attributes">attributes (required).</param>
        /// <param name="updateMask">The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item..</param>
        public CatalogsUpdateRetailItem(string itemId = default(string), OperationEnum operation = default(OperationEnum), UpdatableItemAttributes attributes = default(UpdatableItemAttributes), List<UpdateMaskFieldType> updateMask = default(List<UpdateMaskFieldType>))
        {
            // to ensure "itemId" is required (not null)
            if (itemId == null)
            {
                throw new ArgumentNullException("itemId is a required property for CatalogsUpdateRetailItem and cannot be null");
            }
            this.ItemId = itemId;
            this.Operation = operation;
            // to ensure "attributes" is required (not null)
            if (attributes == null)
            {
                throw new ArgumentNullException("attributes is a required property for CatalogsUpdateRetailItem and cannot be null");
            }
            this.Attributes = attributes;
            this.UpdateMask = updateMask;
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
        public UpdatableItemAttributes Attributes { get; set; }

        /// <summary>
        /// The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
        /// </summary>
        /// <value>The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.</value>
        /*
        <example>[&quot;ad_link&quot;,&quot;adult&quot;,&quot;age_group&quot;,&quot;availability&quot;,&quot;average_review_rating&quot;,&quot;brand&quot;,&quot;checkout_enabled&quot;,&quot;color&quot;,&quot;condition&quot;,&quot;custom_label_0&quot;,&quot;custom_label_1&quot;,&quot;custom_label_2&quot;,&quot;custom_label_3&quot;,&quot;custom_label_4&quot;,&quot;description&quot;,&quot;free_shipping_label&quot;,&quot;free_shipping_limit&quot;,&quot;gender&quot;,&quot;google_product_category&quot;,&quot;gtin&quot;,&quot;item_group_id&quot;,&quot;last_updated_time&quot;,&quot;link&quot;,&quot;material&quot;,&quot;min_ad_price&quot;,&quot;mpn&quot;,&quot;number_of_ratings&quot;,&quot;number_of_reviews&quot;,&quot;pattern&quot;,&quot;price&quot;,&quot;product_type&quot;,&quot;sale_price&quot;,&quot;shipping&quot;,&quot;shipping_height&quot;,&quot;shipping_weight&quot;,&quot;shipping_width&quot;,&quot;size&quot;,&quot;size_system&quot;,&quot;size_type&quot;,&quot;tax&quot;,&quot;title&quot;,&quot;variant_names&quot;,&quot;variant_values&quot;]</example>
        */
        [DataMember(Name = "update_mask", EmitDefaultValue = true)]
        public List<UpdateMaskFieldType> UpdateMask { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CatalogsUpdateRetailItem {\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  Operation: ").Append(Operation).Append("\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
            sb.Append("  UpdateMask: ").Append(UpdateMask).Append("\n");
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
