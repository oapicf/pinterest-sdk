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
    public partial class TrendsApi
    { 
        [FunctionName("TrendsApi_TrendsEditorialArticlesList")]
        public async Task<ActionResult<List<TrendsEditorial>>> _TrendsEditorialArticlesList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5trends/editorial_articles")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("TrendsEditorialArticlesList");
            return method != null
                ? (await ((Task<List<TrendsEditorial>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TrendsApi_TrendsFeaturedTopicsList")]
        public async Task<ActionResult<List<FeaturedTrend>>> _TrendsFeaturedTopicsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5trends/topics/featured")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("TrendsFeaturedTopicsList");
            return method != null
                ? (await ((Task<List<FeaturedTrend>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TrendsApi_TrendsProductCategoriesDetailsList")]
        public async Task<ActionResult<List<ProductCategoryDetails>>> _TrendsProductCategoriesDetailsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5trends/product_categories/details")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("TrendsProductCategoriesDetailsList");
            return method != null
                ? (await ((Task<List<ProductCategoryDetails>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TrendsApi_TrendsProductCategoriesTrendingList")]
        public async Task<ActionResult<List<TrendingProductCategory>>> _TrendsProductCategoriesTrendingList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5trends/product_categories/trending")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("TrendsProductCategoriesTrendingList");
            return method != null
                ? (await ((Task<List<TrendingProductCategory>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
