namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProductGroupPromotion

module ProductGroupPromotionCreateRequest =

  //#region ProductGroupPromotionCreateRequest

  [<CLIMutable>]
  type ProductGroupPromotionCreateRequest = {
    [<JsonProperty(PropertyName = "ad_group_id")>]
    AdGroupId : string;
    [<JsonProperty(PropertyName = "product_group_promotion")>]
    ProductGroupPromotion : ProductGroupPromotion[];
  }

  //#endregion
