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
    /// Ad creative type enum. For update, only draft ads may update creative type. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
    /// </summary>
    /// <value>Ad creative type enum. For update, only draft ads may update creative type. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum CreativeType
    {
        /// <summary>
        /// Enum REGULAR for value: REGULAR
        /// </summary>
        [EnumMember(Value = "REGULAR")]
        REGULAR = 1,

        /// <summary>
        /// Enum VIDEO for value: VIDEO
        /// </summary>
        [EnumMember(Value = "VIDEO")]
        VIDEO = 2,

        /// <summary>
        /// Enum SHOPPING for value: SHOPPING
        /// </summary>
        [EnumMember(Value = "SHOPPING")]
        SHOPPING = 3,

        /// <summary>
        /// Enum CAROUSEL for value: CAROUSEL
        /// </summary>
        [EnumMember(Value = "CAROUSEL")]
        CAROUSEL = 4,

        /// <summary>
        /// Enum MAXVIDEO for value: MAX_VIDEO
        /// </summary>
        [EnumMember(Value = "MAX_VIDEO")]
        MAXVIDEO = 5,

        /// <summary>
        /// Enum SHOPTHEPIN for value: SHOP_THE_PIN
        /// </summary>
        [EnumMember(Value = "SHOP_THE_PIN")]
        SHOPTHEPIN = 6,

        /// <summary>
        /// Enum COLLECTION for value: COLLECTION
        /// </summary>
        [EnumMember(Value = "COLLECTION")]
        COLLECTION = 7,

        /// <summary>
        /// Enum IDEA for value: IDEA
        /// </summary>
        [EnumMember(Value = "IDEA")]
        IDEA = 8,

        /// <summary>
        /// Enum SHOWCASE for value: SHOWCASE
        /// </summary>
        [EnumMember(Value = "SHOWCASE")]
        SHOWCASE = 9,

        /// <summary>
        /// Enum QUIZ for value: QUIZ
        /// </summary>
        [EnumMember(Value = "QUIZ")]
        QUIZ = 10
    }

}
