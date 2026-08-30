

#include "ItemAttributesRequestImageLink.h"

using namespace Tiny;

ItemAttributesRequestImageLink::ItemAttributesRequestImageLink()
{
}

ItemAttributesRequestImageLink::ItemAttributesRequestImageLink(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemAttributesRequestImageLink::~ItemAttributesRequestImageLink()
{

}

void
ItemAttributesRequestImageLink::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ItemAttributesRequestImageLink::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



