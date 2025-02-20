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
        /// Creative assets visibility.
        /// </summary>
        /// <value>Creative assets visibility.</value>
        [TypeConverter(typeof(CustomEnumConverter<CreativeAssetsVisibilityType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum CreativeAssetsVisibilityType
        {
            
            /// <summary>
            /// Enum VISIBLEEnum for VISIBLE
            /// </summary>
            [EnumMember(Value = "VISIBLE")]
            VISIBLEEnum = 1,
            
            /// <summary>
            /// Enum HIDDENEnum for HIDDEN
            /// </summary>
            [EnumMember(Value = "HIDDEN")]
            HIDDENEnum = 2
        }
}
