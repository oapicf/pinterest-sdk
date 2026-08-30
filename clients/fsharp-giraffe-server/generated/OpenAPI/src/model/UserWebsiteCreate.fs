namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.WebsiteVerificationMethod

module UserWebsiteCreate =

  //#region UserWebsiteCreate


  type UserWebsiteCreate = {
    VerificationMethod : WebsiteVerificationMethod;
    Website : string;
  }
  //#endregion
