

#include "Country.h"

using namespace Tiny;

Country::Country()
{
}

Country::Country(std::string jsonString)
{
	this->fromJson(jsonString);
}

Country::~Country()
{

}

void
Country::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
Country::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



