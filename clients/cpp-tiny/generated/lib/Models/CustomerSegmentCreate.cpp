

#include "CustomerSegmentCreate.h"

using namespace Tiny;

CustomerSegmentCreate::CustomerSegmentCreate()
{
	audience_ids = std::list<std::string>();
	name = std::string();
}

CustomerSegmentCreate::CustomerSegmentCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomerSegmentCreate::~CustomerSegmentCreate()
{

}

void
CustomerSegmentCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *audience_idsKey = "audience_ids";

    if(object.has_key(audience_idsKey))
    {
        bourne::json value = object[audience_idsKey];


        std::list<std::string> audience_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            audience_ids_list.push_back(element);
        }
        audience_ids = audience_ids_list;


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
CustomerSegmentCreate::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> audience_ids_list = getAudienceIds();
    bourne::json audience_ids_arr = bourne::json::array();

    for(auto& var : audience_ids_list)
    {
        audience_ids_arr.append(var);
    }
    object["audience_ids"] = audience_ids_arr;









    object["name"] = getName();



    return object;

}

std::list<std::string>
CustomerSegmentCreate::getAudienceIds()
{
	return audience_ids;
}

void
CustomerSegmentCreate::setAudienceIds(std::list<std::string> audience_ids)
{
	this->audience_ids = audience_ids;
}

std::string
CustomerSegmentCreate::getName()
{
	return name;
}

void
CustomerSegmentCreate::setName(std::string name)
{
	this->name = name;
}



