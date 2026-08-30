namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BidOptionsAgeBucketMultipliers =

  //#region BidOptionsAgeBucketMultipliers

  [<CLIMutable>]
  type BidOptionsAgeBucketMultipliers = {
    [<JsonProperty(PropertyName = "18-24")>]
    _1824 : decimal;
    [<JsonProperty(PropertyName = "25-34")>]
    _2534 : decimal;
    [<JsonProperty(PropertyName = "35-44")>]
    _3544 : decimal;
    [<JsonProperty(PropertyName = "45-49")>]
    _4549 : decimal;
    [<JsonProperty(PropertyName = "50-54")>]
    _5054 : decimal;
    [<JsonProperty(PropertyName = "55-64")>]
    _5564 : decimal;
    [<JsonProperty(PropertyName = "65+")>]
    _65 : decimal;
  }

  //#endregion
