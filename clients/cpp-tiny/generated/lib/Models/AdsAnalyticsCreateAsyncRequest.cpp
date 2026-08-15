

#include "AdsAnalyticsCreateAsyncRequest.h"

using namespace Tiny;

AdsAnalyticsCreateAsyncRequest::AdsAnalyticsCreateAsyncRequest()
{
	attribution_types = std::list<ConversionReportAttributionType>();
	click_window_days = int(0);
	conversion_report_time = std::string();
	end_date = std::string();
	engagement_window_days = int(0);
	granularity = std::string();
	start_date = std::string();
	view_window_days = int(0);
	campaign_ids = std::list<std::string>();
	campaign_statuses = std::list<CampaignSummaryStatus>();
	campaign_objective_types = std::list<ObjectiveType>();
	campaign_brand_label = std::string();
	ad_group_ids = std::list<std::string>();
	ad_group_statuses = std::list<AdGroupSummaryStatus>();
	ad_ids = std::list<std::string>();
	ad_statuses = std::list<PinPromotionSummaryStatus>();
	product_group_ids = std::list<std::string>();
	product_group_statuses = std::list<ProductGroupSummaryStatus>();
	product_item_ids = std::list<std::string>();
	targeting_types = std::list<std::string>();
	metrics_filters = std::list<AdsAnalyticsMetricsFilter>();
	columns = std::list<ReportingColumnAsync>();
	combine_targeting_types = bool(false);
	custom_conversion_event_metrics = std::list<AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics>();
	end_hour = int(0);
	level = std::string();
	primary_sort = std::string();
	report_format = std::string();
	reporting_timezone = null;
	start_hour = int(0);
}

AdsAnalyticsCreateAsyncRequest::AdsAnalyticsCreateAsyncRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsAnalyticsCreateAsyncRequest::~AdsAnalyticsCreateAsyncRequest()
{

}

