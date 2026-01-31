namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.QualityComponentDetails
open System.Collections.Generic

module QualityComponents =

  //#region QualityComponents


  type QualityComponents = {
    AdvertiserExternalId : IDictionary<string, QualityComponentDetails>;
    ClickIdEpik : IDictionary<string, QualityComponentDetails>;
    ExternalEventId : IDictionary<string, QualityComponentDetails>;
    HashedEmail : IDictionary<string, QualityComponentDetails>;
    HashedMaid : IDictionary<string, QualityComponentDetails>;
    IpAddress : IDictionary<string, QualityComponentDetails>;
    OrderId : IDictionary<string, QualityComponentDetails>;
    OrderValue : IDictionary<string, QualityComponentDetails>;
    ProductId : IDictionary<string, QualityComponentDetails>;
    SourceUrl : IDictionary<string, QualityComponentDetails>;
    UserAgent : IDictionary<string, QualityComponentDetails>;
  }
  //#endregion
