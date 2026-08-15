

#include "AdvancedAuctionItemsSubmitUpsertRecord.h"

using namespace Tiny;

AdvancedAuctionItemsSubmitUpsertRecord::AdvancedAuctionItemsSubmitUpsertRecord()
{
	country = Country();
	item_id = std::string();
	language = Language();
	bid_options = AdvancedAuctionBidOptions();
	errors = std::list<AdvancedAuctionOperationError>();
	update_mask = std::list<UpdateMaskBidOptionField>();
}

AdvancedAuctionItemsSubmitUpsertRecord::AdvancedAuctionItemsSubmitUpsertRecord(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvancedAuctionItemsSubmitUpsertRecord::~AdvancedAuctionItemsSubmitUpsertRecord()
{

}

void
AdvancedAuctionItemsSubmitUpsertRecord::fromJson(std::string jsonObj)
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

    const char *bid_optionsKey = "bid_options";

    if(object.has_key(bid_optionsKey))
    {
        bourne::json value = object[bid_optionsKey];




        AdvancedAuctionBidOptions* obj = &bid_options;
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

    const char *update_maskKey = "update_mask";

    if(object.has_key(update_maskKey))
    {
        bourne::json value = object[update_maskKey];


        std::list<UpdateMaskBidOptionField> update_mask_list;
        UpdateMaskBidOptionField element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            update_mask_list.push_back(element);
        }
        update_mask = update_mask_list;


    }


}

bourne::json
AdvancedAuctionItemsSubmitUpsertRecord::toJson()
{
    bourne::json object = bourne::json::object();






	object["country"] = getCountry().toJson();





    object["item_id"] = getItemId();







	object["language"] = getLanguage().toJson();






	object["bid_options"] = getBidOptions().toJson();




    std::list<AdvancedAuctionOperationError> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        AdvancedAuctionOperationError obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;






    std::list<UpdateMaskBidOptionField> update_mask_list = getUpdateMask();
    bourne::json update_mask_arr = bourne::json::array();

    for(auto& var : update_mask_list)
    {
        UpdateMaskBidOptionField obj = var;
        update_mask_arr.append(obj.toJson());
    }
    object["update_mask"] = update_mask_arr;




    return object;

}

Country
AdvancedAuctionItemsSubmitUpsertRecord::getCountry()
{
	return country;
}

void
AdvancedAuctionItemsSubmitUpsertRecord::setCountry(Country  country)
{
	this->country = country;
}

std::string
AdvancedAuctionItemsSubmitUpsertRecord::getItemId()
{
	return item_id;
}

void
AdvancedAuctionItemsSubmitUpsertRecord::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

Language
AdvancedAuctionItemsSubmitUpsertRecord::getLanguage()
{
	return language;
}

void
AdvancedAuctionItemsSubmitUpsertRecord::setLanguage(Language  language)
{
	this->language = language;
}

AdvancedAuctionBidOptions
AdvancedAuctionItemsSubmitUpsertRecord::getBidOptions()
{
	return bid_options;
}

void
AdvancedAuctionItemsSubmitUpsertRecord::setBidOptions(AdvancedAuctionBidOptions  bid_options)
{
	this->bid_options = bid_options;
}

std::list<AdvancedAuctionOperationError>
AdvancedAuctionItemsSubmitUpsertRecord::getErrors()
{
	return errors;
}

void
AdvancedAuctionItemsSubmitUpsertRecord::setErrors(std::list <AdvancedAuctionOperationError> errors)
{
	this->errors = errors;
}

std::list<UpdateMaskBidOptionField>
AdvancedAuctionItemsSubmitUpsertRecord::getUpdateMask()
{
	return update_mask;
}

void
AdvancedAuctionItemsSubmitUpsertRecord::setUpdateMask(std::list <UpdateMaskBidOptionField> update_mask)
{
	this->update_mask = update_mask;
}



