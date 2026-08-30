namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SSIOAccountItem
open OpenAPI.Model.SSIOAccountPMPName

module SSIOAccount =

  //#region SSIOAccount


  type SSIOAccount = {
    BilltoInfos : SSIOAccountItem[];
    CanEdit : bool;
    Currency : string;
    Eligible : bool;
    Error : string;
    PmpNames : SSIOAccountPMPName[];
  }
  //#endregion
