

#include "CreateAssetAccessRequestErrorMessage_inner.h"

using namespace Tiny;

CreateAssetAccessRequestErrorMessage_inner::CreateAssetAccessRequestErrorMessage_inner()
{
	code = int(0);
	messages = std::list<std::string>();
}

CreateAssetAccessRequestErrorMessage_inner::CreateAssetAccessRequestErrorMessage_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateAssetAccessRequestErrorMessage_inner::~CreateAssetAccessRequestErrorMessage_inner()
{

}

void
CreateAssetAccessRequestErrorMessage_inner::fromJson(std::string jsonObj)
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
CreateAssetAccessRequestErrorMessage_inner::toJson()
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
CreateAssetAccessRequestErrorMessage_inner::getCode()
{
	return code;
}

void
CreateAssetAccessRequestErrorMessage_inner::setCode(int  code)
{
	this->code = code;
}

std::list<std::string>
CreateAssetAccessRequestErrorMessage_inner::getMessages()
{
	return messages;
}

void
CreateAssetAccessRequestErrorMessage_inner::setMessages(std::list <std::string> messages)
{
	this->messages = messages;
}



