namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ObjectiveType

module CampaignObjectivesFilter =

  //#region CampaignObjectivesFilter

  [<CLIMutable>]
  type CampaignObjectivesFilter = {
    [<JsonProperty(PropertyName = "campaign_objective_types")>]
    CampaignObjectiveTypes : ObjectiveType[];
  }

  //#endregion
