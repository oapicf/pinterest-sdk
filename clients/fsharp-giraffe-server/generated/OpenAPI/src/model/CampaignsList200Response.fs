namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignResponse
open OpenAPI.Model.string option

module CampaignsList200Response =

  //#region CampaignsList200Response


  type campaigns_list_200_response = {
    Bookmark : string option;
    Items : CampaignResponse[];
  }
  //#endregion
