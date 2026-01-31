namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SSIOAccountItem
open OpenAPI.Model.SSIOAccountPMPName

module SSIOAccountResponse =

  //#region SSIOAccountResponse


  type SSIOAccountResponse = {
    BilltoInfos : SSIOAccountItem[];
    CanEdit : bool;
    Currency : string;
    Eligible : bool;
    Error : string;
    PmpNames : SSIOAccountPMPName[];
  }
  //#endregion
