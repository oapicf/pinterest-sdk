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
    public partial class CatalogProductGroupsApi
    { 
        [FunctionName("CatalogProductGroupsApi_CatalogsProductGroupPinsList")]
        public async Task<ActionResult<CatalogsProductGroupPinsList200Response>> _CatalogsProductGroupPinsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5catalogs/product_groups/{product_group_id}/products")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string productGroupId)
        {
            var method = this.GetType().GetMethod("CatalogsProductGroupPinsList");
            return method != null
                ? (await ((Task<CatalogsProductGroupPinsList200Response>)method.Invoke(this, new object[] { req, context, productGroupId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogProductGroupsApi_CatalogsProductGroupsCreate")]
        public async Task<ActionResult<CatalogsVerticalProductGroup>> _CatalogsProductGroupsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5catalogs/product_groups")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CatalogsProductGroupsCreate");
            return method != null
                ? (await ((Task<CatalogsVerticalProductGroup>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogProductGroupsApi_CatalogsProductGroupsCreateMany")]
        public async Task<ActionResult<List<string>>> _CatalogsProductGroupsCreateMany([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5catalogs/product_groups/multiple")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CatalogsProductGroupsCreateMany");
            return method != null
                ? (await ((Task<List<string>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogProductGroupsApi_CatalogsProductGroupsDelete")]
        public async Task<ActionResult<CatalogsVerticalProductGroup>> _CatalogsProductGroupsDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5catalogs/product_groups/{product_group_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string productGroupId)
        {
            var method = this.GetType().GetMethod("CatalogsProductGroupsDelete");
            return method != null
                ? (await ((Task<CatalogsVerticalProductGroup>)method.Invoke(this, new object[] { req, context, productGroupId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogProductGroupsApi_CatalogsProductGroupsDeleteMany")]
        public async Task<ActionResult<>> _CatalogsProductGroupsDeleteMany([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5catalogs/product_groups/multiple")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CatalogsProductGroupsDeleteMany");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogProductGroupsApi_CatalogsProductGroupsGet")]
        public async Task<ActionResult<CatalogsVerticalProductGroup>> _CatalogsProductGroupsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5catalogs/product_groups/{product_group_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string productGroupId)
        {
            var method = this.GetType().GetMethod("CatalogsProductGroupsGet");
            return method != null
                ? (await ((Task<CatalogsVerticalProductGroup>)method.Invoke(this, new object[] { req, context, productGroupId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogProductGroupsApi_CatalogsProductGroupsList")]
        public async Task<ActionResult<CatalogsProductGroupsList200Response>> _CatalogsProductGroupsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5catalogs/product_groups")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CatalogsProductGroupsList");
            return method != null
                ? (await ((Task<CatalogsProductGroupsList200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogProductGroupsApi_CatalogsProductGroupsProductCountsGet")]
        public async Task<ActionResult<CatalogsProductGroupProductCountsVertical>> _CatalogsProductGroupsProductCountsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5catalogs/product_groups/{product_group_id}/product_counts")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string productGroupId)
        {
            var method = this.GetType().GetMethod("CatalogsProductGroupsProductCountsGet");
            return method != null
                ? (await ((Task<CatalogsProductGroupProductCountsVertical>)method.Invoke(this, new object[] { req, context, productGroupId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogProductGroupsApi_CatalogsProductGroupsUpdate")]
        public async Task<ActionResult<CatalogsVerticalProductGroup>> _CatalogsProductGroupsUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5catalogs/product_groups/{product_group_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string productGroupId)
        {
            var method = this.GetType().GetMethod("CatalogsProductGroupsUpdate");
            return method != null
                ? (await ((Task<CatalogsVerticalProductGroup>)method.Invoke(this, new object[] { req, context, productGroupId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogProductGroupsApi_ProductsByProductGroupFilterList")]
        public async Task<ActionResult<CatalogsProductGroupPinsList200Response>> _ProductsByProductGroupFilterList([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5catalogs/products/get_by_product_group_filters")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ProductsByProductGroupFilterList");
            return method != null
                ? (await ((Task<CatalogsProductGroupPinsList200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
