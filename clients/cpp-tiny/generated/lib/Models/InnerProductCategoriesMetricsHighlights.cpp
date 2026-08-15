

#include "InnerProductCategoriesMetricsHighlights.h"

using namespace Tiny;

InnerProductCategoriesMetricsHighlights::InnerProductCategoriesMetricsHighlights()
{
	pct_change_mom = float(0);
}

InnerProductCategoriesMetricsHighlights::InnerProductCategoriesMetricsHighlights(std::string jsonString)
{
	this->fromJson(jsonString);
}

InnerProductCategoriesMetricsHighlights::~InnerProductCategoriesMetricsHighlights()
{

}

void
InnerProductCategoriesMetricsHighlights::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pct_change_momKey = "pct_change_mom";

    if(object.has_key(pct_change_momKey))
    {
        bourne::json value = object[pct_change_momKey];



        jsonToValue(&pct_change_mom, value, "long");


    }


}

bourne::json
InnerProductCategoriesMetricsHighlights::toJson()
{
    bourne::json object = bourne::json::object();





    object["pct_change_mom"] = getPctChangeMom();



    return object;

}

long
InnerProductCategoriesMetricsHighlights::getPctChangeMom()
{
	return pct_change_mom;
}

void
InnerProductCategoriesMetricsHighlights::setPctChangeMom(long  pct_change_mom)
{
	this->pct_change_mom = pct_change_mom;
}



