/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
        /// <summary>
        /// Gets or Sets AudienceAccountType
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<AudienceAccountType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum AudienceAccountType
        {
            
            /// <summary>
            /// Enum ADACCOUNTEnum for AD_ACCOUNT
            /// </summary>
            [EnumMember(Value = "AD_ACCOUNT")]
            ADACCOUNTEnum = 1,
            
            /// <summary>
            /// Enum BUSINESSACCOUNTEnum for BUSINESS_ACCOUNT
            /// </summary>
            [EnumMember(Value = "BUSINESS_ACCOUNT")]
            BUSINESSACCOUNTEnum = 2
        }
}
