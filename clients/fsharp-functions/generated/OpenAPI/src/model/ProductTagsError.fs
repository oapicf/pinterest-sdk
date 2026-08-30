namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.IneligibleProductTagsErrorDetails

module ProductTagsError =

  //#region ProductTagsError

  [<CLIMutable>]
  type ProductTagsError = {
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "details")>]
    Details : IneligibleProductTagsErrorDetails;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
