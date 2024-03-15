namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignCreateResponseData
open OpenAPI.Model.Exception

module CampaignCreateResponseItem =

  //#region CampaignCreateResponseItem


  type CampaignCreateResponseItem = {
    Data : CampaignCreateResponseData;
    Exceptions : Exception[];
  }
  //#endregion
