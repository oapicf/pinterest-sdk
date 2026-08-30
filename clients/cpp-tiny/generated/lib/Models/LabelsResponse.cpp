

#include "LabelsResponse.h"

using namespace Tiny;

LabelsResponse::LabelsResponse()
{
	errors = std::list<LabelError>();
	labels = std::list<Label>();
}

LabelsResponse::LabelsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabelsResponse::~LabelsResponse()
{

}

void
LabelsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<LabelError> errors_list;
        LabelError element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            errors_list.push_back(element);
        }
        errors = errors_list;


    }

    const char *labelsKey = "labels";

    if(object.has_key(labelsKey))
    {
        bourne::json value = object[labelsKey];


        std::list<Label> labels_list;
        Label element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            labels_list.push_back(element);
        }
        labels = labels_list;


    }


}

bourne::json
LabelsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<LabelError> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        LabelError obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;






    std::list<Label> labels_list = getLabels();
    bourne::json labels_arr = bourne::json::array();

    for(auto& var : labels_list)
    {
        Label obj = var;
        labels_arr.append(obj.toJson());
    }
    object["labels"] = labels_arr;




    return object;

}

std::list<LabelError>
LabelsResponse::getErrors()
{
	return errors;
}

void
LabelsResponse::setErrors(std::list<LabelError> errors)
{
	this->errors = errors;
}

std::list<Label>
LabelsResponse::getLabels()
{
	return labels;
}

void
LabelsResponse::setLabels(std::list<Label> labels)
{
	this->labels = labels;
}



