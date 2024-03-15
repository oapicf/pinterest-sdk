namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemAttributes
open OpenAPI.Model.Pin

module CatalogsRetailItemResponse =

  //#region CatalogsRetailItemResponse


  type CatalogsRetailItemResponse = {
    CatalogType : CatalogsType;
    ItemId : string;
    Pins : Pin[];
    Attributes : ItemAttributes;
  }
  //#endregion
