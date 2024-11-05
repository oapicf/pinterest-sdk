namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ProductGroupPromotionCreateRequestElement

module ProductGroupPromotionCreateRequest =

  //#region ProductGroupPromotionCreateRequest


  type ProductGroupPromotionCreateRequest = {
    AdGroupId : string;
    ProductGroupPromotion : ProductGroupPromotionCreateRequestElement[];
  }
  //#endregion
