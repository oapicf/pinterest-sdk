

#include "ProductCategoryDetails.h"

using namespace Tiny;

ProductCategoryDetails::ProductCategoryDetails()
{
	demographics = ProductCategoriesDemographic();
	has_prediction = bool(false);
	metrics_highlights = ProductCategoriesMetricsHighlights();
	predicted_time_series = null<long>();
	product_category = ProductCategoryEnum();
	related_searches = std::list<std::string>();
	time_series = null<long>();
}

ProductCategoryDetails::ProductCategoryDetails(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductCategoryDetails::~ProductCategoryDetails()
{

}

void
ProductCategoryDetails::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *demographicsKey = "demographics";

    if(object.has_key(demographicsKey))
    {
        bourne::json value = object[demographicsKey];




        ProductCategoriesDemographic* obj = &demographics;
		obj->fromJson(value.dump());

    }

    const char *has_predictionKey = "has_prediction";

    if(object.has_key(has_predictionKey))
    {
        bourne::json value = object[has_predictionKey];



        jsonToValue(&has_prediction, value, "bool");


    }

    const char *metrics_highlightsKey = "metrics_highlights";

    if(object.has_key(metrics_highlightsKey))
    {
        bourne::json value = object[metrics_highlightsKey];




        ProductCategoriesMetricsHighlights* obj = &metrics_highlights;
		obj->fromJson(value.dump());

    }

    const char *predicted_time_seriesKey = "predicted_time_series";

    if(object.has_key(predicted_time_seriesKey))
    {
        bourne::json value = object[predicted_time_seriesKey];


    }

    const char *product_categoryKey = "product_category";

    if(object.has_key(product_categoryKey))
    {
        bourne::json value = object[product_categoryKey];




        ProductCategoryEnum* obj = &product_category;
		obj->fromJson(value.dump());

    }

    const char *related_searchesKey = "related_searches";

    if(object.has_key(related_searchesKey))
    {
        bourne::json value = object[related_searchesKey];


        std::list<std::string> related_searches_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            related_searches_list.push_back(element);
        }
        related_searches = related_searches_list;


    }

    const char *time_seriesKey = "time_series";

    if(object.has_key(time_seriesKey))
    {
        bourne::json value = object[time_seriesKey];


    }


}

bourne::json
ProductCategoryDetails::toJson()
{
    bourne::json object = bourne::json::object();






	object["demographics"] = getDemographics().toJson();





    object["has_prediction"] = isHasPrediction();







	object["metrics_highlights"] = getMetricsHighlights().toJson();









	object["product_category"] = getProductCategory().toJson();




    std::list<std::string> related_searches_list = getRelatedSearches();
    bourne::json related_searches_arr = bourne::json::array();

    for(auto& var : related_searches_list)
    {
        related_searches_arr.append(var);
    }
    object["related_searches"] = related_searches_arr;









    return object;

}

ProductCategoriesDemographic
ProductCategoryDetails::getDemographics()
{
	return demographics;
}

void
ProductCategoryDetails::setDemographics(ProductCategoriesDemographic  demographics)
{
	this->demographics = demographics;
}

bool
ProductCategoryDetails::isHasPrediction()
{
	return has_prediction;
}

void
ProductCategoryDetails::setHasPrediction(bool  has_prediction)
{
	this->has_prediction = has_prediction;
}

ProductCategoriesMetricsHighlights
ProductCategoryDetails::getMetricsHighlights()
{
	return metrics_highlights;
}

void
ProductCategoryDetails::setMetricsHighlights(ProductCategoriesMetricsHighlights  metrics_highlights)
{
	this->metrics_highlights = metrics_highlights;
}

Map<string, string>
ProductCategoryDetails::getPredictedTimeSeries()
{
	return predicted_time_series;
}

void
ProductCategoryDetails::setPredictedTimeSeries(Map <string, string> predicted_time_series)
{
	this->predicted_time_series = predicted_time_series;
}

ProductCategoryEnum
ProductCategoryDetails::getProductCategory()
{
	return product_category;
}

void
ProductCategoryDetails::setProductCategory(ProductCategoryEnum  product_category)
{
	this->product_category = product_category;
}

std::list<std::string>
ProductCategoryDetails::getRelatedSearches()
{
	return related_searches;
}

void
ProductCategoryDetails::setRelatedSearches(std::list <std::string> related_searches)
{
	this->related_searches = related_searches;
}

Map<string, string>
ProductCategoryDetails::getTimeSeries()
{
	return time_series;
}

void
ProductCategoryDetails::setTimeSeries(Map <string, string> time_series)
{
	this->time_series = time_series;
}



