namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OperationType

module BusinessToBusinessSharedAudienceUpdateWithRequiredBody =

  //#region BusinessToBusinessSharedAudienceUpdateWithRequiredBody

  [<CLIMutable>]
  type BusinessToBusinessSharedAudienceUpdateWithRequiredBody = {
    [<JsonProperty(PropertyName = "audience_id")>]
    AudienceId : string;
    [<JsonProperty(PropertyName = "operation_type")>]
    OperationType : OperationType;
    [<JsonProperty(PropertyName = "recipient_business_ids")>]
    RecipientBusinessIds : string[];
  }

  //#endregion
