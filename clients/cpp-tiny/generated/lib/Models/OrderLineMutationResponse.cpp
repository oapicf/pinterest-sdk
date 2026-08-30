

#include "OrderLineMutationResponse.h"

using namespace Tiny;

OrderLineMutationResponse::OrderLineMutationResponse()
{
	data = OrderLineMutationResult();
}

OrderLineMutationResponse::OrderLineMutationResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderLineMutationResponse::~OrderLineMutationResponse()
{

}

void
OrderLineMutationResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        OrderLineMutationResult* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrderLineMutationResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["data"] = getData().toJson();


    return object;

}

OrderLineMutationResult
OrderLineMutationResponse::getData()
{
	return data;
}

void
OrderLineMutationResponse::setData(OrderLineMutationResult data)
{
	this->data = data;
}



