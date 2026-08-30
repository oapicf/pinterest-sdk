

#include "CatalogsAiContentDisclosureLabel.h"

using namespace Tiny;

CatalogsAiContentDisclosureLabel::CatalogsAiContentDisclosureLabel()
{
}

CatalogsAiContentDisclosureLabel::CatalogsAiContentDisclosureLabel(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsAiContentDisclosureLabel::~CatalogsAiContentDisclosureLabel()
{

}

void
CatalogsAiContentDisclosureLabel::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CatalogsAiContentDisclosureLabel::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



