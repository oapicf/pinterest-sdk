

#include "Catalogs_local_stores_create_200_response_inner.h"

using namespace Tiny;

Catalogs_local_stores_create_200_response_inner::Catalogs_local_stores_create_200_response_inner()
{
	data = Catalogs_local_stores_create_200_response_inner_data();
}

Catalogs_local_stores_create_200_response_inner::Catalogs_local_stores_create_200_response_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

Catalogs_local_stores_create_200_response_inner::~Catalogs_local_stores_create_200_response_inner()
{

}

void
Catalogs_local_stores_create_200_response_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        Catalogs_local_stores_create_200_response_inner_data* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
Catalogs_local_stores_create_200_response_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["data"] = getData().toJson();


    return object;

}

Catalogs_local_stores_create_200_response_inner_data
Catalogs_local_stores_create_200_response_inner::getData()
{
	return data;
}

void
Catalogs_local_stores_create_200_response_inner::setData(Catalogs_local_stores_create_200_response_inner_data data)
{
	this->data = data;
}



