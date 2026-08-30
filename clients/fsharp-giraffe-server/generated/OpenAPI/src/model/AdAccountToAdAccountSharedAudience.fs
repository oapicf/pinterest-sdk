namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Role

module AdAccountToAdAccountSharedAudience =

  //#region AdAccountToAdAccountSharedAudience


  type AdAccountToAdAccountSharedAudience = {
    AudienceId : string;
    Permissions : Role[];
    RecipientAccountIds : string[];
  }
  //#endregion
