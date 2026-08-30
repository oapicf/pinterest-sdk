

#include "ItemProcessingRecord.h"

using namespace Tiny;

ItemProcessingRecord::ItemProcessingRecord()
{
	errors = std::list<ItemValidationEvent>();
	item_id = std::string();
	status = ItemProcessingStatus();
	warnings = std::list<ItemValidationEvent>();
}

ItemProcessingRecord::ItemProcessingRecord(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemProcessingRecord::~ItemProcessingRecord()
{

}

void
ItemProcessingRecord::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<ItemValidationEvent> errors_list;
        ItemValidationEvent element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            errors_list.push_back(element);
        }
        errors = errors_list;


    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        ItemProcessingStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *warningsKey = "warnings";

    if(object.has_key(warningsKey))
    {
        bourne::json value = object[warningsKey];


        std::list<ItemValidationEvent> warnings_list;
        ItemValidationEvent element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            warnings_list.push_back(element);
        }
        warnings = warnings_list;


    }


}

bourne::json
ItemProcessingRecord::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ItemValidationEvent> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        ItemValidationEvent obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;







    object["item_id"] = getItemId();







	object["status"] = getStatus().toJson();




    std::list<ItemValidationEvent> warnings_list = getWarnings();
    bourne::json warnings_arr = bourne::json::array();

    for(auto& var : warnings_list)
    {
        ItemValidationEvent obj = var;
        warnings_arr.append(obj.toJson());
    }
    object["warnings"] = warnings_arr;




    return object;

}

std::list<ItemValidationEvent>
ItemProcessingRecord::getErrors()
{
	return errors;
}

void
ItemProcessingRecord::setErrors(std::list<ItemValidationEvent> errors)
{
	this->errors = errors;
}

std::string
ItemProcessingRecord::getItemId()
{
	return item_id;
}

void
ItemProcessingRecord::setItemId(std::string item_id)
{
	this->item_id = item_id;
}

ItemProcessingStatus
ItemProcessingRecord::getStatus()
{
	return status;
}

void
ItemProcessingRecord::setStatus(ItemProcessingStatus status)
{
	this->status = status;
}

std::list<ItemValidationEvent>
ItemProcessingRecord::getWarnings()
{
	return warnings;
}

void
ItemProcessingRecord::setWarnings(std::list<ItemValidationEvent> warnings)
{
	this->warnings = warnings;
}



