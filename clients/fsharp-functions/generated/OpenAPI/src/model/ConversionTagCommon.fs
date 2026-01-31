namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionTagConfigs
open OpenAPI.Model.EnhancedMatchStatusType
open OpenAPI.Model.decimal option

module ConversionTagCommon =

  //#region ConversionTagCommon

  [<CLIMutable>]
  type ConversionTagCommon = {
    [<JsonProperty(PropertyName = "code_snippet")>]
    CodeSnippet : string;
    [<JsonProperty(PropertyName = "configs")>]
    Configs : ConversionTagConfigs;
    [<JsonProperty(PropertyName = "enhanced_match_status")>]
    EnhancedMatchStatus : EnhancedMatchStatusType;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "last_fired_time_ms")>]
    LastFiredTimeMs : decimal option;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "version")>]
    Version : string;
  }

  //#endregion
