namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MatchType

module AdGroupAudienceSizingKeyword =

  //#region AdGroupAudienceSizingKeyword

  [<CLIMutable>]
  type AdGroupAudienceSizingKeyword = {
    [<JsonProperty(PropertyName = "match_type")>]
    MatchType : MatchType;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
