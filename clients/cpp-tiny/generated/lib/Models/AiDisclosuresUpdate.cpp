

#include "AiDisclosuresUpdate.h"

using namespace Tiny;

AiDisclosuresUpdate::AiDisclosuresUpdate()
{
	values = std::list<AiDisclosureItem>();
}

AiDisclosuresUpdate::AiDisclosuresUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

AiDisclosuresUpdate::~AiDisclosuresUpdate()
{

}

void
AiDisclosuresUpdate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *valuesKey = "values";

    if(object.has_key(valuesKey))
    {
        bourne::json value = object[valuesKey];


        std::list<AiDisclosureItem> values_list;
        AiDisclosureItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            values_list.push_back(element);
        }
        values = values_list;


    }


}

bourne::json
AiDisclosuresUpdate::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AiDisclosureItem> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        AiDisclosureItem obj = var;
        values_arr.append(obj.toJson());
    }
    object["values"] = values_arr;




    return object;

}

std::list<AiDisclosureItem>
AiDisclosuresUpdate::getValues()
{
	return values;
}

void
AiDisclosuresUpdate::setValues(std::list<AiDisclosureItem> values)
{
	this->values = values;
}



