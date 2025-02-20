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
        /// Summary status for pin promotions
        /// </summary>
        /// <value>Summary status for pin promotions</value>
        [TypeConverter(typeof(CustomEnumConverter<PinPromotionSummaryStatus>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum PinPromotionSummaryStatus
        {
            
            /// <summary>
            /// Enum APPROVEDEnum for APPROVED
            /// </summary>
            [EnumMember(Value = "APPROVED")]
            APPROVEDEnum = 1,
            
            /// <summary>
            /// Enum PAUSEDEnum for PAUSED
            /// </summary>
            [EnumMember(Value = "PAUSED")]
            PAUSEDEnum = 2,
            
            /// <summary>
            /// Enum PENDINGEnum for PENDING
            /// </summary>
            [EnumMember(Value = "PENDING")]
            PENDINGEnum = 3,
            
            /// <summary>
            /// Enum REJECTEDEnum for REJECTED
            /// </summary>
            [EnumMember(Value = "REJECTED")]
            REJECTEDEnum = 4,
            
            /// <summary>
            /// Enum ADVERTISERDISABLEDEnum for ADVERTISER_DISABLED
            /// </summary>
            [EnumMember(Value = "ADVERTISER_DISABLED")]
            ADVERTISERDISABLEDEnum = 5,
            
            /// <summary>
            /// Enum ARCHIVEDEnum for ARCHIVED
            /// </summary>
            [EnumMember(Value = "ARCHIVED")]
            ARCHIVEDEnum = 6,
            
            /// <summary>
            /// Enum DRAFTEnum for DRAFT
            /// </summary>
            [EnumMember(Value = "DRAFT")]
            DRAFTEnum = 7,
            
            /// <summary>
            /// Enum DELETEDDRAFTEnum for DELETED_DRAFT
            /// </summary>
            [EnumMember(Value = "DELETED_DRAFT")]
            DELETEDDRAFTEnum = 8
        }
}
