

#include "PinMediaSourceImagesURL.h"

using namespace Tiny;

PinMediaSourceImagesURL::PinMediaSourceImagesURL()
{
	index = int(0);
	items = std::list<PinMediaSourceImagesURLItem>();
	source_type = std::string();
}

PinMediaSourceImagesURL::PinMediaSourceImagesURL(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMediaSourceImagesURL::~PinMediaSourceImagesURL()
{

}

void
PinMediaSourceImagesURL::fromJson(std::string jsonObj)
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


        std::list<PinMediaSourceImagesURLItem> items_list;
        PinMediaSourceImagesURLItem element;
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
PinMediaSourceImagesURL::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();





    std::list<PinMediaSourceImagesURLItem> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        PinMediaSourceImagesURLItem obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;







    object["source_type"] = getSourceType();



    return object;

}

int
PinMediaSourceImagesURL::getIndex()
{
	return index;
}

void
PinMediaSourceImagesURL::setIndex(int  index)
{
	this->index = index;
}

std::list<PinMediaSourceImagesURLItem>
PinMediaSourceImagesURL::getItems()
{
	return items;
}

void
PinMediaSourceImagesURL::setItems(std::list <PinMediaSourceImagesURLItem> items)
{
	this->items = items;
}

std::string
PinMediaSourceImagesURL::getSourceType()
{
	return source_type;
}

void
PinMediaSourceImagesURL::setSourceType(std::string  source_type)
{
	this->source_type = source_type;
}



