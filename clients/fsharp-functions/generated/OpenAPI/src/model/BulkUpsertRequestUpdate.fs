namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdGroupUpdateRequest
open OpenAPI.Model.AdUpdateRequest
open OpenAPI.Model.CampaignUpdateRequest
open OpenAPI.Model.KeywordUpdate
open OpenAPI.Model.ProductGroupPromotionUpdateRequest

module BulkUpsertRequestUpdate =

  //#region BulkUpsertRequestUpdate

  [<CLIMutable>]
  type BulkUpsertRequestUpdate = {
    [<JsonProperty(PropertyName = "campaigns")>]
    Campaigns : CampaignUpdateRequest[];
    [<JsonProperty(PropertyName = "ad_groups")>]
    AdGroups : AdGroupUpdateRequest[];
    [<JsonProperty(PropertyName = "ads")>]
    Ads : AdUpdateRequest[];
    [<JsonProperty(PropertyName = "product_groups")>]
    ProductGroups : ProductGroupPromotionUpdateRequest[];
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : KeywordUpdate[];
  }

  //#endregion
