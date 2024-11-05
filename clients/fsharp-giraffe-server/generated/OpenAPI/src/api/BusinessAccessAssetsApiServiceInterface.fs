namespace OpenAPI
open BusinessAccessAssetsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module BusinessAccessAssetsApiServiceInterface =

    //#region Service interface
    type IBusinessAccessAssetsApiService =
      abstract member AssetGroupCreate:HttpContext -> AssetGroupCreateArgs->AssetGroupCreateResult
      abstract member AssetGroupDelete:HttpContext -> AssetGroupDeleteArgs->AssetGroupDeleteResult
      abstract member AssetGroupUpdate:HttpContext -> AssetGroupUpdateArgs->AssetGroupUpdateResult
      abstract member BusinessAssetMembersGet:HttpContext -> BusinessAssetMembersGetArgs->BusinessAssetMembersGetResult
      abstract member BusinessAssetPartnersGet:HttpContext -> BusinessAssetPartnersGetArgs->BusinessAssetPartnersGetResult
      abstract member BusinessAssetsGet:HttpContext -> BusinessAssetsGetArgs->BusinessAssetsGetResult
      abstract member BusinessMemberAssetsGet:HttpContext -> BusinessMemberAssetsGetArgs->BusinessMemberAssetsGetResult
      abstract member BusinessMembersAssetAccessDelete:HttpContext -> BusinessMembersAssetAccessDeleteArgs->BusinessMembersAssetAccessDeleteResult
      abstract member BusinessMembersAssetAccessUpdate:HttpContext -> BusinessMembersAssetAccessUpdateArgs->BusinessMembersAssetAccessUpdateResult
      abstract member BusinessPartnerAssetAccessGet:HttpContext -> BusinessPartnerAssetAccessGetArgs->BusinessPartnerAssetAccessGetResult
      abstract member DeletePartnerAssetAccessHandlerImpl:HttpContext -> DeletePartnerAssetAccessHandlerImplArgs->DeletePartnerAssetAccessHandlerImplResult
      abstract member UpdatePartnerAssetAccessHandlerImpl:HttpContext -> UpdatePartnerAssetAccessHandlerImplArgs->UpdatePartnerAssetAccessHandlerImplResult
    //#endregion