

#include "HotelProcessingRecord.h"

using namespace Tiny;

HotelProcessingRecord::HotelProcessingRecord()
{
	errors = std::list<ItemValidationEvent>();
	hotel_id = std::string();
	status = ItemProcessingStatus();
	warnings = std::list<ItemValidationEvent>();
}

HotelProcessingRecord::HotelProcessingRecord(std::string jsonString)
{
	this->fromJson(jsonString);
}

HotelProcessingRecord::~HotelProcessingRecord()
{

}

void
HotelProcessingRecord::fromJson(std::string jsonObj)
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

    const char *hotel_idKey = "hotel_id";

    if(object.has_key(hotel_idKey))
    {
        bourne::json value = object[hotel_idKey];



        jsonToValue(&hotel_id, value, "std::string");


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
HotelProcessingRecord::toJson()
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







    object["hotel_id"] = getHotelId();







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
HotelProcessingRecord::getErrors()
{
	return errors;
}

void
HotelProcessingRecord::setErrors(std::list<ItemValidationEvent> errors)
{
	this->errors = errors;
}

std::string
HotelProcessingRecord::getHotelId()
{
	return hotel_id;
}

void
HotelProcessingRecord::setHotelId(std::string hotel_id)
{
	this->hotel_id = hotel_id;
}

ItemProcessingStatus
HotelProcessingRecord::getStatus()
{
	return status;
}

void
HotelProcessingRecord::setStatus(ItemProcessingStatus status)
{
	this->status = status;
}

std::list<ItemValidationEvent>
HotelProcessingRecord::getWarnings()
{
	return warnings;
}

void
HotelProcessingRecord::setWarnings(std::list<ItemValidationEvent> warnings)
{
	this->warnings = warnings;
}



