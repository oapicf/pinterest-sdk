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

/*
* TargetingTemplateApiImpl.h
*
* 
*/

#ifndef TARGETING_TEMPLATE_API_IMPL_H_
#define TARGETING_TEMPLATE_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <TargetingTemplateApi.h>


#include "Error.h"
#include "TargetingTemplateCreate.h"
#include "TargetingTemplateGetResponseData.h"
#include "TargetingTemplateUpdateRequest.h"
#include "Targeting_template_list_200_response.h"
#include <string>

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class  TargetingTemplateApiImpl : public org::openapitools::server::api::TargetingTemplateApi {
public:
    explicit TargetingTemplateApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~TargetingTemplateApiImpl() override = default;

    void targeting_template_create(const std::string &adAccountId, const TargetingTemplateCreate &targetingTemplateCreate, Pistache::Http::ResponseWriter &response);
    void targeting_template_list(const std::string &adAccountId, const std::optional<std::string> &order, const std::optional<bool> &includeSizing, const std::optional<std::string> &searchQuery, const std::optional<int32_t> &pageSize, const std::optional<std::string> &bookmark, Pistache::Http::ResponseWriter &response);
    void targeting_template_update(const std::string &adAccountId, const TargetingTemplateUpdateRequest &targetingTemplateUpdateRequest, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
