

#include "CatalogsUpdateRetailItem.h"

using namespace Tiny;

CatalogsUpdateRetailItem::CatalogsUpdateRetailItem()
{
	attributes = UpdatableItemAttributes();
	item_id = std::string();
	operation = std::string();
	update_mask = std::list<UpdateMaskFieldType>();
}

CatalogsUpdateRetailItem::CatalogsUpdateRetailItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsUpdateRetailItem::~CatalogsUpdateRetailItem()
{

}

void
CatalogsUpdateRetailItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attributesKey = "attributes";

    if(object.has_key(attributesKey))
    {
        bourne::json value = object[attributesKey];




        UpdatableItemAttributes* obj = &attributes;
		obj->fromJson(value.dump());

    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }

    const char *operationKey = "operation";

    if(object.has_key(operationKey))
    {
        bourne::json value = object[operationKey];



        jsonToValue(&operation, value, "std::string");


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
CatalogsUpdateRetailItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["item_id"] = getItemId();






    object["operation"] = getOperation();





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

UpdatableItemAttributes
CatalogsUpdateRetailItem::getAttributes()
{
	return attributes;
}

void
CatalogsUpdateRetailItem::setAttributes(UpdatableItemAttributes  attributes)
{
	this->attributes = attributes;
}

std::string
CatalogsUpdateRetailItem::getItemId()
{
	return item_id;
}

void
CatalogsUpdateRetailItem::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

std::string
CatalogsUpdateRetailItem::getOperation()
{
	return operation;
}

void
CatalogsUpdateRetailItem::setOperation(std::string  operation)
{
	this->operation = operation;
}

std::list<UpdateMaskFieldType>
CatalogsUpdateRetailItem::getUpdateMask()
{
	return update_mask;
}

void
CatalogsUpdateRetailItem::setUpdateMask(std::list <UpdateMaskFieldType> update_mask)
{
	this->update_mask = update_mask;
}



