

#include "UpdateMaskFieldType.h"

using namespace Tiny;

UpdateMaskFieldType::UpdateMaskFieldType()
{
}

UpdateMaskFieldType::UpdateMaskFieldType(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateMaskFieldType::~UpdateMaskFieldType()
{

}

void
UpdateMaskFieldType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
UpdateMaskFieldType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



