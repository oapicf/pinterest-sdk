namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module SSIOInsertionOrderStatusResponse =

  //#region SSIOInsertionOrderStatusResponse


  type SSIOInsertionOrderStatusResponse = {
    PinOrderId : string;
    Status : string;
    CreationTime : string option;
  }
  //#endregion
