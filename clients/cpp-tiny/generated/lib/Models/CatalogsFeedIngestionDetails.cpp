

#include "CatalogsFeedIngestionDetails.h"

using namespace Tiny;

CatalogsFeedIngestionDetails::CatalogsFeedIngestionDetails()
{
	errors = CatalogsFeedIngestionErrors();
	info = CatalogsFeedIngestionInfo();
	warnings = CatalogsFeedIngestionWarnings();
}

CatalogsFeedIngestionDetails::CatalogsFeedIngestionDetails(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedIngestionDetails::~CatalogsFeedIngestionDetails()
{

}

void
CatalogsFeedIngestionDetails::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];




        CatalogsFeedIngestionErrors* obj = &errors;
		obj->fromJson(value.dump());

    }

    const char *infoKey = "info";

    if(object.has_key(infoKey))
    {
        bourne::json value = object[infoKey];




        CatalogsFeedIngestionInfo* obj = &info;
		obj->fromJson(value.dump());

    }

    const char *warningsKey = "warnings";

    if(object.has_key(warningsKey))
    {
        bourne::json value = object[warningsKey];




        CatalogsFeedIngestionWarnings* obj = &warnings;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsFeedIngestionDetails::toJson()
{
    bourne::json object = bourne::json::object();






	object["errors"] = getErrors().toJson();






	object["info"] = getInfo().toJson();






	object["warnings"] = getWarnings().toJson();


    return object;

}

CatalogsFeedIngestionErrors
CatalogsFeedIngestionDetails::getErrors()
{
	return errors;
}

void
CatalogsFeedIngestionDetails::setErrors(CatalogsFeedIngestionErrors errors)
{
	this->errors = errors;
}

CatalogsFeedIngestionInfo
CatalogsFeedIngestionDetails::getInfo()
{
	return info;
}

void
CatalogsFeedIngestionDetails::setInfo(CatalogsFeedIngestionInfo info)
{
	this->info = info;
}

CatalogsFeedIngestionWarnings
CatalogsFeedIngestionDetails::getWarnings()
{
	return warnings;
}

void
CatalogsFeedIngestionDetails::setWarnings(CatalogsFeedIngestionWarnings warnings)
{
	this->warnings = warnings;
}



