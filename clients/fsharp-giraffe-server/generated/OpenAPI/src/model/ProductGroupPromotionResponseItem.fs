namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Exception
open OpenAPI.Model.ProductGroupPromotionResponseElement

module ProductGroupPromotionResponseItem =

  //#region ProductGroupPromotionResponseItem


  type ProductGroupPromotionResponseItem = {
    Data : ProductGroupPromotionResponseElement;
    Exceptions : Exception[];
  }
  //#endregion
