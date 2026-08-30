

#include "AiDisclosureItem.h"

using namespace Tiny;

AiDisclosureItem::AiDisclosureItem()
{
}

AiDisclosureItem::AiDisclosureItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

AiDisclosureItem::~AiDisclosureItem()
{

}

void
AiDisclosureItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AiDisclosureItem::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



