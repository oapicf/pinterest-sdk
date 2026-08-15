

#include "ConversionProductReportRequest.h"

using namespace Tiny;

ConversionProductReportRequest::ConversionProductReportRequest()
{
	ad_group_ids = std::list<std::string>();
	campaign_ids = std::list<std::string>();
	campaign_objective_types = std::list<ObjectiveType>();
	click_window_days = int(0);
	columns = std::list<ConversionProductReportingColumn>();
	conversion_product_attribution_type = std::string();
	conversion_product_breakdown = std::string();
	conversion_report_time = std::string();
	end_date = std::string();
	granularity = std::string();
	level = std::string();
	product_sku_ids = std::list<std::string>();
	report_name = std::string();
	start_date = std::string();
	view_window_days = int(0);
}

ConversionProductReportRequest::ConversionProductReportRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionProductReportRequest::~ConversionProductReportRequest()
{

}

void
ConversionProductReportRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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

    const char *click_window_daysKey = "click_window_days";

    if(object.has_key(click_window_daysKey))
    {
        bourne::json value = object[click_window_daysKey];




        ConversionAttributionWindowDays* obj = &click_window_days;
		obj->fromJson(value.dump());

    }

    const char *columnsKey = "columns";

    if(object.has_key(columnsKey))
    {
        bourne::json value = object[columnsKey];


        std::list<ConversionProductReportingColumn> columns_list;
        ConversionProductReportingColumn element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            columns_list.push_back(element);
        }
        columns = columns_list;


    }

    const char *conversion_product_attribution_typeKey = "conversion_product_attribution_type";

    if(object.has_key(conversion_product_attribution_typeKey))
    {
        bourne::json value = object[conversion_product_attribution_typeKey];



        jsonToValue(&conversion_product_attribution_type, value, "std::string");


    }

    const char *conversion_product_breakdownKey = "conversion_product_breakdown";

    if(object.has_key(conversion_product_breakdownKey))
    {
        bourne::json value = object[conversion_product_breakdownKey];



        jsonToValue(&conversion_product_breakdown, value, "std::string");


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

    const char *granularityKey = "granularity";

    if(object.has_key(granularityKey))
    {
        bourne::json value = object[granularityKey];



        jsonToValue(&granularity, value, "std::string");


    }

    const char *levelKey = "level";

    if(object.has_key(levelKey))
    {
        bourne::json value = object[levelKey];



        jsonToValue(&level, value, "std::string");


    }

    const char *product_sku_idsKey = "product_sku_ids";

    if(object.has_key(product_sku_idsKey))
    {
        bourne::json value = object[product_sku_idsKey];


        std::list<std::string> product_sku_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            product_sku_ids_list.push_back(element);
        }
        product_sku_ids = product_sku_ids_list;


    }

    const char *report_nameKey = "report_name";

    if(object.has_key(report_nameKey))
    {
        bourne::json value = object[report_nameKey];



        jsonToValue(&report_name, value, "std::string");


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


}

bourne::json
ConversionProductReportRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> ad_group_ids_list = getAdGroupIds();
    bourne::json ad_group_ids_arr = bourne::json::array();

    for(auto& var : ad_group_ids_list)
    {
        ad_group_ids_arr.append(var);
    }
    object["ad_group_ids"] = ad_group_ids_arr;








    std::list<std::string> campaign_ids_list = getCampaignIds();
    bourne::json campaign_ids_arr = bourne::json::array();

    for(auto& var : campaign_ids_list)
    {
        campaign_ids_arr.append(var);
    }
    object["campaign_ids"] = campaign_ids_arr;








    std::list<ObjectiveType> campaign_objective_types_list = getCampaignObjectiveTypes();
    bourne::json campaign_objective_types_arr = bourne::json::array();

    for(auto& var : campaign_objective_types_list)
    {
        ObjectiveType obj = var;
        campaign_objective_types_arr.append(obj.toJson());
    }
    object["campaign_objective_types"] = campaign_objective_types_arr;








	object["click_window_days"] = getClickWindowDays().toJson();




    std::list<ConversionProductReportingColumn> columns_list = getColumns();
    bourne::json columns_arr = bourne::json::array();

    for(auto& var : columns_list)
    {
        ConversionProductReportingColumn obj = var;
        columns_arr.append(obj.toJson());
    }
    object["columns"] = columns_arr;







    object["conversion_product_attribution_type"] = getConversionProductAttributionType();






    object["conversion_product_breakdown"] = getConversionProductBreakdown();







	object["conversion_report_time"] = getConversionReportTime().toJson();





    object["end_date"] = getEndDate();






    object["granularity"] = getGranularity();






    object["level"] = getLevel();





    std::list<std::string> product_sku_ids_list = getProductSkuIds();
    bourne::json product_sku_ids_arr = bourne::json::array();

    for(auto& var : product_sku_ids_list)
    {
        product_sku_ids_arr.append(var);
    }
    object["product_sku_ids"] = product_sku_ids_arr;









    object["report_name"] = getReportName();






    object["start_date"] = getStartDate();







	object["view_window_days"] = getViewWindowDays().toJson();


    return object;

}

