namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
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

  [<CLIMutable>]
  type BulkUpsertRequestUpdate = {
    [<JsonProperty(PropertyName = "ad_groups")>]
    AdGroups : AdGroupUpdateRequest[];
    [<JsonProperty(PropertyName = "ads")>]
    Ads : AdUpdateRequest[];
    [<JsonProperty(PropertyName = "campaigns")>]
    Campaigns : CampaignUpdateRequest[];
    [<JsonProperty(PropertyName = "catalog_product_groups")>]
    CatalogProductGroups : BulkUpsertRequestUpdateCatalogProductGroupsItems[];
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : KeywordUpdateGenerated[];
    [<JsonProperty(PropertyName = "labels")>]
    Labels : LabelBulkUpdateRequest[];
    [<JsonProperty(PropertyName = "product_groups")>]
    ProductGroups : ProductGroupPromotionUpdateRequest[];
    [<JsonProperty(PropertyName = "schedules")>]
    Schedules : ScheduleUpdateRequest[];
  }

  //#endregion