void
AdsAnalyticsCreateAsyncRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attribution_typesKey = "attribution_types";

    if(object.has_key(attribution_typesKey))
    {
        bourne::json value = object[attribution_typesKey];


        std::list<ConversionReportAttributionType> attribution_types_list;
        ConversionReportAttributionType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            attribution_types_list.push_back(element);
        }
        attribution_types = attribution_types_list;


    }

    const char *click_window_daysKey = "click_window_days";

    if(object.has_key(click_window_daysKey))
    {
        bourne::json value = object[click_window_daysKey];




        ConversionAttributionWindowDays* obj = &click_window_days;
		obj->fromJson(value.dump());

    }

    const char *conversion_report_timeKey = "conversion_report_time";

    if(object.has_key(conversion_report_timeKey))
    {
        bourne::json value = object[conversion_report_timeKey];




        ConversionReportTimeType* obj = &conversion_report_time;
		obj->fromJson(value.dump());

    }

    const char *end_dateKey = "end_date";

    if(object.has_key(end_dateKey))
    {
        bourne::json value = object[end_dateKey];



        jsonToValue(&end_date, value, "std::string");


    }

    const char *engagement_window_daysKey = "engagement_window_days";

    if(object.has_key(engagement_window_daysKey))
    {
        bourne::json value = object[engagement_window_daysKey];




        ConversionAttributionWindowDays* obj = &engagement_window_days;
		obj->fromJson(value.dump());

    }

    const char *granularityKey = "granularity";

    if(object.has_key(granularityKey))
    {
        bourne::json value = object[granularityKey];




        Granularity* obj = &granularity;
		obj->fromJson(value.dump());

    }

    const char *start_dateKey = "start_date";

    if(object.has_key(start_dateKey))
    {
        bourne::json value = object[start_dateKey];



        jsonToValue(&start_date, value, "std::string");


    }

    const char *view_window_daysKey = "view_window_days";

    if(object.has_key(view_window_daysKey))
    {
        bourne::json value = object[view_window_daysKey];




        ConversionAttributionWindowDays* obj = &view_window_days;
		obj->fromJson(value.dump());

    }

    const char *campaign_idsKey = "campaign_ids";

    if(object.has_key(campaign_idsKey))
    {
        bourne::json value = object[campaign_idsKey];


        std::list<std::string> campaign_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            campaign_ids_list.push_back(element);
        }
        campaign_ids = campaign_ids_list;


    }

    const char *campaign_statusesKey = "campaign_statuses";

    if(object.has_key(campaign_statusesKey))
    {
        bourne::json value = object[campaign_statusesKey];


        std::list<CampaignSummaryStatus> campaign_statuses_list;
        CampaignSummaryStatus element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            campaign_statuses_list.push_back(element);
        }
        campaign_statuses = campaign_statuses_list;


    }

    const char *campaign_objective_typesKey = "campaign_objective_types";

    if(object.has_key(campaign_objective_typesKey))
    {
        bourne::json value = object[campaign_objective_typesKey];


        std::list<ObjectiveType> campaign_objective_types_list;
        ObjectiveType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            campaign_objective_types_list.push_back(element);
        }
        campaign_objective_types = campaign_objective_types_list;


    }

    const char *campaign_brand_labelKey = "campaign_brand_label";

    if(object.has_key(campaign_brand_labelKey))
    {
        bourne::json value = object[campaign_brand_labelKey];



        jsonToValue(&campaign_brand_label, value, "std::string");


    }

    const char *ad_group_idsKey = "ad_group_ids";

    if(object.has_key(ad_group_idsKey))
    {
        bourne::json value = object[ad_group_idsKey];


        std::list<std::string> ad_group_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            ad_group_ids_list.push_back(element);
        }
        ad_group_ids = ad_group_ids_list;


    }

    const char *ad_group_statusesKey = "ad_group_statuses";

    if(object.has_key(ad_group_statusesKey))
    {
        bourne::json value = object[ad_group_statusesKey];


        std::list<AdGroupSummaryStatus> ad_group_statuses_list;
        AdGroupSummaryStatus element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            ad_group_statuses_list.push_back(element);
        }
        ad_group_statuses = ad_group_statuses_list;


    }

    const char *ad_idsKey = "ad_ids";

    if(object.has_key(ad_idsKey))
    {
        bourne::json value = object[ad_idsKey];


        std::list<std::string> ad_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            ad_ids_list.push_back(element);
        }
        ad_ids = ad_ids_list;


    }

    const char *ad_statusesKey = "ad_statuses";

    if(object.has_key(ad_statusesKey))
    {
        bourne::json value = object[ad_statusesKey];


        std::list<PinPromotionSummaryStatus> ad_statuses_list;
        PinPromotionSummaryStatus element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            ad_statuses_list.push_back(element);
        }
        ad_statuses = ad_statuses_list;


    }

    const char *product_group_idsKey = "product_group_ids";

    if(object.has_key(product_group_idsKey))
    {
        bourne::json value = object[product_group_idsKey];


        std::list<std::string> product_group_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            product_group_ids_list.push_back(element);
        }
        product_group_ids = product_group_ids_list;


    }

    const char *product_group_statusesKey = "product_group_statuses";

    if(object.has_key(product_group_statusesKey))
    {
        bourne::json value = object[product_group_statusesKey];


        std::list<ProductGroupSummaryStatus> product_group_statuses_list;
        ProductGroupSummaryStatus element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            product_group_statuses_list.push_back(element);
        }
        product_group_statuses = product_group_statuses_list;


    }

    const char *product_item_idsKey = "product_item_ids";

    if(object.has_key(product_item_idsKey))
    {
        bourne::json value = object[product_item_idsKey];


        std::list<std::string> product_item_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            product_item_ids_list.push_back(element);
        }
        product_item_ids = product_item_ids_list;


    }

    const char *targeting_typesKey = "targeting_types";

    if(object.has_key(targeting_typesKey))
    {
        bourne::json value = object[targeting_typesKey];


        std::list<std::string> targeting_types_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            targeting_types_list.push_back(element);
        }
        targeting_types = targeting_types_list;


    }

    const char *metrics_filtersKey = "metrics_filters";

    if(object.has_key(metrics_filtersKey))
    {
        bourne::json value = object[metrics_filtersKey];


        std::list<AdsAnalyticsMetricsFilter> metrics_filters_list;
        AdsAnalyticsMetricsFilter element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            metrics_filters_list.push_back(element);
        }
        metrics_filters = metrics_filters_list;


    }

    const char *columnsKey = "columns";

    if(object.has_key(columnsKey))
    {
        bourne::json value = object[columnsKey];


        std::list<ReportingColumnAsync> columns_list;
        ReportingColumnAsync element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            columns_list.push_back(element);
        }
        columns = columns_list;


    }

    const char *combine_targeting_typesKey = "combine_targeting_types";

    if(object.has_key(combine_targeting_typesKey))
    {
        bourne::json value = object[combine_targeting_typesKey];



        jsonToValue(&combine_targeting_types, value, "bool");


    }

    const char *custom_conversion_event_metricsKey = "custom_conversion_event_metrics";

    if(object.has_key(custom_conversion_event_metricsKey))
    {
        bourne::json value = object[custom_conversion_event_metricsKey];


        std::list<AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics> custom_conversion_event_metrics_list;
        AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            custom_conversion_event_metrics_list.push_back(element);
        }
        custom_conversion_event_metrics = custom_conversion_event_metrics_list;


    }

    const char *end_hourKey = "end_hour";

    if(object.has_key(end_hourKey))
    {
        bourne::json value = object[end_hourKey];



        jsonToValue(&end_hour, value, "int");


    }

    const char *levelKey = "level";

    if(object.has_key(levelKey))
    {
        bourne::json value = object[levelKey];




        MetricsReportingLevel* obj = &level;
		obj->fromJson(value.dump());

    }

    const char *primary_sortKey = "primary_sort";

    if(object.has_key(primary_sortKey))
    {
        bourne::json value = object[primary_sortKey];



        jsonToValue(&primary_sort, value, "std::string");


    }

    const char *report_formatKey = "report_format";

    if(object.has_key(report_formatKey))
    {
        bourne::json value = object[report_formatKey];




        DataOutputFormat* obj = &report_format;
		obj->fromJson(value.dump());

    }

    const char *reporting_timezoneKey = "reporting_timezone";

    if(object.has_key(reporting_timezoneKey))
    {
        bourne::json value = object[reporting_timezoneKey];




        ReportingTimeZone* obj = &reporting_timezone;
		obj->fromJson(value.dump());

    }

    const char *start_hourKey = "start_hour";

    if(object.has_key(start_hourKey))
    {
        bourne::json value = object[start_hourKey];



        jsonToValue(&start_hour, value, "int");


    }


}

