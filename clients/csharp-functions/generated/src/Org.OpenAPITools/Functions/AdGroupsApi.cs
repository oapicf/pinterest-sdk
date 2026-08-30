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
    public partial class AdGroupsApi
    { 
        [FunctionName("AdGroupsApi_AdGroupsAnalytics")]
        public async Task<ActionResult<List<AdGroupsAnalyticsMetrics>>> _AdGroupsAnalytics([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ad_groups/analytics")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdGroupsAnalytics");
            return method != null
                ? (await ((Task<List<AdGroupsAnalyticsMetrics>>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdGroupsApi_AdGroupsAudienceSizing")]
        public async Task<ActionResult<AdGroupAudienceSizing>> _AdGroupsAudienceSizing([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/ad_groups/audience_sizing")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdGroupsAudienceSizing");
            return method != null
                ? (await ((Task<AdGroupAudienceSizing>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdGroupsApi_AdGroupsBidFloorGet")]
        public async Task<ActionResult<BidFloor>> _AdGroupsBidFloorGet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/bid_floor")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdGroupsBidFloorGet");
            return method != null
                ? (await ((Task<BidFloor>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdGroupsApi_AdGroupsCreate")]
        public async Task<ActionResult<AdGroupsCreate200Response>> _AdGroupsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/ad_groups")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdGroupsCreate");
            return method != null
                ? (await ((Task<AdGroupsCreate200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdGroupsApi_AdGroupsDynamicTitlesDownloadCsv")]
        public async Task<ActionResult<DynamicTitlesDownloadCSV>> _AdGroupsDynamicTitlesDownloadCsv([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, [RegularExpression("^\\d+$")] [MaxLength(18)]string adGroupId)
        {
            var method = this.GetType().GetMethod("AdGroupsDynamicTitlesDownloadCsv");
            return method != null
                ? (await ((Task<DynamicTitlesDownloadCSV>)method.Invoke(this, new object[] { req, context, adAccountId, adGroupId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdGroupsApi_AdGroupsDynamicTitlesGetStatus")]
        public async Task<ActionResult<DynamicTitlesGetStatus>> _AdGroupsDynamicTitlesGetStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, [RegularExpression("^\\d+$")] [MaxLength(18)]string adGroupId)
        {
            var method = this.GetType().GetMethod("AdGroupsDynamicTitlesGetStatus");
            return method != null
                ? (await ((Task<DynamicTitlesGetStatus>)method.Invoke(this, new object[] { req, context, adAccountId, adGroupId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdGroupsApi_AdGroupsDynamicTitlesGetUploadUrl")]
        public async Task<ActionResult<DynamicTitlesUploadURL>> _AdGroupsDynamicTitlesGetUploadUrl([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, [RegularExpression("^\\d+$")] [MaxLength(18)]string adGroupId)
        {
            var method = this.GetType().GetMethod("AdGroupsDynamicTitlesGetUploadUrl");
            return method != null
                ? (await ((Task<DynamicTitlesUploadURL>)method.Invoke(this, new object[] { req, context, adAccountId, adGroupId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdGroupsApi_AdGroupsDynamicTitlesProcessCsv")]
        public async Task<ActionResult<DynamicTitlesProcessCSV>> _AdGroupsDynamicTitlesProcessCsv([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, [RegularExpression("^\\d+$")] [MaxLength(18)]string adGroupId)
        {
            var method = this.GetType().GetMethod("AdGroupsDynamicTitlesProcessCsv");
            return method != null
                ? (await ((Task<DynamicTitlesProcessCSV>)method.Invoke(this, new object[] { req, context, adAccountId, adGroupId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdGroupsApi_AdGroupsGet")]
        public async Task<ActionResult<AdGroup>> _AdGroupsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adGroupId, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdGroupsGet");
            return method != null
                ? (await ((Task<AdGroup>)method.Invoke(this, new object[] { req, context, adGroupId, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdGroupsApi_AdGroupsList")]
        public async Task<ActionResult<AdGroupsList200Response>> _AdGroupsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ad_groups")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdGroupsList");
            return method != null
                ? (await ((Task<AdGroupsList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdGroupsApi_AdGroupsTargetingAnalyticsGet")]
        public async Task<ActionResult<MetricsResponse>> _AdGroupsTargetingAnalyticsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ad_groups/targeting_analytics")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdGroupsTargetingAnalyticsGet");
            return method != null
                ? (await ((Task<MetricsResponse>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdGroupsApi_AdGroupsUpdate")]
        public async Task<ActionResult<AdGroupsCreate200Response>> _AdGroupsUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5ad_accounts/{ad_account_id}/ad_groups")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdGroupsUpdate");
            return method != null
                ? (await ((Task<AdGroupsCreate200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdGroupsApi_GetAdGroupsByPromotionIdsList")]
        public async Task<ActionResult<AdGroupsList200Response>> _GetAdGroupsByPromotionIdsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/promotion_applied_entities")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("GetAdGroupsByPromotionIdsList");
            return method != null
                ? (await ((Task<AdGroupsList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
