

#include "LabeledEntities.h"

using namespace Tiny;

LabeledEntities::LabeledEntities()
{
	entities_labels = std::list<EntityLabel>();
	errors = std::list<EntityLabelError>();
}

LabeledEntities::LabeledEntities(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabeledEntities::~LabeledEntities()
{

}

void
LabeledEntities::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *entities_labelsKey = "entities_labels";

    if(object.has_key(entities_labelsKey))
    {
        bourne::json value = object[entities_labelsKey];


        std::list<EntityLabel> entities_labels_list;
        EntityLabel element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            entities_labels_list.push_back(element);
        }
        entities_labels = entities_labels_list;


    }

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<EntityLabelError> errors_list;
        EntityLabelError element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            errors_list.push_back(element);
        }
        errors = errors_list;


    }


}

bourne::json
LabeledEntities::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<EntityLabel> entities_labels_list = getEntitiesLabels();
    bourne::json entities_labels_arr = bourne::json::array();

    for(auto& var : entities_labels_list)
    {
        EntityLabel obj = var;
        entities_labels_arr.append(obj.toJson());
    }
    object["entities_labels"] = entities_labels_arr;






    std::list<EntityLabelError> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        EntityLabelError obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;




    return object;

}

std::list<EntityLabel>
LabeledEntities::getEntitiesLabels()
{
	return entities_labels;
}

void
LabeledEntities::setEntitiesLabels(std::list<EntityLabel> entities_labels)
{
	this->entities_labels = entities_labels;
}

std::list<EntityLabelError>
LabeledEntities::getErrors()
{
	return errors;
}

void
LabeledEntities::setErrors(std::list<EntityLabelError> errors)
{
	this->errors = errors;
}



