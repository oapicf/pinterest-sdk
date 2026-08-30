

#include "ConversionProductReportCreate.h"

using namespace Tiny;

ConversionProductReportCreate::ConversionProductReportCreate()
{
	ad_group_ids = std::list<std::string>();
	campaign_ids = std::list<std::string>();
	campaign_objective_types = std::list<ConversionObjectiveType>();
	click_window_days = null;
	columns = std::list<ConversionProductReportingColumn>();
	conversion_product_attribution_type = null;
	conversion_product_breakdown = null;
	conversion_report_time = null;
	end_date = std::string();
	granularity = null;
	level = null;
	product_sku_ids = std::list<std::string>();
	report_name = std::string();
	start_date = std::string();
	view_window_days = null;
}

ConversionProductReportCreate::ConversionProductReportCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionProductReportCreate::~ConversionProductReportCreate()
{

}

void
ConversionProductReportCreate::fromJson(std::string jsonObj)
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


        std::list<ConversionObjectiveType> campaign_objective_types_list;
        ConversionObjectiveType element;
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




        ConversionProductAttributionType* obj = &conversion_product_attribution_type;
		obj->fromJson(value.dump());

    }

    const char *conversion_product_breakdownKey = "conversion_product_breakdown";

    if(object.has_key(conversion_product_breakdownKey))
    {
        bourne::json value = object[conversion_product_breakdownKey];




        ConversionProductReportBreakdownType* obj = &conversion_product_breakdown;
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

    const char *granularityKey = "granularity";

    if(object.has_key(granularityKey))
    {
        bourne::json value = object[granularityKey];




        ConversionProductReportGranularity* obj = &granularity;
		obj->fromJson(value.dump());

    }

    const char *levelKey = "level";

    if(object.has_key(levelKey))
    {
        bourne::json value = object[levelKey];




        ConversionProductReportLevel* obj = &level;
		obj->fromJson(value.dump());

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
ConversionProductReportCreate::toJson()
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








    std::list<ConversionObjectiveType> campaign_objective_types_list = getCampaignObjectiveTypes();
    bourne::json campaign_objective_types_arr = bourne::json::array();

    for(auto& var : campaign_objective_types_list)
    {
        ConversionObjectiveType obj = var;
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








	object["conversion_product_attribution_type"] = getConversionProductAttributionType().toJson();






	object["conversion_product_breakdown"] = getConversionProductBreakdown().toJson();






	object["conversion_report_time"] = getConversionReportTime().toJson();





    object["end_date"] = getEndDate();







	object["granularity"] = getGranularity().toJson();






	object["level"] = getLevel().toJson();




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
ConversionProductReportCreate::getAdGroupIds()
{
	return ad_group_ids;
}

void
ConversionProductReportCreate::setAdGroupIds(std::list<std::string> ad_group_ids)
{
	this->ad_group_ids = ad_group_ids;
}

std::list<std::string>
ConversionProductReportCreate::getCampaignIds()
{
	return campaign_ids;
}

void
ConversionProductReportCreate::setCampaignIds(std::list<std::string> campaign_ids)
{
	this->campaign_ids = campaign_ids;
}

std::list<ConversionObjectiveType>
ConversionProductReportCreate::getCampaignObjectiveTypes()
{
	return campaign_objective_types;
}

void
ConversionProductReportCreate::setCampaignObjectiveTypes(std::list<ConversionObjectiveType> campaign_objective_types)
{
	this->campaign_objective_types = campaign_objective_types;
}

ConversionAttributionWindowDays
ConversionProductReportCreate::getClickWindowDays()
{
	return click_window_days;
}

void
ConversionProductReportCreate::setClickWindowDays(ConversionAttributionWindowDays click_window_days)
{
	this->click_window_days = click_window_days;
}

std::list<ConversionProductReportingColumn>
ConversionProductReportCreate::getColumns()
{
	return columns;
}

void
ConversionProductReportCreate::setColumns(std::list<ConversionProductReportingColumn> columns)
{
	this->columns = columns;
}

ConversionProductAttributionType
ConversionProductReportCreate::getConversionProductAttributionType()
{
	return conversion_product_attribution_type;
}

void
ConversionProductReportCreate::setConversionProductAttributionType(ConversionProductAttributionType conversion_product_attribution_type)
{
	this->conversion_product_attribution_type = conversion_product_attribution_type;
}

ConversionProductReportBreakdownType
ConversionProductReportCreate::getConversionProductBreakdown()
{
	return conversion_product_breakdown;
}

void
ConversionProductReportCreate::setConversionProductBreakdown(ConversionProductReportBreakdownType conversion_product_breakdown)
{
	this->conversion_product_breakdown = conversion_product_breakdown;
}

ConversionReportTimeType
ConversionProductReportCreate::getConversionReportTime()
{
	return conversion_report_time;
}

void
ConversionProductReportCreate::setConversionReportTime(ConversionReportTimeType conversion_report_time)
{
	this->conversion_report_time = conversion_report_time;
}

std::string
ConversionProductReportCreate::getEndDate()
{
	return end_date;
}

void
ConversionProductReportCreate::setEndDate(std::string end_date)
{
	this->end_date = end_date;
}

ConversionProductReportGranularity
ConversionProductReportCreate::getGranularity()
{
	return granularity;
}

void
ConversionProductReportCreate::setGranularity(ConversionProductReportGranularity granularity)
{
	this->granularity = granularity;
}

ConversionProductReportLevel
ConversionProductReportCreate::getLevel()
{
	return level;
}

void
ConversionProductReportCreate::setLevel(ConversionProductReportLevel level)
{
	this->level = level;
}

std::list<std::string>
ConversionProductReportCreate::getProductSkuIds()
{
	return product_sku_ids;
}

void
ConversionProductReportCreate::setProductSkuIds(std::list<std::string> product_sku_ids)
{
	this->product_sku_ids = product_sku_ids;
}

std::string
ConversionProductReportCreate::getReportName()
{
	return report_name;
}

void
ConversionProductReportCreate::setReportName(std::string report_name)
{
	this->report_name = report_name;
}

std::string
ConversionProductReportCreate::getStartDate()
{
	return start_date;
}

void
ConversionProductReportCreate::setStartDate(std::string start_date)
{
	this->start_date = start_date;
}

ConversionAttributionWindowDays
ConversionProductReportCreate::getViewWindowDays()
{
	return view_window_days;
}

void
ConversionProductReportCreate::setViewWindowDays(ConversionAttributionWindowDays view_window_days)
{
	this->view_window_days = view_window_days;
}



