namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleCountriesCriteria

module CountryFilter =

  //#region CountryFilter

  [<CLIMutable>]
  type CountryFilter = {
    [<JsonProperty(PropertyName = "COUNTRY")>]
    COUNTRY : CatalogsProductGroupMultipleCountriesCriteria;
  }

  //#endregion
