namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecShoppingRetargeting

module TargetingSpecOperationShoppingRetargeting =

  //#region TargetingSpecOperationShoppingRetargeting

  //#region enums
  type FieldEnum = SHOPPINGRETARGETINGEnum of string  
  //#endregion
  //#region enums
  type OperationEnum = SETEnum of string  
  //#endregion

  type TargetingSpecOperationShoppingRetargeting = {
    Field : FieldEnum;
    Operation : OperationEnum;
    Values : TargetingSpecShoppingRetargeting[];
  }
  //#endregion
