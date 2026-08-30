#ifndef TINY_CPP_CLIENT_AudienceInsightsApi_H_
#define TINY_CPP_CLIENT_AudienceInsightsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AudienceInsightType.h"
#include "AudienceInsights.h"
#include "Audience_insights_scope_and_type_get_200_response.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class AudienceInsightsApi : public Service {
public:
    AudienceInsightsApi() = default;

    virtual ~AudienceInsightsApi();

    /**
    * Get audience insights scope and type.
    *
    * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                Audience_insights_scope_and_type_get_200_response
        >
    audienceInsightsScopeAndType_get(
            
            std::string adAccountId
            
    );
    /**
    * Get audience insights.
    *
    * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.  [Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param audienceInsightType Type of audience insights. *Required*
    */
    Response<
                AudienceInsights
        >
    audienceInsights_get(
            
            std::string adAccountId
            , 
            
            AudienceInsightType audienceInsightType
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_AudienceInsightsApi_H_ */