

#include "CatalogsHotelItemErrorResponse.h"

using namespace Tiny;

CatalogsHotelItemErrorResponse::CatalogsHotelItemErrorResponse()
{
	catalog_type = CatalogsType();
	errors = std::list<ItemValidationEvent>();
	hotel_id = std::string();
}

CatalogsHotelItemErrorResponse::CatalogsHotelItemErrorResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelItemErrorResponse::~CatalogsHotelItemErrorResponse()
{

}

void
CatalogsHotelItemErrorResponse::fromJson(std::string jsonObj)
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

    const char *hotel_idKey = "hotel_id";

    if(object.has_key(hotel_idKey))
    {
        bourne::json value = object[hotel_idKey];



        jsonToValue(&hotel_id, value, "std::string");


    }


}

bourne::json
CatalogsHotelItemErrorResponse::toJson()
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







    object["hotel_id"] = getHotelId();



    return object;

}

CatalogsType
CatalogsHotelItemErrorResponse::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelItemErrorResponse::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::list<ItemValidationEvent>
CatalogsHotelItemErrorResponse::getErrors()
{
	return errors;
}

void
CatalogsHotelItemErrorResponse::setErrors(std::list <ItemValidationEvent> errors)
{
	this->errors = errors;
}

std::string
CatalogsHotelItemErrorResponse::getHotelId()
{
	return hotel_id;
}

void
CatalogsHotelItemErrorResponse::setHotelId(std::string  hotel_id)
{
	this->hotel_id = hotel_id;
}



