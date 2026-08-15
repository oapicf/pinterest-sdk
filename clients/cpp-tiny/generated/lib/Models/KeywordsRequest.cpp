

#include "KeywordsRequest.h"

using namespace Tiny;

KeywordsRequest::KeywordsRequest()
{
	keywords = std::list<KeywordsCommon>();
	parent_id = std::string();
}

KeywordsRequest::KeywordsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeywordsRequest::~KeywordsRequest()
{

}

void
KeywordsRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *keywordsKey = "keywords";

    if(object.has_key(keywordsKey))
    {
        bourne::json value = object[keywordsKey];


        std::list<KeywordsCommon> keywords_list;
        KeywordsCommon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            keywords_list.push_back(element);
        }
        keywords = keywords_list;


    }

    const char *parent_idKey = "parent_id";

    if(object.has_key(parent_idKey))
    {
        bourne::json value = object[parent_idKey];



        jsonToValue(&parent_id, value, "std::string");


    }


}

bourne::json
KeywordsRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<KeywordsCommon> keywords_list = getKeywords();
    bourne::json keywords_arr = bourne::json::array();

    for(auto& var : keywords_list)
    {
        KeywordsCommon obj = var;
        keywords_arr.append(obj.toJson());
    }
    object["keywords"] = keywords_arr;







    object["parent_id"] = getParentId();



    return object;

}

std::list<KeywordsCommon>
KeywordsRequest::getKeywords()
{
	return keywords;
}

void
KeywordsRequest::setKeywords(std::list <KeywordsCommon> keywords)
{
	this->keywords = keywords;
}

std::string
KeywordsRequest::getParentId()
{
	return parent_id;
}

void
KeywordsRequest::setParentId(std::string  parent_id)
{
	this->parent_id = parent_id;
}



