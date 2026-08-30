

#include "CreationSource.h"

using namespace Tiny;

CreationSource::CreationSource()
{
}

CreationSource::CreationSource(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreationSource::~CreationSource()
{

}

void
CreationSource::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreationSource::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



