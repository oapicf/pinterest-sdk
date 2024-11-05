namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsProduct
open OpenAPI.Model.CatalogsCreativeAssetsProductMetadata
open OpenAPI.Model.CatalogsHotelProduct
open OpenAPI.Model.CatalogsRetailProduct
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Pin

module CatalogsProduct =

  //#region CatalogsProduct


  type CatalogsProduct = {
    CatalogType : CatalogsType;
    Metadata : CatalogsCreativeAssetsProductMetadata;
    Pin : Pin;
  }
  //#endregion
