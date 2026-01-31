namespace OpenAPI.Model

open System
open System.Collections.Generic

module MediaUploadParameters =

  //#region MediaUploadParameters


  type MediaUploadParameters = {
    ContentType : string;
    Key : string;
    Policy : string;
    XAmzAlgorithm : string;
    XAmzCredential : string;
    XAmzDate : string;
    XAmzSecurityToken : string;
    XAmzSignature : string;
  }
  //#endregion
