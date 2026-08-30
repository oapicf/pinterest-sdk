namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CampaignAdPreviewCreate =

  //#region CampaignAdPreviewCreate

  [<CLIMutable>]
  type CampaignAdPreviewCreate = {
    [<JsonProperty(PropertyName = "ad_group_id")>]
    AdGroupId : string;
  }

  //#endregion
