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
    /// Ad targeting types for MMM report
    /// </summary>
    /// <value>Ad targeting types for MMM report</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum MMMReportingTargetingType
    {
        /// <summary>
        /// Enum APPTYPE for value: APPTYPE
        /// </summary>
        [EnumMember(Value = "APPTYPE")]
        APPTYPE = 1,

        /// <summary>
        /// Enum COUNTRY for value: COUNTRY
        /// </summary>
        [EnumMember(Value = "COUNTRY")]
        COUNTRY = 2,

        /// <summary>
        /// Enum CREATIVETYPE for value: CREATIVE_TYPE
        /// </summary>
        [EnumMember(Value = "CREATIVE_TYPE")]
        CREATIVETYPE = 3,

        /// <summary>
        /// Enum GENDER for value: GENDER
        /// </summary>
        [EnumMember(Value = "GENDER")]
        GENDER = 4,

        /// <summary>
        /// Enum LOCATION for value: LOCATION
        /// </summary>
        [EnumMember(Value = "LOCATION")]
        LOCATION = 5
    }

}
