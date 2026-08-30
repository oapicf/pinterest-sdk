namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ProductGroupPromotion

module ProductGroupPromotionsCreate =

  //#region ProductGroupPromotionsCreate


  type ProductGroupPromotionsCreate = {
    AdGroupId : string;
    ProductGroupPromotion : ProductGroupPromotion[];
  }
  //#endregion
