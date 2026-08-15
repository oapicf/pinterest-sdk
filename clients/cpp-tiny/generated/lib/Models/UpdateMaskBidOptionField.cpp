

#include "UpdateMaskBidOptionField.h"

using namespace Tiny;

UpdateMaskBidOptionField::UpdateMaskBidOptionField()
{
}

UpdateMaskBidOptionField::UpdateMaskBidOptionField(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateMaskBidOptionField::~UpdateMaskBidOptionField()
{

}

void
UpdateMaskBidOptionField::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
UpdateMaskBidOptionField::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



