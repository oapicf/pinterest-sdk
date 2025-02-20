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



#include "CppRestOpenAPIClient/model/SSIOInsertionOrderStatusResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



SSIOInsertionOrderStatusResponse::SSIOInsertionOrderStatusResponse()
{
    m_Pin_order_id = utility::conversions::to_string_t("");
    m_Pin_order_idIsSet = false;
    m_Status = utility::conversions::to_string_t("");
    m_StatusIsSet = false;
    m_Creation_time = utility::conversions::to_string_t("");
    m_Creation_timeIsSet = false;
}

SSIOInsertionOrderStatusResponse::~SSIOInsertionOrderStatusResponse()
{
}

void SSIOInsertionOrderStatusResponse::validate()
{
    // TODO: implement validation
}

web::json::value SSIOInsertionOrderStatusResponse::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Pin_order_idIsSet)
    {
        val[utility::conversions::to_string_t(U("pin_order_id"))] = ModelBase::toJson(m_Pin_order_id);
    }
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t(U("status"))] = ModelBase::toJson(m_Status);
    }
    if(m_Creation_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("creation_time"))] = ModelBase::toJson(m_Creation_time);
    }

    return val;
}

bool SSIOInsertionOrderStatusResponse::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("pin_order_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("pin_order_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPinOrderId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPinOrderId);
            setPinOrderId(refVal_setPinOrderId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("status"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("status")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setStatus;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStatus);
            setStatus(refVal_setStatus);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("creation_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("creation_time")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCreationTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreationTime);
            setCreationTime(refVal_setCreationTime);
        }
    }
    return ok;
}

void SSIOInsertionOrderStatusResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Pin_order_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pin_order_id")), m_Pin_order_id));
    }
    if(m_StatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("status")), m_Status));
    }
    if(m_Creation_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("creation_time")), m_Creation_time));
    }
}

bool SSIOInsertionOrderStatusResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("pin_order_id"))))
    {
        utility::string_t refVal_setPinOrderId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pin_order_id"))), refVal_setPinOrderId );
        setPinOrderId(refVal_setPinOrderId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("status"))))
    {
        utility::string_t refVal_setStatus;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("status"))), refVal_setStatus );
        setStatus(refVal_setStatus);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("creation_time"))))
    {
        utility::string_t refVal_setCreationTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("creation_time"))), refVal_setCreationTime );
        setCreationTime(refVal_setCreationTime);
    }
    return ok;
}

utility::string_t SSIOInsertionOrderStatusResponse::getPinOrderId() const
{
    return m_Pin_order_id;
}

void SSIOInsertionOrderStatusResponse::setPinOrderId(const utility::string_t& value)
{
    m_Pin_order_id = value;
    m_Pin_order_idIsSet = true;
}

bool SSIOInsertionOrderStatusResponse::pinOrderIdIsSet() const
{
    return m_Pin_order_idIsSet;
}

void SSIOInsertionOrderStatusResponse::unsetPin_order_id()
{
    m_Pin_order_idIsSet = false;
}
utility::string_t SSIOInsertionOrderStatusResponse::getStatus() const
{
    return m_Status;
}

void SSIOInsertionOrderStatusResponse::setStatus(const utility::string_t& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool SSIOInsertionOrderStatusResponse::statusIsSet() const
{
    return m_StatusIsSet;
}

void SSIOInsertionOrderStatusResponse::unsetStatus()
{
    m_StatusIsSet = false;
}
utility::string_t SSIOInsertionOrderStatusResponse::getCreationTime() const
{
    return m_Creation_time;
}

void SSIOInsertionOrderStatusResponse::setCreationTime(const utility::string_t& value)
{
    m_Creation_time = value;
    m_Creation_timeIsSet = true;
}

bool SSIOInsertionOrderStatusResponse::creationTimeIsSet() const
{
    return m_Creation_timeIsSet;
}

void SSIOInsertionOrderStatusResponse::unsetCreation_time()
{
    m_Creation_timeIsSet = false;
}
}
}
}
}


