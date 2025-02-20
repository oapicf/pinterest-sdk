/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class IntegrationsApiController : ControllerBase
    { 
        /// <summary>
        /// Delete commerce integration
        /// </summary>
        /// <remarks>Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.</remarks>
        /// <param name="externalBusinessId">External business ID for the integration.</param>
        /// <response code="204">Commerce Integration deleted successfully</response>
        /// <response code="0">Unexpected error.</response>
        [HttpDelete]
        [Route("/v5/integrations/commerce/{external_business_id}")]
        [ValidateModelState]
        [SwaggerOperation("IntegrationsCommerceDel")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "Unexpected error.")]
        public virtual IActionResult IntegrationsCommerceDel([FromRoute (Name = "external_business_id")][Required]string externalBusinessId)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get commerce integration
        /// </summary>
        /// <remarks>Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.</remarks>
        /// <param name="externalBusinessId">External business ID for the integration.</param>
        /// <response code="200">Success</response>
        /// <response code="404">Integration not found.</response>
        /// <response code="409">Can&#39;t access this integration metadata.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v5/integrations/commerce/{external_business_id}")]
        [ValidateModelState]
        [SwaggerOperation("IntegrationsCommerceGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(IntegrationMetadata), description: "Success")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "Integration not found.")]
        [SwaggerResponse(statusCode: 409, type: typeof(Error), description: "Can&#39;t access this integration metadata.")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "Unexpected error.")]
        public virtual IActionResult IntegrationsCommerceGet([FromRoute (Name = "external_business_id")][Required]string externalBusinessId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(IntegrationMetadata));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409, default(Error));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"id\" : \"7329167449607351372\",\n  \"external_business_id\" : \"1238401984\",\n  \"connected_merchant_id\" : \"1445572885401\",\n  \"connected_user_id\" : \"871939315263957401\",\n  \"connected_advertiser_id\" : \"549764738871\",\n  \"connected_lba_id\" : \"871939315263957402\",\n  \"connected_tag_id\" : \"2412141155151\",\n  \"partner_access_token_expiry\" : 1621350033000,\n  \"partner_refresh_token_expiry\" : 1621350033000,\n  \"scopes\" : \"accounts:read\",\n  \"created_timestamp\" : 1621350033000,\n  \"updated_timestamp\" : 1621350033000,\n  \"additional_id_1\" : \"128464\",\n  \"partner_metadata\" : \"\"\n}";
            exampleJson = "{\n  \"code\" : 0,\n  \"message\" : \"message\"\n}";
            exampleJson = "{\n  \"code\" : 0,\n  \"message\" : \"message\"\n}";
            exampleJson = "{\n  \"code\" : 0,\n  \"message\" : \"message\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<IntegrationMetadata>(exampleJson)
            : default(IntegrationMetadata);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update commerce integration
        /// </summary>
        /// <remarks>Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.</remarks>
        /// <param name="externalBusinessId">External business ID for the integration.</param>
        /// <param name="integrationRequestPatch">Parameters to get create/update the Integration Metadata</param>
        /// <response code="200">Success</response>
        /// <response code="404">Integration not found.</response>
        /// <response code="409">Can&#39;t access this integration metadata.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPatch]
        [Route("/v5/integrations/commerce/{external_business_id}")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("IntegrationsCommercePatch")]
        [SwaggerResponse(statusCode: 200, type: typeof(IntegrationMetadata), description: "Success")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "Integration not found.")]
        [SwaggerResponse(statusCode: 409, type: typeof(Error), description: "Can&#39;t access this integration metadata.")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "Unexpected error.")]
        public virtual IActionResult IntegrationsCommercePatch([FromRoute (Name = "external_business_id")][Required]string externalBusinessId, [FromBody]IntegrationRequestPatch integrationRequestPatch)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(IntegrationMetadata));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409, default(Error));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"id\" : \"7329167449607351372\",\n  \"external_business_id\" : \"1238401984\",\n  \"connected_merchant_id\" : \"1445572885401\",\n  \"connected_user_id\" : \"871939315263957401\",\n  \"connected_advertiser_id\" : \"549764738871\",\n  \"connected_lba_id\" : \"871939315263957402\",\n  \"connected_tag_id\" : \"2412141155151\",\n  \"partner_access_token_expiry\" : 1621350033000,\n  \"partner_refresh_token_expiry\" : 1621350033000,\n  \"scopes\" : \"accounts:read\",\n  \"created_timestamp\" : 1621350033000,\n  \"updated_timestamp\" : 1621350033000,\n  \"additional_id_1\" : \"128464\",\n  \"partner_metadata\" : \"\"\n}";
            exampleJson = "{\n  \"code\" : 0,\n  \"message\" : \"message\"\n}";
            exampleJson = "{\n  \"code\" : 0,\n  \"message\" : \"message\"\n}";
            exampleJson = "{\n  \"code\" : 0,\n  \"message\" : \"message\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<IntegrationMetadata>(exampleJson)
            : default(IntegrationMetadata);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Create commerce integration
        /// </summary>
        /// <remarks>Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.</remarks>
        /// <param name="integrationRequest">Parameters to get create/update the Integration Metadata</param>
        /// <response code="200">Success</response>
        /// <response code="404">Integration not found.</response>
        /// <response code="409">Can&#39;t access this integration metadata.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v5/integrations/commerce")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("IntegrationsCommercePost")]
        [SwaggerResponse(statusCode: 200, type: typeof(IntegrationMetadata), description: "Success")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "Integration not found.")]
        [SwaggerResponse(statusCode: 409, type: typeof(Error), description: "Can&#39;t access this integration metadata.")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "Unexpected error.")]
        public virtual IActionResult IntegrationsCommercePost([FromBody]IntegrationRequest integrationRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(IntegrationMetadata));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409, default(Error));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"id\" : \"7329167449607351372\",\n  \"external_business_id\" : \"1238401984\",\n  \"connected_merchant_id\" : \"1445572885401\",\n  \"connected_user_id\" : \"871939315263957401\",\n  \"connected_advertiser_id\" : \"549764738871\",\n  \"connected_lba_id\" : \"871939315263957402\",\n  \"connected_tag_id\" : \"2412141155151\",\n  \"partner_access_token_expiry\" : 1621350033000,\n  \"partner_refresh_token_expiry\" : 1621350033000,\n  \"scopes\" : \"accounts:read\",\n  \"created_timestamp\" : 1621350033000,\n  \"updated_timestamp\" : 1621350033000,\n  \"additional_id_1\" : \"128464\",\n  \"partner_metadata\" : \"\"\n}";
            exampleJson = "{\n  \"code\" : 0,\n  \"message\" : \"message\"\n}";
            exampleJson = "{\n  \"code\" : 0,\n  \"message\" : \"message\"\n}";
            exampleJson = "{\n  \"code\" : 0,\n  \"message\" : \"message\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<IntegrationMetadata>(exampleJson)
            : default(IntegrationMetadata);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get integration metadata
        /// </summary>
        /// <remarks>Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.</remarks>
        /// <param name="id">Integration ID.</param>
        /// <response code="200">Success</response>
        /// <response code="404">Integration not found.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v5/integrations/{id}")]
        [ValidateModelState]
        [SwaggerOperation("IntegrationsGetById")]
        [SwaggerResponse(statusCode: 200, type: typeof(IntegrationRecord), description: "Success")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "Integration not found.")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "Unexpected error.")]
        public virtual IActionResult IntegrationsGetById([FromRoute (Name = "id")][Required]string id)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(IntegrationRecord));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"id\" : \"7329123456789012345\",\n  \"external_business_id\" : \"1234567890\",\n  \"connected_merchant_id\" : \"1234567890123\",\n  \"connected_user_id\" : \"123456789012345678\",\n  \"connected_advertiser_id\" : \"123456789012\",\n  \"connected_lba_id\" : \"871234567890123456\",\n  \"connected_tag_id\" : \"2412345678901\",\n  \"partner_access_token\" : \"ABCLUOJS5XDMWDE\",\n  \"partner_refresh_token\" : \"ABCLUOJS5XDMWDE\",\n  \"partner_primary_email\" : \"partner@server.com\",\n  \"partner_access_token_expiry\" : 1621350033000,\n  \"partner_refresh_token_expiry\" : 1621350033000,\n  \"scopes\" : \"accounts:read\",\n  \"partner_metadata\" : \"\",\n  \"additional_id_1\" : \"123456\",\n  \"created_time\" : 1621350033000,\n  \"updated_time\" : 1621350033000\n}";
            exampleJson = "{\n  \"code\" : 0,\n  \"message\" : \"message\"\n}";
            exampleJson = "{\n  \"code\" : 0,\n  \"message\" : \"message\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<IntegrationRecord>(exampleJson)
            : default(IntegrationRecord);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get integration metadata list
        /// </summary>
        /// <remarks>Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.</remarks>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <response code="200">Success</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v5/integrations")]
        [ValidateModelState]
        [SwaggerOperation("IntegrationsGetList")]
        [SwaggerResponse(statusCode: 200, type: typeof(IntegrationsGetList200Response), description: "Success")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "Unexpected error.")]
        public virtual IActionResult IntegrationsGetList([FromQuery (Name = "bookmark")]string bookmark, [FromQuery (Name = "page_size")][Range(1, 250)]int? pageSize)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(IntegrationsGetList200Response));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"bookmark\" : \"bookmark\",\n  \"items\" : [ {\n    \"id\" : \"7329123456789012345\",\n    \"external_business_id\" : \"1234567890\",\n    \"connected_merchant_id\" : \"1234567890123\",\n    \"connected_user_id\" : \"123456789012345678\",\n    \"connected_advertiser_id\" : \"123456789012\",\n    \"connected_lba_id\" : \"871234567890123456\",\n    \"connected_tag_id\" : \"2412345678901\",\n    \"partner_access_token\" : \"ABCLUOJS5XDMWDE\",\n    \"partner_refresh_token\" : \"ABCLUOJS5XDMWDE\",\n    \"partner_primary_email\" : \"partner@server.com\",\n    \"partner_access_token_expiry\" : 1621350033000,\n    \"partner_refresh_token_expiry\" : 1621350033000,\n    \"scopes\" : \"accounts:read\",\n    \"partner_metadata\" : \"\",\n    \"additional_id_1\" : \"123456\",\n    \"created_time\" : 1621350033000,\n    \"updated_time\" : 1621350033000\n  }, {\n    \"id\" : \"7329123456789012345\",\n    \"external_business_id\" : \"1234567890\",\n    \"connected_merchant_id\" : \"1234567890123\",\n    \"connected_user_id\" : \"123456789012345678\",\n    \"connected_advertiser_id\" : \"123456789012\",\n    \"connected_lba_id\" : \"871234567890123456\",\n    \"connected_tag_id\" : \"2412345678901\",\n    \"partner_access_token\" : \"ABCLUOJS5XDMWDE\",\n    \"partner_refresh_token\" : \"ABCLUOJS5XDMWDE\",\n    \"partner_primary_email\" : \"partner@server.com\",\n    \"partner_access_token_expiry\" : 1621350033000,\n    \"partner_refresh_token_expiry\" : 1621350033000,\n    \"scopes\" : \"accounts:read\",\n    \"partner_metadata\" : \"\",\n    \"additional_id_1\" : \"123456\",\n    \"created_time\" : 1621350033000,\n    \"updated_time\" : 1621350033000\n  } ]\n}";
            exampleJson = "{\n  \"code\" : 0,\n  \"message\" : \"message\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<IntegrationsGetList200Response>(exampleJson)
            : default(IntegrationsGetList200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Receives batched logs from integration applications.
        /// </summary>
        /// <remarks>This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.</remarks>
        /// <param name="integrationLogsRequest">Ingest log information from external integration application.</param>
        /// <response code="200">Success.</response>
        /// <response code="400">Bad request.</response>
        /// <response code="0">Unexpected error</response>
        [HttpPost]
        [Route("/v5/integrations/logs")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("IntegrationsLogsPost")]
        [SwaggerResponse(statusCode: 200, type: typeof(IntegrationLogsSuccessResponse), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(DetailedError), description: "Bad request.")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "Unexpected error")]
        public virtual IActionResult IntegrationsLogsPost([FromBody]IntegrationLogsRequest integrationLogsRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(IntegrationLogsSuccessResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(DetailedError));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"message\" : \"message\"\n}";
            exampleJson = "{\n  \"code\" : 1,\n  \"details\" : \"{}\",\n  \"message\" : \"message\"\n}";
            exampleJson = "{\n  \"code\" : 0,\n  \"message\" : \"message\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<IntegrationLogsSuccessResponse>(exampleJson)
            : default(IntegrationLogsSuccessResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
