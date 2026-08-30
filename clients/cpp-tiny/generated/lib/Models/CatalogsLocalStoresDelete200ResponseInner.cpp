

#include "Catalogs_local_stores_delete_200_response_inner.h"

using namespace Tiny;

Catalogs_local_stores_delete_200_response_inner::Catalogs_local_stores_delete_200_response_inner()
{
	id = std::string();
	status = Campaign_ad_preview_delete_200_response_inner_status();
}

Catalogs_local_stores_delete_200_response_inner::Catalogs_local_stores_delete_200_response_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

Catalogs_local_stores_delete_200_response_inner::~Catalogs_local_stores_delete_200_response_inner()
{

}

void
Catalogs_local_stores_delete_200_response_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        Campaign_ad_preview_delete_200_response_inner_status* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
Catalogs_local_stores_delete_200_response_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["status"] = getStatus().toJson();


    return object;

}

std::string
Catalogs_local_stores_delete_200_response_inner::getId()
{
	return id;
}

void
Catalogs_local_stores_delete_200_response_inner::setId(std::string id)
{
	this->id = id;
}

Campaign_ad_preview_delete_200_response_inner_status
Catalogs_local_stores_delete_200_response_inner::getStatus()
{
	return status;
}

void
Catalogs_local_stores_delete_200_response_inner::setStatus(Campaign_ad_preview_delete_200_response_inner_status status)
{
	this->status = status;
}



