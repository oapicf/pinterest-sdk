/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Client.Auth;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IProductGroupsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get catalog product groups
        /// </summary>
        /// <remarks>
        /// This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="feedProfileId">The feed profile id whose catalog product groups we want to return. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>AdAccountsCatalogsProductGroupsList200Response</returns>
        [Obsolete]
        AdAccountsCatalogsProductGroupsList200Response AdAccountsCatalogsProductGroupsList(string adAccountId, string? feedProfileId = default(string?), int operationIndex = 0);

        /// <summary>
        /// Get catalog product groups
        /// </summary>
        /// <remarks>
        /// This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="feedProfileId">The feed profile id whose catalog product groups we want to return. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of AdAccountsCatalogsProductGroupsList200Response</returns>
        [Obsolete]
        ApiResponse<AdAccountsCatalogsProductGroupsList200Response> AdAccountsCatalogsProductGroupsListWithHttpInfo(string adAccountId, string? feedProfileId = default(string?), int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IProductGroupsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get catalog product groups
        /// </summary>
        /// <remarks>
        /// This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="feedProfileId">The feed profile id whose catalog product groups we want to return. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of AdAccountsCatalogsProductGroupsList200Response</returns>
        [Obsolete]
        System.Threading.Tasks.Task<AdAccountsCatalogsProductGroupsList200Response> AdAccountsCatalogsProductGroupsListAsync(string adAccountId, string? feedProfileId = default(string?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get catalog product groups
        /// </summary>
        /// <remarks>
        /// This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="feedProfileId">The feed profile id whose catalog product groups we want to return. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (AdAccountsCatalogsProductGroupsList200Response)</returns>
        [Obsolete]
        System.Threading.Tasks.Task<ApiResponse<AdAccountsCatalogsProductGroupsList200Response>> AdAccountsCatalogsProductGroupsListWithHttpInfoAsync(string adAccountId, string? feedProfileId = default(string?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IProductGroupsApi : IProductGroupsApiSync, IProductGroupsApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class ProductGroupsApi : IProductGroupsApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="ProductGroupsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ProductGroupsApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ProductGroupsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ProductGroupsApi(string basePath)
        {
            this.Configuration = Org.OpenAPITools.Client.Configuration.MergeConfigurations(
                Org.OpenAPITools.Client.GlobalConfiguration.Instance,
                new Org.OpenAPITools.Client.Configuration { BasePath = basePath }
            );
            this.Client = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ProductGroupsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ProductGroupsApi(Org.OpenAPITools.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = Org.OpenAPITools.Client.Configuration.MergeConfigurations(
                Org.OpenAPITools.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ProductGroupsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public ProductGroupsApi(Org.OpenAPITools.Client.ISynchronousClient client, Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public Org.OpenAPITools.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public Org.OpenAPITools.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Org.OpenAPITools.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Org.OpenAPITools.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Get catalog product groups This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="feedProfileId">The feed profile id whose catalog product groups we want to return. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>AdAccountsCatalogsProductGroupsList200Response</returns>
        [Obsolete]
        public AdAccountsCatalogsProductGroupsList200Response AdAccountsCatalogsProductGroupsList(string adAccountId, string? feedProfileId = default(string?), int operationIndex = 0)
        {
            Org.OpenAPITools.Client.ApiResponse<AdAccountsCatalogsProductGroupsList200Response> localVarResponse = AdAccountsCatalogsProductGroupsListWithHttpInfo(adAccountId, feedProfileId);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get catalog product groups This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="feedProfileId">The feed profile id whose catalog product groups we want to return. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of AdAccountsCatalogsProductGroupsList200Response</returns>
        [Obsolete]
        public Org.OpenAPITools.Client.ApiResponse<AdAccountsCatalogsProductGroupsList200Response> AdAccountsCatalogsProductGroupsListWithHttpInfo(string adAccountId, string? feedProfileId = default(string?), int operationIndex = 0)
        {
            // verify the required parameter 'adAccountId' is set
            if (adAccountId == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'adAccountId' when calling ProductGroupsApi->AdAccountsCatalogsProductGroupsList");
            }

            Org.OpenAPITools.Client.RequestOptions localVarRequestOptions = new Org.OpenAPITools.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("ad_account_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(adAccountId)); // path parameter
            if (feedProfileId != null)
            {
                localVarRequestOptions.QueryParameters.Add(Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "feed_profile_id", feedProfileId));
            }

            localVarRequestOptions.Operation = "ProductGroupsApi.AdAccountsCatalogsProductGroupsList";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (pinterest_oauth2) required
            // oauth required
            if (!localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                if (!string.IsNullOrEmpty(this.Configuration.AccessToken))
                {
                    localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
                }
                else if (!string.IsNullOrEmpty(this.Configuration.OAuthTokenUrl) &&
                         !string.IsNullOrEmpty(this.Configuration.OAuthClientId) &&
                         !string.IsNullOrEmpty(this.Configuration.OAuthClientSecret) &&
                         this.Configuration.OAuthFlow != null)
                {
                    localVarRequestOptions.OAuth = true;
                }
            }

            // make the HTTP request
            var localVarResponse = this.Client.Get<AdAccountsCatalogsProductGroupsList200Response>("/ad_accounts/{ad_account_id}/product_groups/catalogs", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("AdAccountsCatalogsProductGroupsList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get catalog product groups This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="feedProfileId">The feed profile id whose catalog product groups we want to return. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of AdAccountsCatalogsProductGroupsList200Response</returns>
        [Obsolete]
        public async System.Threading.Tasks.Task<AdAccountsCatalogsProductGroupsList200Response> AdAccountsCatalogsProductGroupsListAsync(string adAccountId, string? feedProfileId = default(string?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Org.OpenAPITools.Client.ApiResponse<AdAccountsCatalogsProductGroupsList200Response> localVarResponse = await AdAccountsCatalogsProductGroupsListWithHttpInfoAsync(adAccountId, feedProfileId, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get catalog product groups This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="feedProfileId">The feed profile id whose catalog product groups we want to return. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (AdAccountsCatalogsProductGroupsList200Response)</returns>
        [Obsolete]
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<AdAccountsCatalogsProductGroupsList200Response>> AdAccountsCatalogsProductGroupsListWithHttpInfoAsync(string adAccountId, string? feedProfileId = default(string?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'adAccountId' is set
            if (adAccountId == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'adAccountId' when calling ProductGroupsApi->AdAccountsCatalogsProductGroupsList");
            }


            Org.OpenAPITools.Client.RequestOptions localVarRequestOptions = new Org.OpenAPITools.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("ad_account_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(adAccountId)); // path parameter
            if (feedProfileId != null)
            {
                localVarRequestOptions.QueryParameters.Add(Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "feed_profile_id", feedProfileId));
            }

            localVarRequestOptions.Operation = "ProductGroupsApi.AdAccountsCatalogsProductGroupsList";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (pinterest_oauth2) required
            // oauth required
            if (!localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                if (!string.IsNullOrEmpty(this.Configuration.AccessToken))
                {
                    localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
                }
                else if (!string.IsNullOrEmpty(this.Configuration.OAuthTokenUrl) &&
                         !string.IsNullOrEmpty(this.Configuration.OAuthClientId) &&
                         !string.IsNullOrEmpty(this.Configuration.OAuthClientSecret) &&
                         this.Configuration.OAuthFlow != null)
                {
                    localVarRequestOptions.OAuth = true;
                }
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<AdAccountsCatalogsProductGroupsList200Response>("/ad_accounts/{ad_account_id}/product_groups/catalogs", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("AdAccountsCatalogsProductGroupsList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}