std::list<std::string>
ConversionProductReportRequest::getAdGroupIds()
{
	return ad_group_ids;
}

void
ConversionProductReportRequest::setAdGroupIds(std::list <std::string> ad_group_ids)
{
	this->ad_group_ids = ad_group_ids;
}

std::list<std::string>
ConversionProductReportRequest::getCampaignIds()
{
	return campaign_ids;
}

void
ConversionProductReportRequest::setCampaignIds(std::list <std::string> campaign_ids)
{
	this->campaign_ids = campaign_ids;
}

std::list<ObjectiveType>
ConversionProductReportRequest::getCampaignObjectiveTypes()
{
	return campaign_objective_types;
}

void
ConversionProductReportRequest::setCampaignObjectiveTypes(std::list <ObjectiveType> campaign_objective_types)
{
	this->campaign_objective_types = campaign_objective_types;
}

ConversionAttributionWindowDays
ConversionProductReportRequest::getClickWindowDays()
{
	return click_window_days;
}

void
ConversionProductReportRequest::setClickWindowDays(ConversionAttributionWindowDays  click_window_days)
{
	this->click_window_days = click_window_days;
}

std::list<ConversionProductReportingColumn>
ConversionProductReportRequest::getColumns()
{
	return columns;
}

void
ConversionProductReportRequest::setColumns(std::list <ConversionProductReportingColumn> columns)
{
	this->columns = columns;
}

std::string
ConversionProductReportRequest::getConversionProductAttributionType()
{
	return conversion_product_attribution_type;
}

void
ConversionProductReportRequest::setConversionProductAttributionType(std::string  conversion_product_attribution_type)
{
	this->conversion_product_attribution_type = conversion_product_attribution_type;
}

std::string
ConversionProductReportRequest::getConversionProductBreakdown()
{
	return conversion_product_breakdown;
}

void
ConversionProductReportRequest::setConversionProductBreakdown(std::string  conversion_product_breakdown)
{
	this->conversion_product_breakdown = conversion_product_breakdown;
}

ConversionReportTimeType
ConversionProductReportRequest::getConversionReportTime()
{
	return conversion_report_time;
}

void
ConversionProductReportRequest::setConversionReportTime(ConversionReportTimeType  conversion_report_time)
{
	this->conversion_report_time = conversion_report_time;
}

std::string
ConversionProductReportRequest::getEndDate()
{
	return end_date;
}

void
ConversionProductReportRequest::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

std::string
ConversionProductReportRequest::getGranularity()
{
	return granularity;
}

void
ConversionProductReportRequest::setGranularity(std::string  granularity)
{
	this->granularity = granularity;
}

std::string
ConversionProductReportRequest::getLevel()
{
	return level;
}

void
ConversionProductReportRequest::setLevel(std::string  level)
{
	this->level = level;
}

std::list<std::string>
ConversionProductReportRequest::getProductSkuIds()
{
	return product_sku_ids;
}

void
ConversionProductReportRequest::setProductSkuIds(std::list <std::string> product_sku_ids)
{
	this->product_sku_ids = product_sku_ids;
}

std::string
ConversionProductReportRequest::getReportName()
{
	return report_name;
}

void
ConversionProductReportRequest::setReportName(std::string  report_name)
{
	this->report_name = report_name;
}

std::string
ConversionProductReportRequest::getStartDate()
{
	return start_date;
}

void
ConversionProductReportRequest::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}

ConversionAttributionWindowDays
ConversionProductReportRequest::getViewWindowDays()
{
	return view_window_days;
}

void
ConversionProductReportRequest::setViewWindowDays(ConversionAttributionWindowDays  view_window_days)
{
	this->view_window_days = view_window_days;
}



