namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdCreateRequest
open OpenAPI.Model.AdGroupCreateRequest
open OpenAPI.Model.CampaignCreateRequest
open OpenAPI.Model.KeywordsRequest
open OpenAPI.Model.ProductGroupPromotionCreateRequest

module BulkUpsertRequestCreate =

  //#region BulkUpsertRequestCreate

  [<CLIMutable>]
  type BulkUpsertRequestCreate = {
    [<JsonProperty(PropertyName = "campaigns")>]
    Campaigns : CampaignCreateRequest[];
    [<JsonProperty(PropertyName = "ad_groups")>]
    AdGroups : AdGroupCreateRequest[];
    [<JsonProperty(PropertyName = "ads")>]
    Ads : AdCreateRequest[];
    [<JsonProperty(PropertyName = "product_groups")>]
    ProductGroups : ProductGroupPromotionCreateRequest[];
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : KeywordsRequest[];
  }

  //#endregion
