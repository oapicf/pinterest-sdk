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
    /// Defines AudienceAccountType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum AudienceAccountType
    {
        /// <summary>
        /// Enum ADACCOUNT for value: AD_ACCOUNT
        /// </summary>
        [EnumMember(Value = "AD_ACCOUNT")]
        ADACCOUNT = 1,

        /// <summary>
        /// Enum BUSINESSACCOUNT for value: BUSINESS_ACCOUNT
        /// </summary>
        [EnumMember(Value = "BUSINESS_ACCOUNT")]
        BUSINESSACCOUNT = 2
    }

}
