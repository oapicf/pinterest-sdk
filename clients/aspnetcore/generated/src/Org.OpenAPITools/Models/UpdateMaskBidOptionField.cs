/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
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
        /// bid option field to apply operation updates to
        /// </summary>
        /// <value>bid option field to apply operation updates to</value>
        [TypeConverter(typeof(CustomEnumConverter<UpdateMaskBidOptionField>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum UpdateMaskBidOptionField
        {
            
            /// <summary>
            /// Enum BIDEnum for BID
            /// </summary>
            [EnumMember(Value = "BID")]
            BIDEnum = 1,
            
            /// <summary>
            /// Enum APPTYPEBIDMULTIPLIERSETEnum for APP_TYPE_BID_MULTIPLIER_SET
            /// </summary>
            [EnumMember(Value = "APP_TYPE_BID_MULTIPLIER_SET")]
            APPTYPEBIDMULTIPLIERSETEnum = 2,
            
            /// <summary>
            /// Enum PLACEMENTBIDMULTIPLIERSETEnum for PLACEMENT_BID_MULTIPLIER_SET
            /// </summary>
            [EnumMember(Value = "PLACEMENT_BID_MULTIPLIER_SET")]
            PLACEMENTBIDMULTIPLIERSETEnum = 3
        }
}
