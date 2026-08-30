namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AudienceUpdateOperationType

module CustomerSegmentUpdateRequestUpdateWithRequiredBody =

  //#region CustomerSegmentUpdateRequestUpdateWithRequiredBody

  [<CLIMutable>]
  type CustomerSegmentUpdateRequestUpdateWithRequiredBody = {
    [<JsonProperty(PropertyName = "audience_ids")>]
    AudienceIds : string[];
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "operation_type")>]
    OperationType : AudienceUpdateOperationType;
  }

  //#endregion
