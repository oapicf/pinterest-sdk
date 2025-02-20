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
    /// CreateAssetGroupBody
    /// </summary>
    [DataContract(Name = "CreateAssetGroupBody")]
    public partial class CreateAssetGroupBody : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateAssetGroupBody" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateAssetGroupBody() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateAssetGroupBody" /> class.
        /// </summary>
        /// <param name="assetGroupName">Asset Group name (required).</param>
        /// <param name="assetGroupDescription">Asset group description (required).</param>
        /// <param name="assetGroupTypes">Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. (required).</param>
        public CreateAssetGroupBody(string assetGroupName = default(string), string assetGroupDescription = default(string), List<AssetGroupType> assetGroupTypes = default(List<AssetGroupType>))
        {
            // to ensure "assetGroupName" is required (not null)
            if (assetGroupName == null)
            {
                throw new ArgumentNullException("assetGroupName is a required property for CreateAssetGroupBody and cannot be null");
            }
            this.AssetGroupName = assetGroupName;
            // to ensure "assetGroupDescription" is required (not null)
            if (assetGroupDescription == null)
            {
                throw new ArgumentNullException("assetGroupDescription is a required property for CreateAssetGroupBody and cannot be null");
            }
            this.AssetGroupDescription = assetGroupDescription;
            // to ensure "assetGroupTypes" is required (not null)
            if (assetGroupTypes == null)
            {
                throw new ArgumentNullException("assetGroupTypes is a required property for CreateAssetGroupBody and cannot be null");
            }
            this.AssetGroupTypes = assetGroupTypes;
        }

        /// <summary>
        /// Asset Group name
        /// </summary>
        /// <value>Asset Group name</value>
        /*
        <example>Canada Ad Accounts</example>
        */
        [DataMember(Name = "asset_group_name", IsRequired = true, EmitDefaultValue = true)]
        public string AssetGroupName { get; set; }

        /// <summary>
        /// Asset group description
        /// </summary>
        /// <value>Asset group description</value>
        /*
        <example>Asset groups that has ad accounts shared in Canada</example>
        */
        [DataMember(Name = "asset_group_description", IsRequired = true, EmitDefaultValue = true)]
        public string AssetGroupDescription { get; set; }

        /// <summary>
        /// Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
        /// </summary>
        /// <value>Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.</value>
        /*
        <example>[&quot;BRAND&quot;,&quot;LOCATION_OR_LANGUAGE&quot;,&quot;PRODUCT_LINE&quot;,&quot;OTHER&quot;]</example>
        */
        [DataMember(Name = "asset_group_types", IsRequired = true, EmitDefaultValue = true)]
        public List<AssetGroupType> AssetGroupTypes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateAssetGroupBody {\n");
            sb.Append("  AssetGroupName: ").Append(AssetGroupName).Append("\n");
            sb.Append("  AssetGroupDescription: ").Append(AssetGroupDescription).Append("\n");
            sb.Append("  AssetGroupTypes: ").Append(AssetGroupTypes).Append("\n");
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
