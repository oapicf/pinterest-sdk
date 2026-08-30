

#include "AdvancedAuctionItemsSubmitDeleteRecord.h"

using namespace Tiny;

AdvancedAuctionItemsSubmitDeleteRecord::AdvancedAuctionItemsSubmitDeleteRecord()
{
	country = Country();
	errors = std::list<AdvancedAuctionOperationError>();
	item_id = std::string();
	language = Language();
	operation = std::string();
}

AdvancedAuctionItemsSubmitDeleteRecord::AdvancedAuctionItemsSubmitDeleteRecord(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvancedAuctionItemsSubmitDeleteRecord::~AdvancedAuctionItemsSubmitDeleteRecord()
{

}

void
AdvancedAuctionItemsSubmitDeleteRecord::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countryKey = "country";

    if(object.has_key(countryKey))
    {
        bourne::json value = object[countryKey];




        Country* obj = &country;
		obj->fromJson(value.dump());

    }

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<AdvancedAuctionOperationError> errors_list;
        AdvancedAuctionOperationError element;
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

    const char *languageKey = "language";

    if(object.has_key(languageKey))
    {
        bourne::json value = object[languageKey];




        Language* obj = &language;
		obj->fromJson(value.dump());

    }

    const char *operationKey = "operation";

    if(object.has_key(operationKey))
    {
        bourne::json value = object[operationKey];



        jsonToValue(&operation, value, "std::string");


    }


}

bourne::json
AdvancedAuctionItemsSubmitDeleteRecord::toJson()
{
    bourne::json object = bourne::json::object();






	object["country"] = getCountry().toJson();




    std::list<AdvancedAuctionOperationError> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        AdvancedAuctionOperationError obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;







    object["item_id"] = getItemId();







	object["language"] = getLanguage().toJson();





    object["operation"] = getOperation();



    return object;

}

Country
AdvancedAuctionItemsSubmitDeleteRecord::getCountry()
{
	return country;
}

void
AdvancedAuctionItemsSubmitDeleteRecord::setCountry(Country country)
{
	this->country = country;
}

std::list<AdvancedAuctionOperationError>
AdvancedAuctionItemsSubmitDeleteRecord::getErrors()
{
	return errors;
}

void
AdvancedAuctionItemsSubmitDeleteRecord::setErrors(std::list<AdvancedAuctionOperationError> errors)
{
	this->errors = errors;
}

std::string
AdvancedAuctionItemsSubmitDeleteRecord::getItemId()
{
	return item_id;
}

void
AdvancedAuctionItemsSubmitDeleteRecord::setItemId(std::string item_id)
{
	this->item_id = item_id;
}

Language
AdvancedAuctionItemsSubmitDeleteRecord::getLanguage()
{
	return language;
}

void
AdvancedAuctionItemsSubmitDeleteRecord::setLanguage(Language language)
{
	this->language = language;
}

std::string
AdvancedAuctionItemsSubmitDeleteRecord::getOperation()
{
	return operation;
}

void
AdvancedAuctionItemsSubmitDeleteRecord::setOperation(std::string operation)
{
	this->operation = operation;
}



