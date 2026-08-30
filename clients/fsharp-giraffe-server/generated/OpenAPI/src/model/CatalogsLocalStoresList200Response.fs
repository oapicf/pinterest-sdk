namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LocalStore
open OpenAPI.Model.string option

module CatalogsLocalStoresList200Response =

  //#region CatalogsLocalStoresList200Response


  type catalogs_local_stores_list_200_response = {
    Bookmark : string option;
    Items : LocalStore[];
  }
  //#endregion
