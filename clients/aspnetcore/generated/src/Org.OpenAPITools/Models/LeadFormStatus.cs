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
        /// Status of the lead form
        /// </summary>
        /// <value>Status of the lead form</value>
        [TypeConverter(typeof(CustomEnumConverter<LeadFormStatus>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum LeadFormStatus
        {
            
            /// <summary>
            /// Enum DRAFTEnum for DRAFT
            /// </summary>
            [EnumMember(Value = "DRAFT")]
            DRAFTEnum = 1,
            
            /// <summary>
            /// Enum ACTIVEEnum for ACTIVE
            /// </summary>
            [EnumMember(Value = "ACTIVE")]
            ACTIVEEnum = 2
        }
}
