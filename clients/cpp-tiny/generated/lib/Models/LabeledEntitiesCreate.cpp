

#include "LabeledEntitiesCreate.h"

using namespace Tiny;

LabeledEntitiesCreate::LabeledEntitiesCreate()
{
	entity_ids = std::list<std::string>();
}

LabeledEntitiesCreate::LabeledEntitiesCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabeledEntitiesCreate::~LabeledEntitiesCreate()
{

}

void
LabeledEntitiesCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *entity_idsKey = "entity_ids";

    if(object.has_key(entity_idsKey))
    {
        bourne::json value = object[entity_idsKey];


        std::list<std::string> entity_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            entity_ids_list.push_back(element);
        }
        entity_ids = entity_ids_list;


    }


}

bourne::json
LabeledEntitiesCreate::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> entity_ids_list = getEntityIds();
    bourne::json entity_ids_arr = bourne::json::array();

    for(auto& var : entity_ids_list)
    {
        entity_ids_arr.append(var);
    }
    object["entity_ids"] = entity_ids_arr;






    return object;

}

std::list<std::string>
LabeledEntitiesCreate::getEntityIds()
{
	return entity_ids;
}

void
LabeledEntitiesCreate::setEntityIds(std::list<std::string> entity_ids)
{
	this->entity_ids = entity_ids;
}



