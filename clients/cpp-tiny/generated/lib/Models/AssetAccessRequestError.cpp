

#include "AssetAccessRequestError.h"

using namespace Tiny;

AssetAccessRequestError::AssetAccessRequestError()
{
	code = int(0);
	messages = std::list<std::string>();
}

AssetAccessRequestError::AssetAccessRequestError(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetAccessRequestError::~AssetAccessRequestError()
{

}

void
AssetAccessRequestError::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "int");


    }

    const char *messagesKey = "messages";

    if(object.has_key(messagesKey))
    {
        bourne::json value = object[messagesKey];


        std::list<std::string> messages_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            messages_list.push_back(element);
        }
        messages = messages_list;


    }


}

bourne::json
AssetAccessRequestError::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();





    std::list<std::string> messages_list = getMessages();
    bourne::json messages_arr = bourne::json::array();

    for(auto& var : messages_list)
    {
        messages_arr.append(var);
    }
    object["messages"] = messages_arr;






    return object;

}

int
AssetAccessRequestError::getCode()
{
	return code;
}

void
AssetAccessRequestError::setCode(int code)
{
	this->code = code;
}

std::list<std::string>
AssetAccessRequestError::getMessages()
{
	return messages;
}

void
AssetAccessRequestError::setMessages(std::list<std::string> messages)
{
	this->messages = messages;
}



