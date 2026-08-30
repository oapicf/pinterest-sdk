

#include "AdAccountsAudienceRule.h"

using namespace Tiny;

AdAccountsAudienceRule::AdAccountsAudienceRule()
{
	ad_account_id = std::string();
	ad_id = std::list<std::string>();
	campaign_id = std::list<std::string>();
	country = std::string();
	customer_list_id = std::string();
	engagement_domain = std::list<std::string>();
	engagement_type = std::string();
	engager_type = int(0);
	event = std::string();
	event_data = EventData();
	event_source = null;
	ingestion_source = null;
	objective_type = std::list<AudienceObjectiveType>();
	percentage = int(0);
	pin_id = std::list<std::string>();
	prefill = bool(false);
	retention_days = int(0);
	seed_id = std::list<std::string>();
	url = std::list<std::string>();
	visitor_source_id = std::string();
}

AdAccountsAudienceRule::AdAccountsAudienceRule(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountsAudienceRule::~AdAccountsAudienceRule()
{

}

void
AdAccountsAudienceRule::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *ad_idKey = "ad_id";

    if(object.has_key(ad_idKey))
    {
        bourne::json value = object[ad_idKey];


        std::list<std::string> ad_id_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            ad_id_list.push_back(element);
        }
        ad_id = ad_id_list;


    }

    const char *campaign_idKey = "campaign_id";

    if(object.has_key(campaign_idKey))
    {
        bourne::json value = object[campaign_idKey];


        std::list<std::string> campaign_id_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            campaign_id_list.push_back(element);
        }
        campaign_id = campaign_id_list;


    }

    const char *countryKey = "country";

    if(object.has_key(countryKey))
    {
        bourne::json value = object[countryKey];



        jsonToValue(&country, value, "std::string");


    }

    const char *customer_list_idKey = "customer_list_id";

    if(object.has_key(customer_list_idKey))
    {
        bourne::json value = object[customer_list_idKey];



        jsonToValue(&customer_list_id, value, "std::string");


    }

    const char *engagement_domainKey = "engagement_domain";

    if(object.has_key(engagement_domainKey))
    {
        bourne::json value = object[engagement_domainKey];


        std::list<std::string> engagement_domain_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            engagement_domain_list.push_back(element);
        }
        engagement_domain = engagement_domain_list;


    }

    const char *engagement_typeKey = "engagement_type";

    if(object.has_key(engagement_typeKey))
    {
        bourne::json value = object[engagement_typeKey];



        jsonToValue(&engagement_type, value, "std::string");


    }

    const char *engager_typeKey = "engager_type";

    if(object.has_key(engager_typeKey))
    {
        bourne::json value = object[engager_typeKey];



        jsonToValue(&engager_type, value, "int");


    }

    const char *eventKey = "event";

    if(object.has_key(eventKey))
    {
        bourne::json value = object[eventKey];



        jsonToValue(&event, value, "std::string");


    }

    const char *event_dataKey = "event_data";

    if(object.has_key(event_dataKey))
    {
        bourne::json value = object[event_dataKey];




        EventData* obj = &event_data;
		obj->fromJson(value.dump());

    }

    const char *event_sourceKey = "event_source";

    if(object.has_key(event_sourceKey))
    {
        bourne::json value = object[event_sourceKey];




        Object* obj = &event_source;
		obj->fromJson(value.dump());

    }

    const char *ingestion_sourceKey = "ingestion_source";

    if(object.has_key(ingestion_sourceKey))
    {
        bourne::json value = object[ingestion_sourceKey];




        Object* obj = &ingestion_source;
		obj->fromJson(value.dump());

    }

    const char *objective_typeKey = "objective_type";

    if(object.has_key(objective_typeKey))
    {
        bourne::json value = object[objective_typeKey];


        std::list<AudienceObjectiveType> objective_type_list;
        AudienceObjectiveType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            objective_type_list.push_back(element);
        }
        objective_type = objective_type_list;


    }

    const char *percentageKey = "percentage";

    if(object.has_key(percentageKey))
    {
        bourne::json value = object[percentageKey];



        jsonToValue(&percentage, value, "int");


    }

    const char *pin_idKey = "pin_id";

    if(object.has_key(pin_idKey))
    {
        bourne::json value = object[pin_idKey];


        std::list<std::string> pin_id_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            pin_id_list.push_back(element);
        }
        pin_id = pin_id_list;


    }

    const char *prefillKey = "prefill";

    if(object.has_key(prefillKey))
    {
        bourne::json value = object[prefillKey];



        jsonToValue(&prefill, value, "bool");


    }

    const char *retention_daysKey = "retention_days";

    if(object.has_key(retention_daysKey))
    {
        bourne::json value = object[retention_daysKey];



        jsonToValue(&retention_days, value, "int");


    }

    const char *seed_idKey = "seed_id";

    if(object.has_key(seed_idKey))
    {
        bourne::json value = object[seed_idKey];


        std::list<std::string> seed_id_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            seed_id_list.push_back(element);
        }
        seed_id = seed_id_list;


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];


        std::list<std::string> url_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            url_list.push_back(element);
        }
        url = url_list;


    }

    const char *visitor_source_idKey = "visitor_source_id";

    if(object.has_key(visitor_source_idKey))
    {
        bourne::json value = object[visitor_source_idKey];



        jsonToValue(&visitor_source_id, value, "std::string");


    }


}

