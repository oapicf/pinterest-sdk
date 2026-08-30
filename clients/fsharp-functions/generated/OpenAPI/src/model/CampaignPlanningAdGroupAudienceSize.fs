namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CampaignPlanningAdGroupAudienceSize =

  //#region CampaignPlanningAdGroupAudienceSize

  [<CLIMutable>]
  type CampaignPlanningAdGroupAudienceSize = {
    [<JsonProperty(PropertyName = "count_lower")>]
    CountLower : int;
    [<JsonProperty(PropertyName = "count_upper")>]
    CountUpper : int;
  }

  //#endregion
