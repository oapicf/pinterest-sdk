

#include "DynamicTitlesProcessCSVError.h"

using namespace Tiny;

DynamicTitlesProcessCSVError::DynamicTitlesProcessCSVError()
{
	error_type = std::string();
	row_number = int(0);
}

DynamicTitlesProcessCSVError::DynamicTitlesProcessCSVError(std::string jsonString)
{
	this->fromJson(jsonString);
}

DynamicTitlesProcessCSVError::~DynamicTitlesProcessCSVError()
{

}

void
DynamicTitlesProcessCSVError::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *error_typeKey = "error_type";

    if(object.has_key(error_typeKey))
    {
        bourne::json value = object[error_typeKey];



        jsonToValue(&error_type, value, "std::string");


    }

    const char *row_numberKey = "row_number";

    if(object.has_key(row_numberKey))
    {
        bourne::json value = object[row_numberKey];



        jsonToValue(&row_number, value, "int");


    }


}

bourne::json
DynamicTitlesProcessCSVError::toJson()
{
    bourne::json object = bourne::json::object();





    object["error_type"] = getErrorType();






    object["row_number"] = getRowNumber();



    return object;

}

std::string
DynamicTitlesProcessCSVError::getErrorType()
{
	return error_type;
}

void
DynamicTitlesProcessCSVError::setErrorType(std::string error_type)
{
	this->error_type = error_type;
}

int
DynamicTitlesProcessCSVError::getRowNumber()
{
	return row_number;
}

void
DynamicTitlesProcessCSVError::setRowNumber(int row_number)
{
	this->row_number = row_number;
}



