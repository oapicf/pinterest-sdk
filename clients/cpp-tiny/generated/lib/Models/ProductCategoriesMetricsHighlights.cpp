

#include "ProductCategoriesMetricsHighlights.h"

using namespace Tiny;

ProductCategoriesMetricsHighlights::ProductCategoriesMetricsHighlights()
{
	engagement = null;
	outbound_clicks = null;
	pin_saves = null;
}

ProductCategoriesMetricsHighlights::ProductCategoriesMetricsHighlights(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductCategoriesMetricsHighlights::~ProductCategoriesMetricsHighlights()
{

}

void
ProductCategoriesMetricsHighlights::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *engagementKey = "engagement";

    if(object.has_key(engagementKey))
    {
        bourne::json value = object[engagementKey];




        InnerProductCategoriesMetricsHighlights* obj = &engagement;
		obj->fromJson(value.dump());

    }

    const char *outbound_clicksKey = "outbound_clicks";

    if(object.has_key(outbound_clicksKey))
    {
        bourne::json value = object[outbound_clicksKey];




        InnerProductCategoriesMetricsHighlights* obj = &outbound_clicks;
		obj->fromJson(value.dump());

    }

    const char *pin_savesKey = "pin_saves";

    if(object.has_key(pin_savesKey))
    {
        bourne::json value = object[pin_savesKey];




        InnerProductCategoriesMetricsHighlights* obj = &pin_saves;
		obj->fromJson(value.dump());

    }


}

bourne::json
ProductCategoriesMetricsHighlights::toJson()
{
    bourne::json object = bourne::json::object();






	object["engagement"] = getEngagement().toJson();






	object["outbound_clicks"] = getOutboundClicks().toJson();






	object["pin_saves"] = getPinSaves().toJson();


    return object;

}

InnerProductCategoriesMetricsHighlights
ProductCategoriesMetricsHighlights::getEngagement()
{
	return engagement;
}

void
ProductCategoriesMetricsHighlights::setEngagement(InnerProductCategoriesMetricsHighlights engagement)
{
	this->engagement = engagement;
}

InnerProductCategoriesMetricsHighlights
ProductCategoriesMetricsHighlights::getOutboundClicks()
{
	return outbound_clicks;
}

void
ProductCategoriesMetricsHighlights::setOutboundClicks(InnerProductCategoriesMetricsHighlights outbound_clicks)
{
	this->outbound_clicks = outbound_clicks;
}

InnerProductCategoriesMetricsHighlights
ProductCategoriesMetricsHighlights::getPinSaves()
{
	return pin_saves;
}

void
ProductCategoriesMetricsHighlights::setPinSaves(InnerProductCategoriesMetricsHighlights pin_saves)
{
	this->pin_saves = pin_saves;
}



