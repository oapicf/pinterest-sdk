namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MatchType

module TargetingTemplateKeyword =

  //#region TargetingTemplateKeyword

  [<CLIMutable>]
  type TargetingTemplateKeyword = {
    [<JsonProperty(PropertyName = "match_type")>]
    MatchType : MatchType;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
