

#include "AdBatchWriteResponseModel.h"

using namespace Tiny;

AdBatchWriteResponseModel::AdBatchWriteResponseModel()
{
	items = std::list<AdBatchItem>();
}

AdBatchWriteResponseModel::AdBatchWriteResponseModel(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdBatchWriteResponseModel::~AdBatchWriteResponseModel()
{

}

void
AdBatchWriteResponseModel::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<AdBatchItem> items_list;
        AdBatchItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
AdBatchWriteResponseModel::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AdBatchItem> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        AdBatchItem obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<AdBatchItem>
AdBatchWriteResponseModel::getItems()
{
	return items;
}

void
AdBatchWriteResponseModel::setItems(std::list<AdBatchItem> items)
{
	this->items = items;
}



