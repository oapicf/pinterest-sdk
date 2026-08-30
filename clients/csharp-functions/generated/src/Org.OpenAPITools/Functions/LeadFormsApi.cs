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
    public partial class LeadFormsApi
    { 
        [FunctionName("LeadFormsApi_LeadFormGet")]
        public async Task<ActionResult<LeadForm>> _LeadFormGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string leadFormId, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("LeadFormGet");
            return method != null
                ? (await ((Task<LeadForm>)method.Invoke(this, new object[] { req, context, leadFormId, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LeadFormsApi_LeadFormTestCreate")]
        public async Task<ActionResult<LeadFormTest>> _LeadFormTestCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, [RegularExpression("^\\d+$")]string leadFormId)
        {
            var method = this.GetType().GetMethod("LeadFormTestCreate");
            return method != null
                ? (await ((Task<LeadFormTest>)method.Invoke(this, new object[] { req, context, adAccountId, leadFormId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LeadFormsApi_LeadFormsCreate")]
        public async Task<ActionResult<LeadFormsCreate200Response>> _LeadFormsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/lead_forms")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("LeadFormsCreate");
            return method != null
                ? (await ((Task<LeadFormsCreate200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LeadFormsApi_LeadFormsList")]
        public async Task<ActionResult<LeadFormsList200Response>> _LeadFormsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/lead_forms")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("LeadFormsList");
            return method != null
                ? (await ((Task<LeadFormsList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LeadFormsApi_LeadFormsUpdate")]
        public async Task<ActionResult<LeadFormsCreate200Response>> _LeadFormsUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5ad_accounts/{ad_account_id}/lead_forms")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("LeadFormsUpdate");
            return method != null
                ? (await ((Task<LeadFormsCreate200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
