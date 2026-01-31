namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdGroupUpdateRequest
open OpenAPI.Model.AdUpdateRequest
open OpenAPI.Model.CampaignUpdateRequest
open OpenAPI.Model.CatalogsProductGroupsUpdateRequest
open OpenAPI.Model.KeywordUpdate
open OpenAPI.Model.LabelBulkUpdateRequest
open OpenAPI.Model.ProductGroupPromotionUpdateRequest

module BulkUpsertRequestUpdate =

  //#region BulkUpsertRequestUpdate


  type BulkUpsertRequestUpdate = {
    AdGroups : AdGroupUpdateRequest[];
    Ads : AdUpdateRequest[];
    Campaigns : CampaignUpdateRequest[];
    CatalogProductGroups : CatalogsProductGroupsUpdateRequest[];
    Keywords : KeywordUpdate[];
    Labels : LabelBulkUpdateRequest[];
    ProductGroups : ProductGroupPromotionUpdateRequest[];
  }
  //#endregion
