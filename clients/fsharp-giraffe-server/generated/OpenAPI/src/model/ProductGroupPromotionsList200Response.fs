namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ProductGroupPromotion
open OpenAPI.Model.string option

module ProductGroupPromotionsList200Response =

  //#region ProductGroupPromotionsList200Response


  type product_group_promotions_list_200_response = {
    Bookmark : string option;
    Items : ProductGroupPromotion[];
  }
  //#endregion
