/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

/*
* AudienceInsightsApiImpl.h
*
* 
*/

#ifndef AUDIENCE_INSIGHTS_API_IMPL_H_
#define AUDIENCE_INSIGHTS_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <AudienceInsightsApi.h>


#include "AudienceDefinitionResponse.h"
#include "AudienceInsightType.h"
#include "AudienceInsightsResponse.h"
#include "Error.h"
#include <string>

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class  AudienceInsightsApiImpl : public org::openapitools::server::api::AudienceInsightsApi {
public:
    explicit AudienceInsightsApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~AudienceInsightsApiImpl() override = default;

    void audience_insights_scope_and_type_get(const std::string &adAccountId, Pistache::Http::ResponseWriter &response);
    void audience_insights_get(const std::string &adAccountId, const std::optional<AudienceInsightType> &audienceInsightType, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif