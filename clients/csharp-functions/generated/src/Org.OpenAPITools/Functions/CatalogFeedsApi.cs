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
    public partial class CatalogFeedsApi
    { 
        [FunctionName("CatalogFeedsApi_FeedProcessingResultsList")]
        public async Task<ActionResult<FeedProcessingResultsList200Response>> _FeedProcessingResultsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5catalogs/feeds/{feed_id}/processing_results")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string feedId)
        {
            var method = this.GetType().GetMethod("FeedProcessingResultsList");
            return method != null
                ? (await ((Task<FeedProcessingResultsList200Response>)method.Invoke(this, new object[] { req, context, feedId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogFeedsApi_FeedsCreate")]
        public async Task<ActionResult<CatalogsFeed>> _FeedsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5catalogs/feeds")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("FeedsCreate");
            return method != null
                ? (await ((Task<CatalogsFeed>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogFeedsApi_FeedsDelete")]
        public async Task<ActionResult<CatalogsFeed>> _FeedsDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5catalogs/feeds/{feed_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string feedId)
        {
            var method = this.GetType().GetMethod("FeedsDelete");
            return method != null
                ? (await ((Task<CatalogsFeed>)method.Invoke(this, new object[] { req, context, feedId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogFeedsApi_FeedsGet")]
        public async Task<ActionResult<CatalogsFeed>> _FeedsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5catalogs/feeds/{feed_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string feedId)
        {
            var method = this.GetType().GetMethod("FeedsGet");
            return method != null
                ? (await ((Task<CatalogsFeed>)method.Invoke(this, new object[] { req, context, feedId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogFeedsApi_FeedsIngest")]
        public async Task<ActionResult<CatalogsFeedIngestion>> _FeedsIngest([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5catalogs/feeds/{feed_id}/ingest")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string feedId)
        {
            var method = this.GetType().GetMethod("FeedsIngest");
            return method != null
                ? (await ((Task<CatalogsFeedIngestion>)method.Invoke(this, new object[] { req, context, feedId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogFeedsApi_FeedsList")]
        public async Task<ActionResult<FeedsList200Response>> _FeedsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5catalogs/feeds")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("FeedsList");
            return method != null
                ? (await ((Task<FeedsList200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogFeedsApi_FeedsUpdate")]
        public async Task<ActionResult<CatalogsFeed>> _FeedsUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5catalogs/feeds/{feed_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string feedId)
        {
            var method = this.GetType().GetMethod("FeedsUpdate");
            return method != null
                ? (await ((Task<CatalogsFeed>)method.Invoke(this, new object[] { req, context, feedId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogFeedsApi_ItemsIssuesList")]
        public async Task<ActionResult<ItemsIssuesList200Response>> _ItemsIssuesList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5catalogs/processing_results/{processing_result_id}/item_issues")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string processingResultId)
        {
            var method = this.GetType().GetMethod("ItemsIssuesList");
            return method != null
                ? (await ((Task<ItemsIssuesList200Response>)method.Invoke(this, new object[] { req, context, processingResultId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
