

#include "TrendingProductCategory.h"

using namespace Tiny;

TrendingProductCategory::TrendingProductCategory()
{
	engagement_type = null;
	pct_change_mom = int(0);
	percent_relative_volume = int(0);
	product_category = std::string();
	verticals = std::list<VerticalProductCategory>();
}

TrendingProductCategory::TrendingProductCategory(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendingProductCategory::~TrendingProductCategory()
{

}

void
TrendingProductCategory::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *engagement_typeKey = "engagement_type";

    if(object.has_key(engagement_typeKey))
    {
        bourne::json value = object[engagement_typeKey];




        ProductCategoriesEngagementType* obj = &engagement_type;
		obj->fromJson(value.dump());

    }

    const char *pct_change_momKey = "pct_change_mom";

    if(object.has_key(pct_change_momKey))
    {
        bourne::json value = object[pct_change_momKey];



        jsonToValue(&pct_change_mom, value, "int");


    }

    const char *percent_relative_volumeKey = "percent_relative_volume";

    if(object.has_key(percent_relative_volumeKey))
    {
        bourne::json value = object[percent_relative_volumeKey];



        jsonToValue(&percent_relative_volume, value, "int");


    }

    const char *product_categoryKey = "product_category";

    if(object.has_key(product_categoryKey))
    {
        bourne::json value = object[product_categoryKey];



        jsonToValue(&product_category, value, "std::string");


    }

    const char *verticalsKey = "verticals";

    if(object.has_key(verticalsKey))
    {
        bourne::json value = object[verticalsKey];


        std::list<VerticalProductCategory> verticals_list;
        VerticalProductCategory element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            verticals_list.push_back(element);
        }
        verticals = verticals_list;


    }


}

bourne::json
TrendingProductCategory::toJson()
{
    bourne::json object = bourne::json::object();






	object["engagement_type"] = getEngagementType().toJson();





    object["pct_change_mom"] = getPctChangeMom();






    object["percent_relative_volume"] = getPercentRelativeVolume();






    object["product_category"] = getProductCategory();





    std::list<VerticalProductCategory> verticals_list = getVerticals();
    bourne::json verticals_arr = bourne::json::array();

    for(auto& var : verticals_list)
    {
        VerticalProductCategory obj = var;
        verticals_arr.append(obj.toJson());
    }
    object["verticals"] = verticals_arr;




    return object;

}

ProductCategoriesEngagementType
TrendingProductCategory::getEngagementType()
{
	return engagement_type;
}

void
TrendingProductCategory::setEngagementType(ProductCategoriesEngagementType  engagement_type)
{
	this->engagement_type = engagement_type;
}

int
TrendingProductCategory::getPctChangeMom()
{
	return pct_change_mom;
}

void
TrendingProductCategory::setPctChangeMom(int  pct_change_mom)
{
	this->pct_change_mom = pct_change_mom;
}

int
TrendingProductCategory::getPercentRelativeVolume()
{
	return percent_relative_volume;
}

void
TrendingProductCategory::setPercentRelativeVolume(int  percent_relative_volume)
{
	this->percent_relative_volume = percent_relative_volume;
}

std::string
TrendingProductCategory::getProductCategory()
{
	return product_category;
}

void
TrendingProductCategory::setProductCategory(std::string  product_category)
{
	this->product_category = product_category;
}

std::list<VerticalProductCategory>
TrendingProductCategory::getVerticals()
{
	return verticals;
}

void
TrendingProductCategory::setVerticals(std::list <VerticalProductCategory> verticals)
{
	this->verticals = verticals;
}



