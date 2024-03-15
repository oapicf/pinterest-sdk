namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Catalog
open OpenAPI.Model.string option

module CatalogsList200Response =

  //#region CatalogsList200Response


  type catalogs_list_200_response = {
    Items : Catalog[];
    Bookmark : string option;
  }
  //#endregion