bourne::json
AdsAnalyticsCreateAsyncRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ConversionReportAttributionType> attribution_types_list = getAttributionTypes();
    bourne::json attribution_types_arr = bourne::json::array();

    for(auto& var : attribution_types_list)
    {
        ConversionReportAttributionType obj = var;
        attribution_types_arr.append(obj.toJson());
    }
    object["attribution_types"] = attribution_types_arr;








	object["click_window_days"] = getClickWindowDays().toJson();






	object["conversion_report_time"] = getConversionReportTime().toJson();





    object["end_date"] = getEndDate();







	object["engagement_window_days"] = getEngagementWindowDays().toJson();






	object["granularity"] = getGranularity().toJson();





    object["start_date"] = getStartDate();







	object["view_window_days"] = getViewWindowDays().toJson();




    std::list<std::string> campaign_ids_list = getCampaignIds();
    bourne::json campaign_ids_arr = bourne::json::array();

    for(auto& var : campaign_ids_list)
    {
        campaign_ids_arr.append(var);
    }
    object["campaign_ids"] = campaign_ids_arr;








    std::list<CampaignSummaryStatus> campaign_statuses_list = getCampaignStatuses();
    bourne::json campaign_statuses_arr = bourne::json::array();

    for(auto& var : campaign_statuses_list)
    {
        CampaignSummaryStatus obj = var;
        campaign_statuses_arr.append(obj.toJson());
    }
    object["campaign_statuses"] = campaign_statuses_arr;






    std::list<ObjectiveType> campaign_objective_types_list = getCampaignObjectiveTypes();
    bourne::json campaign_objective_types_arr = bourne::json::array();

    for(auto& var : campaign_objective_types_list)
    {
        ObjectiveType obj = var;
        campaign_objective_types_arr.append(obj.toJson());
    }
    object["campaign_objective_types"] = campaign_objective_types_arr;







    object["campaign_brand_label"] = getCampaignBrandLabel();





    std::list<std::string> ad_group_ids_list = getAdGroupIds();
    bourne::json ad_group_ids_arr = bourne::json::array();

    for(auto& var : ad_group_ids_list)
    {
        ad_group_ids_arr.append(var);
    }
    object["ad_group_ids"] = ad_group_ids_arr;








    std::list<AdGroupSummaryStatus> ad_group_statuses_list = getAdGroupStatuses();
    bourne::json ad_group_statuses_arr = bourne::json::array();

    for(auto& var : ad_group_statuses_list)
    {
        AdGroupSummaryStatus obj = var;
        ad_group_statuses_arr.append(obj.toJson());
    }
    object["ad_group_statuses"] = ad_group_statuses_arr;






    std::list<std::string> ad_ids_list = getAdIds();
    bourne::json ad_ids_arr = bourne::json::array();

    for(auto& var : ad_ids_list)
    {
        ad_ids_arr.append(var);
    }
    object["ad_ids"] = ad_ids_arr;








    std::list<PinPromotionSummaryStatus> ad_statuses_list = getAdStatuses();
    bourne::json ad_statuses_arr = bourne::json::array();

    for(auto& var : ad_statuses_list)
    {
        PinPromotionSummaryStatus obj = var;
        ad_statuses_arr.append(obj.toJson());
    }
    object["ad_statuses"] = ad_statuses_arr;






    std::list<std::string> product_group_ids_list = getProductGroupIds();
    bourne::json product_group_ids_arr = bourne::json::array();

    for(auto& var : product_group_ids_list)
    {
        product_group_ids_arr.append(var);
    }
    object["product_group_ids"] = product_group_ids_arr;








    std::list<ProductGroupSummaryStatus> product_group_statuses_list = getProductGroupStatuses();
    bourne::json product_group_statuses_arr = bourne::json::array();

    for(auto& var : product_group_statuses_list)
    {
        ProductGroupSummaryStatus obj = var;
        product_group_statuses_arr.append(obj.toJson());
    }
    object["product_group_statuses"] = product_group_statuses_arr;






    std::list<std::string> product_item_ids_list = getProductItemIds();
    bourne::json product_item_ids_arr = bourne::json::array();

    for(auto& var : product_item_ids_list)
    {
        product_item_ids_arr.append(var);
    }
    object["product_item_ids"] = product_item_ids_arr;








    std::list<std::string> targeting_types_list = getTargetingTypes();
    bourne::json targeting_types_arr = bourne::json::array();

    for(auto& var : targeting_types_list)
    {
        targeting_types_arr.append(var);
    }
    object["targeting_types"] = targeting_types_arr;








    std::list<AdsAnalyticsMetricsFilter> metrics_filters_list = getMetricsFilters();
    bourne::json metrics_filters_arr = bourne::json::array();

    for(auto& var : metrics_filters_list)
    {
        AdsAnalyticsMetricsFilter obj = var;
        metrics_filters_arr.append(obj.toJson());
    }
    object["metrics_filters"] = metrics_filters_arr;






    std::list<ReportingColumnAsync> columns_list = getColumns();
    bourne::json columns_arr = bourne::json::array();

    for(auto& var : columns_list)
    {
        ReportingColumnAsync obj = var;
        columns_arr.append(obj.toJson());
    }
    object["columns"] = columns_arr;







    object["combine_targeting_types"] = isCombineTargetingTypes();





    std::list<AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics> custom_conversion_event_metrics_list = getCustomConversionEventMetrics();
    bourne::json custom_conversion_event_metrics_arr = bourne::json::array();

    for(auto& var : custom_conversion_event_metrics_list)
    {
        AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics obj = var;
        custom_conversion_event_metrics_arr.append(obj.toJson());
    }
    object["custom_conversion_event_metrics"] = custom_conversion_event_metrics_arr;







    object["end_hour"] = getEndHour();







	object["level"] = getLevel().toJson();





    object["primary_sort"] = getPrimarySort();







	object["report_format"] = getReportFormat().toJson();






	object["reporting_timezone"] = getReportingTimezone().toJson();





    object["start_hour"] = getStartHour();



    return object;

}

