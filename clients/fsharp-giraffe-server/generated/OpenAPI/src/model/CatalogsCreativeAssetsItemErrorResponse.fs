namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemValidationEvent

module CatalogsCreativeAssetsItemErrorResponse =

  //#region CatalogsCreativeAssetsItemErrorResponse


  type CatalogsCreativeAssetsItemErrorResponse = {
    CatalogType : CatalogsType;
    CreativeAssetsId : string;
    Errors : ItemValidationEvent[];
  }
  //#endregion
