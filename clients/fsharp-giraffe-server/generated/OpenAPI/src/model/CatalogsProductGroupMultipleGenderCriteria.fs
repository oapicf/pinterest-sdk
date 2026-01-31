namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Gender

module CatalogsProductGroupMultipleGenderCriteria =

  //#region CatalogsProductGroupMultipleGenderCriteria


  type CatalogsProductGroupMultipleGenderCriteria = {
    Negated : bool;
    Values : Gender[];
  }
  //#endregion