std::list<ConversionReportAttributionType>
AdsAnalyticsCreateAsyncRequest::getAttributionTypes()
{
	return attribution_types;
}

void
AdsAnalyticsCreateAsyncRequest::setAttributionTypes(std::list <ConversionReportAttributionType> attribution_types)
{
	this->attribution_types = attribution_types;
}

ConversionAttributionWindowDays
AdsAnalyticsCreateAsyncRequest::getClickWindowDays()
{
	return click_window_days;
}

void
AdsAnalyticsCreateAsyncRequest::setClickWindowDays(ConversionAttributionWindowDays  click_window_days)
{
	this->click_window_days = click_window_days;
}

ConversionReportTimeType
AdsAnalyticsCreateAsyncRequest::getConversionReportTime()
{
	return conversion_report_time;
}

void
AdsAnalyticsCreateAsyncRequest::setConversionReportTime(ConversionReportTimeType  conversion_report_time)
{
	this->conversion_report_time = conversion_report_time;
}

std::string
AdsAnalyticsCreateAsyncRequest::getEndDate()
{
	return end_date;
}

void
AdsAnalyticsCreateAsyncRequest::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

ConversionAttributionWindowDays
AdsAnalyticsCreateAsyncRequest::getEngagementWindowDays()
{
	return engagement_window_days;
}

