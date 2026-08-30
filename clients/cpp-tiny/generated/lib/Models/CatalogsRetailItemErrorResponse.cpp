

#include "CatalogsRetailItemErrorResponse.h"

using namespace Tiny;

CatalogsRetailItemErrorResponse::CatalogsRetailItemErrorResponse()
{
	catalog_type = std::string();
	errors = std::list<ItemValidationEvent>();
	item_id = std::string();
	item_response_kind = std::string();
}

CatalogsRetailItemErrorResponse::CatalogsRetailItemErrorResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailItemErrorResponse::~CatalogsRetailItemErrorResponse()
{

}

void
CatalogsRetailItemErrorResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


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

    const char *item_response_kindKey = "item_response_kind";

    if(object.has_key(item_response_kindKey))
    {
        bourne::json value = object[item_response_kindKey];



        jsonToValue(&item_response_kind, value, "std::string");


    }


}

bourne::json
CatalogsRetailItemErrorResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();





    std::list<ItemValidationEvent> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        ItemValidationEvent obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;







    object["item_id"] = getItemId();






    object["item_response_kind"] = getItemResponseKind();



    return object;

}

std::string
CatalogsRetailItemErrorResponse::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailItemErrorResponse::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

std::list<ItemValidationEvent>
CatalogsRetailItemErrorResponse::getErrors()
{
	return errors;
}

void
CatalogsRetailItemErrorResponse::setErrors(std::list<ItemValidationEvent> errors)
{
	this->errors = errors;
}

std::string
CatalogsRetailItemErrorResponse::getItemId()
{
	return item_id;
}

void
CatalogsRetailItemErrorResponse::setItemId(std::string item_id)
{
	this->item_id = item_id;
}

std::string
CatalogsRetailItemErrorResponse::getItemResponseKind()
{
	return item_response_kind;
}

void
CatalogsRetailItemErrorResponse::setItemResponseKind(std::string item_response_kind)
{
	this->item_response_kind = item_response_kind;
}



