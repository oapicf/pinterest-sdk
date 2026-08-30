namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecOperations

module AdGroupUpdateRequestAllOf1 =

  //#region AdGroupUpdateRequestAllOf1

  [<CLIMutable>]
  type AdGroupUpdateRequestAllOf1 = {
    [<JsonProperty(PropertyName = "bid_multiplier")>]
    BidMultiplier : decimal;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "targeting_spec_operations")>]
    TargetingSpecOperations : TargetingSpecOperations[];
  }

  //#endregion
