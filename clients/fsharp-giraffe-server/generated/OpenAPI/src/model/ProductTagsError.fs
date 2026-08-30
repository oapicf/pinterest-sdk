namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.IneligibleProductTagsErrorDetails

module ProductTagsError =

  //#region ProductTagsError


  type ProductTagsError = {
    Code : int;
    Details : IneligibleProductTagsErrorDetails;
    Message : string;
  }
  //#endregion
