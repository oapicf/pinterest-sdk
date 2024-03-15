namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdGroupUpdateRequest
open OpenAPI.Model.AdUpdateRequest
open OpenAPI.Model.CampaignUpdateRequest
open OpenAPI.Model.KeywordUpdate
open OpenAPI.Model.ProductGroupPromotionUpdateRequest

module BulkUpsertRequestUpdate =

  //#region BulkUpsertRequestUpdate


  type BulkUpsertRequestUpdate = {
    Campaigns : CampaignUpdateRequest[];
    AdGroups : AdGroupUpdateRequest[];
    Ads : AdUpdateRequest[];
    ProductGroups : ProductGroupPromotionUpdateRequest[];
    Keywords : KeywordUpdate[];
  }
  //#endregion
