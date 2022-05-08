/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.3.0
* Contact: pinterest-api@pinterest.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

#include "OauthApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

OauthApiImpl::OauthApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : OauthApi(rtr)
{
}

void OauthApiImpl::oauth_token(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter &response){
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}
