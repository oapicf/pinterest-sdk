

#include "NullableCurrency.h"

using namespace Tiny;

NullableCurrency::NullableCurrency()
{
}

NullableCurrency::NullableCurrency(std::string jsonString)
{
	this->fromJson(jsonString);
}

NullableCurrency::~NullableCurrency()
{

}

void
NullableCurrency::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
NullableCurrency::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



