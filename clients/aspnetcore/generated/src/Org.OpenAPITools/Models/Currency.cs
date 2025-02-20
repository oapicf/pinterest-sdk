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
        /// Currency Codes from ISO 4217
        /// </summary>
        /// <value>Currency Codes from ISO 4217</value>
        [TypeConverter(typeof(CustomEnumConverter<Currency>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum Currency
        {
            
            /// <summary>
            /// Enum UNKEnum for UNK
            /// </summary>
            [EnumMember(Value = "UNK")]
            UNKEnum = 1,
            
            /// <summary>
            /// Enum USDEnum for USD
            /// </summary>
            [EnumMember(Value = "USD")]
            USDEnum = 2,
            
            /// <summary>
            /// Enum GBPEnum for GBP
            /// </summary>
            [EnumMember(Value = "GBP")]
            GBPEnum = 3,
            
            /// <summary>
            /// Enum CADEnum for CAD
            /// </summary>
            [EnumMember(Value = "CAD")]
            CADEnum = 4,
            
            /// <summary>
            /// Enum EUREnum for EUR
            /// </summary>
            [EnumMember(Value = "EUR")]
            EUREnum = 5,
            
            /// <summary>
            /// Enum AUDEnum for AUD
            /// </summary>
            [EnumMember(Value = "AUD")]
            AUDEnum = 6,
            
            /// <summary>
            /// Enum NZDEnum for NZD
            /// </summary>
            [EnumMember(Value = "NZD")]
            NZDEnum = 7,
            
            /// <summary>
            /// Enum SEKEnum for SEK
            /// </summary>
            [EnumMember(Value = "SEK")]
            SEKEnum = 8,
            
            /// <summary>
            /// Enum ILSEnum for ILS
            /// </summary>
            [EnumMember(Value = "ILS")]
            ILSEnum = 9,
            
            /// <summary>
            /// Enum CHFEnum for CHF
            /// </summary>
            [EnumMember(Value = "CHF")]
            CHFEnum = 10,
            
            /// <summary>
            /// Enum HKDEnum for HKD
            /// </summary>
            [EnumMember(Value = "HKD")]
            HKDEnum = 11,
            
            /// <summary>
            /// Enum JPYEnum for JPY
            /// </summary>
            [EnumMember(Value = "JPY")]
            JPYEnum = 12,
            
            /// <summary>
            /// Enum SGDEnum for SGD
            /// </summary>
            [EnumMember(Value = "SGD")]
            SGDEnum = 13,
            
            /// <summary>
            /// Enum KRWEnum for KRW
            /// </summary>
            [EnumMember(Value = "KRW")]
            KRWEnum = 14,
            
            /// <summary>
            /// Enum NOKEnum for NOK
            /// </summary>
            [EnumMember(Value = "NOK")]
            NOKEnum = 15,
            
            /// <summary>
            /// Enum DKKEnum for DKK
            /// </summary>
            [EnumMember(Value = "DKK")]
            DKKEnum = 16,
            
            /// <summary>
            /// Enum PLNEnum for PLN
            /// </summary>
            [EnumMember(Value = "PLN")]
            PLNEnum = 17,
            
            /// <summary>
            /// Enum RONEnum for RON
            /// </summary>
            [EnumMember(Value = "RON")]
            RONEnum = 18,
            
            /// <summary>
            /// Enum HUFEnum for HUF
            /// </summary>
            [EnumMember(Value = "HUF")]
            HUFEnum = 19,
            
            /// <summary>
            /// Enum CZKEnum for CZK
            /// </summary>
            [EnumMember(Value = "CZK")]
            CZKEnum = 20,
            
            /// <summary>
            /// Enum BRLEnum for BRL
            /// </summary>
            [EnumMember(Value = "BRL")]
            BRLEnum = 21,
            
            /// <summary>
            /// Enum MXNEnum for MXN
            /// </summary>
            [EnumMember(Value = "MXN")]
            MXNEnum = 22,
            
            /// <summary>
            /// Enum ARSEnum for ARS
            /// </summary>
            [EnumMember(Value = "ARS")]
            ARSEnum = 23,
            
            /// <summary>
            /// Enum CLPEnum for CLP
            /// </summary>
            [EnumMember(Value = "CLP")]
            CLPEnum = 24,
            
            /// <summary>
            /// Enum COPEnum for COP
            /// </summary>
            [EnumMember(Value = "COP")]
            COPEnum = 25,
            
            /// <summary>
            /// Enum INREnum for INR
            /// </summary>
            [EnumMember(Value = "INR")]
            INREnum = 26,
            
            /// <summary>
            /// Enum TRYEnum for TRY
            /// </summary>
            [EnumMember(Value = "TRY")]
            TRYEnum = 27
        }
}
