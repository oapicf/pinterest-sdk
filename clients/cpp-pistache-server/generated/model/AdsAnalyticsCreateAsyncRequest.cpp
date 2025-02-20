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


#include "AdsAnalyticsCreateAsyncRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

AdsAnalyticsCreateAsyncRequest::AdsAnalyticsCreateAsyncRequest()
{
    m_Start_date = "";
    m_End_date = "";
    m_Click_window_daysIsSet = false;
    m_Engagement_window_daysIsSet = false;
    m_View_window_daysIsSet = false;
    m_Conversion_report_timeIsSet = false;
    m_Attribution_typesIsSet = false;
    m_Campaign_idsIsSet = false;
    m_Campaign_statusesIsSet = false;
    m_Campaign_objective_typesIsSet = false;
    m_Ad_group_idsIsSet = false;
    m_Ad_group_statusesIsSet = false;
    m_Ad_idsIsSet = false;
    m_Ad_statusesIsSet = false;
    m_Product_group_idsIsSet = false;
    m_Product_group_statusesIsSet = false;
    m_Product_item_idsIsSet = false;
    m_Targeting_typesIsSet = false;
    m_Metrics_filtersIsSet = false;
    m_Report_formatIsSet = false;
    m_Primary_sort = "";
    m_Primary_sortIsSet = false;
    m_Start_hour = 0;
    m_Start_hourIsSet = false;
    m_End_hour = 0;
    m_End_hourIsSet = false;
    
}

void AdsAnalyticsCreateAsyncRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool AdsAnalyticsCreateAsyncRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool AdsAnalyticsCreateAsyncRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "AdsAnalyticsCreateAsyncRequest" : pathPrefix;

         
    
    /* Start_date */ {
        const std::string& value = m_Start_date;
        const std::string currentValuePath = _pathPrefix + ".startDate";
                
        

    }
         
    
    /* End_date */ {
        const std::string& value = m_End_date;
        const std::string currentValuePath = _pathPrefix + ".endDate";
                
        

    }
                             
    if (attributionTypesIsSet())
    {
        const std::vector<org::openapitools::server::model::ConversionReportAttributionType>& value = m_Attribution_types;
        const std::string currentValuePath = _pathPrefix + ".attributionTypes";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::ConversionReportAttributionType& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
         
    if (campaignIdsIsSet())
    {
        const std::vector<std::string>& value = m_Campaign_ids;
        const std::string currentValuePath = _pathPrefix + ".campaignIds";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 500)
        {
            success = false;
            msg << currentValuePath << ": must have at most 500 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (campaignStatusesIsSet())
    {
        const std::vector<org::openapitools::server::model::CampaignSummaryStatus>& value = m_Campaign_statuses;
        const std::string currentValuePath = _pathPrefix + ".campaignStatuses";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 6)
        {
            success = false;
            msg << currentValuePath << ": must have at most 6 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::CampaignSummaryStatus& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
         
    if (campaignObjectiveTypesIsSet())
    {
        const std::vector<org::openapitools::server::model::ObjectiveType>& value = m_Campaign_objective_types;
        const std::string currentValuePath = _pathPrefix + ".campaignObjectiveTypes";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 7)
        {
            success = false;
            msg << currentValuePath << ": must have at most 7 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::ObjectiveType& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
         
    if (adGroupIdsIsSet())
    {
        const std::vector<std::string>& value = m_Ad_group_ids;
        const std::string currentValuePath = _pathPrefix + ".adGroupIds";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 500)
        {
            success = false;
            msg << currentValuePath << ": must have at most 500 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (adGroupStatusesIsSet())
    {
        const std::vector<org::openapitools::server::model::AdGroupSummaryStatus>& value = m_Ad_group_statuses;
        const std::string currentValuePath = _pathPrefix + ".adGroupStatuses";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 6)
        {
            success = false;
            msg << currentValuePath << ": must have at most 6 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::AdGroupSummaryStatus& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
         
    if (adIdsIsSet())
    {
        const std::vector<std::string>& value = m_Ad_ids;
        const std::string currentValuePath = _pathPrefix + ".adIds";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 500)
        {
            success = false;
            msg << currentValuePath << ": must have at most 500 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (adStatusesIsSet())
    {
        const std::vector<org::openapitools::server::model::PinPromotionSummaryStatus>& value = m_Ad_statuses;
        const std::string currentValuePath = _pathPrefix + ".adStatuses";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 6)
        {
            success = false;
            msg << currentValuePath << ": must have at most 6 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::PinPromotionSummaryStatus& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
         
    if (productGroupIdsIsSet())
    {
        const std::vector<std::string>& value = m_Product_group_ids;
        const std::string currentValuePath = _pathPrefix + ".productGroupIds";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 500)
        {
            success = false;
            msg << currentValuePath << ": must have at most 500 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (productGroupStatusesIsSet())
    {
        const std::vector<org::openapitools::server::model::ProductGroupSummaryStatus>& value = m_Product_group_statuses;
        const std::string currentValuePath = _pathPrefix + ".productGroupStatuses";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 6)
        {
            success = false;
            msg << currentValuePath << ": must have at most 6 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::ProductGroupSummaryStatus& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
         
    if (productItemIdsIsSet())
    {
        const std::vector<std::string>& value = m_Product_item_ids;
        const std::string currentValuePath = _pathPrefix + ".productItemIds";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 500)
        {
            success = false;
            msg << currentValuePath << ": must have at most 500 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (targetingTypesIsSet())
    {
        const std::vector<org::openapitools::server::model::AdsAnalyticsTargetingType>& value = m_Targeting_types;
        const std::string currentValuePath = _pathPrefix + ".targetingTypes";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 5)
        {
            success = false;
            msg << currentValuePath << ": must have at most 5 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::AdsAnalyticsTargetingType& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
         
    if (metricsFiltersIsSet())
    {
        const std::vector<org::openapitools::server::model::AdsAnalyticsMetricsFilter>& value = m_Metrics_filters;
        const std::string currentValuePath = _pathPrefix + ".metricsFilters";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::AdsAnalyticsMetricsFilter& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".metricsFilters") && success;
 
                i++;
            }
        }

    }
         
    
    /* Columns */ {
        const std::vector<org::openapitools::server::model::ReportingColumnAsync>& value = m_Columns;
        const std::string currentValuePath = _pathPrefix + ".columns";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::ReportingColumnAsync& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
                     
    if (startHourIsSet())
    {
        const int32_t& value = m_Start_hour;
        const std::string currentValuePath = _pathPrefix + ".startHour";
                
        
        if (value < 0)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 0;";
        }
        if (value > 23)
        {
            success = false;
            msg << currentValuePath << ": must be less than or equal to 23;";
        }

    }
         
    if (endHourIsSet())
    {
        const int32_t& value = m_End_hour;
        const std::string currentValuePath = _pathPrefix + ".endHour";
                
        
        if (value < 0)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 0;";
        }
        if (value > 23)
        {
            success = false;
            msg << currentValuePath << ": must be less than or equal to 23;";
        }

    }
    
    return success;
}

bool AdsAnalyticsCreateAsyncRequest::operator==(const AdsAnalyticsCreateAsyncRequest& rhs) const
{
    return
    
    
    (getStartDate() == rhs.getStartDate())
     &&
    
    (getEndDate() == rhs.getEndDate())
     &&
    
    (getGranularity() == rhs.getGranularity())
     &&
    
    
    ((!clickWindowDaysIsSet() && !rhs.clickWindowDaysIsSet()) || (clickWindowDaysIsSet() && rhs.clickWindowDaysIsSet() && getClickWindowDays() == rhs.getClickWindowDays())) &&
    
    
    ((!engagementWindowDaysIsSet() && !rhs.engagementWindowDaysIsSet()) || (engagementWindowDaysIsSet() && rhs.engagementWindowDaysIsSet() && getEngagementWindowDays() == rhs.getEngagementWindowDays())) &&
    
    
    ((!viewWindowDaysIsSet() && !rhs.viewWindowDaysIsSet()) || (viewWindowDaysIsSet() && rhs.viewWindowDaysIsSet() && getViewWindowDays() == rhs.getViewWindowDays())) &&
    
    
    ((!conversionReportTimeIsSet() && !rhs.conversionReportTimeIsSet()) || (conversionReportTimeIsSet() && rhs.conversionReportTimeIsSet() && getConversionReportTime() == rhs.getConversionReportTime())) &&
    
    
    ((!attributionTypesIsSet() && !rhs.attributionTypesIsSet()) || (attributionTypesIsSet() && rhs.attributionTypesIsSet() && getAttributionTypes() == rhs.getAttributionTypes())) &&
    
    
    ((!campaignIdsIsSet() && !rhs.campaignIdsIsSet()) || (campaignIdsIsSet() && rhs.campaignIdsIsSet() && getCampaignIds() == rhs.getCampaignIds())) &&
    
    
    ((!campaignStatusesIsSet() && !rhs.campaignStatusesIsSet()) || (campaignStatusesIsSet() && rhs.campaignStatusesIsSet() && getCampaignStatuses() == rhs.getCampaignStatuses())) &&
    
    
    ((!campaignObjectiveTypesIsSet() && !rhs.campaignObjectiveTypesIsSet()) || (campaignObjectiveTypesIsSet() && rhs.campaignObjectiveTypesIsSet() && getCampaignObjectiveTypes() == rhs.getCampaignObjectiveTypes())) &&
    
    
    ((!adGroupIdsIsSet() && !rhs.adGroupIdsIsSet()) || (adGroupIdsIsSet() && rhs.adGroupIdsIsSet() && getAdGroupIds() == rhs.getAdGroupIds())) &&
    
    
    ((!adGroupStatusesIsSet() && !rhs.adGroupStatusesIsSet()) || (adGroupStatusesIsSet() && rhs.adGroupStatusesIsSet() && getAdGroupStatuses() == rhs.getAdGroupStatuses())) &&
    
    
    ((!adIdsIsSet() && !rhs.adIdsIsSet()) || (adIdsIsSet() && rhs.adIdsIsSet() && getAdIds() == rhs.getAdIds())) &&
    
    
    ((!adStatusesIsSet() && !rhs.adStatusesIsSet()) || (adStatusesIsSet() && rhs.adStatusesIsSet() && getAdStatuses() == rhs.getAdStatuses())) &&
    
    
    ((!productGroupIdsIsSet() && !rhs.productGroupIdsIsSet()) || (productGroupIdsIsSet() && rhs.productGroupIdsIsSet() && getProductGroupIds() == rhs.getProductGroupIds())) &&
    
    
    ((!productGroupStatusesIsSet() && !rhs.productGroupStatusesIsSet()) || (productGroupStatusesIsSet() && rhs.productGroupStatusesIsSet() && getProductGroupStatuses() == rhs.getProductGroupStatuses())) &&
    
    
    ((!productItemIdsIsSet() && !rhs.productItemIdsIsSet()) || (productItemIdsIsSet() && rhs.productItemIdsIsSet() && getProductItemIds() == rhs.getProductItemIds())) &&
    
    
    ((!targetingTypesIsSet() && !rhs.targetingTypesIsSet()) || (targetingTypesIsSet() && rhs.targetingTypesIsSet() && getTargetingTypes() == rhs.getTargetingTypes())) &&
    
    
    ((!metricsFiltersIsSet() && !rhs.metricsFiltersIsSet()) || (metricsFiltersIsSet() && rhs.metricsFiltersIsSet() && getMetricsFilters() == rhs.getMetricsFilters())) &&
    
    (getColumns() == rhs.getColumns())
     &&
    
    (getLevel() == rhs.getLevel())
     &&
    
    
    ((!reportFormatIsSet() && !rhs.reportFormatIsSet()) || (reportFormatIsSet() && rhs.reportFormatIsSet() && getReportFormat() == rhs.getReportFormat())) &&
    
    
    ((!primarySortIsSet() && !rhs.primarySortIsSet()) || (primarySortIsSet() && rhs.primarySortIsSet() && getPrimarySort() == rhs.getPrimarySort())) &&
    
    
    ((!startHourIsSet() && !rhs.startHourIsSet()) || (startHourIsSet() && rhs.startHourIsSet() && getStartHour() == rhs.getStartHour())) &&
    
    
    ((!endHourIsSet() && !rhs.endHourIsSet()) || (endHourIsSet() && rhs.endHourIsSet() && getEndHour() == rhs.getEndHour()))
    
    ;
}

bool AdsAnalyticsCreateAsyncRequest::operator!=(const AdsAnalyticsCreateAsyncRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const AdsAnalyticsCreateAsyncRequest& o)
{
    j = nlohmann::json::object();
    j["start_date"] = o.m_Start_date;
    j["end_date"] = o.m_End_date;
    j["granularity"] = o.m_Granularity;
    if(o.clickWindowDaysIsSet())
        j["click_window_days"] = o.m_Click_window_days;
    if(o.engagementWindowDaysIsSet())
        j["engagement_window_days"] = o.m_Engagement_window_days;
    if(o.viewWindowDaysIsSet())
        j["view_window_days"] = o.m_View_window_days;
    if(o.conversionReportTimeIsSet())
        j["conversion_report_time"] = o.m_Conversion_report_time;
    if(o.attributionTypesIsSet() || !o.m_Attribution_types.empty())
        j["attribution_types"] = o.m_Attribution_types;
    if(o.campaignIdsIsSet() || !o.m_Campaign_ids.empty())
        j["campaign_ids"] = o.m_Campaign_ids;
    if(o.campaignStatusesIsSet() || !o.m_Campaign_statuses.empty())
        j["campaign_statuses"] = o.m_Campaign_statuses;
    if(o.campaignObjectiveTypesIsSet() || !o.m_Campaign_objective_types.empty())
        j["campaign_objective_types"] = o.m_Campaign_objective_types;
    if(o.adGroupIdsIsSet() || !o.m_Ad_group_ids.empty())
        j["ad_group_ids"] = o.m_Ad_group_ids;
    if(o.adGroupStatusesIsSet() || !o.m_Ad_group_statuses.empty())
        j["ad_group_statuses"] = o.m_Ad_group_statuses;
    if(o.adIdsIsSet() || !o.m_Ad_ids.empty())
        j["ad_ids"] = o.m_Ad_ids;
    if(o.adStatusesIsSet() || !o.m_Ad_statuses.empty())
        j["ad_statuses"] = o.m_Ad_statuses;
    if(o.productGroupIdsIsSet() || !o.m_Product_group_ids.empty())
        j["product_group_ids"] = o.m_Product_group_ids;
    if(o.productGroupStatusesIsSet() || !o.m_Product_group_statuses.empty())
        j["product_group_statuses"] = o.m_Product_group_statuses;
    if(o.productItemIdsIsSet() || !o.m_Product_item_ids.empty())
        j["product_item_ids"] = o.m_Product_item_ids;
    if(o.targetingTypesIsSet() || !o.m_Targeting_types.empty())
        j["targeting_types"] = o.m_Targeting_types;
    if(o.metricsFiltersIsSet() || !o.m_Metrics_filters.empty())
        j["metrics_filters"] = o.m_Metrics_filters;
    j["columns"] = o.m_Columns;
    j["level"] = o.m_Level;
    if(o.reportFormatIsSet())
        j["report_format"] = o.m_Report_format;
    if(o.primarySortIsSet())
        j["primary_sort"] = o.m_Primary_sort;
    if(o.startHourIsSet())
        j["start_hour"] = o.m_Start_hour;
    if(o.endHourIsSet())
        j["end_hour"] = o.m_End_hour;
    
}

void from_json(const nlohmann::json& j, AdsAnalyticsCreateAsyncRequest& o)
{
    j.at("start_date").get_to(o.m_Start_date);
    j.at("end_date").get_to(o.m_End_date);
    j.at("granularity").get_to(o.m_Granularity);
    if(j.find("click_window_days") != j.end())
    {
        j.at("click_window_days").get_to(o.m_Click_window_days);
        o.m_Click_window_daysIsSet = true;
    } 
    if(j.find("engagement_window_days") != j.end())
    {
        j.at("engagement_window_days").get_to(o.m_Engagement_window_days);
        o.m_Engagement_window_daysIsSet = true;
    } 
    if(j.find("view_window_days") != j.end())
    {
        j.at("view_window_days").get_to(o.m_View_window_days);
        o.m_View_window_daysIsSet = true;
    } 
    if(j.find("conversion_report_time") != j.end())
    {
        j.at("conversion_report_time").get_to(o.m_Conversion_report_time);
        o.m_Conversion_report_timeIsSet = true;
    } 
    if(j.find("attribution_types") != j.end())
    {
        j.at("attribution_types").get_to(o.m_Attribution_types);
        o.m_Attribution_typesIsSet = true;
    } 
    if(j.find("campaign_ids") != j.end())
    {
        j.at("campaign_ids").get_to(o.m_Campaign_ids);
        o.m_Campaign_idsIsSet = true;
    } 
    if(j.find("campaign_statuses") != j.end())
    {
        j.at("campaign_statuses").get_to(o.m_Campaign_statuses);
        o.m_Campaign_statusesIsSet = true;
    } 
    if(j.find("campaign_objective_types") != j.end())
    {
        j.at("campaign_objective_types").get_to(o.m_Campaign_objective_types);
        o.m_Campaign_objective_typesIsSet = true;
    } 
    if(j.find("ad_group_ids") != j.end())
    {
        j.at("ad_group_ids").get_to(o.m_Ad_group_ids);
        o.m_Ad_group_idsIsSet = true;
    } 
    if(j.find("ad_group_statuses") != j.end())
    {
        j.at("ad_group_statuses").get_to(o.m_Ad_group_statuses);
        o.m_Ad_group_statusesIsSet = true;
    } 
    if(j.find("ad_ids") != j.end())
    {
        j.at("ad_ids").get_to(o.m_Ad_ids);
        o.m_Ad_idsIsSet = true;
    } 
    if(j.find("ad_statuses") != j.end())
    {
        j.at("ad_statuses").get_to(o.m_Ad_statuses);
        o.m_Ad_statusesIsSet = true;
    } 
    if(j.find("product_group_ids") != j.end())
    {
        j.at("product_group_ids").get_to(o.m_Product_group_ids);
        o.m_Product_group_idsIsSet = true;
    } 
    if(j.find("product_group_statuses") != j.end())
    {
        j.at("product_group_statuses").get_to(o.m_Product_group_statuses);
        o.m_Product_group_statusesIsSet = true;
    } 
    if(j.find("product_item_ids") != j.end())
    {
        j.at("product_item_ids").get_to(o.m_Product_item_ids);
        o.m_Product_item_idsIsSet = true;
    } 
    if(j.find("targeting_types") != j.end())
    {
        j.at("targeting_types").get_to(o.m_Targeting_types);
        o.m_Targeting_typesIsSet = true;
    } 
    if(j.find("metrics_filters") != j.end())
    {
        j.at("metrics_filters").get_to(o.m_Metrics_filters);
        o.m_Metrics_filtersIsSet = true;
    } 
    j.at("columns").get_to(o.m_Columns);
    j.at("level").get_to(o.m_Level);
    if(j.find("report_format") != j.end())
    {
        j.at("report_format").get_to(o.m_Report_format);
        o.m_Report_formatIsSet = true;
    } 
    if(j.find("primary_sort") != j.end())
    {
        j.at("primary_sort").get_to(o.m_Primary_sort);
        o.m_Primary_sortIsSet = true;
    } 
    if(j.find("start_hour") != j.end())
    {
        j.at("start_hour").get_to(o.m_Start_hour);
        o.m_Start_hourIsSet = true;
    } 
    if(j.find("end_hour") != j.end())
    {
        j.at("end_hour").get_to(o.m_End_hour);
        o.m_End_hourIsSet = true;
    } 
    
}

std::string AdsAnalyticsCreateAsyncRequest::getStartDate() const
{
    return m_Start_date;
}
void AdsAnalyticsCreateAsyncRequest::setStartDate(std::string const& value)
{
    m_Start_date = value;
}
std::string AdsAnalyticsCreateAsyncRequest::getEndDate() const
{
    return m_End_date;
}
void AdsAnalyticsCreateAsyncRequest::setEndDate(std::string const& value)
{
    m_End_date = value;
}
org::openapitools::server::model::Granularity AdsAnalyticsCreateAsyncRequest::getGranularity() const
{
    return m_Granularity;
}
void AdsAnalyticsCreateAsyncRequest::setGranularity(org::openapitools::server::model::Granularity const& value)
{
    m_Granularity = value;
}
org::openapitools::server::model::ConversionAttributionWindowDays AdsAnalyticsCreateAsyncRequest::getClickWindowDays() const
{
    return m_Click_window_days;
}
void AdsAnalyticsCreateAsyncRequest::setClickWindowDays(org::openapitools::server::model::ConversionAttributionWindowDays const& value)
{
    m_Click_window_days = value;
    m_Click_window_daysIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::clickWindowDaysIsSet() const
{
    return m_Click_window_daysIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetClick_window_days()
{
    m_Click_window_daysIsSet = false;
}
org::openapitools::server::model::ConversionAttributionWindowDays AdsAnalyticsCreateAsyncRequest::getEngagementWindowDays() const
{
    return m_Engagement_window_days;
}
void AdsAnalyticsCreateAsyncRequest::setEngagementWindowDays(org::openapitools::server::model::ConversionAttributionWindowDays const& value)
{
    m_Engagement_window_days = value;
    m_Engagement_window_daysIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::engagementWindowDaysIsSet() const
{
    return m_Engagement_window_daysIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetEngagement_window_days()
{
    m_Engagement_window_daysIsSet = false;
}
org::openapitools::server::model::ConversionAttributionWindowDays AdsAnalyticsCreateAsyncRequest::getViewWindowDays() const
{
    return m_View_window_days;
}
void AdsAnalyticsCreateAsyncRequest::setViewWindowDays(org::openapitools::server::model::ConversionAttributionWindowDays const& value)
{
    m_View_window_days = value;
    m_View_window_daysIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::viewWindowDaysIsSet() const
{
    return m_View_window_daysIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetView_window_days()
{
    m_View_window_daysIsSet = false;
}
org::openapitools::server::model::ConversionReportTimeType AdsAnalyticsCreateAsyncRequest::getConversionReportTime() const
{
    return m_Conversion_report_time;
}
void AdsAnalyticsCreateAsyncRequest::setConversionReportTime(org::openapitools::server::model::ConversionReportTimeType const& value)
{
    m_Conversion_report_time = value;
    m_Conversion_report_timeIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::conversionReportTimeIsSet() const
{
    return m_Conversion_report_timeIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetConversion_report_time()
{
    m_Conversion_report_timeIsSet = false;
}
std::vector<org::openapitools::server::model::ConversionReportAttributionType> AdsAnalyticsCreateAsyncRequest::getAttributionTypes() const
{
    return m_Attribution_types;
}
void AdsAnalyticsCreateAsyncRequest::setAttributionTypes(std::vector<org::openapitools::server::model::ConversionReportAttributionType> const& value)
{
    m_Attribution_types = value;
    m_Attribution_typesIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::attributionTypesIsSet() const
{
    return m_Attribution_typesIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetAttribution_types()
{
    m_Attribution_typesIsSet = false;
}
std::vector<std::string> AdsAnalyticsCreateAsyncRequest::getCampaignIds() const
{
    return m_Campaign_ids;
}
void AdsAnalyticsCreateAsyncRequest::setCampaignIds(std::vector<std::string> const& value)
{
    m_Campaign_ids = value;
    m_Campaign_idsIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::campaignIdsIsSet() const
{
    return m_Campaign_idsIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetCampaign_ids()
{
    m_Campaign_idsIsSet = false;
}
std::vector<org::openapitools::server::model::CampaignSummaryStatus> AdsAnalyticsCreateAsyncRequest::getCampaignStatuses() const
{
    return m_Campaign_statuses;
}
void AdsAnalyticsCreateAsyncRequest::setCampaignStatuses(std::vector<org::openapitools::server::model::CampaignSummaryStatus> const& value)
{
    m_Campaign_statuses = value;
    m_Campaign_statusesIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::campaignStatusesIsSet() const
{
    return m_Campaign_statusesIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetCampaign_statuses()
{
    m_Campaign_statusesIsSet = false;
}
std::vector<org::openapitools::server::model::ObjectiveType> AdsAnalyticsCreateAsyncRequest::getCampaignObjectiveTypes() const
{
    return m_Campaign_objective_types;
}
void AdsAnalyticsCreateAsyncRequest::setCampaignObjectiveTypes(std::vector<org::openapitools::server::model::ObjectiveType> const& value)
{
    m_Campaign_objective_types = value;
    m_Campaign_objective_typesIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::campaignObjectiveTypesIsSet() const
{
    return m_Campaign_objective_typesIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetCampaign_objective_types()
{
    m_Campaign_objective_typesIsSet = false;
}
std::vector<std::string> AdsAnalyticsCreateAsyncRequest::getAdGroupIds() const
{
    return m_Ad_group_ids;
}
void AdsAnalyticsCreateAsyncRequest::setAdGroupIds(std::vector<std::string> const& value)
{
    m_Ad_group_ids = value;
    m_Ad_group_idsIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::adGroupIdsIsSet() const
{
    return m_Ad_group_idsIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetAd_group_ids()
{
    m_Ad_group_idsIsSet = false;
}
std::vector<org::openapitools::server::model::AdGroupSummaryStatus> AdsAnalyticsCreateAsyncRequest::getAdGroupStatuses() const
{
    return m_Ad_group_statuses;
}
void AdsAnalyticsCreateAsyncRequest::setAdGroupStatuses(std::vector<org::openapitools::server::model::AdGroupSummaryStatus> const& value)
{
    m_Ad_group_statuses = value;
    m_Ad_group_statusesIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::adGroupStatusesIsSet() const
{
    return m_Ad_group_statusesIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetAd_group_statuses()
{
    m_Ad_group_statusesIsSet = false;
}
std::vector<std::string> AdsAnalyticsCreateAsyncRequest::getAdIds() const
{
    return m_Ad_ids;
}
void AdsAnalyticsCreateAsyncRequest::setAdIds(std::vector<std::string> const& value)
{
    m_Ad_ids = value;
    m_Ad_idsIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::adIdsIsSet() const
{
    return m_Ad_idsIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetAd_ids()
{
    m_Ad_idsIsSet = false;
}
std::vector<org::openapitools::server::model::PinPromotionSummaryStatus> AdsAnalyticsCreateAsyncRequest::getAdStatuses() const
{
    return m_Ad_statuses;
}
void AdsAnalyticsCreateAsyncRequest::setAdStatuses(std::vector<org::openapitools::server::model::PinPromotionSummaryStatus> const& value)
{
    m_Ad_statuses = value;
    m_Ad_statusesIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::adStatusesIsSet() const
{
    return m_Ad_statusesIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetAd_statuses()
{
    m_Ad_statusesIsSet = false;
}
std::vector<std::string> AdsAnalyticsCreateAsyncRequest::getProductGroupIds() const
{
    return m_Product_group_ids;
}
void AdsAnalyticsCreateAsyncRequest::setProductGroupIds(std::vector<std::string> const& value)
{
    m_Product_group_ids = value;
    m_Product_group_idsIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::productGroupIdsIsSet() const
{
    return m_Product_group_idsIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetProduct_group_ids()
{
    m_Product_group_idsIsSet = false;
}
std::vector<org::openapitools::server::model::ProductGroupSummaryStatus> AdsAnalyticsCreateAsyncRequest::getProductGroupStatuses() const
{
    return m_Product_group_statuses;
}
void AdsAnalyticsCreateAsyncRequest::setProductGroupStatuses(std::vector<org::openapitools::server::model::ProductGroupSummaryStatus> const& value)
{
    m_Product_group_statuses = value;
    m_Product_group_statusesIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::productGroupStatusesIsSet() const
{
    return m_Product_group_statusesIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetProduct_group_statuses()
{
    m_Product_group_statusesIsSet = false;
}
std::vector<std::string> AdsAnalyticsCreateAsyncRequest::getProductItemIds() const
{
    return m_Product_item_ids;
}
void AdsAnalyticsCreateAsyncRequest::setProductItemIds(std::vector<std::string> const& value)
{
    m_Product_item_ids = value;
    m_Product_item_idsIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::productItemIdsIsSet() const
{
    return m_Product_item_idsIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetProduct_item_ids()
{
    m_Product_item_idsIsSet = false;
}
std::vector<org::openapitools::server::model::AdsAnalyticsTargetingType> AdsAnalyticsCreateAsyncRequest::getTargetingTypes() const
{
    return m_Targeting_types;
}
void AdsAnalyticsCreateAsyncRequest::setTargetingTypes(std::vector<org::openapitools::server::model::AdsAnalyticsTargetingType> const& value)
{
    m_Targeting_types = value;
    m_Targeting_typesIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::targetingTypesIsSet() const
{
    return m_Targeting_typesIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetTargeting_types()
{
    m_Targeting_typesIsSet = false;
}
std::vector<org::openapitools::server::model::AdsAnalyticsMetricsFilter> AdsAnalyticsCreateAsyncRequest::getMetricsFilters() const
{
    return m_Metrics_filters;
}
void AdsAnalyticsCreateAsyncRequest::setMetricsFilters(std::vector<org::openapitools::server::model::AdsAnalyticsMetricsFilter> const& value)
{
    m_Metrics_filters = value;
    m_Metrics_filtersIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::metricsFiltersIsSet() const
{
    return m_Metrics_filtersIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetMetrics_filters()
{
    m_Metrics_filtersIsSet = false;
}
std::vector<org::openapitools::server::model::ReportingColumnAsync> AdsAnalyticsCreateAsyncRequest::getColumns() const
{
    return m_Columns;
}
void AdsAnalyticsCreateAsyncRequest::setColumns(std::vector<org::openapitools::server::model::ReportingColumnAsync> const& value)
{
    m_Columns = value;
}
org::openapitools::server::model::MetricsReportingLevel AdsAnalyticsCreateAsyncRequest::getLevel() const
{
    return m_Level;
}
void AdsAnalyticsCreateAsyncRequest::setLevel(org::openapitools::server::model::MetricsReportingLevel const& value)
{
    m_Level = value;
}
org::openapitools::server::model::DataOutputFormat AdsAnalyticsCreateAsyncRequest::getReportFormat() const
{
    return m_Report_format;
}
void AdsAnalyticsCreateAsyncRequest::setReportFormat(org::openapitools::server::model::DataOutputFormat const& value)
{
    m_Report_format = value;
    m_Report_formatIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::reportFormatIsSet() const
{
    return m_Report_formatIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetReport_format()
{
    m_Report_formatIsSet = false;
}
std::string AdsAnalyticsCreateAsyncRequest::getPrimarySort() const
{
    return m_Primary_sort;
}
void AdsAnalyticsCreateAsyncRequest::setPrimarySort(std::string const& value)
{
    m_Primary_sort = value;
    m_Primary_sortIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::primarySortIsSet() const
{
    return m_Primary_sortIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetPrimary_sort()
{
    m_Primary_sortIsSet = false;
}
int32_t AdsAnalyticsCreateAsyncRequest::getStartHour() const
{
    return m_Start_hour;
}
void AdsAnalyticsCreateAsyncRequest::setStartHour(int32_t const value)
{
    m_Start_hour = value;
    m_Start_hourIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::startHourIsSet() const
{
    return m_Start_hourIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetStart_hour()
{
    m_Start_hourIsSet = false;
}
int32_t AdsAnalyticsCreateAsyncRequest::getEndHour() const
{
    return m_End_hour;
}
void AdsAnalyticsCreateAsyncRequest::setEndHour(int32_t const value)
{
    m_End_hour = value;
    m_End_hourIsSet = true;
}
bool AdsAnalyticsCreateAsyncRequest::endHourIsSet() const
{
    return m_End_hourIsSet;
}
void AdsAnalyticsCreateAsyncRequest::unsetEnd_hour()
{
    m_End_hourIsSet = false;
}


} // namespace org::openapitools::server::model

