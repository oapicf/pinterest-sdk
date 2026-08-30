

#include "FormFactor.h"

using namespace Tiny;

FormFactor::FormFactor()
{
}

FormFactor::FormFactor(std::string jsonString)
{
	this->fromJson(jsonString);
}

FormFactor::~FormFactor()
{

}

void
FormFactor::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FormFactor::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



