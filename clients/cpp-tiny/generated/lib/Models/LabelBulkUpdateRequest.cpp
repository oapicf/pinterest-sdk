

#include "LabelBulkUpdateRequest.h"

using namespace Tiny;

LabelBulkUpdateRequest::LabelBulkUpdateRequest()
{
	id = std::string();
	parent_id = std::string();
	status = LabelStatusBulkUpdate();
}

LabelBulkUpdateRequest::LabelBulkUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabelBulkUpdateRequest::~LabelBulkUpdateRequest()
{

}

void
LabelBulkUpdateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *parent_idKey = "parent_id";

    if(object.has_key(parent_idKey))
    {
        bourne::json value = object[parent_idKey];



        jsonToValue(&parent_id, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        LabelStatusBulkUpdate* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
LabelBulkUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["parent_id"] = getParentId();







	object["status"] = getStatus().toJson();


    return object;

}

std::string
LabelBulkUpdateRequest::getId()
{
	return id;
}

void
LabelBulkUpdateRequest::setId(std::string id)
{
	this->id = id;
}

std::string
LabelBulkUpdateRequest::getParentId()
{
	return parent_id;
}

void
LabelBulkUpdateRequest::setParentId(std::string parent_id)
{
	this->parent_id = parent_id;
}

LabelStatusBulkUpdate
LabelBulkUpdateRequest::getStatus()
{
	return status;
}

void
LabelBulkUpdateRequest::setStatus(LabelStatusBulkUpdate status)
{
	this->status = status;
}



