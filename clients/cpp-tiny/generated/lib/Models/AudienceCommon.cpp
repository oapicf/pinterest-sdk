

#include "AudienceCommon.h"

using namespace Tiny;

AudienceCommon::AudienceCommon()
{
	ad_account_id = std::string();
	name = std::string();
	rule = AudienceRule();
}

AudienceCommon::AudienceCommon(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceCommon::~AudienceCommon()
{

}

void
AudienceCommon::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *ruleKey = "rule";

    if(object.has_key(ruleKey))
    {
        bourne::json value = object[ruleKey];




        AudienceRule* obj = &rule;
		obj->fromJson(value.dump());

    }


}

bourne::json
AudienceCommon::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["name"] = getName();







	object["rule"] = getRule().toJson();


    return object;

}

std::string
AudienceCommon::getAdAccountId()
{
	return ad_account_id;
}

void
AudienceCommon::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
AudienceCommon::getName()
{
	return name;
}

void
AudienceCommon::setName(std::string  name)
{
	this->name = name;
}

AudienceRule
AudienceCommon::getRule()
{
	return rule;
}

void
AudienceCommon::setRule(AudienceRule  rule)
{
	this->rule = rule;
}