void
AdsAnalyticsCreateAsyncRequest::setEngagementWindowDays(ConversionAttributionWindowDays  engagement_window_days)
{
	this->engagement_window_days = engagement_window_days;
}

Granularity
AdsAnalyticsCreateAsyncRequest::getGranularity()
{
	return granularity;
}

void
AdsAnalyticsCreateAsyncRequest::setGranularity(Granularity  granularity)
{
	this->granularity = granularity;
}

std::string
AdsAnalyticsCreateAsyncRequest::getStartDate()
{
	return start_date;
}

void
AdsAnalyticsCreateAsyncRequest::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}

ConversionAttributionWindowDays
AdsAnalyticsCreateAsyncRequest::getViewWindowDays()
{
	return view_window_days;
}

void
AdsAnalyticsCreateAsyncRequest::setViewWindowDays(ConversionAttributionWindowDays  view_window_days)
{
	this->view_window_days = view_window_days;
}

std::list<std::string>
AdsAnalyticsCreateAsyncRequest::getCampaignIds()
{
	return campaign_ids;
}

void
AdsAnalyticsCreateAsyncRequest::setCampaignIds(std::list <std::string> campaign_ids)
{
	this->campaign_ids = campaign_ids;
}

std::list<CampaignSummaryStatus>
AdsAnalyticsCreateAsyncRequest::getCampaignStatuses()
{
	return campaign_statuses;
}

void
AdsAnalyticsCreateAsyncRequest::setCampaignStatuses(std::list <CampaignSummaryStatus> campaign_statuses)
{
	this->campaign_statuses = campaign_statuses;
}

std::list<ObjectiveType>
AdsAnalyticsCreateAsyncRequest::getCampaignObjectiveTypes()
{
	return campaign_objective_types;
}

void
AdsAnalyticsCreateAsyncRequest::setCampaignObjectiveTypes(std::list <ObjectiveType> campaign_objective_types)
{
	this->campaign_objective_types = campaign_objective_types;
}

std::string
AdsAnalyticsCreateAsyncRequest::getCampaignBrandLabel()
{
	return campaign_brand_label;
}

void
AdsAnalyticsCreateAsyncRequest::setCampaignBrandLabel(std::string  campaign_brand_label)
{
	this->campaign_brand_label = campaign_brand_label;
}

std::list<std::string>
AdsAnalyticsCreateAsyncRequest::getAdGroupIds()
{
	return ad_group_ids;
}

void
AdsAnalyticsCreateAsyncRequest::setAdGroupIds(std::list <std::string> ad_group_ids)
{
	this->ad_group_ids = ad_group_ids;
}

std::list<AdGroupSummaryStatus>
AdsAnalyticsCreateAsyncRequest::getAdGroupStatuses()
{
	return ad_group_statuses;
}

void
AdsAnalyticsCreateAsyncRequest::setAdGroupStatuses(std::list <AdGroupSummaryStatus> ad_group_statuses)
{
	this->ad_group_statuses = ad_group_statuses;
}

std::list<std::string>
AdsAnalyticsCreateAsyncRequest::getAdIds()
{
	return ad_ids;
}

void
AdsAnalyticsCreateAsyncRequest::setAdIds(std::list <std::string> ad_ids)
{
	this->ad_ids = ad_ids;
}

std::list<PinPromotionSummaryStatus>
AdsAnalyticsCreateAsyncRequest::getAdStatuses()
{
	return ad_statuses;
}

void
AdsAnalyticsCreateAsyncRequest::setAdStatuses(std::list <PinPromotionSummaryStatus> ad_statuses)
{
	this->ad_statuses = ad_statuses;
}

