

#include "BusinessMemberAssetsGetResponse.h"

using namespace Tiny;

BusinessMemberAssetsGetResponse::BusinessMemberAssetsGetResponse()
{
	bookmark = std::string();
	items = std::list<AssetIdPermissions>();
	total_data_count = int(0);
	total_data_count_by_status = null;
}

BusinessMemberAssetsGetResponse::BusinessMemberAssetsGetResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessMemberAssetsGetResponse::~BusinessMemberAssetsGetResponse()
{

}

void
BusinessMemberAssetsGetResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bookmarkKey = "bookmark";

    if(object.has_key(bookmarkKey))
    {
        bourne::json value = object[bookmarkKey];



        jsonToValue(&bookmark, value, "std::string");


    }

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<AssetIdPermissions> items_list;
        AssetIdPermissions element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }

    const char *total_data_countKey = "total_data_count";

    if(object.has_key(total_data_countKey))
    {
        bourne::json value = object[total_data_countKey];



        jsonToValue(&total_data_count, value, "int");


    }

    const char *total_data_count_by_statusKey = "total_data_count_by_status";

    if(object.has_key(total_data_count_by_statusKey))
    {
        bourne::json value = object[total_data_count_by_statusKey];




        TotalCountByEntityStatus* obj = &total_data_count_by_status;
		obj->fromJson(value.dump());

    }


}

bourne::json
BusinessMemberAssetsGetResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["bookmark"] = getBookmark();





    std::list<AssetIdPermissions> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        AssetIdPermissions obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;







    object["total_data_count"] = getTotalDataCount();







	object["total_data_count_by_status"] = getTotalDataCountByStatus().toJson();


    return object;

}

std::string
BusinessMemberAssetsGetResponse::getBookmark()
{
	return bookmark;
}

void
BusinessMemberAssetsGetResponse::setBookmark(std::string bookmark)
{
	this->bookmark = bookmark;
}

std::list<AssetIdPermissions>
BusinessMemberAssetsGetResponse::getItems()
{
	return items;
}

void
BusinessMemberAssetsGetResponse::setItems(std::list<AssetIdPermissions> items)
{
	this->items = items;
}

int
BusinessMemberAssetsGetResponse::getTotalDataCount()
{
	return total_data_count;
}

void
BusinessMemberAssetsGetResponse::setTotalDataCount(int total_data_count)
{
	this->total_data_count = total_data_count;
}

TotalCountByEntityStatus
BusinessMemberAssetsGetResponse::getTotalDataCountByStatus()
{
	return total_data_count_by_status;
}

void
BusinessMemberAssetsGetResponse::setTotalDataCountByStatus(TotalCountByEntityStatus total_data_count_by_status)
{
	this->total_data_count_by_status = total_data_count_by_status;
}



