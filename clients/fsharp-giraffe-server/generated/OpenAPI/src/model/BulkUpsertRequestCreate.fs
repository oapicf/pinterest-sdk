namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdCreateRequest
open OpenAPI.Model.AdGroupCreateRequest
open OpenAPI.Model.CampaignCreateRequest
open OpenAPI.Model.KeywordsRequest
open OpenAPI.Model.LabelCreateRequest
open OpenAPI.Model.MultipleProductGroupsInner
open OpenAPI.Model.ProductGroupPromotionCreateRequest

module BulkUpsertRequestCreate =

  //#region BulkUpsertRequestCreate


  type BulkUpsertRequestCreate = {
    AdGroups : AdGroupCreateRequest[];
    Ads : AdCreateRequest[];
    Campaigns : CampaignCreateRequest[];
    CatalogProductGroups : MultipleProductGroupsInner[];
    Keywords : KeywordsRequest[];
    Labels : LabelCreateRequest[];
    ProductGroups : ProductGroupPromotionCreateRequest[];
  }
  //#endregion
