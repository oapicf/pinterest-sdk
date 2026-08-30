

#include "IntegrationLogsInvalidLogResponseRejectedLogsItems.h"

using namespace Tiny;

IntegrationLogsInvalidLogResponseRejectedLogsItems::IntegrationLogsInvalidLogResponseRejectedLogsItems()
{
	field = std::string();
	log_index = int(0);
	reason = std::string();
	value = std::string();
}

IntegrationLogsInvalidLogResponseRejectedLogsItems::IntegrationLogsInvalidLogResponseRejectedLogsItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

IntegrationLogsInvalidLogResponseRejectedLogsItems::~IntegrationLogsInvalidLogResponseRejectedLogsItems()
{

}

void
IntegrationLogsInvalidLogResponseRejectedLogsItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fieldKey = "field";

    if(object.has_key(fieldKey))
    {
        bourne::json value = object[fieldKey];



        jsonToValue(&field, value, "std::string");


    }

    const char *log_indexKey = "log_index";

    if(object.has_key(log_indexKey))
    {
        bourne::json value = object[log_indexKey];



        jsonToValue(&log_index, value, "int");


    }

    const char *reasonKey = "reason";

    if(object.has_key(reasonKey))
    {
        bourne::json value = object[reasonKey];



        jsonToValue(&reason, value, "std::string");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }


}

bourne::json
IntegrationLogsInvalidLogResponseRejectedLogsItems::toJson()
{
    bourne::json object = bourne::json::object();





    object["field"] = getField();






    object["log_index"] = getLogIndex();






    object["reason"] = getReason();






    object["value"] = getValue();



    return object;

}

std::string
IntegrationLogsInvalidLogResponseRejectedLogsItems::getField()
{
	return field;
}

void
IntegrationLogsInvalidLogResponseRejectedLogsItems::setField(std::string field)
{
	this->field = field;
}

int
IntegrationLogsInvalidLogResponseRejectedLogsItems::getLogIndex()
{
	return log_index;
}

void
IntegrationLogsInvalidLogResponseRejectedLogsItems::setLogIndex(int log_index)
{
	this->log_index = log_index;
}

std::string
IntegrationLogsInvalidLogResponseRejectedLogsItems::getReason()
{
	return reason;
}

void
IntegrationLogsInvalidLogResponseRejectedLogsItems::setReason(std::string reason)
{
	this->reason = reason;
}

std::string
IntegrationLogsInvalidLogResponseRejectedLogsItems::getValue()
{
	return value;
}

void
IntegrationLogsInvalidLogResponseRejectedLogsItems::setValue(std::string value)
{
	this->value = value;
}



