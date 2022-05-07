namespace OpenAPI.Model

open System
open System.Collections.Generic

module Account =

  //#region Account

  //#region enums
  type AccountTypeEnum = PINNEREnum of string  |  BUSINESSEnum of string  
  //#endregion

  type Account = {
    AccountType : AccountTypeEnum;
    ProfileImage : string;
    WebsiteUrl : string;
    Username : string;
  }
  //#endregion
