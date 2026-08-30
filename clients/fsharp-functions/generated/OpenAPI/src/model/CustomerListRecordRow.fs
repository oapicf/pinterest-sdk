namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CustomerListRecordRow =

  //#region CustomerListRecordRow

  [<CLIMutable>]
  type CustomerListRecordRow = {
    [<JsonProperty(PropertyName = "email")>]
    Email : string;
    [<JsonProperty(PropertyName = "external_id")>]
    ExternalId : string;
    [<JsonProperty(PropertyName = "hashed_phone_number")>]
    HashedPhoneNumber : string;
    [<JsonProperty(PropertyName = "hashed_pinner_id")>]
    HashedPinnerId : string;
    [<JsonProperty(PropertyName = "ip_address")>]
    IpAddress : string;
    [<JsonProperty(PropertyName = "liveramp_envelope")>]
    LiverampEnvelope : string;
    [<JsonProperty(PropertyName = "maid")>]
    Maid : string;
    [<JsonProperty(PropertyName = "user_agent")>]
    UserAgent : string;
  }

  //#endregion
