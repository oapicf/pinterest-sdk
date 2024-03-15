namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductMetadata
open OpenAPI.Model.Pin

module CatalogsProduct =

  //#region CatalogsProduct


  type CatalogsProduct = {
    Metadata : CatalogsProductMetadata;
    Pin : Pin;
  }
  //#endregion
