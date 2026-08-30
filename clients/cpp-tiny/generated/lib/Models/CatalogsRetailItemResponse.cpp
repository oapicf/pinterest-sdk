

#include "CatalogsRetailItemResponse.h"

using namespace Tiny;

CatalogsRetailItemResponse::CatalogsRetailItemResponse()
{
	attributes = ItemAttributes();
	catalog_type = std::string();
	item_id = std::string();
	item_response_kind = std::string();
	pins = std::list<Pin>();
}

CatalogsRetailItemResponse::CatalogsRetailItemResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailItemResponse::~CatalogsRetailItemResponse()
{

}

void
CatalogsRetailItemResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attributesKey = "attributes";

    if(object.has_key(attributesKey))
    {
        bourne::json value = object[attributesKey];




        ItemAttributes* obj = &attributes;
		obj->fromJson(value.dump());

    }

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }

    const char *item_response_kindKey = "item_response_kind";

    if(object.has_key(item_response_kindKey))
    {
        bourne::json value = object[item_response_kindKey];



        jsonToValue(&item_response_kind, value, "std::string");


    }

    const char *pinsKey = "pins";

    if(object.has_key(pinsKey))
    {
        bourne::json value = object[pinsKey];


        std::list<Pin> pins_list;
        Pin element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pins_list.push_back(element);
        }
        pins = pins_list;


    }


}

bourne::json
CatalogsRetailItemResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["catalog_type"] = getCatalogType();






    object["item_id"] = getItemId();






    object["item_response_kind"] = getItemResponseKind();





    std::list<Pin> pins_list = getPins();
    bourne::json pins_arr = bourne::json::array();

    for(auto& var : pins_list)
    {
        Pin obj = var;
        pins_arr.append(obj.toJson());
    }
    object["pins"] = pins_arr;




    return object;

}

ItemAttributes
CatalogsRetailItemResponse::getAttributes()
{
	return attributes;
}

void
CatalogsRetailItemResponse::setAttributes(ItemAttributes attributes)
{
	this->attributes = attributes;
}

std::string
CatalogsRetailItemResponse::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailItemResponse::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsRetailItemResponse::getItemId()
{
	return item_id;
}

void
CatalogsRetailItemResponse::setItemId(std::string item_id)
{
	this->item_id = item_id;
}

std::string
CatalogsRetailItemResponse::getItemResponseKind()
{
	return item_response_kind;
}

void
CatalogsRetailItemResponse::setItemResponseKind(std::string item_response_kind)
{
	this->item_response_kind = item_response_kind;
}

std::list<Pin>
CatalogsRetailItemResponse::getPins()
{
	return pins;
}

void
CatalogsRetailItemResponse::setPins(std::list<Pin> pins)
{
	this->pins = pins;
}



