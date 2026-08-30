namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Role

module BusinessToAdAccountSharedAudience =

  //#region BusinessToAdAccountSharedAudience


  type BusinessToAdAccountSharedAudience = {
    AudienceId : string;
    Permissions : Role[];
    RecipientAccountIds : string[];
  }
  //#endregion
