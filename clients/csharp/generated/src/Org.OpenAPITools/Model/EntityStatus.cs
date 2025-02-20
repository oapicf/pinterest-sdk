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
    /// Entity status
    /// </summary>
    /// <value>Entity status</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum EntityStatus
    {
        /// <summary>
        /// Enum ACTIVE for value: ACTIVE
        /// </summary>
        [EnumMember(Value = "ACTIVE")]
        ACTIVE = 1,

        /// <summary>
        /// Enum PAUSED for value: PAUSED
        /// </summary>
        [EnumMember(Value = "PAUSED")]
        PAUSED = 2,

        /// <summary>
        /// Enum ARCHIVED for value: ARCHIVED
        /// </summary>
        [EnumMember(Value = "ARCHIVED")]
        ARCHIVED = 3,

        /// <summary>
        /// Enum DRAFT for value: DRAFT
        /// </summary>
        [EnumMember(Value = "DRAFT")]
        DRAFT = 4,

        /// <summary>
        /// Enum DELETEDDRAFT for value: DELETED_DRAFT
        /// </summary>
        [EnumMember(Value = "DELETED_DRAFT")]
        DELETEDDRAFT = 5
    }

}
