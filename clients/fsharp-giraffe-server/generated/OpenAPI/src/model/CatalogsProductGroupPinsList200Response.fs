namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProduct
open OpenAPI.Model.string option

module CatalogsProductGroupPinsList200Response =

  //#region CatalogsProductGroupPinsList200Response


  type catalogs_product_group_pins_list_200_response = {
    Items : CatalogsProduct[];
    Bookmark : string option;
  }
  //#endregion
