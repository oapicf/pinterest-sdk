

#include "CatalogsListProductsByFeedBasedFilter.h"

using namespace Tiny;

CatalogsListProductsByFeedBasedFilter::CatalogsListProductsByFeedBasedFilter()
{
	feed_id = std::string();
	filters = CatalogsProductGroupFilters();
}

CatalogsListProductsByFeedBasedFilter::CatalogsListProductsByFeedBasedFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsListProductsByFeedBasedFilter::~CatalogsListProductsByFeedBasedFilter()
{

}

void
CatalogsListProductsByFeedBasedFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *feed_idKey = "feed_id";

    if(object.has_key(feed_idKey))
    {
        bourne::json value = object[feed_idKey];



        jsonToValue(&feed_id, value, "std::string");


    }

    const char *filtersKey = "filters";

    if(object.has_key(filtersKey))
    {
        bourne::json value = object[filtersKey];




        CatalogsProductGroupFilters* obj = &filters;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsListProductsByFeedBasedFilter::toJson()
{
    bourne::json object = bourne::json::object();





    object["feed_id"] = getFeedId();







	object["filters"] = getFilters().toJson();


    return object;

}

std::string
CatalogsListProductsByFeedBasedFilter::getFeedId()
{
	return feed_id;
}

void
CatalogsListProductsByFeedBasedFilter::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}

CatalogsProductGroupFilters
CatalogsListProductsByFeedBasedFilter::getFilters()
{
	return filters;
}

void
CatalogsListProductsByFeedBasedFilter::setFilters(CatalogsProductGroupFilters  filters)
{
	this->filters = filters;
}



