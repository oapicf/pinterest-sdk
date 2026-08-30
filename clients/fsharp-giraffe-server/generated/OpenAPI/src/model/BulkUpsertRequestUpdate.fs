namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdGroupUpdateRequest
open OpenAPI.Model.AdUpdateRequest
open OpenAPI.Model.BulkUpsertRequestUpdateCatalogProductGroupsItems
open OpenAPI.Model.CampaignUpdateRequest
open OpenAPI.Model.KeywordUpdateGenerated
open OpenAPI.Model.LabelBulkUpdateRequest
open OpenAPI.Model.ProductGroupPromotionUpdateRequest
open OpenAPI.Model.ScheduleUpdateRequest

module BulkUpsertRequestUpdate =

  //#region BulkUpsertRequestUpdate


  type BulkUpsertRequestUpdate = {
    AdGroups : AdGroupUpdateRequest[];
    Ads : AdUpdateRequest[];
    Campaigns : CampaignUpdateRequest[];
    CatalogProductGroups : BulkUpsertRequestUpdateCatalogProductGroupsItems[];
    Keywords : KeywordUpdateGenerated[];
    Labels : LabelBulkUpdateRequest[];
    ProductGroups : ProductGroupPromotionUpdateRequest[];
    Schedules : ScheduleUpdateRequest[];
  }
  //#endregion
