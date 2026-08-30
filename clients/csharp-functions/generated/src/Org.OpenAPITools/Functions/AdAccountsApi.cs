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
    public partial class AdAccountsApi
    { 
        [FunctionName("AdAccountsApi_AdAccountAnalytics")]
        public async Task<ActionResult<List<AdAccountAnalyticsItems>>> _AdAccountAnalytics([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/analytics")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdAccountAnalytics");
            return method != null
                ? (await ((Task<List<AdAccountAnalyticsItems>>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdAccountsApi_AdAccountTargetingAnalyticsGet")]
        public async Task<ActionResult<MetricsResponse>> _AdAccountTargetingAnalyticsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/targeting_analytics")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdAccountTargetingAnalyticsGet");
            return method != null
                ? (await ((Task<MetricsResponse>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdAccountsApi_AdAccountsCreate")]
        public async Task<ActionResult<AdAccount>> _AdAccountsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AdAccountsCreate");
            return method != null
                ? (await ((Task<AdAccount>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdAccountsApi_AdAccountsGet")]
        public async Task<ActionResult<AdAccount>> _AdAccountsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdAccountsGet");
            return method != null
                ? (await ((Task<AdAccount>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdAccountsApi_AdAccountsList")]
        public async Task<ActionResult<AdAccountsList200Response>> _AdAccountsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AdAccountsList");
            return method != null
                ? (await ((Task<AdAccountsList200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdAccountsApi_AnalyticsCreateConversionProductReport")]
        public async Task<ActionResult<ConversionProductReport>> _AnalyticsCreateConversionProductReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/reports/brand_category_sku")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AnalyticsCreateConversionProductReport");
            return method != null
                ? (await ((Task<ConversionProductReport>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdAccountsApi_AnalyticsCreateMmmReport")]
        public async Task<ActionResult<MMMReport>> _AnalyticsCreateMmmReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/mmm_reports")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AnalyticsCreateMmmReport");
            return method != null
                ? (await ((Task<MMMReport>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdAccountsApi_AnalyticsCreateReport")]
        public async Task<ActionResult<AdsAnalyticsCreateAsyncResponse>> _AnalyticsCreateReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/reports")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AnalyticsCreateReport");
            return method != null
                ? (await ((Task<AdsAnalyticsCreateAsyncResponse>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdAccountsApi_AnalyticsCreateTemplateReport")]
        public async Task<ActionResult<TemplateBasedReport>> _AnalyticsCreateTemplateReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/templates/{template_id}/reports")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId,  [MaxLength(18)]string templateId)
        {
            var method = this.GetType().GetMethod("AnalyticsCreateTemplateReport");
            return method != null
                ? (await ((Task<TemplateBasedReport>)method.Invoke(this, new object[] { req, context, adAccountId, templateId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdAccountsApi_AnalyticsGetConversionProductReport")]
        public async Task<ActionResult<ConversionProductReport>> _AnalyticsGetConversionProductReport([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/reports/brand_category_sku")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AnalyticsGetConversionProductReport");
            return method != null
                ? (await ((Task<ConversionProductReport>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdAccountsApi_AnalyticsGetMmmReport")]
        public async Task<ActionResult<MMMReport>> _AnalyticsGetMmmReport([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/mmm_reports")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AnalyticsGetMmmReport");
            return method != null
                ? (await ((Task<MMMReport>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdAccountsApi_AnalyticsGetReport")]
        public async Task<ActionResult<AdsAnalyticsGetAsyncResponse>> _AnalyticsGetReport([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/reports")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AnalyticsGetReport");
            return method != null
                ? (await ((Task<AdsAnalyticsGetAsyncResponse>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdAccountsApi_SandboxDelete")]
        public async Task<ActionResult<string>> _SandboxDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5ad_accounts/{ad_account_id}/sandbox")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("SandboxDelete");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdAccountsApi_TemplatesList")]
        public async Task<ActionResult<TemplatesList200Response>> _TemplatesList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/templates")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("TemplatesList");
            return method != null
                ? (await ((Task<TemplatesList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
