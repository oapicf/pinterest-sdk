namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.SSIOAccountItem
open OpenAPI.Model.SSIOAccountPMPName

module SSIOAccount =

  //#region SSIOAccount

  [<CLIMutable>]
  type SSIOAccount = {
    [<JsonProperty(PropertyName = "billto_infos")>]
    BilltoInfos : SSIOAccountItem[];
    [<JsonProperty(PropertyName = "can_edit")>]
    CanEdit : bool;
    [<JsonProperty(PropertyName = "currency")>]
    Currency : string;
    [<JsonProperty(PropertyName = "eligible")>]
    Eligible : bool;
    [<JsonProperty(PropertyName = "error")>]
    Error : string;
    [<JsonProperty(PropertyName = "pmp_names")>]
    PmpNames : SSIOAccountPMPName[];
  }

  //#endregion
