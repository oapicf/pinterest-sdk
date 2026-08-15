

#include "LabelCreateRequest.h"

using namespace Tiny;

LabelCreateRequest::LabelCreateRequest()
{
	labels = std::list<LabelCreateRequest_labels_inner>();
	parent_id = std::string();
}

LabelCreateRequest::LabelCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabelCreateRequest::~LabelCreateRequest()
{

}

void
LabelCreateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *labelsKey = "labels";

    if(object.has_key(labelsKey))
    {
        bourne::json value = object[labelsKey];


        std::list<LabelCreateRequest_labels_inner> labels_list;
        LabelCreateRequest_labels_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            labels_list.push_back(element);
        }
        labels = labels_list;


    }

    const char *parent_idKey = "parent_id";

    if(object.has_key(parent_idKey))
    {
        bourne::json value = object[parent_idKey];



        jsonToValue(&parent_id, value, "std::string");


    }


}

bourne::json
LabelCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<LabelCreateRequest_labels_inner> labels_list = getLabels();
    bourne::json labels_arr = bourne::json::array();

    for(auto& var : labels_list)
    {
        LabelCreateRequest_labels_inner obj = var;
        labels_arr.append(obj.toJson());
    }
    object["labels"] = labels_arr;







    object["parent_id"] = getParentId();



    return object;

}

std::list<LabelCreateRequest_labels_inner>
LabelCreateRequest::getLabels()
{
	return labels;
}

void
LabelCreateRequest::setLabels(std::list <LabelCreateRequest_labels_inner> labels)
{
	this->labels = labels;
}

std::string
LabelCreateRequest::getParentId()
{
	return parent_id;
}

void
LabelCreateRequest::setParentId(std::string  parent_id)
{
	this->parent_id = parent_id;
}



