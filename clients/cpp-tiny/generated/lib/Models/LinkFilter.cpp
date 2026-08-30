

#include "LinkFilter.h"

using namespace Tiny;

LinkFilter::LinkFilter()
{
	lINK = CatalogsProductGroupFilterOperatorTypeCriteria();
}

LinkFilter::LinkFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

LinkFilter::~LinkFilter()
{

}

void
LinkFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *lINKKey = "LINK";

    if(object.has_key(lINKKey))
    {
        bourne::json value = object[lINKKey];




        CatalogsProductGroupFilterOperatorTypeCriteria* obj = &lINK;
		obj->fromJson(value.dump());

    }


}

bourne::json
LinkFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["lINK"] = getLINK().toJson();


    return object;

}

CatalogsProductGroupFilterOperatorTypeCriteria
LinkFilter::getLINK()
{
	return lINK;
}

void
LinkFilter::setLINK(CatalogsProductGroupFilterOperatorTypeCriteria lINK)
{
	this->lINK = lINK;
}



