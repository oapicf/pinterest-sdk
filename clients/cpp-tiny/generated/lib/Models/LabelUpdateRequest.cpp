

#include "LabelUpdateRequest.h"

using namespace Tiny;

LabelUpdateRequest::LabelUpdateRequest()
{
	labels = std::list<LabelUpdateItem>();
}

LabelUpdateRequest::LabelUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabelUpdateRequest::~LabelUpdateRequest()
{

}

void
LabelUpdateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *labelsKey = "labels";

    if(object.has_key(labelsKey))
    {
        bourne::json value = object[labelsKey];


        std::list<LabelUpdateItem> labels_list;
        LabelUpdateItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            labels_list.push_back(element);
        }
        labels = labels_list;


    }


}

bourne::json
LabelUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<LabelUpdateItem> labels_list = getLabels();
    bourne::json labels_arr = bourne::json::array();

    for(auto& var : labels_list)
    {
        LabelUpdateItem obj = var;
        labels_arr.append(obj.toJson());
    }
    object["labels"] = labels_arr;




    return object;

}

std::list<LabelUpdateItem>
LabelUpdateRequest::getLabels()
{
	return labels;
}

void
LabelUpdateRequest::setLabels(std::list<LabelUpdateItem> labels)
{
	this->labels = labels;
}



