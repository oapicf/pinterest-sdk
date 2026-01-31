namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdGroupUpdateRequest
open OpenAPI.Model.AdUpdateRequest
open OpenAPI.Model.CampaignUpdateRequest
open OpenAPI.Model.CatalogsProductGroupsUpdateRequest
open OpenAPI.Model.KeywordUpdate
open OpenAPI.Model.LabelBulkUpdateRequest
open OpenAPI.Model.ProductGroupPromotionUpdateRequest

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
    CatalogProductGroups : CatalogsProductGroupsUpdateRequest[];
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : KeywordUpdate[];
    [<JsonProperty(PropertyName = "labels")>]
    Labels : LabelBulkUpdateRequest[];
    [<JsonProperty(PropertyName = "product_groups")>]
    ProductGroups : ProductGroupPromotionUpdateRequest[];
  }

  //#endregion
