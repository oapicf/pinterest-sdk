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
    public partial class ConversionTagsApi
    { 
        [FunctionName("ConversionTagsApi_ConversionTagsCreate")]
        public async Task<ActionResult<ConversionTag>> _ConversionTagsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/conversion_tags")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("ConversionTagsCreate");
            return method != null
                ? (await ((Task<ConversionTag>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConversionTagsApi_ConversionTagsGet")]
        public async Task<ActionResult<ConversionTag>> _ConversionTagsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, [RegularExpression("^\\d+$")] [MaxLength(18)]string conversionTagId)
        {
            var method = this.GetType().GetMethod("ConversionTagsGet");
            return method != null
                ? (await ((Task<ConversionTag>)method.Invoke(this, new object[] { req, context, adAccountId, conversionTagId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConversionTagsApi_ConversionTagsList")]
        public async Task<ActionResult<ConversionTagsList200Response>> _ConversionTagsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/conversion_tags")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("ConversionTagsList");
            return method != null
                ? (await ((Task<ConversionTagsList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConversionTagsApi_OcpmEligibleConversionTagsGet")]
        public async Task<ActionResult<Dictionary<string, List<ConversionEventResponse>>>> _OcpmEligibleConversionTagsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("OcpmEligibleConversionTagsGet");
            return method != null
                ? (await ((Task<Dictionary<string, List<ConversionEventResponse>>>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConversionTagsApi_PageVisitConversionTagsGet")]
        public async Task<ActionResult<PageVisitConversionTagsGet200Response>> _PageVisitConversionTagsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/conversion_tags/page_visit")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("PageVisitConversionTagsGet");
            return method != null
                ? (await ((Task<PageVisitConversionTagsGet200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
