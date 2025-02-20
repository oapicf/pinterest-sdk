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
 * SSIOInsertionOrderStatus.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_SSIOInsertionOrderStatus_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_SSIOInsertionOrderStatus_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  SSIOInsertionOrderStatus
    : public ModelBase
{
public:
    SSIOInsertionOrderStatus();
    virtual ~SSIOInsertionOrderStatus();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// SSIOInsertionOrderStatus members

    /// <summary>
    /// Salesforce order id
    /// </summary>
    utility::string_t getPinOrderId() const;
    bool pinOrderIdIsSet() const;
    void unsetPin_order_id();

    void setPinOrderId(const utility::string_t& value);

    /// <summary>
    /// Salesforce insertion order status
    /// </summary>
    utility::string_t getStatus() const;
    bool statusIsSet() const;
    void unsetStatus();

    void setStatus(const utility::string_t& value);

    /// <summary>
    /// Salesforce insertion order creation time
    /// </summary>
    utility::string_t getCreationTime() const;
    bool creationTimeIsSet() const;
    void unsetCreation_time();

    void setCreationTime(const utility::string_t& value);


protected:
    utility::string_t m_Pin_order_id;
    bool m_Pin_order_idIsSet;
    utility::string_t m_Status;
    bool m_StatusIsSet;
    utility::string_t m_Creation_time;
    bool m_Creation_timeIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_SSIOInsertionOrderStatus_H_ */
