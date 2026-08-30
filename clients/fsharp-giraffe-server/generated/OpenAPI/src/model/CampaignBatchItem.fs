namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignBatchResponseData
open OpenAPI.Model.Exception

module CampaignBatchItem =

  //#region CampaignBatchItem


  type CampaignBatchItem = {
    Data : CampaignBatchResponseData;
    Exceptions : Exception[];
  }
  //#endregion
