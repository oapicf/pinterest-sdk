/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * AudienceInsightsApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_AudienceInsightsApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_AudienceInsightsApi_H_



#include "CppRestOpenAPIClient/ApiClient.h"

#include "CppRestOpenAPIClient/model/AudienceDefinitionResponse.h"
#include "CppRestOpenAPIClient/model/AudienceInsightType.h"
#include "CppRestOpenAPIClient/model/AudienceInsightsResponse.h"
#include "CppRestOpenAPIClient/model/Error.h"
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  AudienceInsightsApi 
{
public:

    explicit AudienceInsightsApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~AudienceInsightsApi();

    /// <summary>
    /// Get audience insights scope and type
    /// </summary>
    /// <remarks>
    /// Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    pplx::task<std::shared_ptr<AudienceDefinitionResponse>> audienceInsightsScopeAndType_get(
        utility::string_t adAccountId
    ) const;
    /// <summary>
    /// Get audience insights
    /// </summary>
    /// <remarks>
    /// Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account&#39;s engaged audience on Pinterest, the ad account&#39;s total audience on Pinterest and Pinterest&#39;s total audience.&lt;p/&gt; &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-insights\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Learn more about Audience Insights&lt;/a&gt;.
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    /// <param name="audienceInsightType">Type of audience insights.</param>
    pplx::task<std::shared_ptr<AudienceInsightsResponse>> audienceInsights_get(
        utility::string_t adAccountId,
        std::shared_ptr<AudienceInsightType> audienceInsightType
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_AudienceInsightsApi_H_ */

