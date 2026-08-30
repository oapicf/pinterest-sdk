

#include "BulkDownloadCreate.h"

using namespace Tiny;

BulkDownloadCreate::BulkDownloadCreate()
{
	campaign_filter = BulkDownloadCampaignFilter();
	entity_ids = std::list<std::string>();
	entity_types = std::list<BulkEntityType>();
	output_format = null;
	updated_since = std::string();
}

BulkDownloadCreate::BulkDownloadCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkDownloadCreate::~BulkDownloadCreate()
{

}

void
BulkDownloadCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaign_filterKey = "campaign_filter";

    if(object.has_key(campaign_filterKey))
    {
        bourne::json value = object[campaign_filterKey];




        BulkDownloadCampaignFilter* obj = &campaign_filter;
		obj->fromJson(value.dump());

    }

    const char *entity_idsKey = "entity_ids";

    if(object.has_key(entity_idsKey))
    {
        bourne::json value = object[entity_idsKey];


        std::list<std::string> entity_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            entity_ids_list.push_back(element);
        }
        entity_ids = entity_ids_list;


    }

    const char *entity_typesKey = "entity_types";

    if(object.has_key(entity_typesKey))
    {
        bourne::json value = object[entity_typesKey];


        std::list<BulkEntityType> entity_types_list;
        BulkEntityType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            entity_types_list.push_back(element);
        }
        entity_types = entity_types_list;


    }

    const char *output_formatKey = "output_format";

    if(object.has_key(output_formatKey))
    {
        bourne::json value = object[output_formatKey];




        BulkOutputFormat* obj = &output_format;
		obj->fromJson(value.dump());

    }

    const char *updated_sinceKey = "updated_since";

    if(object.has_key(updated_sinceKey))
    {
        bourne::json value = object[updated_sinceKey];



        jsonToValue(&updated_since, value, "std::string");


    }


}

bourne::json
BulkDownloadCreate::toJson()
{
    bourne::json object = bourne::json::object();






	object["campaign_filter"] = getCampaignFilter().toJson();




    std::list<std::string> entity_ids_list = getEntityIds();
    bourne::json entity_ids_arr = bourne::json::array();

    for(auto& var : entity_ids_list)
    {
        entity_ids_arr.append(var);
    }
    object["entity_ids"] = entity_ids_arr;








    std::list<BulkEntityType> entity_types_list = getEntityTypes();
    bourne::json entity_types_arr = bourne::json::array();

    for(auto& var : entity_types_list)
    {
        BulkEntityType obj = var;
        entity_types_arr.append(obj.toJson());
    }
    object["entity_types"] = entity_types_arr;








	object["output_format"] = getOutputFormat().toJson();





    object["updated_since"] = getUpdatedSince();



    return object;

}

BulkDownloadCampaignFilter
BulkDownloadCreate::getCampaignFilter()
{
	return campaign_filter;
}

void
BulkDownloadCreate::setCampaignFilter(BulkDownloadCampaignFilter campaign_filter)
{
	this->campaign_filter = campaign_filter;
}

std::list<std::string>
BulkDownloadCreate::getEntityIds()
{
	return entity_ids;
}

void
BulkDownloadCreate::setEntityIds(std::list<std::string> entity_ids)
{
	this->entity_ids = entity_ids;
}

std::list<BulkEntityType>
BulkDownloadCreate::getEntityTypes()
{
	return entity_types;
}

void
BulkDownloadCreate::setEntityTypes(std::list<BulkEntityType> entity_types)
{
	this->entity_types = entity_types;
}

BulkOutputFormat
BulkDownloadCreate::getOutputFormat()
{
	return output_format;
}

void
BulkDownloadCreate::setOutputFormat(BulkOutputFormat output_format)
{
	this->output_format = output_format;
}

std::string
BulkDownloadCreate::getUpdatedSince()
{
	return updated_since;
}

void
BulkDownloadCreate::setUpdatedSince(std::string updated_since)
{
	this->updated_since = updated_since;
}



