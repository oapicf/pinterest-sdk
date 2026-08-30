

#include "CatalogsCreativeAssetsItemResponse.h"

using namespace Tiny;

CatalogsCreativeAssetsItemResponse::CatalogsCreativeAssetsItemResponse()
{
	attributes = CatalogsCreativeAssetsAttributes();
	catalog_type = std::string();
	creative_assets_id = std::string();
	item_response_kind = std::string();
	pins = std::list<Pin>();
}

CatalogsCreativeAssetsItemResponse::CatalogsCreativeAssetsItemResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsItemResponse::~CatalogsCreativeAssetsItemResponse()
{

}

void
CatalogsCreativeAssetsItemResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attributesKey = "attributes";

    if(object.has_key(attributesKey))
    {
        bourne::json value = object[attributesKey];




        CatalogsCreativeAssetsAttributes* obj = &attributes;
		obj->fromJson(value.dump());

    }

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *creative_assets_idKey = "creative_assets_id";

    if(object.has_key(creative_assets_idKey))
    {
        bourne::json value = object[creative_assets_idKey];



        jsonToValue(&creative_assets_id, value, "std::string");


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
CatalogsCreativeAssetsItemResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["catalog_type"] = getCatalogType();






    object["creative_assets_id"] = getCreativeAssetsId();






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

CatalogsCreativeAssetsAttributes
CatalogsCreativeAssetsItemResponse::getAttributes()
{
	return attributes;
}

void
CatalogsCreativeAssetsItemResponse::setAttributes(CatalogsCreativeAssetsAttributes attributes)
{
	this->attributes = attributes;
}

std::string
CatalogsCreativeAssetsItemResponse::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsItemResponse::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsCreativeAssetsItemResponse::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
CatalogsCreativeAssetsItemResponse::setCreativeAssetsId(std::string creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}

std::string
CatalogsCreativeAssetsItemResponse::getItemResponseKind()
{
	return item_response_kind;
}

void
CatalogsCreativeAssetsItemResponse::setItemResponseKind(std::string item_response_kind)
{
	this->item_response_kind = item_response_kind;
}

std::list<Pin>
CatalogsCreativeAssetsItemResponse::getPins()
{
	return pins;
}

void
CatalogsCreativeAssetsItemResponse::setPins(std::list<Pin> pins)
{
	this->pins = pins;
}



