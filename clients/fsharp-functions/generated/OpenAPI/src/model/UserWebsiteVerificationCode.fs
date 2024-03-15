namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UserWebsiteVerificationCode =

  //#region UserWebsiteVerificationCode

  [<CLIMutable>]
  type UserWebsiteVerificationCode = {
    [<JsonProperty(PropertyName = "verification_code")>]
    VerificationCode : string;
    [<JsonProperty(PropertyName = "dns_txt_record")>]
    DnsTxtRecord : string;
    [<JsonProperty(PropertyName = "metatag")>]
    Metatag : string;
    [<JsonProperty(PropertyName = "filename")>]
    Filename : string;
    [<JsonProperty(PropertyName = "file_content")>]
    FileContent : string;
  }

  //#endregion
