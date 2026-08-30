namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemValidationEvent

module CatalogsRetailItemErrorResponse =

  //#region CatalogsRetailItemErrorResponse

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion
  //#region enums
  type ItemResponseKindEnum = RetailItemErrorEnum of string  
  //#endregion

  type CatalogsRetailItemErrorResponse = {
    CatalogType : CatalogTypeEnum;
    Errors : ItemValidationEvent[];
    ItemId : string;
    ItemResponseKind : ItemResponseKindEnum;
  }
  //#endregion
