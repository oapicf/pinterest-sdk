namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MediaUploadAllOfUploadParameters =

  //#region MediaUploadAllOfUploadParameters

  [<CLIMutable>]
  type MediaUploadAllOfUploadParameters = {
    [<JsonProperty(PropertyName = "x-amz-date")>]
    XAmzDate : string;
    [<JsonProperty(PropertyName = "x-amz-signature")>]
    XAmzSignature : string;
    [<JsonProperty(PropertyName = "x-amz-security-token")>]
    XAmzSecurityToken : string;
    [<JsonProperty(PropertyName = "x-amz-algorithm")>]
    XAmzAlgorithm : string;
    [<JsonProperty(PropertyName = "key")>]
    Key : string;
    [<JsonProperty(PropertyName = "policy")>]
    Policy : string;
    [<JsonProperty(PropertyName = "x-amz-credential")>]
    XAmzCredential : string;
    [<JsonProperty(PropertyName = "Content-Type")>]
    ContentType : string;
  }

  //#endregion
