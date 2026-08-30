namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FilterOperatorType

module CatalogsProductGroupFilterOperatorTypeCriteria =

  //#region CatalogsProductGroupFilterOperatorTypeCriteria


  type CatalogsProductGroupFilterOperatorTypeCriteria = {
    FilterOperatorType : FilterOperatorType;
    Negated : bool;
    Values : string[];
  }
  //#endregion
