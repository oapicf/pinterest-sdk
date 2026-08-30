

#include "CatalogsHotelItemResponse.h"

using namespace Tiny;

CatalogsHotelItemResponse::CatalogsHotelItemResponse()
{
	attributes = CatalogsHotelAttributes();
	catalog_type = std::string();
	hotel_id = std::string();
	item_response_kind = std::string();
	pins = std::list<Pin>();
}

CatalogsHotelItemResponse::CatalogsHotelItemResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelItemResponse::~CatalogsHotelItemResponse()
{

}

void
CatalogsHotelItemResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attributesKey = "attributes";

    if(object.has_key(attributesKey))
    {
        bourne::json value = object[attributesKey];




        CatalogsHotelAttributes* obj = &attributes;
		obj->fromJson(value.dump());

    }

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *hotel_idKey = "hotel_id";

    if(object.has_key(hotel_idKey))
    {
        bourne::json value = object[hotel_idKey];



        jsonToValue(&hotel_id, value, "std::string");


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
CatalogsHotelItemResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["catalog_type"] = getCatalogType();






    object["hotel_id"] = getHotelId();






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

CatalogsHotelAttributes
CatalogsHotelItemResponse::getAttributes()
{
	return attributes;
}

void
CatalogsHotelItemResponse::setAttributes(CatalogsHotelAttributes attributes)
{
	this->attributes = attributes;
}

std::string
CatalogsHotelItemResponse::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelItemResponse::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsHotelItemResponse::getHotelId()
{
	return hotel_id;
}

void
CatalogsHotelItemResponse::setHotelId(std::string hotel_id)
{
	this->hotel_id = hotel_id;
}

std::string
CatalogsHotelItemResponse::getItemResponseKind()
{
	return item_response_kind;
}

void
CatalogsHotelItemResponse::setItemResponseKind(std::string item_response_kind)
{
	this->item_response_kind = item_response_kind;
}

std::list<Pin>
CatalogsHotelItemResponse::getPins()
{
	return pins;
}

void
CatalogsHotelItemResponse::setPins(std::list<Pin> pins)
{
	this->pins = pins;
}



