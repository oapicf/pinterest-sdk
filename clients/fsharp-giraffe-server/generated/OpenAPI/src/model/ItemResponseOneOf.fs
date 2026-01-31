namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsAttributes
open OpenAPI.Model.CatalogsCreativeAssetsItemResponse
open OpenAPI.Model.CatalogsHotelItemResponse
open OpenAPI.Model.CatalogsRetailItemResponse
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Pin

module ItemResponseOneOf =

  //#region ItemResponseOneOf


  type ItemResponse_oneOf = {
    CatalogType : CatalogsType;
    Attributes : CatalogsCreativeAssetsAttributes;
    ItemId : string;
    Pins : Pin[];
    HotelId : string;
    CreativeAssetsId : string;
  }
  //#endregion
