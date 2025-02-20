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



#include "CppRestOpenAPIClient/model/HotelIdFilter.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



HotelIdFilter::HotelIdFilter()
{
    m_HOTEL_IDIsSet = false;
}

HotelIdFilter::~HotelIdFilter()
{
}

void HotelIdFilter::validate()
{
    // TODO: implement validation
}

web::json::value HotelIdFilter::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_HOTEL_IDIsSet)
    {
        val[utility::conversions::to_string_t(U("HOTEL_ID"))] = ModelBase::toJson(m_HOTEL_ID);
    }

    return val;
}

bool HotelIdFilter::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("HOTEL_ID"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("HOTEL_ID")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> refVal_setHOTELID;
            ok &= ModelBase::fromJson(fieldValue, refVal_setHOTELID);
            setHOTELID(refVal_setHOTELID);
        }
    }
    return ok;
}

void HotelIdFilter::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_HOTEL_IDIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("HOTEL_ID")), m_HOTEL_ID));
    }
}

bool HotelIdFilter::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("HOTEL_ID"))))
    {
        std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> refVal_setHOTELID;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("HOTEL_ID"))), refVal_setHOTELID );
        setHOTELID(refVal_setHOTELID);
    }
    return ok;
}

std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> HotelIdFilter::getHOTELID() const
{
    return m_HOTEL_ID;
}

void HotelIdFilter::setHOTELID(const std::shared_ptr<CatalogsProductGroupMultipleStringCriteria>& value)
{
    m_HOTEL_ID = value;
    m_HOTEL_IDIsSet = true;
}

bool HotelIdFilter::hOTELIDIsSet() const
{
    return m_HOTEL_IDIsSet;
}

void HotelIdFilter::unsetHOTEL_ID()
{
    m_HOTEL_IDIsSet = false;
}
}
}
}
}


