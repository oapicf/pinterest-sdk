namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.NullalbleMatchType

module AdGroupDeliveryEstimatesKeywordsItems =

  //#region AdGroupDeliveryEstimatesKeywordsItems

  [<CLIMutable>]
  type AdGroupDeliveryEstimatesKeywordsItems = {
    [<JsonProperty(PropertyName = "match_type")>]
    MatchType : NullalbleMatchType;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
