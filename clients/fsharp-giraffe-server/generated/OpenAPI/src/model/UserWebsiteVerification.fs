namespace OpenAPI.Model

open System
open System.Collections.Generic

module UserWebsiteVerification =

  //#region UserWebsiteVerification


  type UserWebsiteVerification = {
    DnsTxtRecord : string;
    FileContent : string;
    Filename : string;
    Metatag : string;
    VerificationCode : string;
  }
  //#endregion
