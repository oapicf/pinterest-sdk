

#include "AudienceDemographics.h"

using namespace Tiny;

AudienceDemographics::AudienceDemographics()
{
	ages = std::list<AudienceDemographicValue>();
	countries = std::list<AudienceDemographicValue>();
	devices = std::list<AudienceDemographicValue>();
	genders = std::list<AudienceDemographicValue>();
	metros = std::list<AudienceDemographicValue>();
}

AudienceDemographics::AudienceDemographics(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceDemographics::~AudienceDemographics()
{

}

void
AudienceDemographics::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *agesKey = "ages";

    if(object.has_key(agesKey))
    {
        bourne::json value = object[agesKey];


        std::list<AudienceDemographicValue> ages_list;
        AudienceDemographicValue element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            ages_list.push_back(element);
        }
        ages = ages_list;


    }

    const char *countriesKey = "countries";

    if(object.has_key(countriesKey))
    {
        bourne::json value = object[countriesKey];


        std::list<AudienceDemographicValue> countries_list;
        AudienceDemographicValue element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            countries_list.push_back(element);
        }
        countries = countries_list;


    }

    const char *devicesKey = "devices";

    if(object.has_key(devicesKey))
    {
        bourne::json value = object[devicesKey];


        std::list<AudienceDemographicValue> devices_list;
        AudienceDemographicValue element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            devices_list.push_back(element);
        }
        devices = devices_list;


    }

    const char *gendersKey = "genders";

    if(object.has_key(gendersKey))
    {
        bourne::json value = object[gendersKey];


        std::list<AudienceDemographicValue> genders_list;
        AudienceDemographicValue element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            genders_list.push_back(element);
        }
        genders = genders_list;


    }

    const char *metrosKey = "metros";

    if(object.has_key(metrosKey))
    {
        bourne::json value = object[metrosKey];


        std::list<AudienceDemographicValue> metros_list;
        AudienceDemographicValue element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            metros_list.push_back(element);
        }
        metros = metros_list;


    }


}

bourne::json
AudienceDemographics::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AudienceDemographicValue> ages_list = getAges();
    bourne::json ages_arr = bourne::json::array();

    for(auto& var : ages_list)
    {
        AudienceDemographicValue obj = var;
        ages_arr.append(obj.toJson());
    }
    object["ages"] = ages_arr;






    std::list<AudienceDemographicValue> countries_list = getCountries();
    bourne::json countries_arr = bourne::json::array();

    for(auto& var : countries_list)
    {
        AudienceDemographicValue obj = var;
        countries_arr.append(obj.toJson());
    }
    object["countries"] = countries_arr;






    std::list<AudienceDemographicValue> devices_list = getDevices();
    bourne::json devices_arr = bourne::json::array();

    for(auto& var : devices_list)
    {
        AudienceDemographicValue obj = var;
        devices_arr.append(obj.toJson());
    }
    object["devices"] = devices_arr;






    std::list<AudienceDemographicValue> genders_list = getGenders();
    bourne::json genders_arr = bourne::json::array();

    for(auto& var : genders_list)
    {
        AudienceDemographicValue obj = var;
        genders_arr.append(obj.toJson());
    }
    object["genders"] = genders_arr;






    std::list<AudienceDemographicValue> metros_list = getMetros();
    bourne::json metros_arr = bourne::json::array();

    for(auto& var : metros_list)
    {
        AudienceDemographicValue obj = var;
        metros_arr.append(obj.toJson());
    }
    object["metros"] = metros_arr;




    return object;

}

std::list<AudienceDemographicValue>
AudienceDemographics::getAges()
{
	return ages;
}

void
AudienceDemographics::setAges(std::list <AudienceDemographicValue> ages)
{
	this->ages = ages;
}

std::list<AudienceDemographicValue>
AudienceDemographics::getCountries()
{
	return countries;
}

void
AudienceDemographics::setCountries(std::list <AudienceDemographicValue> countries)
{
	this->countries = countries;
}

std::list<AudienceDemographicValue>
AudienceDemographics::getDevices()
{
	return devices;
}

void
AudienceDemographics::setDevices(std::list <AudienceDemographicValue> devices)
{
	this->devices = devices;
}

std::list<AudienceDemographicValue>
AudienceDemographics::getGenders()
{
	return genders;
}

void
AudienceDemographics::setGenders(std::list <AudienceDemographicValue> genders)
{
	this->genders = genders;
}

std::list<AudienceDemographicValue>
AudienceDemographics::getMetros()
{
	return metros;
}

void
AudienceDemographics::setMetros(std::list <AudienceDemographicValue> metros)
{
	this->metros = metros;
}



