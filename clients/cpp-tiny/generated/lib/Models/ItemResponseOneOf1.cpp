

#include "ItemResponse_oneOf_1.h"

using namespace Tiny;

ItemResponse_oneOf_1::ItemResponse_oneOf_1()
{
	catalog_type = CatalogsType();
	errors = std::list<ItemValidationEvent>();
	item_id = std::string();
	hotel_id = std::string();
	creative_assets_id = std::string();
}

ItemResponse_oneOf_1::ItemResponse_oneOf_1(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemResponse_oneOf_1::~ItemResponse_oneOf_1()
{

}

void
ItemResponse_oneOf_1::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];




        CatalogsType* obj = &catalog_type;
		obj->fromJson(value.dump());

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

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


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


}

bourne::json
ItemResponse_oneOf_1::toJson()
{
    bourne::json object = bourne::json::object();






	object["catalog_type"] = getCatalogType().toJson();




    std::list<ItemValidationEvent> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        ItemValidationEvent obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;







    object["item_id"] = getItemId();






    object["hotel_id"] = getHotelId();






    object["creative_assets_id"] = getCreativeAssetsId();



    return object;

}

CatalogsType
ItemResponse_oneOf_1::getCatalogType()
{
	return catalog_type;
}

void
ItemResponse_oneOf_1::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::list<ItemValidationEvent>
ItemResponse_oneOf_1::getErrors()
{
	return errors;
}

void
ItemResponse_oneOf_1::setErrors(std::list <ItemValidationEvent> errors)
{
	this->errors = errors;
}

std::string
ItemResponse_oneOf_1::getItemId()
{
	return item_id;
}

void
ItemResponse_oneOf_1::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

std::string
ItemResponse_oneOf_1::getHotelId()
{
	return hotel_id;
}

void
ItemResponse_oneOf_1::setHotelId(std::string  hotel_id)
{
	this->hotel_id = hotel_id;
}

std::string
ItemResponse_oneOf_1::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
ItemResponse_oneOf_1::setCreativeAssetsId(std::string  creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}



