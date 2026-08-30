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
    public partial class AudienceSharingApi
    { 
        [FunctionName("AudienceSharingApi_AdAccountsAudiencesSharedAccountsList")]
        public async Task<ActionResult<AdAccountsAudiencesSharedAccountsList200Response>> _AdAccountsAudiencesSharedAccountsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/audiences/shared/accounts")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdAccountsAudiencesSharedAccountsList");
            return method != null
                ? (await ((Task<AdAccountsAudiencesSharedAccountsList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceSharingApi_BusinessAccountAudiencesSharedAccountsList")]
        public async Task<ActionResult<AdAccountsAudiencesSharedAccountsList200Response>> _BusinessAccountAudiencesSharedAccountsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5businesses/{business_id}/audiences/shared/accounts")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("BusinessAccountAudiencesSharedAccountsList");
            return method != null
                ? (await ((Task<AdAccountsAudiencesSharedAccountsList200Response>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceSharingApi_SharedAudiencesForBusinessList")]
        public async Task<ActionResult<SharedAudiencesForBusinessList200Response>> _SharedAudiencesForBusinessList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5businesses/{business_id}/audiences")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("SharedAudiencesForBusinessList");
            return method != null
                ? (await ((Task<SharedAudiencesForBusinessList200Response>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceSharingApi_UpdateAdAccountToAdAccountSharedAudience")]
        public async Task<ActionResult<AdAccountToAdAccountSharedAudience>> _UpdateAdAccountToAdAccountSharedAudience([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5ad_accounts/{ad_account_id}/audiences/ad_accounts/shared")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("UpdateAdAccountToAdAccountSharedAudience");
            return method != null
                ? (await ((Task<AdAccountToAdAccountSharedAudience>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceSharingApi_UpdateAdAccountToBusinessSharedAudience")]
        public async Task<ActionResult<AdAccountToBusinessSharedAudience>> _UpdateAdAccountToBusinessSharedAudience([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5ad_accounts/{ad_account_id}/audiences/businesses/shared")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("UpdateAdAccountToBusinessSharedAudience");
            return method != null
                ? (await ((Task<AdAccountToBusinessSharedAudience>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceSharingApi_UpdateBusinessToAdAccountSharedAudience")]
        public async Task<ActionResult<BusinessToAdAccountSharedAudience>> _UpdateBusinessToAdAccountSharedAudience([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5businesses/{business_id}/audiences/ad_accounts/shared")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("UpdateBusinessToAdAccountSharedAudience");
            return method != null
                ? (await ((Task<BusinessToAdAccountSharedAudience>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceSharingApi_UpdateBusinessToBusinessSharedAudience")]
        public async Task<ActionResult<BusinessToBusinessSharedAudience>> _UpdateBusinessToBusinessSharedAudience([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5businesses/{business_id}/audiences/businesses/shared")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")][StringLength(20, MinimumLength=1)]string businessId)
        {
            var method = this.GetType().GetMethod("UpdateBusinessToBusinessSharedAudience");
            return method != null
                ? (await ((Task<BusinessToBusinessSharedAudience>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
