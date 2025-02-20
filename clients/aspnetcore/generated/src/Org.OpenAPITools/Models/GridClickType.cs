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
        /// Where a user is taken after clicking on an ad in grid. </p><strong>Note:</strong>  This parameter is read-only and is set to DIRECT_TO_DESTINATION by default for direct links supported ads.  grid_click_type values provided will be ignored.
        /// </summary>
        /// <value>Where a user is taken after clicking on an ad in grid. </p><strong>Note:</strong>  This parameter is read-only and is set to DIRECT_TO_DESTINATION by default for direct links supported ads.  grid_click_type values provided will be ignored.</value>
        [TypeConverter(typeof(CustomEnumConverter<GridClickType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum GridClickType
        {
            
            /// <summary>
            /// Enum CLOSEUPEnum for CLOSEUP
            /// </summary>
            [EnumMember(Value = "CLOSEUP")]
            CLOSEUPEnum = 1,
            
            /// <summary>
            /// Enum DIRECTTODESTINATIONEnum for DIRECT_TO_DESTINATION
            /// </summary>
            [EnumMember(Value = "DIRECT_TO_DESTINATION")]
            DIRECTTODESTINATIONEnum = 2
        }
}
