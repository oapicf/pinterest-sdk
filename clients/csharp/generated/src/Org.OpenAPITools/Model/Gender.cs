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
    /// Defines Gender
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Gender
    {
        /// <summary>
        /// Enum FEMALE for value: FEMALE
        /// </summary>
        [EnumMember(Value = "FEMALE")]
        FEMALE = 1,

        /// <summary>
        /// Enum MALE for value: MALE
        /// </summary>
        [EnumMember(Value = "MALE")]
        MALE = 2,

        /// <summary>
        /// Enum UNISEX for value: UNISEX
        /// </summary>
        [EnumMember(Value = "UNISEX")]
        UNISEX = 3
    }

}