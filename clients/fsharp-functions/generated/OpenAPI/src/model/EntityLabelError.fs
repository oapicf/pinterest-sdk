namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EntityLabel

module EntityLabelError =

  //#region EntityLabelError

  [<CLIMutable>]
  type EntityLabelError = {
    [<JsonProperty(PropertyName = "data")>]
    Data : EntityLabel;
    [<JsonProperty(PropertyName = "error_messages")>]
    ErrorMessages : string[];
  }

  //#endregion
