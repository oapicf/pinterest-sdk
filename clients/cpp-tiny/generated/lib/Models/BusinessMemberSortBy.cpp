

#include "BusinessMemberSortBy.h"

using namespace Tiny;

BusinessMemberSortBy::BusinessMemberSortBy()
{
}

BusinessMemberSortBy::BusinessMemberSortBy(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessMemberSortBy::~BusinessMemberSortBy()
{

}

void
BusinessMemberSortBy::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BusinessMemberSortBy::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



