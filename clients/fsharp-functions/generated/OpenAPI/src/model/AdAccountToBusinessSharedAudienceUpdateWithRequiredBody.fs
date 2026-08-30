namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OperationType

module AdAccountToBusinessSharedAudienceUpdateWithRequiredBody =

  //#region AdAccountToBusinessSharedAudienceUpdateWithRequiredBody

  [<CLIMutable>]
  type AdAccountToBusinessSharedAudienceUpdateWithRequiredBody = {
    [<JsonProperty(PropertyName = "audience_id")>]
    AudienceId : string;
    [<JsonProperty(PropertyName = "operation_type")>]
    OperationType : OperationType;
    [<JsonProperty(PropertyName = "recipient_business_ids")>]
    RecipientBusinessIds : string[];
  }

  //#endregion
