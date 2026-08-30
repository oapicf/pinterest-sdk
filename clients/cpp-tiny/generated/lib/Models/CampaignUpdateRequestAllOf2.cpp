

#include "CampaignUpdateRequestAllOf2.h"

using namespace Tiny;

CampaignUpdateRequestAllOf2::CampaignUpdateRequestAllOf2()
{
	bid_options = CampaignBidOptionsUpdate();
	intended_promotion_type = IntendedPromotionType();
	is_ltv_optimized = bool(false);
	is_performance_plus = bool(false);
	is_top_of_search = bool(false);
	objective_type = null;
}

CampaignUpdateRequestAllOf2::CampaignUpdateRequestAllOf2(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignUpdateRequestAllOf2::~CampaignUpdateRequestAllOf2()
{

}

void
CampaignUpdateRequestAllOf2::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bid_optionsKey = "bid_options";

    if(object.has_key(bid_optionsKey))
    {
        bourne::json value = object[bid_optionsKey];




        CampaignBidOptionsUpdate* obj = &bid_options;
		obj->fromJson(value.dump());

    }

    const char *intended_promotion_typeKey = "intended_promotion_type";

    if(object.has_key(intended_promotion_typeKey))
    {
        bourne::json value = object[intended_promotion_typeKey];




        IntendedPromotionType* obj = &intended_promotion_type;
		obj->fromJson(value.dump());

    }

    const char *is_ltv_optimizedKey = "is_ltv_optimized";

    if(object.has_key(is_ltv_optimizedKey))
    {
        bourne::json value = object[is_ltv_optimizedKey];



        jsonToValue(&is_ltv_optimized, value, "bool");


    }

    const char *is_performance_plusKey = "is_performance_plus";

    if(object.has_key(is_performance_plusKey))
    {
        bourne::json value = object[is_performance_plusKey];



        jsonToValue(&is_performance_plus, value, "bool");


    }

    const char *is_top_of_searchKey = "is_top_of_search";

    if(object.has_key(is_top_of_searchKey))
    {
        bourne::json value = object[is_top_of_searchKey];



        jsonToValue(&is_top_of_search, value, "bool");


    }

    const char *objective_typeKey = "objective_type";

    if(object.has_key(objective_typeKey))
    {
        bourne::json value = object[objective_typeKey];




        ObjectiveType* obj = &objective_type;
		obj->fromJson(value.dump());

    }


}

bourne::json
CampaignUpdateRequestAllOf2::toJson()
{
    bourne::json object = bourne::json::object();






	object["bid_options"] = getBidOptions().toJson();






	object["intended_promotion_type"] = getIntendedPromotionType().toJson();





    object["is_ltv_optimized"] = isIsLtvOptimized();






    object["is_performance_plus"] = isIsPerformancePlus();






    object["is_top_of_search"] = isIsTopOfSearch();







	object["objective_type"] = getObjectiveType().toJson();


    return object;

}

CampaignBidOptionsUpdate
CampaignUpdateRequestAllOf2::getBidOptions()
{
	return bid_options;
}

void
CampaignUpdateRequestAllOf2::setBidOptions(CampaignBidOptionsUpdate bid_options)
{
	this->bid_options = bid_options;
}

IntendedPromotionType
CampaignUpdateRequestAllOf2::getIntendedPromotionType()
{
	return intended_promotion_type;
}

void
CampaignUpdateRequestAllOf2::setIntendedPromotionType(IntendedPromotionType intended_promotion_type)
{
	this->intended_promotion_type = intended_promotion_type;
}

bool
CampaignUpdateRequestAllOf2::isIsLtvOptimized()
{
	return is_ltv_optimized;
}

void
CampaignUpdateRequestAllOf2::setIsLtvOptimized(bool is_ltv_optimized)
{
	this->is_ltv_optimized = is_ltv_optimized;
}

bool
CampaignUpdateRequestAllOf2::isIsPerformancePlus()
{
	return is_performance_plus;
}

void
CampaignUpdateRequestAllOf2::setIsPerformancePlus(bool is_performance_plus)
{
	this->is_performance_plus = is_performance_plus;
}

bool
CampaignUpdateRequestAllOf2::isIsTopOfSearch()
{
	return is_top_of_search;
}

void
CampaignUpdateRequestAllOf2::setIsTopOfSearch(bool is_top_of_search)
{
	this->is_top_of_search = is_top_of_search;
}

ObjectiveType
CampaignUpdateRequestAllOf2::getObjectiveType()
{
	return objective_type;
}

void
CampaignUpdateRequestAllOf2::setObjectiveType(ObjectiveType objective_type)
{
	this->objective_type = objective_type;
}



