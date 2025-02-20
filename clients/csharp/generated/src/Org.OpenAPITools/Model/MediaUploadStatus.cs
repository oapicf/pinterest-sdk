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
    /// Media upload status
    /// </summary>
    /// <value>Media upload status</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum MediaUploadStatus
    {
        /// <summary>
        /// Enum Registered for value: registered
        /// </summary>
        [EnumMember(Value = "registered")]
        Registered = 1,

        /// <summary>
        /// Enum Processing for value: processing
        /// </summary>
        [EnumMember(Value = "processing")]
        Processing = 2,

        /// <summary>
        /// Enum Succeeded for value: succeeded
        /// </summary>
        [EnumMember(Value = "succeeded")]
        Succeeded = 3,

        /// <summary>
        /// Enum Failed for value: failed
        /// </summary>
        [EnumMember(Value = "failed")]
        Failed = 4
    }

}
