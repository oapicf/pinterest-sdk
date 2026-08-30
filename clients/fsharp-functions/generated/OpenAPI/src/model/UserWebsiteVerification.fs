namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UserWebsiteVerification =

  //#region UserWebsiteVerification

  [<CLIMutable>]
  type UserWebsiteVerification = {
    [<JsonProperty(PropertyName = "dns_txt_record")>]
    DnsTxtRecord : string;
    [<JsonProperty(PropertyName = "file_content")>]
    FileContent : string;
    [<JsonProperty(PropertyName = "filename")>]
    Filename : string;
    [<JsonProperty(PropertyName = "metatag")>]
    Metatag : string;
    [<JsonProperty(PropertyName = "verification_code")>]
    VerificationCode : string;
  }

  //#endregion
