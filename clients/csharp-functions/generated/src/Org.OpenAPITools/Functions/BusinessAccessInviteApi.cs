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
    public partial class BusinessAccessInviteApi
    { 
        [FunctionName("BusinessAccessInviteApi_AssetAccessRequestsCreate")]
        public async Task<ActionResult<CreateAssetAccessRequestResponse>> _AssetAccessRequestsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5businesses/{business_id}/requests/assets/access")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("AssetAccessRequestsCreate");
            return method != null
                ? (await ((Task<CreateAssetAccessRequestResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessInviteApi_CancelInvitesOrRequests")]
        public async Task<ActionResult<CancelInvitesResponse>> _CancelInvitesOrRequests([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5businesses/{business_id}/invites")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MinLength(1)]string businessId)
        {
            var method = this.GetType().GetMethod("CancelInvitesOrRequests");
            return method != null
                ? (await ((Task<CancelInvitesResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessInviteApi_CreateAssetInvites")]
        public async Task<ActionResult<UpdateInvitesResultsResponseArray>> _CreateAssetInvites([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5businesses/{business_id}/invites/assets/access")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("CreateAssetInvites");
            return method != null
                ? (await ((Task<UpdateInvitesResultsResponseArray>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessInviteApi_CreateMembershipOrPartnershipInvites")]
        public async Task<ActionResult<CreateInvitesResultsResponseArray>> _CreateMembershipOrPartnershipInvites([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5businesses/{business_id}/invites")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MinLength(1)]string businessId)
        {
            var method = this.GetType().GetMethod("CreateMembershipOrPartnershipInvites");
            return method != null
                ? (await ((Task<CreateInvitesResultsResponseArray>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessInviteApi_GetInvites")]
        public async Task<ActionResult<GetInvites200Response>> _GetInvites([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5businesses/{business_id}/invites")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MinLength(1)]string businessId)
        {
            var method = this.GetType().GetMethod("GetInvites");
            return method != null
                ? (await ((Task<GetInvites200Response>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessInviteApi_RespondBusinessAccessInvites")]
        public async Task<ActionResult<RespondToInvitesResponseArray>> _RespondBusinessAccessInvites([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5businesses/invites")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("RespondBusinessAccessInvites");
            return method != null
                ? (await ((Task<RespondToInvitesResponseArray>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
