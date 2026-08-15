

#include "AdvancedAuctionItemsSubmitDeleteRecord.h"

using namespace Tiny;

AdvancedAuctionItemsSubmitDeleteRecord::AdvancedAuctionItemsSubmitDeleteRecord()
{
	country = Country();
	item_id = std::string();
	language = Language();
	errors = std::list<AdvancedAuctionOperationError>();
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


}

bourne::json
AdvancedAuctionItemsSubmitDeleteRecord::toJson()
{
    bourne::json object = bourne::json::object();






	object["country"] = getCountry().toJson();





    object["item_id"] = getItemId();







	object["language"] = getLanguage().toJson();




    std::list<AdvancedAuctionOperationError> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        AdvancedAuctionOperationError obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;




    return object;

}

Country
AdvancedAuctionItemsSubmitDeleteRecord::getCountry()
{
	return country;
}

void
AdvancedAuctionItemsSubmitDeleteRecord::setCountry(Country  country)
{
	this->country = country;
}

std::string
AdvancedAuctionItemsSubmitDeleteRecord::getItemId()
{
	return item_id;
}

void
AdvancedAuctionItemsSubmitDeleteRecord::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

Language
AdvancedAuctionItemsSubmitDeleteRecord::getLanguage()
{
	return language;
}

void
AdvancedAuctionItemsSubmitDeleteRecord::setLanguage(Language  language)
{
	this->language = language;
}

std::list<AdvancedAuctionOperationError>
AdvancedAuctionItemsSubmitDeleteRecord::getErrors()
{
	return errors;
}

void
AdvancedAuctionItemsSubmitDeleteRecord::setErrors(std::list <AdvancedAuctionOperationError> errors)
{
	this->errors = errors;
}



