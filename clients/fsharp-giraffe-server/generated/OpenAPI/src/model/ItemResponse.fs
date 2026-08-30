namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsAttributes
open OpenAPI.Model.CatalogsCreativeAssetsItemErrorResponse
open OpenAPI.Model.CatalogsCreativeAssetsItemResponse
open OpenAPI.Model.CatalogsHotelItemErrorResponse
open OpenAPI.Model.CatalogsHotelItemResponse
open OpenAPI.Model.CatalogsRetailItemErrorResponse
open OpenAPI.Model.CatalogsRetailItemResponse
open OpenAPI.Model.ItemValidationEvent
open OpenAPI.Model.Pin

module ItemResponse =

  //#region ItemResponse

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion
  //#region enums
  type ItemResponseKindEnum = CreativeAssetsItemErrorEnum of string  
  //#endregion

  type ItemResponse = {
    Attributes : CatalogsCreativeAssetsAttributes;
    CatalogType : CatalogTypeEnum;
    ItemId : string;
    ItemResponseKind : ItemResponseKindEnum;
    Pins : Pin[];
    HotelId : string;
    CreativeAssetsId : string;
    Errors : ItemValidationEvent[];
  }
  //#endregion
