namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.SSIOAccountItem
open OpenAPI.Model.SSIOAccountPMPName

module SSIOAccountResponse =

  //#region SSIOAccountResponse

  [<CLIMutable>]
  type SSIOAccountResponse = {
    [<JsonProperty(PropertyName = "eligible")>]
    Eligible : bool;
    [<JsonProperty(PropertyName = "can_edit")>]
    CanEdit : bool;
    [<JsonProperty(PropertyName = "billto_infos")>]
    BilltoInfos : SSIOAccountItem[];
    [<JsonProperty(PropertyName = "currency")>]
    Currency : string;
    [<JsonProperty(PropertyName = "pmp_names")>]
    PmpNames : SSIOAccountPMPName[];
    [<JsonProperty(PropertyName = "error")>]
    Error : string;
  }

  //#endregion