bourne::json
AdAccountsAudienceRule::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();





    std::list<std::string> ad_id_list = getAdId();
    bourne::json ad_id_arr = bourne::json::array();

    for(auto& var : ad_id_list)
    {
        ad_id_arr.append(var);
    }
    object["ad_id"] = ad_id_arr;








    std::list<std::string> campaign_id_list = getCampaignId();
    bourne::json campaign_id_arr = bourne::json::array();

    for(auto& var : campaign_id_list)
    {
        campaign_id_arr.append(var);
    }
    object["campaign_id"] = campaign_id_arr;









    object["country"] = getCountry();






    object["customer_list_id"] = getCustomerListId();





    std::list<std::string> engagement_domain_list = getEngagementDomain();
    bourne::json engagement_domain_arr = bourne::json::array();

    for(auto& var : engagement_domain_list)
    {
        engagement_domain_arr.append(var);
    }
    object["engagement_domain"] = engagement_domain_arr;









    object["engagement_type"] = getEngagementType();






    object["engager_type"] = getEngagerType();






    object["event"] = getEvent();







	object["event_data"] = getEventData().toJson();






	object["event_source"] = getEventSource().toJson();






	object["ingestion_source"] = getIngestionSource().toJson();




    std::list<AudienceObjectiveType> objective_type_list = getObjectiveType();
    bourne::json objective_type_arr = bourne::json::array();

    for(auto& var : objective_type_list)
    {
        AudienceObjectiveType obj = var;
        objective_type_arr.append(obj.toJson());
    }
    object["objective_type"] = objective_type_arr;







    object["percentage"] = getPercentage();





    std::list<std::string> pin_id_list = getPinId();
    bourne::json pin_id_arr = bourne::json::array();

    for(auto& var : pin_id_list)
    {
        pin_id_arr.append(var);
    }
    object["pin_id"] = pin_id_arr;









    object["prefill"] = isPrefill();






    object["retention_days"] = getRetentionDays();





    std::list<std::string> seed_id_list = getSeedId();
    bourne::json seed_id_arr = bourne::json::array();

    for(auto& var : seed_id_list)
    {
        seed_id_arr.append(var);
    }
    object["seed_id"] = seed_id_arr;








    std::list<std::string> url_list = getUrl();
    bourne::json url_arr = bourne::json::array();

    for(auto& var : url_list)
    {
        url_arr.append(var);
    }
    object["url"] = url_arr;









    object["visitor_source_id"] = getVisitorSourceId();



    return object;

}

std::string
AdAccountsAudienceRule::getAdAccountId()
{
	return ad_account_id;
}

