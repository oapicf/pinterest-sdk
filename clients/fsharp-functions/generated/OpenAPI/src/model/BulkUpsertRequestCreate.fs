namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdCreateRequest
open OpenAPI.Model.AdGroupCreateRequest
open OpenAPI.Model.CampaignCreateRequest
open OpenAPI.Model.KeywordsRequest
open OpenAPI.Model.LabelCreateRequest
open OpenAPI.Model.MultipleProductGroupsInner
open OpenAPI.Model.ProductGroupPromotionCreateRequest

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
    CatalogProductGroups : MultipleProductGroupsInner[];
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : KeywordsRequest[];
    [<JsonProperty(PropertyName = "labels")>]
    Labels : LabelCreateRequest[];
    [<JsonProperty(PropertyName = "product_groups")>]
    ProductGroups : ProductGroupPromotionCreateRequest[];
  }

  //#endregion
