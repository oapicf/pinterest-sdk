

#include "IntegrationLogsInvalidLogResponse_rejected_logs_inner.h"

using namespace Tiny;

IntegrationLogsInvalidLogResponse_rejected_logs_inner::IntegrationLogsInvalidLogResponse_rejected_logs_inner()
{
	field = std::string();
	log_index = int(0);
	reason = std::string();
	value = std::string();
}

IntegrationLogsInvalidLogResponse_rejected_logs_inner::IntegrationLogsInvalidLogResponse_rejected_logs_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

IntegrationLogsInvalidLogResponse_rejected_logs_inner::~IntegrationLogsInvalidLogResponse_rejected_logs_inner()
{

}

void
IntegrationLogsInvalidLogResponse_rejected_logs_inner::fromJson(std::string jsonObj)
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
IntegrationLogsInvalidLogResponse_rejected_logs_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["field"] = getField();






    object["log_index"] = getLogIndex();






    object["reason"] = getReason();






    object["value"] = getValue();



    return object;

}

std::string
IntegrationLogsInvalidLogResponse_rejected_logs_inner::getField()
{
	return field;
}

void
IntegrationLogsInvalidLogResponse_rejected_logs_inner::setField(std::string  field)
{
	this->field = field;
}

int
IntegrationLogsInvalidLogResponse_rejected_logs_inner::getLogIndex()
{
	return log_index;
}

void
IntegrationLogsInvalidLogResponse_rejected_logs_inner::setLogIndex(int  log_index)
{
	this->log_index = log_index;
}

std::string
IntegrationLogsInvalidLogResponse_rejected_logs_inner::getReason()
{
	return reason;
}

void
IntegrationLogsInvalidLogResponse_rejected_logs_inner::setReason(std::string  reason)
{
	this->reason = reason;
}

std::string
IntegrationLogsInvalidLogResponse_rejected_logs_inner::getValue()
{
	return value;
}

void
IntegrationLogsInvalidLogResponse_rejected_logs_inner::setValue(std::string  value)
{
	this->value = value;
}



