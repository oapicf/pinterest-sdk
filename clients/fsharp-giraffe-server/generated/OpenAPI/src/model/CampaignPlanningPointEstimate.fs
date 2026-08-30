namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.double option
open OpenAPI.Model.int option

module CampaignPlanningPointEstimate =

  //#region CampaignPlanningPointEstimate


  type CampaignPlanningPointEstimate = {
    Budget : int;
    DoubleY : double option;
    MaxY : int option;
    MinY : int option;
    Y : int option;
  }
  //#endregion
