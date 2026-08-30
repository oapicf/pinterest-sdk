namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsAiContentDisclosureLabel

module CatalogsAiContentDisclosure =

  //#region CatalogsAiContentDisclosure

  [<CLIMutable>]
  type CatalogsAiContentDisclosure = {
    [<JsonProperty(PropertyName = "disclosure")>]
    Disclosure : CatalogsAiContentDisclosureLabel[];
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
