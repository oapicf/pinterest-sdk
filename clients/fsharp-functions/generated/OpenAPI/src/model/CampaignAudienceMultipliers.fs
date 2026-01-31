namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module CampaignAudienceMultipliers =

  //#region CampaignAudienceMultipliers

  [<CLIMutable>]
  type CampaignAudienceMultipliers = {
    [<JsonProperty(PropertyName = "AUDIENCE_ID")>]
    AUDIENCE_ID : string;
  }

  //#endregion
