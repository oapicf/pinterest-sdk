

#include "TrendingKeywordsResponse.h"

using namespace Tiny;

TrendingKeywordsResponse::TrendingKeywordsResponse()
{
	trends = std::list<TrendingKeyword>();
}

TrendingKeywordsResponse::TrendingKeywordsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendingKeywordsResponse::~TrendingKeywordsResponse()
{

}

void
TrendingKeywordsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *trendsKey = "trends";

    if(object.has_key(trendsKey))
    {
        bourne::json value = object[trendsKey];


        std::list<TrendingKeyword> trends_list;
        TrendingKeyword element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            trends_list.push_back(element);
        }
        trends = trends_list;


    }


}

bourne::json
TrendingKeywordsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<TrendingKeyword> trends_list = getTrends();
    bourne::json trends_arr = bourne::json::array();

    for(auto& var : trends_list)
    {
        TrendingKeyword obj = var;
        trends_arr.append(obj.toJson());
    }
    object["trends"] = trends_arr;




    return object;

}

std::list<TrendingKeyword>
TrendingKeywordsResponse::getTrends()
{
	return trends;
}

void
TrendingKeywordsResponse::setTrends(std::list <TrendingKeyword> trends)
{
	this->trends = trends;
}



