namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsFeedIngestionInfo =

  //#region CatalogsFeedIngestionInfo


  type CatalogsFeedIngestionInfo = {
    InStock : int;
    OutOfStock : int;
    Preorder : int;
  }
  //#endregion
