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
    /// Where a user is taken after clicking on an ad in grid.
    /// </summary>
    /// <value>Where a user is taken after clicking on an ad in grid.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum GridClickType
    {
        /// <summary>
        /// Enum CLOSEUP for value: CLOSEUP
        /// </summary>
        [EnumMember(Value = "CLOSEUP")]
        CLOSEUP = 1,

        /// <summary>
        /// Enum DIRECTTODESTINATION for value: DIRECT_TO_DESTINATION
        /// </summary>
        [EnumMember(Value = "DIRECT_TO_DESTINATION")]
        DIRECTTODESTINATION = 2
    }

}