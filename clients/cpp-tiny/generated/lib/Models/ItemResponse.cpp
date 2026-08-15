

#include "ItemResponse.h"

using namespace Tiny;

ItemResponse::ItemResponse()
{
	catalog_type = CatalogsType();
	attributes = CatalogsCreativeAssetsAttributes();
	item_id = std::string();
	pins = std::list<Pin>();
	hotel_id = std::string();
	creative_assets_id = std::string();
	errors = std::list<ItemValidationEvent>();
}

ItemResponse::ItemResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemResponse::~ItemResponse()
{

}

void
ItemResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];




        CatalogsType* obj = &catalog_type;
		obj->fromJson(value.dump());

    }

    const char *attributesKey = "attributes";

    if(object.has_key(attributesKey))
    {
        bourne::json value = object[attributesKey];




        CatalogsCreativeAssetsAttributes* obj = &attributes;
		obj->fromJson(value.dump());

    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


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

    const char *hotel_idKey = "hotel_id";

    if(object.has_key(hotel_idKey))
    {
        bourne::json value = object[hotel_idKey];



        jsonToValue(&hotel_id, value, "std::string");


    }

    const char *creative_assets_idKey = "creative_assets_id";

    if(object.has_key(creative_assets_idKey))
    {
        bourne::json value = object[creative_assets_idKey];



        jsonToValue(&creative_assets_id, value, "std::string");


    }

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<ItemValidationEvent> errors_list;
        ItemValidationEvent element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            errors_list.push_back(element);
        }
        errors = errors_list;


    }


}

bourne::json
ItemResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["catalog_type"] = getCatalogType().toJson();






	object["attributes"] = getAttributes().toJson();





    object["item_id"] = getItemId();





    std::list<Pin> pins_list = getPins();
    bourne::json pins_arr = bourne::json::array();

    for(auto& var : pins_list)
    {
        Pin obj = var;
        pins_arr.append(obj.toJson());
    }
    object["pins"] = pins_arr;







    object["hotel_id"] = getHotelId();






    object["creative_assets_id"] = getCreativeAssetsId();





    std::list<ItemValidationEvent> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        ItemValidationEvent obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;




    return object;

}

CatalogsType
ItemResponse::getCatalogType()
{
	return catalog_type;
}

void
ItemResponse::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsCreativeAssetsAttributes
ItemResponse::getAttributes()
{
	return attributes;
}

void
ItemResponse::setAttributes(CatalogsCreativeAssetsAttributes  attributes)
{
	this->attributes = attributes;
}

std::string
ItemResponse::getItemId()
{
	return item_id;
}

void
ItemResponse::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

std::list<Pin>
ItemResponse::getPins()
{
	return pins;
}

void
ItemResponse::setPins(std::list <Pin> pins)
{
	this->pins = pins;
}

std::string
ItemResponse::getHotelId()
{
	return hotel_id;
}

void
ItemResponse::setHotelId(std::string  hotel_id)
{
	this->hotel_id = hotel_id;
}

std::string
ItemResponse::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
ItemResponse::setCreativeAssetsId(std::string  creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}

std::list<ItemValidationEvent>
ItemResponse::getErrors()
{
	return errors;
}

void
ItemResponse::setErrors(std::list <ItemValidationEvent> errors)
{
	this->errors = errors;
}



