namespace OpenAPI.Model

open System
open System.Collections.Generic

module CustomerListRecordRow =

  //#region CustomerListRecordRow


  type CustomerListRecordRow = {
    Email : string;
    ExternalId : string;
    HashedPhoneNumber : string;
    HashedPinnerId : string;
    IpAddress : string;
    LiverampEnvelope : string;
    Maid : string;
    UserAgent : string;
  }
  //#endregion
