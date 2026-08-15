

#include "AdArrayResponseElement.h"

using namespace Tiny;

AdArrayResponseElement::AdArrayResponseElement()
{
	data = AdResponse();
	exceptions = Exception();
}

AdArrayResponseElement::AdArrayResponseElement(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdArrayResponseElement::~AdArrayResponseElement()
{

}

void
AdArrayResponseElement::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        AdResponse* obj = &data;
		obj->fromJson(value.dump());

    }

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];




        Exception* obj = &exceptions;
		obj->fromJson(value.dump());

    }


}

bourne::json
AdArrayResponseElement::toJson()
{
    bourne::json object = bourne::json::object();






	object["data"] = getData().toJson();






	object["exceptions"] = getExceptions().toJson();


    return object;

}

AdResponse
AdArrayResponseElement::getData()
{
	return data;
}

void
AdArrayResponseElement::setData(AdResponse  data)
{
	this->data = data;
}

Exception
AdArrayResponseElement::getExceptions()
{
	return exceptions;
}

void
AdArrayResponseElement::setExceptions(Exception  exceptions)
{
	this->exceptions = exceptions;
}



