

#include "AdBatchItem.h"

using namespace Tiny;

AdBatchItem::AdBatchItem()
{
	data = Ad();
	exceptions = Pinterest.Lib.Error();
}

AdBatchItem::AdBatchItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdBatchItem::~AdBatchItem()
{

}

void
AdBatchItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        Ad* obj = &data;
		obj->fromJson(value.dump());

    }

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];




        Pinterest.Lib.Error* obj = &exceptions;
		obj->fromJson(value.dump());

    }


}

bourne::json
AdBatchItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["data"] = getData().toJson();






	object["exceptions"] = getExceptions().toJson();


    return object;

}

Ad
AdBatchItem::getData()
{
	return data;
}

void
AdBatchItem::setData(Ad data)
{
	this->data = data;
}

Pinterest.Lib.Error
AdBatchItem::getExceptions()
{
	return exceptions;
}

void
AdBatchItem::setExceptions(Pinterest.Lib.Error exceptions)
{
	this->exceptions = exceptions;
}



