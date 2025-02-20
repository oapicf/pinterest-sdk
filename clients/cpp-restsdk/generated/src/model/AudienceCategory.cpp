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



#include "CppRestOpenAPIClient/model/AudienceCategory.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



AudienceCategory::AudienceCategory()
{
    m_Key = utility::conversions::to_string_t("");
    m_KeyIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_Ratio = 0.0;
    m_RatioIsSet = false;
    m_Index = 0.0;
    m_IndexIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_SubcategoriesIsSet = false;
}

AudienceCategory::~AudienceCategory()
{
}

void AudienceCategory::validate()
{
    // TODO: implement validation
}

web::json::value AudienceCategory::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_KeyIsSet)
    {
        val[utility::conversions::to_string_t(U("key"))] = ModelBase::toJson(m_Key);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }
    if(m_RatioIsSet)
    {
        val[utility::conversions::to_string_t(U("ratio"))] = ModelBase::toJson(m_Ratio);
    }
    if(m_IndexIsSet)
    {
        val[utility::conversions::to_string_t(U("index"))] = ModelBase::toJson(m_Index);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_SubcategoriesIsSet)
    {
        val[utility::conversions::to_string_t(U("subcategories"))] = ModelBase::toJson(m_Subcategories);
    }

    return val;
}

bool AudienceCategory::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("key"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("key")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setKey;
            ok &= ModelBase::fromJson(fieldValue, refVal_setKey);
            setKey(refVal_setKey);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setName);
            setName(refVal_setName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("ratio"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("ratio")));
        if(!fieldValue.is_null())
        {
            double refVal_setRatio;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRatio);
            setRatio(refVal_setRatio);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("index"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("index")));
        if(!fieldValue.is_null())
        {
            double refVal_setIndex;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIndex);
            setIndex(refVal_setIndex);
        }
    }
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
    if(val.has_field(utility::conversions::to_string_t(U("subcategories"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("subcategories")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<AudienceSubcategory>> refVal_setSubcategories;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSubcategories);
            setSubcategories(refVal_setSubcategories);
        }
    }
    return ok;
}

void AudienceCategory::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_KeyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("key")), m_Key));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
    if(m_RatioIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("ratio")), m_Ratio));
    }
    if(m_IndexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("index")), m_Index));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_SubcategoriesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("subcategories")), m_Subcategories));
    }
}

bool AudienceCategory::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("key"))))
    {
        utility::string_t refVal_setKey;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("key"))), refVal_setKey );
        setKey(refVal_setKey);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_setName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_setName );
        setName(refVal_setName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("ratio"))))
    {
        double refVal_setRatio;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("ratio"))), refVal_setRatio );
        setRatio(refVal_setRatio);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("index"))))
    {
        double refVal_setIndex;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("index"))), refVal_setIndex );
        setIndex(refVal_setIndex);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("subcategories"))))
    {
        std::vector<std::shared_ptr<AudienceSubcategory>> refVal_setSubcategories;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("subcategories"))), refVal_setSubcategories );
        setSubcategories(refVal_setSubcategories);
    }
    return ok;
}

utility::string_t AudienceCategory::getKey() const
{
    return m_Key;
}

void AudienceCategory::setKey(const utility::string_t& value)
{
    m_Key = value;
    m_KeyIsSet = true;
}

bool AudienceCategory::keyIsSet() const
{
    return m_KeyIsSet;
}

void AudienceCategory::unsetKey()
{
    m_KeyIsSet = false;
}
utility::string_t AudienceCategory::getName() const
{
    return m_Name;
}

void AudienceCategory::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool AudienceCategory::nameIsSet() const
{
    return m_NameIsSet;
}

void AudienceCategory::unsetName()
{
    m_NameIsSet = false;
}
double AudienceCategory::getRatio() const
{
    return m_Ratio;
}

void AudienceCategory::setRatio(double value)
{
    m_Ratio = value;
    m_RatioIsSet = true;
}

bool AudienceCategory::ratioIsSet() const
{
    return m_RatioIsSet;
}

void AudienceCategory::unsetRatio()
{
    m_RatioIsSet = false;
}
double AudienceCategory::getIndex() const
{
    return m_Index;
}

void AudienceCategory::setIndex(double value)
{
    m_Index = value;
    m_IndexIsSet = true;
}

bool AudienceCategory::indexIsSet() const
{
    return m_IndexIsSet;
}

void AudienceCategory::unsetIndex()
{
    m_IndexIsSet = false;
}
utility::string_t AudienceCategory::getId() const
{
    return m_Id;
}

void AudienceCategory::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool AudienceCategory::idIsSet() const
{
    return m_IdIsSet;
}

void AudienceCategory::unsetId()
{
    m_IdIsSet = false;
}
std::vector<std::shared_ptr<AudienceSubcategory>>& AudienceCategory::getSubcategories()
{
    return m_Subcategories;
}

void AudienceCategory::setSubcategories(const std::vector<std::shared_ptr<AudienceSubcategory>>& value)
{
    m_Subcategories = value;
    m_SubcategoriesIsSet = true;
}

bool AudienceCategory::subcategoriesIsSet() const
{
    return m_SubcategoriesIsSet;
}

void AudienceCategory::unsetSubcategories()
{
    m_SubcategoriesIsSet = false;
}
}
}
}
}


