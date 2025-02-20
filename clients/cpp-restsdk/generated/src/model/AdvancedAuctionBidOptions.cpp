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



#include "CppRestOpenAPIClient/model/AdvancedAuctionBidOptions.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



AdvancedAuctionBidOptions::AdvancedAuctionBidOptions()
{
    m_Bid_in_micro_currency = 0L;
    m_Bid_in_micro_currencyIsSet = false;
    m_App_type_multipliersIsSet = false;
    m_Placement_multipliersIsSet = false;
}

AdvancedAuctionBidOptions::~AdvancedAuctionBidOptions()
{
}

void AdvancedAuctionBidOptions::validate()
{
    // TODO: implement validation
}

web::json::value AdvancedAuctionBidOptions::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Bid_in_micro_currencyIsSet)
    {
        val[utility::conversions::to_string_t(U("bid_in_micro_currency"))] = ModelBase::toJson(m_Bid_in_micro_currency);
    }
    if(m_App_type_multipliersIsSet)
    {
        val[utility::conversions::to_string_t(U("app_type_multipliers"))] = ModelBase::toJson(m_App_type_multipliers);
    }
    if(m_Placement_multipliersIsSet)
    {
        val[utility::conversions::to_string_t(U("placement_multipliers"))] = ModelBase::toJson(m_Placement_multipliers);
    }

    return val;
}

bool AdvancedAuctionBidOptions::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("bid_in_micro_currency"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("bid_in_micro_currency")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setBidInMicroCurrency;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBidInMicroCurrency);
            setBidInMicroCurrency(refVal_setBidInMicroCurrency);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("app_type_multipliers"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("app_type_multipliers")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AppTypeMultipliers> refVal_setAppTypeMultipliers;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAppTypeMultipliers);
            setAppTypeMultipliers(refVal_setAppTypeMultipliers);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("placement_multipliers"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("placement_multipliers")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<PlacementMultipliers> refVal_setPlacementMultipliers;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPlacementMultipliers);
            setPlacementMultipliers(refVal_setPlacementMultipliers);
        }
    }
    return ok;
}

void AdvancedAuctionBidOptions::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Bid_in_micro_currencyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("bid_in_micro_currency")), m_Bid_in_micro_currency));
    }
    if(m_App_type_multipliersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("app_type_multipliers")), m_App_type_multipliers));
    }
    if(m_Placement_multipliersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("placement_multipliers")), m_Placement_multipliers));
    }
}

bool AdvancedAuctionBidOptions::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("bid_in_micro_currency"))))
    {
        int64_t refVal_setBidInMicroCurrency;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("bid_in_micro_currency"))), refVal_setBidInMicroCurrency );
        setBidInMicroCurrency(refVal_setBidInMicroCurrency);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("app_type_multipliers"))))
    {
        std::shared_ptr<AppTypeMultipliers> refVal_setAppTypeMultipliers;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("app_type_multipliers"))), refVal_setAppTypeMultipliers );
        setAppTypeMultipliers(refVal_setAppTypeMultipliers);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("placement_multipliers"))))
    {
        std::shared_ptr<PlacementMultipliers> refVal_setPlacementMultipliers;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("placement_multipliers"))), refVal_setPlacementMultipliers );
        setPlacementMultipliers(refVal_setPlacementMultipliers);
    }
    return ok;
}

int64_t AdvancedAuctionBidOptions::getBidInMicroCurrency() const
{
    return m_Bid_in_micro_currency;
}

void AdvancedAuctionBidOptions::setBidInMicroCurrency(int64_t value)
{
    m_Bid_in_micro_currency = value;
    m_Bid_in_micro_currencyIsSet = true;
}

bool AdvancedAuctionBidOptions::bidInMicroCurrencyIsSet() const
{
    return m_Bid_in_micro_currencyIsSet;
}

void AdvancedAuctionBidOptions::unsetBid_in_micro_currency()
{
    m_Bid_in_micro_currencyIsSet = false;
}
std::shared_ptr<AppTypeMultipliers> AdvancedAuctionBidOptions::getAppTypeMultipliers() const
{
    return m_App_type_multipliers;
}

void AdvancedAuctionBidOptions::setAppTypeMultipliers(const std::shared_ptr<AppTypeMultipliers>& value)
{
    m_App_type_multipliers = value;
    m_App_type_multipliersIsSet = true;
}

bool AdvancedAuctionBidOptions::appTypeMultipliersIsSet() const
{
    return m_App_type_multipliersIsSet;
}

void AdvancedAuctionBidOptions::unsetApp_type_multipliers()
{
    m_App_type_multipliersIsSet = false;
}
std::shared_ptr<PlacementMultipliers> AdvancedAuctionBidOptions::getPlacementMultipliers() const
{
    return m_Placement_multipliers;
}

void AdvancedAuctionBidOptions::setPlacementMultipliers(const std::shared_ptr<PlacementMultipliers>& value)
{
    m_Placement_multipliers = value;
    m_Placement_multipliersIsSet = true;
}

bool AdvancedAuctionBidOptions::placementMultipliersIsSet() const
{
    return m_Placement_multipliersIsSet;
}

void AdvancedAuctionBidOptions::unsetPlacement_multipliers()
{
    m_Placement_multipliersIsSet = false;
}
}
}
}
}


