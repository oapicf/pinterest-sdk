

#include "NonNullableCatalogsCurrency.h"

using namespace Tiny;

NonNullableCatalogsCurrency::NonNullableCatalogsCurrency()
{
}

NonNullableCatalogsCurrency::NonNullableCatalogsCurrency(std::string jsonString)
{
	this->fromJson(jsonString);
}

NonNullableCatalogsCurrency::~NonNullableCatalogsCurrency()
{

}

void
NonNullableCatalogsCurrency::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
NonNullableCatalogsCurrency::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



