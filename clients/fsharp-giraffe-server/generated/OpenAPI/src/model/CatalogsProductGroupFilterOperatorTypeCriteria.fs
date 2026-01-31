namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsProductGroupFilterOperatorTypeCriteria =

  //#region CatalogsProductGroupFilterOperatorTypeCriteria

  //#region enums
  type FilterOperatorTypeEnum = ISEnum of string  |  CONTAINSEnum of string  
  //#endregion

  type CatalogsProductGroupFilterOperatorTypeCriteria = {
    FilterOperatorType : FilterOperatorTypeEnum;
    Negated : bool;
    Values : string[];
  }
  //#endregion
