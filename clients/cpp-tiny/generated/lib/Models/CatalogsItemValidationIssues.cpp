

#include "CatalogsItemValidationIssues.h"

using namespace Tiny;

CatalogsItemValidationIssues::CatalogsItemValidationIssues()
{
	errors = CatalogsItemValidationErrors();
	item_id = std::string();
	item_number = int(0);
	warnings = CatalogsItemValidationWarnings();
}

CatalogsItemValidationIssues::CatalogsItemValidationIssues(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsItemValidationIssues::~CatalogsItemValidationIssues()
{

}

void
CatalogsItemValidationIssues::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];




        CatalogsItemValidationErrors* obj = &errors;
		obj->fromJson(value.dump());

    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }

    const char *item_numberKey = "item_number";

    if(object.has_key(item_numberKey))
    {
        bourne::json value = object[item_numberKey];



        jsonToValue(&item_number, value, "int");


    }

    const char *warningsKey = "warnings";

    if(object.has_key(warningsKey))
    {
        bourne::json value = object[warningsKey];




        CatalogsItemValidationWarnings* obj = &warnings;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsItemValidationIssues::toJson()
{
    bourne::json object = bourne::json::object();






	object["errors"] = getErrors().toJson();





    object["item_id"] = getItemId();






    object["item_number"] = getItemNumber();







	object["warnings"] = getWarnings().toJson();


    return object;

}

CatalogsItemValidationErrors
CatalogsItemValidationIssues::getErrors()
{
	return errors;
}

void
CatalogsItemValidationIssues::setErrors(CatalogsItemValidationErrors  errors)
{
	this->errors = errors;
}

std::string
CatalogsItemValidationIssues::getItemId()
{
	return item_id;
}

void
CatalogsItemValidationIssues::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

int
CatalogsItemValidationIssues::getItemNumber()
{
	return item_number;
}

void
CatalogsItemValidationIssues::setItemNumber(int  item_number)
{
	this->item_number = item_number;
}

CatalogsItemValidationWarnings
CatalogsItemValidationIssues::getWarnings()
{
	return warnings;
}

void
CatalogsItemValidationIssues::setWarnings(CatalogsItemValidationWarnings  warnings)
{
	this->warnings = warnings;
}



