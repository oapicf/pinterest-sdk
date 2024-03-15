namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MatchTypeResponse

module AdGroupAudienceSizingRequestKeywordsInner =

  //#region AdGroupAudienceSizingRequestKeywordsInner

  [<CLIMutable>]
  type AdGroupAudienceSizingRequestKeywordsInner = {
    [<JsonProperty(PropertyName = "match_type")>]
    MatchType : MatchTypeResponse;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
