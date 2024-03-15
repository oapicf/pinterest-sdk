namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SSIOAccountItem
open OpenAPI.Model.SSIOAccountPMPName

module SSIOAccountResponse =

  //#region SSIOAccountResponse


  type SSIOAccountResponse = {
    Eligible : bool;
    CanEdit : bool;
    BilltoInfos : SSIOAccountItem[];
    Currency : string;
    PmpNames : SSIOAccountPMPName[];
    Error : string;
  }
  //#endregion
