

#include "NullableCatalogsItemFieldType.h"

using namespace Tiny;

NullableCatalogsItemFieldType::NullableCatalogsItemFieldType()
{
}

NullableCatalogsItemFieldType::NullableCatalogsItemFieldType(std::string jsonString)
{
	this->fromJson(jsonString);
}

NullableCatalogsItemFieldType::~NullableCatalogsItemFieldType()
{

}

void
NullableCatalogsItemFieldType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
NullableCatalogsItemFieldType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



