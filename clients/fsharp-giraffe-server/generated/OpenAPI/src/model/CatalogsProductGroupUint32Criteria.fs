namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsProductGroupUint32Criteria =

  //#region CatalogsProductGroupUint32Criteria

  //#region enums
  type OperatorEnum = GREATERTHANEnum of string  |  GREATERTHANOREQUALSEnum of string  |  LESSTHANEnum of string  |  LESSTHANOREQUALSEnum of string  
  //#endregion

  type CatalogsProductGroupUint32Criteria = {
    Negated : bool;
    Operator : OperatorEnum;
    Value : int;
  }
  //#endregion
