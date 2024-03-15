namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ProductGroupPromotion

module ProductGroupPromotionCreateRequest =

  //#region ProductGroupPromotionCreateRequest


  type ProductGroupPromotionCreateRequest = {
    AdGroupId : string;
    ProductGroupPromotion : ProductGroupPromotion[];
  }
  //#endregion
