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



#include "CppRestOpenAPIClient/model/CatalogsHotelProductMetadata.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CatalogsHotelProductMetadata::CatalogsHotelProductMetadata()
{
    m_Hotel_id = utility::conversions::to_string_t("");
    m_Hotel_idIsSet = false;
}

CatalogsHotelProductMetadata::~CatalogsHotelProductMetadata()
{
}

void CatalogsHotelProductMetadata::validate()
{
    // TODO: implement validation
}

web::json::value CatalogsHotelProductMetadata::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Hotel_idIsSet)
    {
        val[utility::conversions::to_string_t(U("hotel_id"))] = ModelBase::toJson(m_Hotel_id);
    }

    return val;
}

bool CatalogsHotelProductMetadata::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("hotel_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("hotel_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setHotelId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setHotelId);
            setHotelId(refVal_setHotelId);
        }
    }
    return ok;
}

void CatalogsHotelProductMetadata::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Hotel_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("hotel_id")), m_Hotel_id));
    }
}

bool CatalogsHotelProductMetadata::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("hotel_id"))))
    {
        utility::string_t refVal_setHotelId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("hotel_id"))), refVal_setHotelId );
        setHotelId(refVal_setHotelId);
    }
    return ok;
}

utility::string_t CatalogsHotelProductMetadata::getHotelId() const
{
    return m_Hotel_id;
}

void CatalogsHotelProductMetadata::setHotelId(const utility::string_t& value)
{
    m_Hotel_id = value;
    m_Hotel_idIsSet = true;
}

bool CatalogsHotelProductMetadata::hotelIdIsSet() const
{
    return m_Hotel_idIsSet;
}

void CatalogsHotelProductMetadata::unsetHotel_id()
{
    m_Hotel_idIsSet = false;
}
}
}
}
}


