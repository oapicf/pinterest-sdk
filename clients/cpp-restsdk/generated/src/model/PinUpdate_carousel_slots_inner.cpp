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



#include "CppRestOpenAPIClient/model/PinUpdate_carousel_slots_inner.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



PinUpdate_carousel_slots_inner::PinUpdate_carousel_slots_inner()
{
    m_Title = utility::conversions::to_string_t("");
    m_TitleIsSet = false;
    m_Description = utility::conversions::to_string_t("");
    m_DescriptionIsSet = false;
    m_Link = utility::conversions::to_string_t("");
    m_LinkIsSet = false;
}

PinUpdate_carousel_slots_inner::~PinUpdate_carousel_slots_inner()
{
}

void PinUpdate_carousel_slots_inner::validate()
{
    // TODO: implement validation
}

web::json::value PinUpdate_carousel_slots_inner::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_TitleIsSet)
    {
        val[utility::conversions::to_string_t(U("title"))] = ModelBase::toJson(m_Title);
    }
    if(m_DescriptionIsSet)
    {
        val[utility::conversions::to_string_t(U("description"))] = ModelBase::toJson(m_Description);
    }
    if(m_LinkIsSet)
    {
        val[utility::conversions::to_string_t(U("link"))] = ModelBase::toJson(m_Link);
    }

    return val;
}

bool PinUpdate_carousel_slots_inner::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("title"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("title")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTitle;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTitle);
            setTitle(refVal_setTitle);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("description"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("description")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDescription;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDescription);
            setDescription(refVal_setDescription);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("link"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("link")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLink;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLink);
            setLink(refVal_setLink);
        }
    }
    return ok;
}

void PinUpdate_carousel_slots_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_TitleIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("title")), m_Title));
    }
    if(m_DescriptionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("description")), m_Description));
    }
    if(m_LinkIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("link")), m_Link));
    }
}

bool PinUpdate_carousel_slots_inner::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("title"))))
    {
        utility::string_t refVal_setTitle;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("title"))), refVal_setTitle );
        setTitle(refVal_setTitle);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("description"))))
    {
        utility::string_t refVal_setDescription;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("description"))), refVal_setDescription );
        setDescription(refVal_setDescription);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("link"))))
    {
        utility::string_t refVal_setLink;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("link"))), refVal_setLink );
        setLink(refVal_setLink);
    }
    return ok;
}

utility::string_t PinUpdate_carousel_slots_inner::getTitle() const
{
    return m_Title;
}

void PinUpdate_carousel_slots_inner::setTitle(const utility::string_t& value)
{
    m_Title = value;
    m_TitleIsSet = true;
}

bool PinUpdate_carousel_slots_inner::titleIsSet() const
{
    return m_TitleIsSet;
}

void PinUpdate_carousel_slots_inner::unsetTitle()
{
    m_TitleIsSet = false;
}
utility::string_t PinUpdate_carousel_slots_inner::getDescription() const
{
    return m_Description;
}

void PinUpdate_carousel_slots_inner::setDescription(const utility::string_t& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}

bool PinUpdate_carousel_slots_inner::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}

void PinUpdate_carousel_slots_inner::unsetDescription()
{
    m_DescriptionIsSet = false;
}
utility::string_t PinUpdate_carousel_slots_inner::getLink() const
{
    return m_Link;
}

void PinUpdate_carousel_slots_inner::setLink(const utility::string_t& value)
{
    m_Link = value;
    m_LinkIsSet = true;
}

bool PinUpdate_carousel_slots_inner::linkIsSet() const
{
    return m_LinkIsSet;
}

void PinUpdate_carousel_slots_inner::unsetLink()
{
    m_LinkIsSet = false;
}
}
}
}
}


