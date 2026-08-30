

#include "DynamicTitlesProcessCSV.h"

using namespace Tiny;

DynamicTitlesProcessCSV::DynamicTitlesProcessCSV()
{
	errors = std::list<DynamicTitlesProcessCSVError>();
	status = std::string();
}

DynamicTitlesProcessCSV::DynamicTitlesProcessCSV(std::string jsonString)
{
	this->fromJson(jsonString);
}

DynamicTitlesProcessCSV::~DynamicTitlesProcessCSV()
{

}

void
DynamicTitlesProcessCSV::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<DynamicTitlesProcessCSVError> errors_list;
        DynamicTitlesProcessCSVError element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            errors_list.push_back(element);
        }
        errors = errors_list;


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }


}

bourne::json
DynamicTitlesProcessCSV::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<DynamicTitlesProcessCSVError> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        DynamicTitlesProcessCSVError obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;







    object["status"] = getStatus();



    return object;

}

std::list<DynamicTitlesProcessCSVError>
DynamicTitlesProcessCSV::getErrors()
{
	return errors;
}

void
DynamicTitlesProcessCSV::setErrors(std::list<DynamicTitlesProcessCSVError> errors)
{
	this->errors = errors;
}

std::string
DynamicTitlesProcessCSV::getStatus()
{
	return status;
}

void
DynamicTitlesProcessCSV::setStatus(std::string status)
{
	this->status = status;
}



