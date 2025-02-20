/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "MMMReportingColumn.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

MMMReportingColumn::MMMReportingColumn()
{
    
}

void MMMReportingColumn::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool MMMReportingColumn::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool MMMReportingColumn::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "MMMReportingColumn" : pathPrefix;

    
    if (m_value == MMMReportingColumn::eMMMReportingColumn::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool MMMReportingColumn::operator==(const MMMReportingColumn& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool MMMReportingColumn::operator!=(const MMMReportingColumn& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const MMMReportingColumn& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case MMMReportingColumn::eMMMReportingColumn::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case MMMReportingColumn::eMMMReportingColumn::SPEND_IN_DOLLAR:
            j = "SPEND_IN_DOLLAR";
            break;
        case MMMReportingColumn::eMMMReportingColumn::SPEND_IN_MICRO_DOLLAR:
            j = "SPEND_IN_MICRO_DOLLAR";
            break;
        case MMMReportingColumn::eMMMReportingColumn::ECPC_IN_DOLLAR:
            j = "ECPC_IN_DOLLAR";
            break;
        case MMMReportingColumn::eMMMReportingColumn::ECTR:
            j = "ECTR";
            break;
        case MMMReportingColumn::eMMMReportingColumn::CAMPAIGN_NAME:
            j = "CAMPAIGN_NAME";
            break;
        case MMMReportingColumn::eMMMReportingColumn::TOTAL_ENGAGEMENT:
            j = "TOTAL_ENGAGEMENT";
            break;
        case MMMReportingColumn::eMMMReportingColumn::EENGAGEMENT_RATE:
            j = "EENGAGEMENT_RATE";
            break;
        case MMMReportingColumn::eMMMReportingColumn::ECPM_IN_DOLLAR:
            j = "ECPM_IN_DOLLAR";
            break;
        case MMMReportingColumn::eMMMReportingColumn::CAMPAIGN_ID:
            j = "CAMPAIGN_ID";
            break;
        case MMMReportingColumn::eMMMReportingColumn::ADVERTISER_ID:
            j = "ADVERTISER_ID";
            break;
        case MMMReportingColumn::eMMMReportingColumn::AD_GROUP_ID:
            j = "AD_GROUP_ID";
            break;
        case MMMReportingColumn::eMMMReportingColumn::AD_GROUP_NAME:
            j = "AD_GROUP_NAME";
            break;
        case MMMReportingColumn::eMMMReportingColumn::CLICKTHROUGH_1:
            j = "CLICKTHROUGH_1";
            break;
        case MMMReportingColumn::eMMMReportingColumn::IMPRESSION_1:
            j = "IMPRESSION_1";
            break;
        case MMMReportingColumn::eMMMReportingColumn::CLICKTHROUGH_2:
            j = "CLICKTHROUGH_2";
            break;
        case MMMReportingColumn::eMMMReportingColumn::IMPRESSION_2:
            j = "IMPRESSION_2";
            break;
        case MMMReportingColumn::eMMMReportingColumn::TOTAL_CLICKTHROUGH:
            j = "TOTAL_CLICKTHROUGH";
            break;
        case MMMReportingColumn::eMMMReportingColumn::TOTAL_IMPRESSION:
            j = "TOTAL_IMPRESSION";
            break;
        case MMMReportingColumn::eMMMReportingColumn::ADVERTISER_NAME:
            j = "ADVERTISER_NAME";
            break;
        case MMMReportingColumn::eMMMReportingColumn::SPEND_ORDER_LINE_PAID_TYPE:
            j = "SPEND_ORDER_LINE_PAID_TYPE";
            break;
    }
}

void from_json(const nlohmann::json& j, MMMReportingColumn& o)
{
    
    auto s = j.get<std::string>();
    if (s == "SPEND_IN_DOLLAR") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::SPEND_IN_DOLLAR);
    } 
    else if (s == "SPEND_IN_MICRO_DOLLAR") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::SPEND_IN_MICRO_DOLLAR);
    } 
    else if (s == "ECPC_IN_DOLLAR") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::ECPC_IN_DOLLAR);
    } 
    else if (s == "ECTR") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::ECTR);
    } 
    else if (s == "CAMPAIGN_NAME") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::CAMPAIGN_NAME);
    } 
    else if (s == "TOTAL_ENGAGEMENT") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::TOTAL_ENGAGEMENT);
    } 
    else if (s == "EENGAGEMENT_RATE") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::EENGAGEMENT_RATE);
    } 
    else if (s == "ECPM_IN_DOLLAR") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::ECPM_IN_DOLLAR);
    } 
    else if (s == "CAMPAIGN_ID") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::CAMPAIGN_ID);
    } 
    else if (s == "ADVERTISER_ID") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::ADVERTISER_ID);
    } 
    else if (s == "AD_GROUP_ID") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::AD_GROUP_ID);
    } 
    else if (s == "AD_GROUP_NAME") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::AD_GROUP_NAME);
    } 
    else if (s == "CLICKTHROUGH_1") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::CLICKTHROUGH_1);
    } 
    else if (s == "IMPRESSION_1") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::IMPRESSION_1);
    } 
    else if (s == "CLICKTHROUGH_2") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::CLICKTHROUGH_2);
    } 
    else if (s == "IMPRESSION_2") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::IMPRESSION_2);
    } 
    else if (s == "TOTAL_CLICKTHROUGH") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::TOTAL_CLICKTHROUGH);
    } 
    else if (s == "TOTAL_IMPRESSION") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::TOTAL_IMPRESSION);
    } 
    else if (s == "ADVERTISER_NAME") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::ADVERTISER_NAME);
    } 
    else if (s == "SPEND_ORDER_LINE_PAID_TYPE") {
     o.setValue(MMMReportingColumn::eMMMReportingColumn::SPEND_ORDER_LINE_PAID_TYPE);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " MMMReportingColumn::eMMMReportingColumn";
     throw std::invalid_argument(ss.str());
    } 

}

MMMReportingColumn::eMMMReportingColumn MMMReportingColumn::getValue() const
{
    return m_value;
}
void MMMReportingColumn::setValue(MMMReportingColumn::eMMMReportingColumn value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

