using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class BusinessAccessAssetsApi
    { 
        [FunctionName("BusinessAccessAssetsApi_AssetGroupCreate")]
        public async Task<ActionResult<AssetGroupInput>> _AssetGroupCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5businesses/{business_id}/asset_groups")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("AssetGroupCreate");
            return method != null
                ? (await ((Task<AssetGroupInput>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessAssetsApi_AssetGroupDelete")]
        public async Task<ActionResult<AssetGroupDeletion>> _AssetGroupDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5businesses/{business_id}/asset_groups")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("AssetGroupDelete");
            return method != null
                ? (await ((Task<AssetGroupDeletion>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessAssetsApi_AssetGroupUpdate")]
        public async Task<ActionResult<AssetGroupModification>> _AssetGroupUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5businesses/{business_id}/asset_groups")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("AssetGroupUpdate");
            return method != null
                ? (await ((Task<AssetGroupModification>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessAssetsApi_BusinessAssetMembersGet")]
        public async Task<ActionResult<BusinessAssetMembersGet200Response>> _BusinessAssetMembersGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5businesses/{business_id}/assets/{asset_id}/members")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string assetId)
        {
            var method = this.GetType().GetMethod("BusinessAssetMembersGet");
            return method != null
                ? (await ((Task<BusinessAssetMembersGet200Response>)method.Invoke(this, new object[] { req, context, businessId, assetId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessAssetsApi_BusinessAssetPartnersGet")]
        public async Task<ActionResult<BusinessAssetMembersGet200Response>> _BusinessAssetPartnersGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5businesses/{business_id}/assets/{asset_id}/partners")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string assetId)
        {
            var method = this.GetType().GetMethod("BusinessAssetPartnersGet");
            return method != null
                ? (await ((Task<BusinessAssetMembersGet200Response>)method.Invoke(this, new object[] { req, context, businessId, assetId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessAssetsApi_BusinessAssetsGet")]
        public async Task<ActionResult<BusinessAssetsGet200Response>> _BusinessAssetsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5businesses/{business_id}/assets")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("BusinessAssetsGet");
            return method != null
                ? (await ((Task<BusinessAssetsGet200Response>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessAssetsApi_BusinessMemberAssetsGet")]
        public async Task<ActionResult<BusinessMemberAssetsGetResponse>> _BusinessMemberAssetsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5businesses/{business_id}/members/{member_id}/assets")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string memberId)
        {
            var method = this.GetType().GetMethod("BusinessMemberAssetsGet");
            return method != null
                ? (await ((Task<BusinessMemberAssetsGetResponse>)method.Invoke(this, new object[] { req, context, businessId, memberId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessAssetsApi_BusinessMembersAssetAccessDelete")]
        public async Task<ActionResult<DeleteMemberAccessResultsResponseArray>> _BusinessMembersAssetAccessDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5businesses/{business_id}/members/assets/access")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("BusinessMembersAssetAccessDelete");
            return method != null
                ? (await ((Task<DeleteMemberAccessResultsResponseArray>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessAssetsApi_BusinessMembersAssetAccessUpdate")]
        public async Task<ActionResult<UpdateMemberAssetsResultsResponseArray>> _BusinessMembersAssetAccessUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5businesses/{business_id}/members/assets/access")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("BusinessMembersAssetAccessUpdate");
            return method != null
                ? (await ((Task<UpdateMemberAssetsResultsResponseArray>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessAssetsApi_BusinessPartnerAssetAccessGet")]
        public async Task<ActionResult<BusinessPartnerAssetAccessGet200Response>> _BusinessPartnerAssetAccessGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5businesses/{business_id}/partners/{partner_id}/assets")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string partnerId)
        {
            var method = this.GetType().GetMethod("BusinessPartnerAssetAccessGet");
            return method != null
                ? (await ((Task<BusinessPartnerAssetAccessGet200Response>)method.Invoke(this, new object[] { req, context, businessId, partnerId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessAssetsApi_DeletePartnerAssetAccessHandlerImpl")]
        public async Task<ActionResult<DeletePartnerAssetAccessResultsResponseArray>> _DeletePartnerAssetAccessHandlerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5businesses/{business_id}/partners/assets")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("DeletePartnerAssetAccessHandlerImpl");
            return method != null
                ? (await ((Task<DeletePartnerAssetAccessResultsResponseArray>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessAssetsApi_UpdatePartnerAssetAccessHandlerImpl")]
        public async Task<ActionResult<UpdatePartnerAssetsResultsResponseArray>> _UpdatePartnerAssetAccessHandlerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5businesses/{business_id}/partners/assets")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("UpdatePartnerAssetAccessHandlerImpl");
            return method != null
                ? (await ((Task<UpdatePartnerAssetsResultsResponseArray>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
