

#include "TrackingUrls.h"

using namespace Tiny;

TrackingUrls::TrackingUrls()
{
	audience_verification = std::list<std::string>();
	buyable_button = std::list<std::string>();
	click = std::list<std::string>();
	engagement = std::list<std::string>();
	impression = std::list<std::string>();
}

TrackingUrls::TrackingUrls(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrackingUrls::~TrackingUrls()
{

}

void
TrackingUrls::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *audience_verificationKey = "audience_verification";

    if(object.has_key(audience_verificationKey))
    {
        bourne::json value = object[audience_verificationKey];


        std::list<std::string> audience_verification_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            audience_verification_list.push_back(element);
        }
        audience_verification = audience_verification_list;


    }

    const char *buyable_buttonKey = "buyable_button";

    if(object.has_key(buyable_buttonKey))
    {
        bourne::json value = object[buyable_buttonKey];


        std::list<std::string> buyable_button_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            buyable_button_list.push_back(element);
        }
        buyable_button = buyable_button_list;


    }

    const char *clickKey = "click";

    if(object.has_key(clickKey))
    {
        bourne::json value = object[clickKey];


        std::list<std::string> click_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            click_list.push_back(element);
        }
        click = click_list;


    }

    const char *engagementKey = "engagement";

    if(object.has_key(engagementKey))
    {
        bourne::json value = object[engagementKey];


        std::list<std::string> engagement_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            engagement_list.push_back(element);
        }
        engagement = engagement_list;


    }

    const char *impressionKey = "impression";

    if(object.has_key(impressionKey))
    {
        bourne::json value = object[impressionKey];


        std::list<std::string> impression_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            impression_list.push_back(element);
        }
        impression = impression_list;


    }


}

bourne::json
TrackingUrls::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> audience_verification_list = getAudienceVerification();
    bourne::json audience_verification_arr = bourne::json::array();

    for(auto& var : audience_verification_list)
    {
        audience_verification_arr.append(var);
    }
    object["audience_verification"] = audience_verification_arr;








    std::list<std::string> buyable_button_list = getBuyableButton();
    bourne::json buyable_button_arr = bourne::json::array();

    for(auto& var : buyable_button_list)
    {
        buyable_button_arr.append(var);
    }
    object["buyable_button"] = buyable_button_arr;








    std::list<std::string> click_list = getClick();
    bourne::json click_arr = bourne::json::array();

    for(auto& var : click_list)
    {
        click_arr.append(var);
    }
    object["click"] = click_arr;








    std::list<std::string> engagement_list = getEngagement();
    bourne::json engagement_arr = bourne::json::array();

    for(auto& var : engagement_list)
    {
        engagement_arr.append(var);
    }
    object["engagement"] = engagement_arr;








    std::list<std::string> impression_list = getImpression();
    bourne::json impression_arr = bourne::json::array();

    for(auto& var : impression_list)
    {
        impression_arr.append(var);
    }
    object["impression"] = impression_arr;






    return object;

}

std::list<std::string>
TrackingUrls::getAudienceVerification()
{
	return audience_verification;
}

void
TrackingUrls::setAudienceVerification(std::list<std::string> audience_verification)
{
	this->audience_verification = audience_verification;
}

std::list<std::string>
TrackingUrls::getBuyableButton()
{
	return buyable_button;
}

void
TrackingUrls::setBuyableButton(std::list<std::string> buyable_button)
{
	this->buyable_button = buyable_button;
}

std::list<std::string>
TrackingUrls::getClick()
{
	return click;
}

void
TrackingUrls::setClick(std::list<std::string> click)
{
	this->click = click;
}

std::list<std::string>
TrackingUrls::getEngagement()
{
	return engagement;
}

void
TrackingUrls::setEngagement(std::list<std::string> engagement)
{
	this->engagement = engagement;
}

std::list<std::string>
TrackingUrls::getImpression()
{
	return impression;
}

void
TrackingUrls::setImpression(std::list<std::string> impression)
{
	this->impression = impression;
}



