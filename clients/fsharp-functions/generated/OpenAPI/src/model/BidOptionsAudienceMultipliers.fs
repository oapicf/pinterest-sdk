namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BidOptionsAudienceMultipliers =

  //#region BidOptionsAudienceMultipliers

  [<CLIMutable>]
  type BidOptionsAudienceMultipliers = {
    [<JsonProperty(PropertyName = "audience_id")>]
    AudienceId : string;
    [<JsonProperty(PropertyName = "multiplier")>]
    Multiplier : decimal;
  }

  //#endregion
