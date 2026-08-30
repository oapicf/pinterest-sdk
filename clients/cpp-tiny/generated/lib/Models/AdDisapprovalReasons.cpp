

#include "AdDisapprovalReasons.h"

using namespace Tiny;

AdDisapprovalReasons::AdDisapprovalReasons()
{
}

AdDisapprovalReasons::AdDisapprovalReasons(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdDisapprovalReasons::~AdDisapprovalReasons()
{

}

void
AdDisapprovalReasons::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdDisapprovalReasons::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



