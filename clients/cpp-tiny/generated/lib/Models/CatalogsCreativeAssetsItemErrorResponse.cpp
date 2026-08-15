

#include "CatalogsCreativeAssetsItemErrorResponse.h"

using namespace Tiny;

CatalogsCreativeAssetsItemErrorResponse::CatalogsCreativeAssetsItemErrorResponse()
{
	catalog_type = CatalogsType();
	creative_assets_id = std::string();
	errors = std::list<ItemValidationEvent>();
}

CatalogsCreativeAssetsItemErrorResponse::CatalogsCreativeAssetsItemErrorResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsItemErrorResponse::~CatalogsCreativeAssetsItemErrorResponse()
{

}

void
CatalogsCreativeAssetsItemErrorResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];




        CatalogsType* obj = &catalog_type;
		obj->fromJson(value.dump());

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
CatalogsCreativeAssetsItemErrorResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["catalog_type"] = getCatalogType().toJson();





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
CatalogsCreativeAssetsItemErrorResponse::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsItemErrorResponse::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsCreativeAssetsItemErrorResponse::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
CatalogsCreativeAssetsItemErrorResponse::setCreativeAssetsId(std::string  creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}

std::list<ItemValidationEvent>
CatalogsCreativeAssetsItemErrorResponse::getErrors()
{
	return errors;
}

void
CatalogsCreativeAssetsItemErrorResponse::setErrors(std::list <ItemValidationEvent> errors)
{
	this->errors = errors;
}



