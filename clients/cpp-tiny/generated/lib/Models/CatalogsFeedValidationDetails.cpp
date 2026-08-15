

#include "CatalogsFeedValidationDetails.h"

using namespace Tiny;

CatalogsFeedValidationDetails::CatalogsFeedValidationDetails()
{
	errors = CatalogsFeedValidationErrors();
	warnings = CatalogsFeedValidationWarnings();
}

CatalogsFeedValidationDetails::CatalogsFeedValidationDetails(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedValidationDetails::~CatalogsFeedValidationDetails()
{

}

void
CatalogsFeedValidationDetails::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];




        CatalogsFeedValidationErrors* obj = &errors;
		obj->fromJson(value.dump());

    }

    const char *warningsKey = "warnings";

    if(object.has_key(warningsKey))
    {
        bourne::json value = object[warningsKey];




        CatalogsFeedValidationWarnings* obj = &warnings;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsFeedValidationDetails::toJson()
{
    bourne::json object = bourne::json::object();






	object["errors"] = getErrors().toJson();






	object["warnings"] = getWarnings().toJson();


    return object;

}

CatalogsFeedValidationErrors
CatalogsFeedValidationDetails::getErrors()
{
	return errors;
}

void
CatalogsFeedValidationDetails::setErrors(CatalogsFeedValidationErrors  errors)
{
	this->errors = errors;
}

CatalogsFeedValidationWarnings
CatalogsFeedValidationDetails::getWarnings()
{
	return warnings;
}

void
CatalogsFeedValidationDetails::setWarnings(CatalogsFeedValidationWarnings  warnings)
{
	this->warnings = warnings;
}



