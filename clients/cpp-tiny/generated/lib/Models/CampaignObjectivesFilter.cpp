

#include "CampaignObjectivesFilter.h"

using namespace Tiny;

CampaignObjectivesFilter::CampaignObjectivesFilter()
{
	campaign_objective_types = std::list<ObjectiveType>();
}

CampaignObjectivesFilter::CampaignObjectivesFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignObjectivesFilter::~CampaignObjectivesFilter()
{

}

void
CampaignObjectivesFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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


}

bourne::json
CampaignObjectivesFilter::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ObjectiveType> campaign_objective_types_list = getCampaignObjectiveTypes();
    bourne::json campaign_objective_types_arr = bourne::json::array();

    for(auto& var : campaign_objective_types_list)
    {
        ObjectiveType obj = var;
        campaign_objective_types_arr.append(obj.toJson());
    }
    object["campaign_objective_types"] = campaign_objective_types_arr;




    return object;

}

std::list<ObjectiveType>
CampaignObjectivesFilter::getCampaignObjectiveTypes()
{
	return campaign_objective_types;
}

void
CampaignObjectivesFilter::setCampaignObjectiveTypes(std::list <ObjectiveType> campaign_objective_types)
{
	this->campaign_objective_types = campaign_objective_types;
}



