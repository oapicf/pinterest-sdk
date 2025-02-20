/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

#include "AudienceInsightsApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

AudienceInsightsApiImpl::AudienceInsightsApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : AudienceInsightsApi(rtr)
{
}

void AudienceInsightsApiImpl::audience_insights_scope_and_type_get(const std::string &adAccountId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void AudienceInsightsApiImpl::audience_insights_get(const std::string &adAccountId, const std::optional<org::openapitools::server::model::AudienceInsightType> &audienceInsightType, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}

