namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsItemErrorResponse
open OpenAPI.Model.CatalogsHotelItemErrorResponse
open OpenAPI.Model.CatalogsRetailItemErrorResponse
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemValidationEvent

module ItemResponseOneOf1 =

  //#region ItemResponseOneOf1


  type ItemResponse_oneOf_1 = {
    CatalogType : CatalogsType;
    Errors : ItemValidationEvent[];
    ItemId : string;
    HotelId : string;
    CreativeAssetsId : string;
  }
  //#endregion
