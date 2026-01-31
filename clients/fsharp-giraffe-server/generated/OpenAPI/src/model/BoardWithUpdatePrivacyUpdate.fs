namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BoardUpdatePrivacy
open OpenAPI.Model.string option

module BoardWithUpdatePrivacyUpdate =

  //#region BoardWithUpdatePrivacyUpdate


  type BoardWithUpdatePrivacyUpdate = {
    Description : string option;
    Name : string;
    Privacy : BoardUpdatePrivacy;
  }
  //#endregion
