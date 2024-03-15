namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdCreateRequest
open OpenAPI.Model.AdGroupCreateRequest
open OpenAPI.Model.CampaignCreateRequest
open OpenAPI.Model.KeywordsRequest
open OpenAPI.Model.ProductGroupPromotionCreateRequest

module BulkUpsertRequestCreate =

  //#region BulkUpsertRequestCreate


  type BulkUpsertRequestCreate = {
    Campaigns : CampaignCreateRequest[];
    AdGroups : AdGroupCreateRequest[];
    Ads : AdCreateRequest[];
    ProductGroups : ProductGroupPromotionCreateRequest[];
    Keywords : KeywordsRequest[];
  }
  //#endregion
