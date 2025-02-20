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
    /// Lead form question field type
    /// </summary>
    /// <value>Lead form question field type</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum LeadFormQuestionFieldType
    {
        /// <summary>
        /// Enum TEXTFIELD for value: TEXT_FIELD
        /// </summary>
        [EnumMember(Value = "TEXT_FIELD")]
        TEXTFIELD = 1,

        /// <summary>
        /// Enum TEXTAREA for value: TEXT_AREA
        /// </summary>
        [EnumMember(Value = "TEXT_AREA")]
        TEXTAREA = 2,

        /// <summary>
        /// Enum RADIOLIST for value: RADIO_LIST
        /// </summary>
        [EnumMember(Value = "RADIO_LIST")]
        RADIOLIST = 3,

        /// <summary>
        /// Enum CHECKBOX for value: CHECKBOX
        /// </summary>
        [EnumMember(Value = "CHECKBOX")]
        CHECKBOX = 4
    }

}
