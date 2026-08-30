namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemAttributes
open OpenAPI.Model.Pin

module CatalogsRetailItemResponse =

  //#region CatalogsRetailItemResponse

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion
  //#region enums
  type ItemResponseKindEnum = RetailItemEnum of string  
  //#endregion

  type CatalogsRetailItemResponse = {
    Attributes : ItemAttributes;
    CatalogType : CatalogTypeEnum;
    ItemId : string;
    ItemResponseKind : ItemResponseKindEnum;
    Pins : Pin[];
  }
  //#endregion
