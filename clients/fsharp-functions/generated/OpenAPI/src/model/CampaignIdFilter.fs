namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CampaignIdFilter =

  //#region CampaignIdFilter

  [<CLIMutable>]
  type CampaignIdFilter = {
    [<JsonProperty(PropertyName = "campaign_ids")>]
    CampaignIds : string[];
  }

  //#endregion
