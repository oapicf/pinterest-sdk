namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Role

module BusinessToBusinessSharedAudience =

  //#region BusinessToBusinessSharedAudience


  type BusinessToBusinessSharedAudience = {
    AudienceId : string;
    Permissions : Role[];
    RecipientBusinessIds : string[];
  }
  //#endregion
