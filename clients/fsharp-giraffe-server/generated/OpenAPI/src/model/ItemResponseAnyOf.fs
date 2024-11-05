namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsAttributes
open OpenAPI.Model.CatalogsCreativeAssetsItemResponse
open OpenAPI.Model.CatalogsHotelItemResponse
open OpenAPI.Model.CatalogsRetailItemResponse
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Pin

module ItemResponseAnyOf =

  //#region ItemResponseAnyOf


  type ItemResponse_anyOf = {
    CatalogType : CatalogsType;
    ItemId : string;
    Pins : Pin[];
    Attributes : CatalogsCreativeAssetsAttributes;
    HotelId : string;
    CreativeAssetsId : string;
  }
  //#endregion
