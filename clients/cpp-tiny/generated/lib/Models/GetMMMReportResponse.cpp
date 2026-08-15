

#include "GetMMMReportResponse.h"

using namespace Tiny;

GetMMMReportResponse::GetMMMReportResponse()
{
	code = float(0);
	data = GetMMMReportResponseData();
	message = std::string();
	status = std::string();
}

GetMMMReportResponse::GetMMMReportResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetMMMReportResponse::~GetMMMReportResponse()
{

}

void
GetMMMReportResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "long");


    }

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        GetMMMReportResponseData* obj = &data;
		obj->fromJson(value.dump());

    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }


}

bourne::json
GetMMMReportResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();







	object["data"] = getData().toJson();





    object["message"] = getMessage();






    object["status"] = getStatus();



    return object;

}

long
GetMMMReportResponse::getCode()
{
	return code;
}

void
GetMMMReportResponse::setCode(long  code)
{
	this->code = code;
}

GetMMMReportResponseData
GetMMMReportResponse::getData()
{
	return data;
}

void
GetMMMReportResponse::setData(GetMMMReportResponseData  data)
{
	this->data = data;
}

std::string
GetMMMReportResponse::getMessage()
{
	return message;
}

void
GetMMMReportResponse::setMessage(std::string  message)
{
	this->message = message;
}

std::string
GetMMMReportResponse::getStatus()
{
	return status;
}

void
GetMMMReportResponse::setStatus(std::string  status)
{
	this->status = status;
}



