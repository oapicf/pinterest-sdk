

#include "FeaturedTrend.h"

using namespace Tiny;

FeaturedTrend::FeaturedTrend()
{
	interest = null;
	market = null;
	trends = std::list<TrendingTopic>();
}

FeaturedTrend::FeaturedTrend(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeaturedTrend::~FeaturedTrend()
{

}

void
FeaturedTrend::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *interestKey = "interest";

    if(object.has_key(interestKey))
    {
        bourne::json value = object[interestKey];




        InterestsEnum* obj = &interest;
		obj->fromJson(value.dump());

    }

    const char *marketKey = "market";

    if(object.has_key(marketKey))
    {
        bourne::json value = object[marketKey];




        ProductCategoryRegion* obj = &market;
		obj->fromJson(value.dump());

    }

    const char *trendsKey = "trends";

    if(object.has_key(trendsKey))
    {
        bourne::json value = object[trendsKey];


        std::list<TrendingTopic> trends_list;
        TrendingTopic element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            trends_list.push_back(element);
        }
        trends = trends_list;


    }


}

bourne::json
FeaturedTrend::toJson()
{
    bourne::json object = bourne::json::object();






	object["interest"] = getInterest().toJson();






	object["market"] = getMarket().toJson();




    std::list<TrendingTopic> trends_list = getTrends();
    bourne::json trends_arr = bourne::json::array();

    for(auto& var : trends_list)
    {
        TrendingTopic obj = var;
        trends_arr.append(obj.toJson());
    }
    object["trends"] = trends_arr;




    return object;

}

InterestsEnum
FeaturedTrend::getInterest()
{
	return interest;
}

void
FeaturedTrend::setInterest(InterestsEnum interest)
{
	this->interest = interest;
}

ProductCategoryRegion
FeaturedTrend::getMarket()
{
	return market;
}

void
FeaturedTrend::setMarket(ProductCategoryRegion market)
{
	this->market = market;
}

std::list<TrendingTopic>
FeaturedTrend::getTrends()
{
	return trends;
}

void
FeaturedTrend::setTrends(std::list<TrendingTopic> trends)
{
	this->trends = trends;
}



