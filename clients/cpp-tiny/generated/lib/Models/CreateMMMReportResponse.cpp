

#include "CreateMMMReportResponse.h"

using namespace Tiny;

CreateMMMReportResponse::CreateMMMReportResponse()
{
	code = float(0);
	data = CreateMMMReportResponseData();
}

CreateMMMReportResponse::CreateMMMReportResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateMMMReportResponse::~CreateMMMReportResponse()
{

}

void
CreateMMMReportResponse::fromJson(std::string jsonObj)
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




        CreateMMMReportResponseData* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateMMMReportResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();







	object["data"] = getData().toJson();


    return object;

}

long
CreateMMMReportResponse::getCode()
{
	return code;
}

void
CreateMMMReportResponse::setCode(long  code)
{
	this->code = code;
}

CreateMMMReportResponseData
CreateMMMReportResponse::getData()
{
	return data;
}

void
CreateMMMReportResponse::setData(CreateMMMReportResponseData  data)
{
	this->data = data;
}



