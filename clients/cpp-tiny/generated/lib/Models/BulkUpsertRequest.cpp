

#include "BulkUpsertRequest.h"

using namespace Tiny;

BulkUpsertRequest::BulkUpsertRequest()
{
	create = BulkUpsertRequestCreate();
	update = BulkUpsertRequestUpdate();
}

BulkUpsertRequest::BulkUpsertRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkUpsertRequest::~BulkUpsertRequest()
{

}

void
BulkUpsertRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *createKey = "create";

    if(object.has_key(createKey))
    {
        bourne::json value = object[createKey];




        BulkUpsertRequestCreate* obj = &create;
		obj->fromJson(value.dump());

    }

    const char *updateKey = "update";

    if(object.has_key(updateKey))
    {
        bourne::json value = object[updateKey];




        BulkUpsertRequestUpdate* obj = &update;
		obj->fromJson(value.dump());

    }


}

bourne::json
BulkUpsertRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["create"] = getCreate().toJson();






	object["update"] = getUpdate().toJson();


    return object;

}

BulkUpsertRequestCreate
BulkUpsertRequest::getCreate()
{
	return create;
}

void
BulkUpsertRequest::setCreate(BulkUpsertRequestCreate  create)
{
	this->create = create;
}

BulkUpsertRequestUpdate
BulkUpsertRequest::getUpdate()
{
	return update;
}

void
BulkUpsertRequest::setUpdate(BulkUpsertRequestUpdate  update)
{
	this->update = update;
}



