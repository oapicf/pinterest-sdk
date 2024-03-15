namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductMetadata
open OpenAPI.Model.Pin

module CatalogsProduct =

  //#region CatalogsProduct

  [<CLIMutable>]
  type CatalogsProduct = {
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : CatalogsProductMetadata;
    [<JsonProperty(PropertyName = "pin")>]
    Pin : Pin;
  }

  //#endregion
