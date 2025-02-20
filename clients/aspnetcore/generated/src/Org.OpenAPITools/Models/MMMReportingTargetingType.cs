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
        /// Ad targeting types for MMM report
        /// </summary>
        /// <value>Ad targeting types for MMM report</value>
        [TypeConverter(typeof(CustomEnumConverter<MMMReportingTargetingType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum MMMReportingTargetingType
        {
            
            /// <summary>
            /// Enum APPTYPEEnum for APPTYPE
            /// </summary>
            [EnumMember(Value = "APPTYPE")]
            APPTYPEEnum = 1,
            
            /// <summary>
            /// Enum COUNTRYEnum for COUNTRY
            /// </summary>
            [EnumMember(Value = "COUNTRY")]
            COUNTRYEnum = 2,
            
            /// <summary>
            /// Enum CREATIVETYPEEnum for CREATIVE_TYPE
            /// </summary>
            [EnumMember(Value = "CREATIVE_TYPE")]
            CREATIVETYPEEnum = 3,
            
            /// <summary>
            /// Enum GENDEREnum for GENDER
            /// </summary>
            [EnumMember(Value = "GENDER")]
            GENDEREnum = 4,
            
            /// <summary>
            /// Enum LOCATIONEnum for LOCATION
            /// </summary>
            [EnumMember(Value = "LOCATION")]
            LOCATIONEnum = 5
        }
}
