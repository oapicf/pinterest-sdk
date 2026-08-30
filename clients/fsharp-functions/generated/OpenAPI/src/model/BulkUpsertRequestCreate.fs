namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
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

  [<CLIMutable>]
  type BulkUpsertRequestCreate = {
    [<JsonProperty(PropertyName = "ad_groups")>]
    AdGroups : AdGroupCreateRequest[];
    [<JsonProperty(PropertyName = "ads")>]
    Ads : AdCreateRequest[];
    [<JsonProperty(PropertyName = "campaigns")>]
    Campaigns : CampaignCreateRequest[];
    [<JsonProperty(PropertyName = "catalog_product_groups")>]
    CatalogProductGroups : BulkUpsertRequestCreateCatalogProductGroupsItems[];
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : KeywordsRequest[];
    [<JsonProperty(PropertyName = "labels")>]
    Labels : LabelBulkCreateRequest[];
    [<JsonProperty(PropertyName = "product_groups")>]
    ProductGroups : ProductGroupPromotionCreateRequest[];
    [<JsonProperty(PropertyName = "schedules")>]
    Schedules : ScheduleCreateRequest[];
  }

  //#endregion
