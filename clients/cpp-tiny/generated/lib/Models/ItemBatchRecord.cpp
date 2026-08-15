

#include "ItemBatchRecord.h"

using namespace Tiny;

ItemBatchRecord::ItemBatchRecord()
{
	attributes = ItemAttributesRequest();
	item_id = std::string();
	update_mask = std::list<UpdateMaskFieldType>();
}

ItemBatchRecord::ItemBatchRecord(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemBatchRecord::~ItemBatchRecord()
{

}

void
ItemBatchRecord::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attributesKey = "attributes";

    if(object.has_key(attributesKey))
    {
        bourne::json value = object[attributesKey];




        ItemAttributesRequest* obj = &attributes;
		obj->fromJson(value.dump());

    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }

    const char *update_maskKey = "update_mask";

    if(object.has_key(update_maskKey))
    {
        bourne::json value = object[update_maskKey];


        std::list<UpdateMaskFieldType> update_mask_list;
        UpdateMaskFieldType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            update_mask_list.push_back(element);
        }
        update_mask = update_mask_list;


    }


}

bourne::json
ItemBatchRecord::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["item_id"] = getItemId();





    std::list<UpdateMaskFieldType> update_mask_list = getUpdateMask();
    bourne::json update_mask_arr = bourne::json::array();

    for(auto& var : update_mask_list)
    {
        UpdateMaskFieldType obj = var;
        update_mask_arr.append(obj.toJson());
    }
    object["update_mask"] = update_mask_arr;




    return object;

}

ItemAttributesRequest
ItemBatchRecord::getAttributes()
{
	return attributes;
}

void
ItemBatchRecord::setAttributes(ItemAttributesRequest  attributes)
{
	this->attributes = attributes;
}

std::string
ItemBatchRecord::getItemId()
{
	return item_id;
}

void
ItemBatchRecord::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

std::list<UpdateMaskFieldType>
ItemBatchRecord::getUpdateMask()
{
	return update_mask;
}

void
ItemBatchRecord::setUpdateMask(std::list <UpdateMaskFieldType> update_mask)
{
	this->update_mask = update_mask;
}



