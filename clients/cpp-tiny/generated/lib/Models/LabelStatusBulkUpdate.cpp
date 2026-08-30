

#include "LabelStatusBulkUpdate.h"

using namespace Tiny;

LabelStatusBulkUpdate::LabelStatusBulkUpdate()
{
}

LabelStatusBulkUpdate::LabelStatusBulkUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabelStatusBulkUpdate::~LabelStatusBulkUpdate()
{

}

void
LabelStatusBulkUpdate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
LabelStatusBulkUpdate::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



