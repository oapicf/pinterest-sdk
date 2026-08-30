

#include "PromotionArrayElement.h"

using namespace Tiny;

PromotionArrayElement::PromotionArrayElement()
{
	data = Promotion();
	exception = Exception();
}

PromotionArrayElement::PromotionArrayElement(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromotionArrayElement::~PromotionArrayElement()
{

}

void
PromotionArrayElement::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        Promotion* obj = &data;
		obj->fromJson(value.dump());

    }

    const char *exceptionKey = "exception";

    if(object.has_key(exceptionKey))
    {
        bourne::json value = object[exceptionKey];




        Exception* obj = &exception;
		obj->fromJson(value.dump());

    }


}

bourne::json
PromotionArrayElement::toJson()
{
    bourne::json object = bourne::json::object();






	object["data"] = getData().toJson();






	object["exception"] = getException().toJson();


    return object;

}

Promotion
PromotionArrayElement::getData()
{
	return data;
}

void
PromotionArrayElement::setData(Promotion data)
{
	this->data = data;
}

Exception
PromotionArrayElement::getException()
{
	return exception;
}

void
PromotionArrayElement::setException(Exception exception)
{
	this->exception = exception;
}



