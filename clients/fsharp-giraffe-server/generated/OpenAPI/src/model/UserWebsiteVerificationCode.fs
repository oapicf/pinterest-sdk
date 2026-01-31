namespace OpenAPI.Model

open System
open System.Collections.Generic

module UserWebsiteVerificationCode =

  //#region UserWebsiteVerificationCode


  type UserWebsiteVerificationCode = {
    DnsTxtRecord : string;
    FileContent : string;
    Filename : string;
    Metatag : string;
    VerificationCode : string;
  }
  //#endregion
