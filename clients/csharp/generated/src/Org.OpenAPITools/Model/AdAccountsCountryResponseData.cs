/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
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
    /// AdAccountsCountryResponseData
    /// </summary>
    [DataContract(Name = "AdAccountsCountryResponseData")]
    public partial class AdAccountsCountryResponseData : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public AdCountry? Code { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="AdAccountsCountryResponseData" /> class.
        /// </summary>
        /// <param name="code">code.</param>
        /// <param name="currency">Country currency..</param>
        /// <param name="index">Country index.</param>
        /// <param name="name">Country name.</param>
        public AdAccountsCountryResponseData(AdCountry? code = default(AdCountry?), string currency = default(string), decimal index = default(decimal), string name = default(string))
        {
            this.Code = code;
            this.Currency = currency;
            this.Index = index;
            this.Name = name;
        }

        /// <summary>
        /// Country currency.
        /// </summary>
        /// <value>Country currency.</value>
        /// <example>Dollars</example>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public string Currency { get; set; }

        /// <summary>
        /// Country index
        /// </summary>
        /// <value>Country index</value>
        /// <example>1</example>
        [DataMember(Name = "index", EmitDefaultValue = false)]
        public decimal Index { get; set; }

        /// <summary>
        /// Country name
        /// </summary>
        /// <value>Country name</value>
        /// <example>United States of America</example>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AdAccountsCountryResponseData {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Index: ").Append(Index).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}