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



#include "CppRestOpenAPIClient/model/KeywordUpdate.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



KeywordUpdate::KeywordUpdate()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Archived = false;
    m_ArchivedIsSet = false;
    m_Bid = 0;
    m_BidIsSet = false;
}

KeywordUpdate::~KeywordUpdate()
{
}

void KeywordUpdate::validate()
{
    // TODO: implement validation
}

web::json::value KeywordUpdate::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_ArchivedIsSet)
    {
        val[utility::conversions::to_string_t(U("archived"))] = ModelBase::toJson(m_Archived);
    }
    if(m_BidIsSet)
    {
        val[utility::conversions::to_string_t(U("bid"))] = ModelBase::toJson(m_Bid);
    }

    return val;
}

bool KeywordUpdate::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("archived"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("archived")));
        if(!fieldValue.is_null())
        {
            bool refVal_setArchived;
            ok &= ModelBase::fromJson(fieldValue, refVal_setArchived);
            setArchived(refVal_setArchived);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("bid"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("bid")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setBid;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBid);
            setBid(refVal_setBid);
        }
    }
    return ok;
}

void KeywordUpdate::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_ArchivedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("archived")), m_Archived));
    }
    if(m_BidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("bid")), m_Bid));
    }
}

bool KeywordUpdate::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("archived"))))
    {
        bool refVal_setArchived;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("archived"))), refVal_setArchived );
        setArchived(refVal_setArchived);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("bid"))))
    {
        int32_t refVal_setBid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("bid"))), refVal_setBid );
        setBid(refVal_setBid);
    }
    return ok;
}

utility::string_t KeywordUpdate::getId() const
{
    return m_Id;
}

void KeywordUpdate::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool KeywordUpdate::idIsSet() const
{
    return m_IdIsSet;
}

void KeywordUpdate::unsetId()
{
    m_IdIsSet = false;
}
bool KeywordUpdate::isArchived() const
{
    return m_Archived;
}

void KeywordUpdate::setArchived(bool value)
{
    m_Archived = value;
    m_ArchivedIsSet = true;
}

bool KeywordUpdate::archivedIsSet() const
{
    return m_ArchivedIsSet;
}

void KeywordUpdate::unsetArchived()
{
    m_ArchivedIsSet = false;
}
int32_t KeywordUpdate::getBid() const
{
    return m_Bid;
}

void KeywordUpdate::setBid(int32_t value)
{
    m_Bid = value;
    m_BidIsSet = true;
}

bool KeywordUpdate::bidIsSet() const
{
    return m_BidIsSet;
}

void KeywordUpdate::unsetBid()
{
    m_BidIsSet = false;
}
}
}
}
}


