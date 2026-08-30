

#include "LocalInventoryOperationResult.h"

using namespace Tiny;

LocalInventoryOperationResult::LocalInventoryOperationResult()
{
	errors = std::list<SupplementalItemValidationEvent>();
	item_id = std::string();
	status = null;
	store_code = std::string();
	supplemental_type = std::string();
	warnings = std::list<SupplementalItemValidationEvent>();
}

LocalInventoryOperationResult::LocalInventoryOperationResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocalInventoryOperationResult::~LocalInventoryOperationResult()
{

}

void
LocalInventoryOperationResult::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<SupplementalItemValidationEvent> errors_list;
        SupplementalItemValidationEvent element;
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




        SupplementalItemProcessingStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *store_codeKey = "store_code";

    if(object.has_key(store_codeKey))
    {
        bourne::json value = object[store_codeKey];



        jsonToValue(&store_code, value, "std::string");


    }

    const char *supplemental_typeKey = "supplemental_type";

    if(object.has_key(supplemental_typeKey))
    {
        bourne::json value = object[supplemental_typeKey];



        jsonToValue(&supplemental_type, value, "std::string");


    }

    const char *warningsKey = "warnings";

    if(object.has_key(warningsKey))
    {
        bourne::json value = object[warningsKey];


        std::list<SupplementalItemValidationEvent> warnings_list;
        SupplementalItemValidationEvent element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            warnings_list.push_back(element);
        }
        warnings = warnings_list;


    }


}

bourne::json
LocalInventoryOperationResult::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<SupplementalItemValidationEvent> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        SupplementalItemValidationEvent obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;







    object["item_id"] = getItemId();







	object["status"] = getStatus().toJson();





    object["store_code"] = getStoreCode();






    object["supplemental_type"] = getSupplementalType();





    std::list<SupplementalItemValidationEvent> warnings_list = getWarnings();
    bourne::json warnings_arr = bourne::json::array();

    for(auto& var : warnings_list)
    {
        SupplementalItemValidationEvent obj = var;
        warnings_arr.append(obj.toJson());
    }
    object["warnings"] = warnings_arr;




    return object;

}

std::list<SupplementalItemValidationEvent>
LocalInventoryOperationResult::getErrors()
{
	return errors;
}

void
LocalInventoryOperationResult::setErrors(std::list<SupplementalItemValidationEvent> errors)
{
	this->errors = errors;
}

std::string
LocalInventoryOperationResult::getItemId()
{
	return item_id;
}

void
LocalInventoryOperationResult::setItemId(std::string item_id)
{
	this->item_id = item_id;
}

SupplementalItemProcessingStatus
LocalInventoryOperationResult::getStatus()
{
	return status;
}

void
LocalInventoryOperationResult::setStatus(SupplementalItemProcessingStatus status)
{
	this->status = status;
}

std::string
LocalInventoryOperationResult::getStoreCode()
{
	return store_code;
}

void
LocalInventoryOperationResult::setStoreCode(std::string store_code)
{
	this->store_code = store_code;
}

std::string
LocalInventoryOperationResult::getSupplementalType()
{
	return supplemental_type;
}

void
LocalInventoryOperationResult::setSupplementalType(std::string supplemental_type)
{
	this->supplemental_type = supplemental_type;
}

std::list<SupplementalItemValidationEvent>
LocalInventoryOperationResult::getWarnings()
{
	return warnings;
}

void
LocalInventoryOperationResult::setWarnings(std::list<SupplementalItemValidationEvent> warnings)
{
	this->warnings = warnings;
}



