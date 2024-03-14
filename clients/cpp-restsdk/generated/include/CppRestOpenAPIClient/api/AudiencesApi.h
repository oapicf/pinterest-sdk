/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * AudiencesApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_AudiencesApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_AudiencesApi_H_



#include "CppRestOpenAPIClient/ApiClient.h"

#include "CppRestOpenAPIClient/model/Audience.h"
#include "CppRestOpenAPIClient/model/AudienceCreateRequest.h"
#include "CppRestOpenAPIClient/model/AudienceUpdateRequest.h"
#include "CppRestOpenAPIClient/model/Audiences_list_200_response.h"
#include "CppRestOpenAPIClient/model/Error.h"
#include <vector>
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  AudiencesApi 
{
public:

    explicit AudiencesApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~AudiencesApi();

    /// <summary>
    /// Create audience
    /// </summary>
    /// <remarks>
    /// Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    /// <param name="audienceCreateRequest">List of ads to create, size limit [1, 30]</param>
    pplx::task<std::shared_ptr<Audience>> audiences_create(
        utility::string_t adAccountId,
        std::shared_ptr<AudienceCreateRequest> audienceCreateRequest
    ) const;
    /// <summary>
    /// Get audience
    /// </summary>
    /// <remarks>
    /// Get a specific audience given the audience ID.
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    /// <param name="audienceId">Unique identifier of an audience</param>
    pplx::task<std::shared_ptr<Audience>> audiences_get(
        utility::string_t adAccountId,
        utility::string_t audienceId
    ) const;
    /// <summary>
    /// List audiences
    /// </summary>
    /// <remarks>
    /// Get list of audiences for the ad account.
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    /// <param name="bookmark">Cursor used to fetch the next page of items (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="entityStatuses">Entity status (optional, default to std::vector&lt;std::shared_ptr&lt;utility::string_t&gt;&gt;())</param>
    /// <param name="order">The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 0)</param>
    pplx::task<std::shared_ptr<Audiences_list_200_response>> audiences_list(
        utility::string_t adAccountId,
        boost::optional<utility::string_t> bookmark,
        boost::optional<std::vector<utility::string_t>> entityStatuses,
        boost::optional<utility::string_t> order,
        boost::optional<int32_t> pageSize
    ) const;
    /// <summary>
    /// Update audience
    /// </summary>
    /// <remarks>
    /// Update (edit or remove) an existing targeting audience.
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    /// <param name="audienceId">Unique identifier of an audience</param>
    /// <param name="audienceUpdateRequest">The audience to be updated. (optional)</param>
    pplx::task<std::shared_ptr<Audience>> audiences_update(
        utility::string_t adAccountId,
        utility::string_t audienceId,
        boost::optional<std::shared_ptr<AudienceUpdateRequest>> audienceUpdateRequest
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_AudiencesApi_H_ */
