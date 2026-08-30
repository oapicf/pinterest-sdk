

#include "AudienceInsights.h"

using namespace Tiny;

AudienceInsights::AudienceInsights()
{
	categories = std::list<AudienceCategory>();
	date = std::string();
	demographics = AudienceDemographics();
	size = int(0);
	size_is_upper_bound = bool(false);
	type = AudienceInsightType();
}

AudienceInsights::AudienceInsights(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceInsights::~AudienceInsights()
{

}

void
AudienceInsights::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *categoriesKey = "categories";

    if(object.has_key(categoriesKey))
    {
        bourne::json value = object[categoriesKey];


        std::list<AudienceCategory> categories_list;
        AudienceCategory element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            categories_list.push_back(element);
        }
        categories = categories_list;


    }

    const char *dateKey = "date";

    if(object.has_key(dateKey))
    {
        bourne::json value = object[dateKey];



        jsonToValue(&date, value, "std::string");


    }

    const char *demographicsKey = "demographics";

    if(object.has_key(demographicsKey))
    {
        bourne::json value = object[demographicsKey];




        AudienceDemographics* obj = &demographics;
		obj->fromJson(value.dump());

    }

    const char *sizeKey = "size";

    if(object.has_key(sizeKey))
    {
        bourne::json value = object[sizeKey];



        jsonToValue(&size, value, "int");


    }

    const char *size_is_upper_boundKey = "size_is_upper_bound";

    if(object.has_key(size_is_upper_boundKey))
    {
        bourne::json value = object[size_is_upper_boundKey];



        jsonToValue(&size_is_upper_bound, value, "bool");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        AudienceInsightType* obj = &type;
		obj->fromJson(value.dump());

    }


}

bourne::json
AudienceInsights::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AudienceCategory> categories_list = getCategories();
    bourne::json categories_arr = bourne::json::array();

    for(auto& var : categories_list)
    {
        AudienceCategory obj = var;
        categories_arr.append(obj.toJson());
    }
    object["categories"] = categories_arr;







    object["date"] = getDate();







	object["demographics"] = getDemographics().toJson();





    object["size"] = getSize();






    object["size_is_upper_bound"] = isSizeIsUpperBound();







	object["type"] = getType().toJson();


    return object;

}

std::list<AudienceCategory>
AudienceInsights::getCategories()
{
	return categories;
}

void
AudienceInsights::setCategories(std::list<AudienceCategory> categories)
{
	this->categories = categories;
}

std::string
AudienceInsights::getDate()
{
	return date;
}

void
AudienceInsights::setDate(std::string date)
{
	this->date = date;
}

AudienceDemographics
AudienceInsights::getDemographics()
{
	return demographics;
}

void
AudienceInsights::setDemographics(AudienceDemographics demographics)
{
	this->demographics = demographics;
}

int
AudienceInsights::getSize()
{
	return size;
}

void
AudienceInsights::setSize(int size)
{
	this->size = size;
}

bool
AudienceInsights::isSizeIsUpperBound()
{
	return size_is_upper_bound;
}

void
AudienceInsights::setSizeIsUpperBound(bool size_is_upper_bound)
{
	this->size_is_upper_bound = size_is_upper_bound;
}

AudienceInsightType
AudienceInsights::getType()
{
	return type;
}

void
AudienceInsights::setType(AudienceInsightType type)
{
	this->type = type;
}



