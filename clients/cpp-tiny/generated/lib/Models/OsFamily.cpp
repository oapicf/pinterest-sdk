

#include "OsFamily.h"

using namespace Tiny;

OsFamily::OsFamily()
{
}

OsFamily::OsFamily(std::string jsonString)
{
	this->fromJson(jsonString);
}

OsFamily::~OsFamily()
{

}

void
OsFamily::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OsFamily::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



