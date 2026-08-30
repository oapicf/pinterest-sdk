

#include "LabelCreateRequest.h"

using namespace Tiny;

LabelCreateRequest::LabelCreateRequest()
{
	labels = std::list<LabelCreateItem>();
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


        std::list<LabelCreateItem> labels_list;
        LabelCreateItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            labels_list.push_back(element);
        }
        labels = labels_list;


    }


}

bourne::json
LabelCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<LabelCreateItem> labels_list = getLabels();
    bourne::json labels_arr = bourne::json::array();

    for(auto& var : labels_list)
    {
        LabelCreateItem obj = var;
        labels_arr.append(obj.toJson());
    }
    object["labels"] = labels_arr;




    return object;

}

std::list<LabelCreateItem>
LabelCreateRequest::getLabels()
{
	return labels;
}

void
LabelCreateRequest::setLabels(std::list<LabelCreateItem> labels)
{
	this->labels = labels;
}



