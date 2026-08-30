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
    public partial class KeywordsApi
    { 
        [FunctionName("KeywordsApi_CountryKeywordsMetricsGet")]
        public async Task<ActionResult<KeywordsMetricsArrayResponse>> _CountryKeywordsMetricsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/keywords/metrics")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("CountryKeywordsMetricsGet");
            return method != null
                ? (await ((Task<KeywordsMetricsArrayResponse>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("KeywordsApi_KeywordsCreate")]
        public async Task<ActionResult<Keywords>> _KeywordsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/keywords")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("KeywordsCreate");
            return method != null
                ? (await ((Task<Keywords>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("KeywordsApi_KeywordsGet")]
        public async Task<ActionResult<KeywordsGet200Response>> _KeywordsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/keywords")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("KeywordsGet");
            return method != null
                ? (await ((Task<KeywordsGet200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("KeywordsApi_KeywordsUpdate")]
        public async Task<ActionResult<Keywords>> _KeywordsUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5ad_accounts/{ad_account_id}/keywords")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("KeywordsUpdate");
            return method != null
                ? (await ((Task<Keywords>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("KeywordsApi_TrendingKeywordsList")]
        public async Task<ActionResult<TrendingKeywordsResponse>> _TrendingKeywordsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5trends/keywords/{region}/top/{trend_type}")]HttpRequest req, ExecutionContext context, TrendsSupportedRegion region, TrendType trendType)
        {
            var method = this.GetType().GetMethod("TrendingKeywordsList");
            return method != null
                ? (await ((Task<TrendingKeywordsResponse>)method.Invoke(this, new object[] { req, context, region, trendType })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
