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
 * LeadFormTestRequest.h
 *
 * Request to create test data for lead data test API.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_LeadFormTestRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_LeadFormTestRequest_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Request to create test data for lead data test API.
/// </summary>
class  LeadFormTestRequest
    : public ModelBase
{
public:
    LeadFormTestRequest();
    virtual ~LeadFormTestRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// LeadFormTestRequest members

    /// <summary>
    /// Test lead answers. Should follow the creation order.
    /// </summary>
    std::vector<utility::string_t>& getAnswers();
    bool answersIsSet() const;
    void unsetAnswers();

    void setAnswers(const std::vector<utility::string_t>& value);


protected:
    std::vector<utility::string_t> m_Answers;
    bool m_AnswersIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_LeadFormTestRequest_H_ */
