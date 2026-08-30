namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Role

module AdAccountToBusinessSharedAudience =

  //#region AdAccountToBusinessSharedAudience


  type AdAccountToBusinessSharedAudience = {
    AudienceId : string;
    Permissions : Role[];
    RecipientBusinessIds : string[];
  }
  //#endregion
