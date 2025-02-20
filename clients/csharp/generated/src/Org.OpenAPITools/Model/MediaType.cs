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
    /// Defines MediaType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum MediaType
    {
        /// <summary>
        /// Enum IMAGE for value: IMAGE
        /// </summary>
        [EnumMember(Value = "IMAGE")]
        IMAGE = 1,

        /// <summary>
        /// Enum VIDEO for value: VIDEO
        /// </summary>
        [EnumMember(Value = "VIDEO")]
        VIDEO = 2
    }

}
