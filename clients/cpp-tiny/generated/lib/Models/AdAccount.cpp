

#include "AdAccount.h"

using namespace Tiny;

AdAccount::AdAccount()
{
	country = Country();
	created_time = int(0);
	currency = Currency();
	id = std::string();
	name = std::string();
	owner = null;
	permissions = std::list<BusinessAccessRole>();
	time_zone = std::string();
	updated_time = int(0);
}

AdAccount::AdAccount(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccount::~AdAccount()
{

}

void
AdAccount::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countryKey = "country";

    if(object.has_key(countryKey))
    {
        bourne::json value = object[countryKey];




        Country* obj = &country;
		obj->fromJson(value.dump());

    }

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "int");


    }

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];




        Currency* obj = &currency;
		obj->fromJson(value.dump());

    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *ownerKey = "owner";

    if(object.has_key(ownerKey))
    {
        bourne::json value = object[ownerKey];




        AdAccountOwner* obj = &owner;
		obj->fromJson(value.dump());

    }

    const char *permissionsKey = "permissions";

    if(object.has_key(permissionsKey))
    {
        bourne::json value = object[permissionsKey];


        std::list<BusinessAccessRole> permissions_list;
        BusinessAccessRole element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            permissions_list.push_back(element);
        }
        permissions = permissions_list;


    }

    const char *time_zoneKey = "time_zone";

    if(object.has_key(time_zoneKey))
    {
        bourne::json value = object[time_zoneKey];



        jsonToValue(&time_zone, value, "std::string");


    }

    const char *updated_timeKey = "updated_time";

    if(object.has_key(updated_timeKey))
    {
        bourne::json value = object[updated_timeKey];



        jsonToValue(&updated_time, value, "int");


    }


}

bourne::json
AdAccount::toJson()
{
    bourne::json object = bourne::json::object();






	object["country"] = getCountry().toJson();





    object["created_time"] = getCreatedTime();







	object["currency"] = getCurrency().toJson();





    object["id"] = getId();






    object["name"] = getName();







	object["owner"] = getOwner().toJson();




    std::list<BusinessAccessRole> permissions_list = getPermissions();
    bourne::json permissions_arr = bourne::json::array();

    for(auto& var : permissions_list)
    {
        BusinessAccessRole obj = var;
        permissions_arr.append(obj.toJson());
    }
    object["permissions"] = permissions_arr;







    object["time_zone"] = getTimeZone();






    object["updated_time"] = getUpdatedTime();



    return object;

}

Country
AdAccount::getCountry()
{
	return country;
}

void
AdAccount::setCountry(Country country)
{
	this->country = country;
}

int
AdAccount::getCreatedTime()
{
	return created_time;
}

void
AdAccount::setCreatedTime(int created_time)
{
	this->created_time = created_time;
}

Currency
AdAccount::getCurrency()
{
	return currency;
}

void
AdAccount::setCurrency(Currency currency)
{
	this->currency = currency;
}

std::string
AdAccount::getId()
{
	return id;
}

void
AdAccount::setId(std::string id)
{
	this->id = id;
}

std::string
AdAccount::getName()
{
	return name;
}

void
AdAccount::setName(std::string name)
{
	this->name = name;
}

AdAccountOwner
AdAccount::getOwner()
{
	return owner;
}

void
AdAccount::setOwner(AdAccountOwner owner)
{
	this->owner = owner;
}

std::list<BusinessAccessRole>
AdAccount::getPermissions()
{
	return permissions;
}

void
AdAccount::setPermissions(std::list<BusinessAccessRole> permissions)
{
	this->permissions = permissions;
}

std::string
AdAccount::getTimeZone()
{
	return time_zone;
}

void
AdAccount::setTimeZone(std::string time_zone)
{
	this->time_zone = time_zone;
}

int
AdAccount::getUpdatedTime()
{
	return updated_time;
}

void
AdAccount::setUpdatedTime(int updated_time)
{
	this->updated_time = updated_time;
}



