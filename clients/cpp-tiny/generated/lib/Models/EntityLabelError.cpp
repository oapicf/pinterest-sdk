

#include "EntityLabelError.h"

using namespace Tiny;

EntityLabelError::EntityLabelError()
{
	data = EntityLabel();
	error_messages = std::list<std::string>();
}

EntityLabelError::EntityLabelError(std::string jsonString)
{
	this->fromJson(jsonString);
}

EntityLabelError::~EntityLabelError()
{

}

void
EntityLabelError::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        EntityLabel* obj = &data;
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
EntityLabelError::toJson()
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

EntityLabel
EntityLabelError::getData()
{
	return data;
}

void
EntityLabelError::setData(EntityLabel data)
{
	this->data = data;
}

std::list<std::string>
EntityLabelError::getErrorMessages()
{
	return error_messages;
}

void
EntityLabelError::setErrorMessages(std::list<std::string> error_messages)
{
	this->error_messages = error_messages;
}



