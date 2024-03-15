namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Exception
open OpenAPI.Model.ProductGroupPromotion

module ProductGroupPromotionResponseItem =

  //#region ProductGroupPromotionResponseItem


  type ProductGroupPromotionResponseItem = {
    Data : ProductGroupPromotion;
    Exceptions : Exception[];
  }
  //#endregion
