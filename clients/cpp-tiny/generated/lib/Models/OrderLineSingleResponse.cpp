

#include "OrderLineSingleResponse.h"

using namespace Tiny;

OrderLineSingleResponse::OrderLineSingleResponse()
{
	data = OrderLineResponse();
}

OrderLineSingleResponse::OrderLineSingleResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderLineSingleResponse::~OrderLineSingleResponse()
{

}

void
OrderLineSingleResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        OrderLineResponse* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrderLineSingleResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["data"] = getData().toJson();


    return object;

}

OrderLineResponse
OrderLineSingleResponse::getData()
{
	return data;
}

void
OrderLineSingleResponse::setData(OrderLineResponse  data)
{
	this->data = data;
}