std::list<std::string>
AdsAnalyticsCreateAsyncRequest::getProductGroupIds()
{
	return product_group_ids;
}

void
AdsAnalyticsCreateAsyncRequest::setProductGroupIds(std::list <std::string> product_group_ids)
{
	this->product_group_ids = product_group_ids;
}

std::list<ProductGroupSummaryStatus>
AdsAnalyticsCreateAsyncRequest::getProductGroupStatuses()
{
	return product_group_statuses;
}

void
AdsAnalyticsCreateAsyncRequest::setProductGroupStatuses(std::list <ProductGroupSummaryStatus> product_group_statuses)
{
	this->product_group_statuses = product_group_statuses;
}

std::list<std::string>
AdsAnalyticsCreateAsyncRequest::getProductItemIds()
{
	return product_item_ids;
}

void
AdsAnalyticsCreateAsyncRequest::setProductItemIds(std::list <std::string> product_item_ids)
{
	this->product_item_ids = product_item_ids;
}

std::list<std::string>
AdsAnalyticsCreateAsyncRequest::getTargetingTypes()
{
	return targeting_types;
}

void
AdsAnalyticsCreateAsyncRequest::setTargetingTypes(std::list <std::string> targeting_types)
{
	this->targeting_types = targeting_types;
}

std::list<AdsAnalyticsMetricsFilter>
AdsAnalyticsCreateAsyncRequest::getMetricsFilters()
{
	return metrics_filters;
}

void
AdsAnalyticsCreateAsyncRequest::setMetricsFilters(std::list <AdsAnalyticsMetricsFilter> metrics_filters)
{
	this->metrics_filters = metrics_filters;
}

std::list<ReportingColumnAsync>
AdsAnalyticsCreateAsyncRequest::getColumns()
{
	return columns;
}

void
AdsAnalyticsCreateAsyncRequest::setColumns(std::list <ReportingColumnAsync> columns)
{
	this->columns = columns;
}

bool
AdsAnalyticsCreateAsyncRequest::isCombineTargetingTypes()
{
	return combine_targeting_types;
}

void
AdsAnalyticsCreateAsyncRequest::setCombineTargetingTypes(bool  combine_targeting_types)
{
	this->combine_targeting_types = combine_targeting_types;
}

std::list<AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics>
AdsAnalyticsCreateAsyncRequest::getCustomConversionEventMetrics()
{
	return custom_conversion_event_metrics;
}

void
AdsAnalyticsCreateAsyncRequest::setCustomConversionEventMetrics(std::list <AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics> custom_conversion_event_metrics)
{
	this->custom_conversion_event_metrics = custom_conversion_event_metrics;
}

int
AdsAnalyticsCreateAsyncRequest::getEndHour()
{
	return end_hour;
}

void
AdsAnalyticsCreateAsyncRequest::setEndHour(int  end_hour)
{
	this->end_hour = end_hour;
}

MetricsReportingLevel
AdsAnalyticsCreateAsyncRequest::getLevel()
{
	return level;
}

void
AdsAnalyticsCreateAsyncRequest::setLevel(MetricsReportingLevel  level)
{
	this->level = level;
}

std::string
AdsAnalyticsCreateAsyncRequest::getPrimarySort()
{
	return primary_sort;
}

void
AdsAnalyticsCreateAsyncRequest::setPrimarySort(std::string  primary_sort)
{
	this->primary_sort = primary_sort;
}

DataOutputFormat
AdsAnalyticsCreateAsyncRequest::getReportFormat()
{
	return report_format;
}

void
AdsAnalyticsCreateAsyncRequest::setReportFormat(DataOutputFormat  report_format)
{
	this->report_format = report_format;
}

ReportingTimeZone
AdsAnalyticsCreateAsyncRequest::getReportingTimezone()
{
	return reporting_timezone;
}

void
AdsAnalyticsCreateAsyncRequest::setReportingTimezone(ReportingTimeZone  reporting_timezone)
{
	this->reporting_timezone = reporting_timezone;
}

int
AdsAnalyticsCreateAsyncRequest::getStartHour()
{
	return start_hour;
}

void
AdsAnalyticsCreateAsyncRequest::setStartHour(int  start_hour)
{
	this->start_hour = start_hour;
}



