/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
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
        /// Ad group billable event type. For update, only draft ad groups may update billable event.
        /// </summary>
        /// <value>Ad group billable event type. For update, only draft ad groups may update billable event.</value>
        [TypeConverter(typeof(CustomEnumConverter<ActionType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ActionType
        {
            
            /// <summary>
            /// Enum CLICKTHROUGHEnum for CLICKTHROUGH
            /// </summary>
            [EnumMember(Value = "CLICKTHROUGH")]
            CLICKTHROUGHEnum = 1,
            
            /// <summary>
            /// Enum IMPRESSIONEnum for IMPRESSION
            /// </summary>
            [EnumMember(Value = "IMPRESSION")]
            IMPRESSIONEnum = 2,
            
            /// <summary>
            /// Enum VIDEOV50MRCEnum for VIDEO_V_50_MRC
            /// </summary>
            [EnumMember(Value = "VIDEO_V_50_MRC")]
            VIDEOV50MRCEnum = 3
        }
}