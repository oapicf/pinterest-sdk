namespace OpenAPI
open OpenAPI.Model.BusinessAssetMembersGet200Response
open OpenAPI.Model.BusinessAssetPartnersGet200Response
open OpenAPI.Model.BusinessAssetsGet200Response
open OpenAPI.Model.BusinessMemberAssetsGet200Response
open OpenAPI.Model.BusinessMembersAssetAccessDeleteRequest
open OpenAPI.Model.BusinessPartnerAssetAccessGet200Response
open OpenAPI.Model.CreateAssetGroupBody
open OpenAPI.Model.CreateAssetGroupResponse
open OpenAPI.Model.DeleteAssetGroupBody
open OpenAPI.Model.DeleteAssetGroupResponse
open OpenAPI.Model.DeleteMemberAccessResultsResponseArray
open OpenAPI.Model.DeletePartnerAssetAccessBody
open OpenAPI.Model.DeletePartnerAssetsResultsResponseArray
open OpenAPI.Model.Error
open OpenAPI.Model.PartnerType
open OpenAPI.Model.PermissionsWithOwner
open OpenAPI.Model.UpdateAssetGroupBody
open OpenAPI.Model.UpdateAssetGroupResponse
open OpenAPI.Model.UpdateMemberAssetAccessBody
open OpenAPI.Model.UpdateMemberAssetsResultsResponseArray
open OpenAPI.Model.UpdatePartnerAssetAccessBody
open OpenAPI.Model.UpdatePartnerAssetsResultsResponseArray
open BusinessAccessAssetsApiHandlerParams
open BusinessAccessAssetsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module BusinessAccessAssetsApiServiceImplementation =

    //#region Service implementation
    type BusinessAccessAssetsApiServiceImpl() =
      interface IBusinessAccessAssetsApiService with

        member this.AssetGroupCreate ctx args =
          if true then
            let content = "Success" :> obj :?> CreateAssetGroupResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupCreateStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupCreateStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupCreateDefaultStatusCode { content = content }

        member this.AssetGroupDelete ctx args =
          if true then
            let content = "Success" :> obj :?> DeleteAssetGroupResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupDeleteStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupDeleteStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupDeleteDefaultStatusCode { content = content }

        member this.AssetGroupUpdate ctx args =
          if true then
            let content = "Success" :> obj :?> UpdateAssetGroupResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupUpdateStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupUpdateStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupUpdateDefaultStatusCode { content = content }

        member this.BusinessAssetMembersGet ctx args =
          if true then
            let content = "Sucess" :> obj :?> BusinessAssetMembersGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetMembersGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetMembersGetDefaultStatusCode { content = content }

        member this.BusinessAssetPartnersGet ctx args =
          if true then
            let content = "Sucess" :> obj :?> BusinessAssetPartnersGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetPartnersGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetPartnersGetDefaultStatusCode { content = content }

        member this.BusinessAssetsGet ctx args =
          if true then
            let content = "Success" :> obj :?> BusinessAssetsGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetsGetDefaultStatusCode { content = content }

        member this.BusinessMemberAssetsGet ctx args =
          if true then
            let content = "Success" :> obj :?> BusinessMemberAssetsGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMemberAssetsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMemberAssetsGetDefaultStatusCode { content = content }

        member this.BusinessMembersAssetAccessDelete ctx args =
          if true then
            let content = "response" :> obj :?> DeleteMemberAccessResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMembersAssetAccessDeleteStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMembersAssetAccessDeleteDefaultStatusCode { content = content }

        member this.BusinessMembersAssetAccessUpdate ctx args =
          if true then
            let content = "response" :> obj :?> UpdateMemberAssetsResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMembersAssetAccessUpdateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMembersAssetAccessUpdateDefaultStatusCode { content = content }

        member this.BusinessPartnerAssetAccessGet ctx args =
          if true then
            let content = "Success" :> obj :?> BusinessPartnerAssetAccessGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessPartnerAssetAccessGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessPartnerAssetAccessGetDefaultStatusCode { content = content }

        member this.DeletePartnerAssetAccessHandlerImpl ctx args =
          if true then
            let content = "Success" :> obj :?> DeletePartnerAssetsResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeletePartnerAssetAccessHandlerImplStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeletePartnerAssetAccessHandlerImplDefaultStatusCode { content = content }

        member this.UpdatePartnerAssetAccessHandlerImpl ctx args =
          if true then
            let content = "Success" :> obj :?> UpdatePartnerAssetsResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePartnerAssetAccessHandlerImplStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePartnerAssetAccessHandlerImplDefaultStatusCode { content = content }

      //#endregion

    let BusinessAccessAssetsApiService = BusinessAccessAssetsApiServiceImpl() :> IBusinessAccessAssetsApiService