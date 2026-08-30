

#include "TrendsGender.h"

using namespace Tiny;

TrendsGender::TrendsGender()
{
}

TrendsGender::TrendsGender(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendsGender::~TrendsGender()
{

}

void
TrendsGender::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TrendsGender::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



