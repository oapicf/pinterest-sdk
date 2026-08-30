namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.NumericFilterOperatorType

module CatalogsProductGroupUint32Criteria =

  //#region CatalogsProductGroupUint32Criteria


  type CatalogsProductGroupUint32Criteria = {
    Negated : bool;
    Operator : NumericFilterOperatorType;
    Value : int;
  }
  //#endregion
