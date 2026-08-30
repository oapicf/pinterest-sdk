

#include "IntegrationLogClientError.h"

using namespace Tiny;

IntegrationLogClientError::IntegrationLogClientError()
{
	cause = std::string();
	column_number = int(0);
	file_name = std::string();
	line_number = int(0);
	message = std::string();
	message_detail = std::string();
	name = std::string();
	number = int(0);
	stack_trace = std::string();
}

IntegrationLogClientError::IntegrationLogClientError(std::string jsonString)
{
	this->fromJson(jsonString);
}

IntegrationLogClientError::~IntegrationLogClientError()
{

}

void
IntegrationLogClientError::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *causeKey = "cause";

    if(object.has_key(causeKey))
    {
        bourne::json value = object[causeKey];



        jsonToValue(&cause, value, "std::string");


    }

    const char *column_numberKey = "column_number";

    if(object.has_key(column_numberKey))
    {
        bourne::json value = object[column_numberKey];



        jsonToValue(&column_number, value, "int");


    }

    const char *file_nameKey = "file_name";

    if(object.has_key(file_nameKey))
    {
        bourne::json value = object[file_nameKey];



        jsonToValue(&file_name, value, "std::string");


    }

    const char *line_numberKey = "line_number";

    if(object.has_key(line_numberKey))
    {
        bourne::json value = object[line_numberKey];



        jsonToValue(&line_number, value, "int");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }

    const char *message_detailKey = "message_detail";

    if(object.has_key(message_detailKey))
    {
        bourne::json value = object[message_detailKey];



        jsonToValue(&message_detail, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *numberKey = "number";

    if(object.has_key(numberKey))
    {
        bourne::json value = object[numberKey];



        jsonToValue(&number, value, "int");


    }

    const char *stack_traceKey = "stack_trace";

    if(object.has_key(stack_traceKey))
    {
        bourne::json value = object[stack_traceKey];



        jsonToValue(&stack_trace, value, "std::string");


    }


}

bourne::json
IntegrationLogClientError::toJson()
{
    bourne::json object = bourne::json::object();





    object["cause"] = getCause();






    object["column_number"] = getColumnNumber();






    object["file_name"] = getFileName();






    object["line_number"] = getLineNumber();






    object["message"] = getMessage();






    object["message_detail"] = getMessageDetail();






    object["name"] = getName();






    object["number"] = getNumber();






    object["stack_trace"] = getStackTrace();



    return object;

}

std::string
IntegrationLogClientError::getCause()
{
	return cause;
}

void
IntegrationLogClientError::setCause(std::string cause)
{
	this->cause = cause;
}

int
IntegrationLogClientError::getColumnNumber()
{
	return column_number;
}

void
IntegrationLogClientError::setColumnNumber(int column_number)
{
	this->column_number = column_number;
}

std::string
IntegrationLogClientError::getFileName()
{
	return file_name;
}

void
IntegrationLogClientError::setFileName(std::string file_name)
{
	this->file_name = file_name;
}

int
IntegrationLogClientError::getLineNumber()
{
	return line_number;
}

void
IntegrationLogClientError::setLineNumber(int line_number)
{
	this->line_number = line_number;
}

std::string
IntegrationLogClientError::getMessage()
{
	return message;
}

void
IntegrationLogClientError::setMessage(std::string message)
{
	this->message = message;
}

std::string
IntegrationLogClientError::getMessageDetail()
{
	return message_detail;
}

void
IntegrationLogClientError::setMessageDetail(std::string message_detail)
{
	this->message_detail = message_detail;
}

std::string
IntegrationLogClientError::getName()
{
	return name;
}

void
IntegrationLogClientError::setName(std::string name)
{
	this->name = name;
}

int
IntegrationLogClientError::getNumber()
{
	return number;
}

void
IntegrationLogClientError::setNumber(int number)
{
	this->number = number;
}

std::string
IntegrationLogClientError::getStackTrace()
{
	return stack_trace;
}

void
IntegrationLogClientError::setStackTrace(std::string stack_trace)
{
	this->stack_trace = stack_trace;
}



