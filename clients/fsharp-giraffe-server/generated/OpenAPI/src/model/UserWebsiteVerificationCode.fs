namespace OpenAPI.Model

open System
open System.Collections.Generic

module UserWebsiteVerificationCode =

  //#region UserWebsiteVerificationCode


  type UserWebsiteVerificationCode = {
    VerificationCode : string;
    DnsTxtRecord : string;
    Metatag : string;
    Filename : string;
    FileContent : string;
  }
  //#endregion
