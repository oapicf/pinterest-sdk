

#include "LabelBulkCreateRequest.h"

using namespace Tiny;

LabelBulkCreateRequest::LabelBulkCreateRequest()
{
	labels = std::list<LabelCreateItem>();
	parent_id = std::string();
}

LabelBulkCreateRequest::LabelBulkCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabelBulkCreateRequest::~LabelBulkCreateRequest()
{

}

void
LabelBulkCreateRequest::fromJson(std::string jsonObj)
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

    const char *parent_idKey = "parent_id";

    if(object.has_key(parent_idKey))
    {
        bourne::json value = object[parent_idKey];



        jsonToValue(&parent_id, value, "std::string");


    }


}

bourne::json
LabelBulkCreateRequest::toJson()
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







    object["parent_id"] = getParentId();



    return object;

}

std::list<LabelCreateItem>
LabelBulkCreateRequest::getLabels()
{
	return labels;
}

void
LabelBulkCreateRequest::setLabels(std::list<LabelCreateItem> labels)
{
	this->labels = labels;
}

std::string
LabelBulkCreateRequest::getParentId()
{
	return parent_id;
}

void
LabelBulkCreateRequest::setParentId(std::string parent_id)
{
	this->parent_id = parent_id;
}



