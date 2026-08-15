

#include "GetAudiencesOrderBy.h"

using namespace Tiny;

GetAudiencesOrderBy::GetAudiencesOrderBy()
{
}

GetAudiencesOrderBy::GetAudiencesOrderBy(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetAudiencesOrderBy::~GetAudiencesOrderBy()
{

}

void
GetAudiencesOrderBy::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
GetAudiencesOrderBy::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



