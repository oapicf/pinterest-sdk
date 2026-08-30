namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdCreateRequest
open OpenAPI.Model.AdGroupCreateRequest
open OpenAPI.Model.BulkUpsertRequestCreateCatalogProductGroupsItems
open OpenAPI.Model.CampaignCreateRequest
open OpenAPI.Model.KeywordsRequest
open OpenAPI.Model.LabelBulkCreateRequest
open OpenAPI.Model.ProductGroupPromotionCreateRequest
open OpenAPI.Model.ScheduleCreateRequest

module BulkUpsertRequestCreate =

  //#region BulkUpsertRequestCreate


  type BulkUpsertRequestCreate = {
    AdGroups : AdGroupCreateRequest[];
    Ads : AdCreateRequest[];
    Campaigns : CampaignCreateRequest[];
    CatalogProductGroups : BulkUpsertRequestCreateCatalogProductGroupsItems[];
    Keywords : KeywordsRequest[];
    Labels : LabelBulkCreateRequest[];
    ProductGroups : ProductGroupPromotionCreateRequest[];
    Schedules : ScheduleCreateRequest[];
  }
  //#endregion
