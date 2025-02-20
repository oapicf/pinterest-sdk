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



#include "CppRestOpenAPIClient/model/CatalogsCreativeAssetsProductGroupFiltersAnyOf.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CatalogsCreativeAssetsProductGroupFiltersAnyOf::CatalogsCreativeAssetsProductGroupFiltersAnyOf()
{
    m_Any_ofIsSet = false;
}

CatalogsCreativeAssetsProductGroupFiltersAnyOf::~CatalogsCreativeAssetsProductGroupFiltersAnyOf()
{
}

void CatalogsCreativeAssetsProductGroupFiltersAnyOf::validate()
{
    // TODO: implement validation
}

web::json::value CatalogsCreativeAssetsProductGroupFiltersAnyOf::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Any_ofIsSet)
    {
        val[utility::conversions::to_string_t(U("any_of"))] = ModelBase::toJson(m_Any_of);
    }

    return val;
}

bool CatalogsCreativeAssetsProductGroupFiltersAnyOf::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("any_of"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("any_of")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<CatalogsCreativeAssetsProductGroupFilterKeys>> refVal_setAnyOf;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAnyOf);
            setAnyOf(refVal_setAnyOf);
        }
    }
    return ok;
}

void CatalogsCreativeAssetsProductGroupFiltersAnyOf::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Any_ofIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("any_of")), m_Any_of));
    }
}

bool CatalogsCreativeAssetsProductGroupFiltersAnyOf::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("any_of"))))
    {
        std::vector<std::shared_ptr<CatalogsCreativeAssetsProductGroupFilterKeys>> refVal_setAnyOf;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("any_of"))), refVal_setAnyOf );
        setAnyOf(refVal_setAnyOf);
    }
    return ok;
}

std::vector<std::shared_ptr<CatalogsCreativeAssetsProductGroupFilterKeys>>& CatalogsCreativeAssetsProductGroupFiltersAnyOf::getAnyOf()
{
    return m_Any_of;
}

void CatalogsCreativeAssetsProductGroupFiltersAnyOf::setAnyOf(const std::vector<std::shared_ptr<CatalogsCreativeAssetsProductGroupFilterKeys>>& value)
{
    m_Any_of = value;
    m_Any_ofIsSet = true;
}

bool CatalogsCreativeAssetsProductGroupFiltersAnyOf::anyOfIsSet() const
{
    return m_Any_ofIsSet;
}

void CatalogsCreativeAssetsProductGroupFiltersAnyOf::unsetAny_of()
{
    m_Any_ofIsSet = false;
}
}
}
}
}


