/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CatalogsProductGroupUpdateRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




CatalogsProductGroupUpdateRequest::CatalogsProductGroupUpdateRequest()
{
    m_Feed_id = utility::conversions::to_string_t("");
    m_Feed_idIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_Description = utility::conversions::to_string_t("");
    m_DescriptionIsSet = false;
    m_FiltersIsSet = false;
}

CatalogsProductGroupUpdateRequest::~CatalogsProductGroupUpdateRequest()
{
}

void CatalogsProductGroupUpdateRequest::validate()
{
    // TODO: implement validation
}

web::json::value CatalogsProductGroupUpdateRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Feed_idIsSet)
    {
        val[utility::conversions::to_string_t(U("feed_id"))] = ModelBase::toJson(m_Feed_id);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }
    if(m_DescriptionIsSet)
    {
        val[utility::conversions::to_string_t(U("description"))] = ModelBase::toJson(m_Description);
    }
    if(m_FiltersIsSet)
    {
        val[utility::conversions::to_string_t(U("filters"))] = ModelBase::toJson(m_Filters);
    }

    return val;
}

bool CatalogsProductGroupUpdateRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("feed_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("feed_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_feed_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_feed_id);
            setFeedId(refVal_feed_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_name;
            ok &= ModelBase::fromJson(fieldValue, refVal_name);
            setName(refVal_name);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("description"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("description")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_description;
            ok &= ModelBase::fromJson(fieldValue, refVal_description);
            setDescription(refVal_description);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("filters"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("filters")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<CatalogsProductGroupFilters> refVal_filters;
            ok &= ModelBase::fromJson(fieldValue, refVal_filters);
            setFilters(refVal_filters);
        }
    }
    return ok;
}

void CatalogsProductGroupUpdateRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Feed_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("feed_id")), m_Feed_id));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
    if(m_DescriptionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("description")), m_Description));
    }
    if(m_FiltersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("filters")), m_Filters));
    }
}

bool CatalogsProductGroupUpdateRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("feed_id"))))
    {
        utility::string_t refVal_feed_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("feed_id"))), refVal_feed_id );
        setFeedId(refVal_feed_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_name;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_name );
        setName(refVal_name);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("description"))))
    {
        utility::string_t refVal_description;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("description"))), refVal_description );
        setDescription(refVal_description);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("filters"))))
    {
        std::shared_ptr<CatalogsProductGroupFilters> refVal_filters;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("filters"))), refVal_filters );
        setFilters(refVal_filters);
    }
    return ok;
}

utility::string_t CatalogsProductGroupUpdateRequest::getFeedId() const
{
    return m_Feed_id;
}

void CatalogsProductGroupUpdateRequest::setFeedId(const utility::string_t& value)
{
    m_Feed_id = value;
    m_Feed_idIsSet = true;
}

bool CatalogsProductGroupUpdateRequest::feedIdIsSet() const
{
    return m_Feed_idIsSet;
}

void CatalogsProductGroupUpdateRequest::unsetFeed_id()
{
    m_Feed_idIsSet = false;
}
utility::string_t CatalogsProductGroupUpdateRequest::getName() const
{
    return m_Name;
}

void CatalogsProductGroupUpdateRequest::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool CatalogsProductGroupUpdateRequest::nameIsSet() const
{
    return m_NameIsSet;
}

void CatalogsProductGroupUpdateRequest::unsetName()
{
    m_NameIsSet = false;
}
utility::string_t CatalogsProductGroupUpdateRequest::getDescription() const
{
    return m_Description;
}

void CatalogsProductGroupUpdateRequest::setDescription(const utility::string_t& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}

bool CatalogsProductGroupUpdateRequest::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}

void CatalogsProductGroupUpdateRequest::unsetDescription()
{
    m_DescriptionIsSet = false;
}
std::shared_ptr<CatalogsProductGroupFilters> CatalogsProductGroupUpdateRequest::getFilters() const
{
    return m_Filters;
}

void CatalogsProductGroupUpdateRequest::setFilters(const std::shared_ptr<CatalogsProductGroupFilters>& value)
{
    m_Filters = value;
    m_FiltersIsSet = true;
}

bool CatalogsProductGroupUpdateRequest::filtersIsSet() const
{
    return m_FiltersIsSet;
}

void CatalogsProductGroupUpdateRequest::unsetFilters()
{
    m_FiltersIsSet = false;
}
}
}
}
}

