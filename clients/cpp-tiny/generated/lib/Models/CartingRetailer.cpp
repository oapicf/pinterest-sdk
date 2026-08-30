

#include "CartingRetailer.h"

using namespace Tiny;

CartingRetailer::CartingRetailer()
{
	retailer_id = std::string();
	retailer_name = std::string();
}

CartingRetailer::CartingRetailer(std::string jsonString)
{
	this->fromJson(jsonString);
}

CartingRetailer::~CartingRetailer()
{

}

void
CartingRetailer::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *retailer_idKey = "retailer_id";

    if(object.has_key(retailer_idKey))
    {
        bourne::json value = object[retailer_idKey];



        jsonToValue(&retailer_id, value, "std::string");


    }

    const char *retailer_nameKey = "retailer_name";

    if(object.has_key(retailer_nameKey))
    {
        bourne::json value = object[retailer_nameKey];



        jsonToValue(&retailer_name, value, "std::string");


    }


}

bourne::json
CartingRetailer::toJson()
{
    bourne::json object = bourne::json::object();





    object["retailer_id"] = getRetailerId();






    object["retailer_name"] = getRetailerName();



    return object;

}

std::string
CartingRetailer::getRetailerId()
{
	return retailer_id;
}

void
CartingRetailer::setRetailerId(std::string retailer_id)
{
	this->retailer_id = retailer_id;
}

std::string
CartingRetailer::getRetailerName()
{
	return retailer_name;
}

void
CartingRetailer::setRetailerName(std::string retailer_name)
{
	this->retailer_name = retailer_name;
}



