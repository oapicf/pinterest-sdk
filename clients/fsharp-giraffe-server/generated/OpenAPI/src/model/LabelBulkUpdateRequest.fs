namespace OpenAPI.Model

open System
open System.Collections.Generic

module LabelBulkUpdateRequest =

  //#region LabelBulkUpdateRequest

  //#region enums
  type StatusEnum = ARCHIVEDEnum of string  
  //#endregion

  type LabelBulkUpdateRequest = {
    Id : string;
    Status : StatusEnum;
    Value : string;
  }
  //#endregion
