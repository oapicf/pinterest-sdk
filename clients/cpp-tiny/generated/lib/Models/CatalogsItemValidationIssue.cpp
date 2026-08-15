

#include "CatalogsItemValidationIssue.h"

using namespace Tiny;

CatalogsItemValidationIssue::CatalogsItemValidationIssue()
{
}

CatalogsItemValidationIssue::CatalogsItemValidationIssue(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsItemValidationIssue::~CatalogsItemValidationIssue()
{

}

void
CatalogsItemValidationIssue::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CatalogsItemValidationIssue::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



