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
        /// Ad creative type enum. For update, only draft ads may update creative type. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
        /// </summary>
        /// <value>Ad creative type enum. For update, only draft ads may update creative type. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.</value>
        [TypeConverter(typeof(CustomEnumConverter<CreativeType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum CreativeType
        {
            
            /// <summary>
            /// Enum REGULAREnum for REGULAR
            /// </summary>
            [EnumMember(Value = "REGULAR")]
            REGULAREnum = 1,
            
            /// <summary>
            /// Enum VIDEOEnum for VIDEO
            /// </summary>
            [EnumMember(Value = "VIDEO")]
            VIDEOEnum = 2,
            
            /// <summary>
            /// Enum SHOPPINGEnum for SHOPPING
            /// </summary>
            [EnumMember(Value = "SHOPPING")]
            SHOPPINGEnum = 3,
            
            /// <summary>
            /// Enum CAROUSELEnum for CAROUSEL
            /// </summary>
            [EnumMember(Value = "CAROUSEL")]
            CAROUSELEnum = 4,
            
            /// <summary>
            /// Enum MAXVIDEOEnum for MAX_VIDEO
            /// </summary>
            [EnumMember(Value = "MAX_VIDEO")]
            MAXVIDEOEnum = 5,
            
            /// <summary>
            /// Enum SHOPTHEPINEnum for SHOP_THE_PIN
            /// </summary>
            [EnumMember(Value = "SHOP_THE_PIN")]
            SHOPTHEPINEnum = 6,
            
            /// <summary>
            /// Enum COLLECTIONEnum for COLLECTION
            /// </summary>
            [EnumMember(Value = "COLLECTION")]
            COLLECTIONEnum = 7,
            
            /// <summary>
            /// Enum IDEAEnum for IDEA
            /// </summary>
            [EnumMember(Value = "IDEA")]
            IDEAEnum = 8,
            
            /// <summary>
            /// Enum SHOWCASEEnum for SHOWCASE
            /// </summary>
            [EnumMember(Value = "SHOWCASE")]
            SHOWCASEEnum = 9,
            
            /// <summary>
            /// Enum QUIZEnum for QUIZ
            /// </summary>
            [EnumMember(Value = "QUIZ")]
            QUIZEnum = 10
        }
}
