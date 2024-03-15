namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ProductGroupPromotion

module ProductGroupPromotionUpdateRequest =

  //#region ProductGroupPromotionUpdateRequest


  type ProductGroupPromotionUpdateRequest = {
    AdGroupId : string;
    ProductGroupPromotion : ProductGroupPromotion[];
  }
  //#endregion