void
AdAccountsAudienceRule::setAdAccountId(std::string ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::list<std::string>
AdAccountsAudienceRule::getAdId()
{
	return ad_id;
}

void
AdAccountsAudienceRule::setAdId(std::list<std::string> ad_id)
{
	this->ad_id = ad_id;
}

std::list<std::string>
AdAccountsAudienceRule::getCampaignId()
{
	return campaign_id;
}

void
AdAccountsAudienceRule::setCampaignId(std::list<std::string> campaign_id)
{
	this->campaign_id = campaign_id;
}

std::string
AdAccountsAudienceRule::getCountry()
{
	return country;
}

void
AdAccountsAudienceRule::setCountry(std::string country)
{
	this->country = country;
}

std::string
AdAccountsAudienceRule::getCustomerListId()
{
	return customer_list_id;
}

void
AdAccountsAudienceRule::setCustomerListId(std::string customer_list_id)
{
	this->customer_list_id = customer_list_id;
}

std::list<std::string>
AdAccountsAudienceRule::getEngagementDomain()
{
	return engagement_domain;
}

void
AdAccountsAudienceRule::setEngagementDomain(std::list<std::string> engagement_domain)
{
	this->engagement_domain = engagement_domain;
}

std::string
AdAccountsAudienceRule::getEngagementType()
{
	return engagement_type;
}

void
AdAccountsAudienceRule::setEngagementType(std::string engagement_type)
{
	this->engagement_type = engagement_type;
}

int
AdAccountsAudienceRule::getEngagerType()
{
	return engager_type;
}

void
AdAccountsAudienceRule::setEngagerType(int engager_type)
{
	this->engager_type = engager_type;
}

std::string
AdAccountsAudienceRule::getEvent()
{
	return event;
}

void
AdAccountsAudienceRule::setEvent(std::string event)
{
	this->event = event;
}

EventData
AdAccountsAudienceRule::getEventData()
{
	return event_data;
}

void
AdAccountsAudienceRule::setEventData(EventData event_data)
{
	this->event_data = event_data;
}

Object
AdAccountsAudienceRule::getEventSource()
{
	return event_source;
}

void
AdAccountsAudienceRule::setEventSource(Object event_source)
{
	this->event_source = event_source;
}

Object
AdAccountsAudienceRule::getIngestionSource()
{
	return ingestion_source;
}

void
AdAccountsAudienceRule::setIngestionSource(Object ingestion_source)
{
	this->ingestion_source = ingestion_source;
}

std::list<AudienceObjectiveType>
AdAccountsAudienceRule::getObjectiveType()
{
	return objective_type;
}

void
AdAccountsAudienceRule::setObjectiveType(std::list<AudienceObjectiveType> objective_type)
{
	this->objective_type = objective_type;
}

int
AdAccountsAudienceRule::getPercentage()
{
	return percentage;
}

void
AdAccountsAudienceRule::setPercentage(int percentage)
{
	this->percentage = percentage;
}

std::list<std::string>
AdAccountsAudienceRule::getPinId()
{
	return pin_id;
}

void
AdAccountsAudienceRule::setPinId(std::list<std::string> pin_id)
{
	this->pin_id = pin_id;
}

bool
AdAccountsAudienceRule::isPrefill()
{
	return prefill;
}

void
AdAccountsAudienceRule::setPrefill(bool prefill)
{
	this->prefill = prefill;
}

int
AdAccountsAudienceRule::getRetentionDays()
{
	return retention_days;
}

void
AdAccountsAudienceRule::setRetentionDays(int retention_days)
{
	this->retention_days = retention_days;
}

std::list<std::string>
AdAccountsAudienceRule::getSeedId()
{
	return seed_id;
}

void
AdAccountsAudienceRule::setSeedId(std::list<std::string> seed_id)
{
	this->seed_id = seed_id;
}

std::list<std::string>
AdAccountsAudienceRule::getUrl()
{
	return url;
}

void
AdAccountsAudienceRule::setUrl(std::list<std::string> url)
{
	this->url = url;
}

std::string
AdAccountsAudienceRule::getVisitorSourceId()
{
	return visitor_source_id;
}

void
AdAccountsAudienceRule::setVisitorSourceId(std::string visitor_source_id)
{
	this->visitor_source_id = visitor_source_id;
}



