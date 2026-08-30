

#include "PinMediaSourceImagesBase64.h"

using namespace Tiny;

PinMediaSourceImagesBase64::PinMediaSourceImagesBase64()
{
	index = int(0);
	items = std::list<PinMediaSourceImagesBase64Item>();
	source_type = std::string();
}

PinMediaSourceImagesBase64::PinMediaSourceImagesBase64(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMediaSourceImagesBase64::~PinMediaSourceImagesBase64()
{

}

void
PinMediaSourceImagesBase64::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "int");


    }

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<PinMediaSourceImagesBase64Item> items_list;
        PinMediaSourceImagesBase64Item element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }

    const char *source_typeKey = "source_type";

    if(object.has_key(source_typeKey))
    {
        bourne::json value = object[source_typeKey];



        jsonToValue(&source_type, value, "std::string");


    }


}

bourne::json
PinMediaSourceImagesBase64::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();





    std::list<PinMediaSourceImagesBase64Item> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        PinMediaSourceImagesBase64Item obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;







    object["source_type"] = getSourceType();



    return object;

}

int
PinMediaSourceImagesBase64::getIndex()
{
	return index;
}

void
PinMediaSourceImagesBase64::setIndex(int index)
{
	this->index = index;
}

std::list<PinMediaSourceImagesBase64Item>
PinMediaSourceImagesBase64::getItems()
{
	return items;
}

void
PinMediaSourceImagesBase64::setItems(std::list<PinMediaSourceImagesBase64Item> items)
{
	this->items = items;
}

std::string
PinMediaSourceImagesBase64::getSourceType()
{
	return source_type;
}

void
PinMediaSourceImagesBase64::setSourceType(std::string source_type)
{
	this->source_type = source_type;
}



