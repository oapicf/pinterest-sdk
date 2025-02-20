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

#include "AudiencesApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

AudiencesApiImpl::AudiencesApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : AudiencesApi(rtr)
{
}

void AudiencesApiImpl::audiences_create(const std::string &adAccountId, const AudienceCreateRequest &audienceCreateRequest, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void AudiencesApiImpl::audiences_create_custom(const std::string &adAccountId, const AudienceCreateCustomRequest &audienceCreateCustomRequest, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void AudiencesApiImpl::audiences_get(const std::string &adAccountId, const std::string &audienceId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void AudiencesApiImpl::audiences_list(const std::string &adAccountId, const std::optional<std::string> &bookmark, const std::optional<std::string> &order, const std::optional<int32_t> &pageSize, const std::optional<std::string> &ownershipType, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void AudiencesApiImpl::audiences_update(const std::string &adAccountId, const std::string &audienceId, const AudienceUpdateRequest &audienceUpdateRequest, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}

