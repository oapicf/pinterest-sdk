namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OperationType

module BusinessSharedAudience =

  //#region BusinessSharedAudience


  type BusinessSharedAudience = {
    AudienceId : string;
    OperationType : OperationType;
    RecipientBusinessIds : string[];
  }
  //#endregion
