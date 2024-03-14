/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/MaxPriceFilter.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



MaxPriceFilter::MaxPriceFilter()
{
    m_MAX_PRICEIsSet = false;
}

MaxPriceFilter::~MaxPriceFilter()
{
}

void MaxPriceFilter::validate()
{
    // TODO: implement validation
}

web::json::value MaxPriceFilter::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_MAX_PRICEIsSet)
    {
        val[utility::conversions::to_string_t(U("MAX_PRICE"))] = ModelBase::toJson(m_MAX_PRICE);
    }

    return val;
}

bool MaxPriceFilter::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("MAX_PRICE"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("MAX_PRICE")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<CatalogsProductGroupPricingCriteria> refVal_setMAXPRICE;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMAXPRICE);
            setMAXPRICE(refVal_setMAXPRICE);
        }
    }
    return ok;
}

void MaxPriceFilter::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_MAX_PRICEIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("MAX_PRICE")), m_MAX_PRICE));
    }
}

bool MaxPriceFilter::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("MAX_PRICE"))))
    {
        std::shared_ptr<CatalogsProductGroupPricingCriteria> refVal_setMAXPRICE;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("MAX_PRICE"))), refVal_setMAXPRICE );
        setMAXPRICE(refVal_setMAXPRICE);
    }
    return ok;
}

std::shared_ptr<CatalogsProductGroupPricingCriteria> MaxPriceFilter::getMAXPRICE() const
{
    return m_MAX_PRICE;
}

void MaxPriceFilter::setMAXPRICE(const std::shared_ptr<CatalogsProductGroupPricingCriteria>& value)
{
    m_MAX_PRICE = value;
    m_MAX_PRICEIsSet = true;
}

bool MaxPriceFilter::mAXPRICEIsSet() const
{
    return m_MAX_PRICEIsSet;
}

void MaxPriceFilter::unsetMAX_PRICE()
{
    m_MAX_PRICEIsSet = false;
}
}
}
}
}

