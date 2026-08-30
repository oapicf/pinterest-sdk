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
    public partial class BusinessAccessRelationshipsApi
    { 
        [FunctionName("BusinessAccessRelationshipsApi_BrandAccountsCreate")]
        public async Task<ActionResult<BrandAccount>> _BrandAccountsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessHierarchyId)
        {
            var method = this.GetType().GetMethod("BrandAccountsCreate");
            return method != null
                ? (await ((Task<BrandAccount>)method.Invoke(this, new object[] { req, context, businessHierarchyId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessRelationshipsApi_BrandAccountsUpdate")]
        public async Task<ActionResult<BrandAccount>> _BrandAccountsUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}")]HttpRequest req, ExecutionContext context, string brandAccountId, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessHierarchyId)
        {
            var method = this.GetType().GetMethod("BrandAccountsUpdate");
            return method != null
                ? (await ((Task<BrandAccount>)method.Invoke(this, new object[] { req, context, brandAccountId, businessHierarchyId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessRelationshipsApi_DeleteBusinessMembership")]
        public async Task<ActionResult<DeleteBusinessMembership200Response>> _DeleteBusinessMembership([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5businesses/{business_id}/members")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("DeleteBusinessMembership");
            return method != null
                ? (await ((Task<DeleteBusinessMembership200Response>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessRelationshipsApi_DeleteBusinessPartners")]
        public async Task<ActionResult<DeleteBusinessPartners>> _DeleteBusinessPartners([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5businesses/{business_id}/partners")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("DeleteBusinessPartners");
            return method != null
                ? (await ((Task<DeleteBusinessPartners>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessRelationshipsApi_GetBusinessEmployers")]
        public async Task<ActionResult<GetBusinessEmployers200Response>> _GetBusinessEmployers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5businesses/employers")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetBusinessEmployers");
            return method != null
                ? (await ((Task<GetBusinessEmployers200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessRelationshipsApi_GetBusinessMembers")]
        public async Task<ActionResult<GetBusinessEmployers200Response>> _GetBusinessMembers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5businesses/{business_id}/members")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("GetBusinessMembers");
            return method != null
                ? (await ((Task<GetBusinessEmployers200Response>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessRelationshipsApi_GetBusinessPartners")]
        public async Task<ActionResult<GetBusinessEmployers200Response>> _GetBusinessPartners([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5businesses/{business_id}/partners")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("GetBusinessPartners");
            return method != null
                ? (await ((Task<GetBusinessEmployers200Response>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessRelationshipsApi_SystemUserUpdate")]
        public async Task<ActionResult<>> _SystemUserUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5businesses/{business_id}/system_users/{system_user_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string systemUserId)
        {
            var method = this.GetType().GetMethod("SystemUserUpdate");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, businessId, systemUserId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessAccessRelationshipsApi_UpdateBusinessMemberships")]
        public async Task<ActionResult<UpdateBusinessMembershipsResponse>> _UpdateBusinessMemberships([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5businesses/{business_id}/members")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("UpdateBusinessMemberships");
            return method != null
                ? (await ((Task<UpdateBusinessMembershipsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
