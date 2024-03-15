namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Country

module CatalogsProductGroupMultipleCountriesCriteria =

  //#region CatalogsProductGroupMultipleCountriesCriteria


  type CatalogsProductGroupMultipleCountriesCriteria = {
    Values : Country[];
    Negated : bool;
  }
  //#endregion
