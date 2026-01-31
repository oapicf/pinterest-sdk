namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module SSIOInsertionOrderStatusResponse =

  //#region SSIOInsertionOrderStatusResponse


  type SSIOInsertionOrderStatusResponse = {
    CreationTime : string option;
    PinOrderId : string;
    Status : string;
  }
  //#endregion
