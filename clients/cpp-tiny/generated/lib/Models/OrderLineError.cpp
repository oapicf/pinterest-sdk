

#include "OrderLineError.h"

using namespace Tiny;

OrderLineError::OrderLineError()
{
	data = OrderLine();
	error_messages = std::list<std::string>();
}

OrderLineError::OrderLineError(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderLineError::~OrderLineError()
{

}

void
OrderLineError::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        OrderLine* obj = &data;
		obj->fromJson(value.dump());

    }

    const char *error_messagesKey = "error_messages";

    if(object.has_key(error_messagesKey))
    {
        bourne::json value = object[error_messagesKey];


        std::list<std::string> error_messages_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            error_messages_list.push_back(element);
        }
        error_messages = error_messages_list;


    }


}

bourne::json
OrderLineError::toJson()
{
    bourne::json object = bourne::json::object();






	object["data"] = getData().toJson();




    std::list<std::string> error_messages_list = getErrorMessages();
    bourne::json error_messages_arr = bourne::json::array();

    for(auto& var : error_messages_list)
    {
        error_messages_arr.append(var);
    }
    object["error_messages"] = error_messages_arr;






    return object;

}

OrderLine
OrderLineError::getData()
{
	return data;
}

void
OrderLineError::setData(OrderLine  data)
{
	this->data = data;
}

std::list<std::string>
OrderLineError::getErrorMessages()
{
	return error_messages;
}

void
OrderLineError::setErrorMessages(std::list <std::string> error_messages)
{
	this->error_messages = error_messages;
}



