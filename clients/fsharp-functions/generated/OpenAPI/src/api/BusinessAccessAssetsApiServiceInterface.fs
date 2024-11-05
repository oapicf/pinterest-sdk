namespace OpenAPI
open BusinessAccessAssetsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module BusinessAccessAssetsApiServiceInterface =

    //#region Service interface
    type IBusinessAccessAssetsApiService =
      abstract member AssetGroupCreate : AssetGroupCreateBodyParams -> AssetGroupCreateResult
      abstract member AssetGroupDelete : AssetGroupDeleteBodyParams -> AssetGroupDeleteResult
      abstract member AssetGroupUpdate : AssetGroupUpdateBodyParams -> AssetGroupUpdateResult
      abstract member BusinessAssetMembersGet : unit -> BusinessAssetMembersGetResult
      abstract member BusinessAssetPartnersGet : unit -> BusinessAssetPartnersGetResult
      abstract member BusinessAssetsGet : unit -> BusinessAssetsGetResult
      abstract member BusinessMemberAssetsGet : unit -> BusinessMemberAssetsGetResult
      abstract member BusinessMembersAssetAccessDelete : BusinessMembersAssetAccessDeleteBodyParams -> BusinessMembersAssetAccessDeleteResult
      abstract member BusinessMembersAssetAccessUpdate : BusinessMembersAssetAccessUpdateBodyParams -> BusinessMembersAssetAccessUpdateResult
      abstract member BusinessPartnerAssetAccessGet : unit -> BusinessPartnerAssetAccessGetResult
      abstract member DeletePartnerAssetAccessHandlerImpl : DeletePartnerAssetAccessHandlerImplBodyParams -> DeletePartnerAssetAccessHandlerImplResult
      abstract member UpdatePartnerAssetAccessHandlerImpl : UpdatePartnerAssetAccessHandlerImplBodyParams -> UpdatePartnerAssetAccessHandlerImplResult
    //#endregion