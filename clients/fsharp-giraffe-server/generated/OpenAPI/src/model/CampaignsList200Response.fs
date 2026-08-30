namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Campaign
open OpenAPI.Model.string option

module CampaignsList200Response =

  //#region CampaignsList200Response


  type campaigns_list_200_response = {
    Bookmark : string option;
    Items : Campaign[];
  }
  //#endregion
