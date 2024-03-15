namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupsList200ResponseAllOfItemsInner
open OpenAPI.Model.string option

module CatalogsProductGroupsList200Response =

  //#region CatalogsProductGroupsList200Response


  type catalogs_product_groups_list_200_response = {
    Items : CatalogsProductGroupsList200ResponseAllOfItemsInner[];
    Bookmark : string option;
  }
  //#endregion
