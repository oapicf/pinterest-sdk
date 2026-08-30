namespace OpenAPI
open OpenAPI.Model.AssetGroupDeletion
open OpenAPI.Model.AssetGroupDeletionDelete
open OpenAPI.Model.AssetGroupInput
open OpenAPI.Model.AssetGroupInputCreate
open OpenAPI.Model.AssetGroupModification
open OpenAPI.Model.AssetGroupModificationReadOrUpdate
open OpenAPI.Model.AssetPermissionType
open OpenAPI.Model.AssetSearchBy
open OpenAPI.Model.AssetSortBy
open OpenAPI.Model.BusinessAssetMembersGet200Response
open OpenAPI.Model.BusinessAssetsGet200Response
open OpenAPI.Model.BusinessMemberAssetsGetResponse
open OpenAPI.Model.BusinessMembersAssetAccessDeleteBody
open OpenAPI.Model.BusinessPartnerAssetAccessGet200Response
open OpenAPI.Model.DeleteMemberAccessResultsResponseArray
open OpenAPI.Model.DeletePartnerAssetAccessBody
open OpenAPI.Model.DeletePartnerAssetAccessResultsResponseArray
open OpenAPI.Model.NonDraftEntityStatus
open OpenAPI.Model.PermissionsWithOwner
open OpenAPI.Model.PinterestLibError
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
            let content = "The request has succeeded." :> obj :?> AssetGroupInput // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> AssetGroupInput // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupCreateDefaultStatusCode { content = content }

        member this.AssetGroupDelete ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> AssetGroupDeletion // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupDeleteStatusCode200 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupDeleteDefaultStatusCode { content = content }

        member this.AssetGroupUpdate ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> AssetGroupModification // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupUpdateStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupUpdateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupUpdateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupUpdateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupUpdateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupUpdateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetGroupUpdateDefaultStatusCode { content = content }

        member this.BusinessAssetMembersGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> BusinessAssetMembersGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetMembersGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetMembersGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetMembersGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetMembersGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetMembersGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetMembersGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetMembersGetDefaultStatusCode { content = content }

        member this.BusinessAssetPartnersGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> BusinessAssetMembersGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetPartnersGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetPartnersGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetPartnersGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetPartnersGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetPartnersGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetPartnersGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetPartnersGetDefaultStatusCode { content = content }

        member this.BusinessAssetsGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> BusinessAssetsGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetsGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetsGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetsGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetsGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetsGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetsGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAssetsGetDefaultStatusCode { content = content }

        member this.BusinessMemberAssetsGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> BusinessMemberAssetsGetResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMemberAssetsGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMemberAssetsGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMemberAssetsGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMemberAssetsGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMemberAssetsGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMemberAssetsGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMemberAssetsGetDefaultStatusCode { content = content }

        member this.BusinessMembersAssetAccessDelete ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> DeleteMemberAccessResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMembersAssetAccessDeleteStatusCode200 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMembersAssetAccessDeleteDefaultStatusCode { content = content }

        member this.BusinessMembersAssetAccessUpdate ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> UpdateMemberAssetsResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMembersAssetAccessUpdateStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMembersAssetAccessUpdateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMembersAssetAccessUpdateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMembersAssetAccessUpdateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMembersAssetAccessUpdateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMembersAssetAccessUpdateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessMembersAssetAccessUpdateDefaultStatusCode { content = content }

        member this.BusinessPartnerAssetAccessGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> BusinessPartnerAssetAccessGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessPartnerAssetAccessGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessPartnerAssetAccessGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessPartnerAssetAccessGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessPartnerAssetAccessGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessPartnerAssetAccessGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessPartnerAssetAccessGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessPartnerAssetAccessGetDefaultStatusCode { content = content }

        member this.DeletePartnerAssetAccessHandlerImpl ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> DeletePartnerAssetAccessResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeletePartnerAssetAccessHandlerImplStatusCode200 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeletePartnerAssetAccessHandlerImplDefaultStatusCode { content = content }

        member this.UpdatePartnerAssetAccessHandlerImpl ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> UpdatePartnerAssetsResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePartnerAssetAccessHandlerImplStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePartnerAssetAccessHandlerImplStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePartnerAssetAccessHandlerImplStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePartnerAssetAccessHandlerImplStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePartnerAssetAccessHandlerImplStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePartnerAssetAccessHandlerImplStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePartnerAssetAccessHandlerImplDefaultStatusCode { content = content }

      //#endregion

    let BusinessAccessAssetsApiService = BusinessAccessAssetsApiServiceImpl() :> IBusinessAccessAssetsApiService