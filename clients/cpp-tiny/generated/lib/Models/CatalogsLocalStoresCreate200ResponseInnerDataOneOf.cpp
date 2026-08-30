

#include "Catalogs_local_stores_create_200_response_inner_data_oneOf.h"

using namespace Tiny;

Catalogs_local_stores_create_200_response_inner_data_oneOf::Catalogs_local_stores_create_200_response_inner_data_oneOf()
{
	id = std::string();
	exceptions = Pinterest.Lib.Error();
}

Catalogs_local_stores_create_200_response_inner_data_oneOf::Catalogs_local_stores_create_200_response_inner_data_oneOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

Catalogs_local_stores_create_200_response_inner_data_oneOf::~Catalogs_local_stores_create_200_response_inner_data_oneOf()
{

}

void
Catalogs_local_stores_create_200_response_inner_data_oneOf::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];




        Pinterest.Lib.Error* obj = &exceptions;
		obj->fromJson(value.dump());

    }


}

bourne::json
Catalogs_local_stores_create_200_response_inner_data_oneOf::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["exceptions"] = getExceptions().toJson();


    return object;

}

std::string
Catalogs_local_stores_create_200_response_inner_data_oneOf::getId()
{
	return id;
}

void
Catalogs_local_stores_create_200_response_inner_data_oneOf::setId(std::string id)
{
	this->id = id;
}

Pinterest.Lib.Error
Catalogs_local_stores_create_200_response_inner_data_oneOf::getExceptions()
{
	return exceptions;
}

void
Catalogs_local_stores_create_200_response_inner_data_oneOf::setExceptions(Pinterest.Lib.Error exceptions)
{
	this->exceptions = exceptions;
}



