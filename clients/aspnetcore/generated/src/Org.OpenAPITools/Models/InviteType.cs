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
        /// The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
        /// </summary>
        /// <value>The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.</value>
        [TypeConverter(typeof(CustomEnumConverter<InviteType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum InviteType
        {
            
            /// <summary>
            /// Enum MEMBERINVITEEnum for MEMBER_INVITE
            /// </summary>
            [EnumMember(Value = "MEMBER_INVITE")]
            MEMBERINVITEEnum = 1,
            
            /// <summary>
            /// Enum PARTNERINVITEEnum for PARTNER_INVITE
            /// </summary>
            [EnumMember(Value = "PARTNER_INVITE")]
            PARTNERINVITEEnum = 2,
            
            /// <summary>
            /// Enum PARTNERREQUESTEnum for PARTNER_REQUEST
            /// </summary>
            [EnumMember(Value = "PARTNER_REQUEST")]
            PARTNERREQUESTEnum = 3
        }
}
