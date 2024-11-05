namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelProductMetadata
open OpenAPI.Model.Pin

module CatalogsHotelProduct =

  //#region CatalogsHotelProduct

  [<CLIMutable>]
  type CatalogsHotelProduct = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : CatalogsHotelProductMetadata;
    [<JsonProperty(PropertyName = "pin")>]
    Pin : Pin;
  }

  //#endregion
