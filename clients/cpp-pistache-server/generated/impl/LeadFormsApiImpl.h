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
* LeadFormsApiImpl.h
*
* 
*/

#ifndef LEAD_FORMS_API_IMPL_H_
#define LEAD_FORMS_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <LeadFormsApi.h>


#include "Error.h"
#include "LeadFormResponse.h"
#include "LeadFormTestRequest.h"
#include "LeadFormTestResponse.h"
#include "Lead_forms_list_200_response.h"
#include <string>

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class  LeadFormsApiImpl : public org::openapitools::server::api::LeadFormsApi {
public:
    explicit LeadFormsApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~LeadFormsApiImpl() override = default;

    void lead_form_test_create(const std::string &adAccountId, const std::string &leadFormId, const LeadFormTestRequest &leadFormTestRequest, Pistache::Http::ResponseWriter &response);
    void lead_form_get(const std::string &adAccountId, const std::string &leadFormId, Pistache::Http::ResponseWriter &response);
    void lead_forms_list(const std::string &adAccountId, const std::optional<int32_t> &pageSize, const std::optional<std::string> &order, const std::optional<std::string> &bookmark, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif