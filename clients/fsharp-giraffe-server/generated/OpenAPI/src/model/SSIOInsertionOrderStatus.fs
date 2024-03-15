namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module SSIOInsertionOrderStatus =

  //#region SSIOInsertionOrderStatus


  type SSIOInsertionOrderStatus = {
    PinOrderId : string;
    Status : string;
    CreationTime : string option;
  }
  //#endregion
