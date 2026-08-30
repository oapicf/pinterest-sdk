

#include "CreativeAssetsProcessingRecord.h"

using namespace Tiny;

CreativeAssetsProcessingRecord::CreativeAssetsProcessingRecord()
{
	creative_assets_id = std::string();
	errors = std::list<ItemValidationEvent>();
	status = ItemProcessingStatus();
	warnings = std::list<ItemValidationEvent>();
}

CreativeAssetsProcessingRecord::CreativeAssetsProcessingRecord(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreativeAssetsProcessingRecord::~CreativeAssetsProcessingRecord()
{

}

void
CreativeAssetsProcessingRecord::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *creative_assets_idKey = "creative_assets_id";

    if(object.has_key(creative_assets_idKey))
    {
        bourne::json value = object[creative_assets_idKey];



        jsonToValue(&creative_assets_id, value, "std::string");


    }

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
CreativeAssetsProcessingRecord::toJson()
{
    bourne::json object = bourne::json::object();





    object["creative_assets_id"] = getCreativeAssetsId();





    std::list<ItemValidationEvent> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        ItemValidationEvent obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;








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

std::string
CreativeAssetsProcessingRecord::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
CreativeAssetsProcessingRecord::setCreativeAssetsId(std::string creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}

std::list<ItemValidationEvent>
CreativeAssetsProcessingRecord::getErrors()
{
	return errors;
}

void
CreativeAssetsProcessingRecord::setErrors(std::list<ItemValidationEvent> errors)
{
	this->errors = errors;
}

ItemProcessingStatus
CreativeAssetsProcessingRecord::getStatus()
{
	return status;
}

void
CreativeAssetsProcessingRecord::setStatus(ItemProcessingStatus status)
{
	this->status = status;
}

std::list<ItemValidationEvent>
CreativeAssetsProcessingRecord::getWarnings()
{
	return warnings;
}

void
CreativeAssetsProcessingRecord::setWarnings(std::list<ItemValidationEvent> warnings)
{
	this->warnings = warnings;
}



