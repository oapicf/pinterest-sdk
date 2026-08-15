

#include "ProductCategoriesDemographic.h"

using namespace Tiny;

ProductCategoriesDemographic::ProductCategoriesDemographic()
{
	age = null<long>();
	gender = GenderDemographics();
}

ProductCategoriesDemographic::ProductCategoriesDemographic(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductCategoriesDemographic::~ProductCategoriesDemographic()
{

}

void
ProductCategoriesDemographic::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ageKey = "age";

    if(object.has_key(ageKey))
    {
        bourne::json value = object[ageKey];


    }

    const char *genderKey = "gender";

    if(object.has_key(genderKey))
    {
        bourne::json value = object[genderKey];




        GenderDemographics* obj = &gender;
		obj->fromJson(value.dump());

    }


}

bourne::json
ProductCategoriesDemographic::toJson()
{
    bourne::json object = bourne::json::object();









	object["gender"] = getGender().toJson();


    return object;

}

Map<string, string>
ProductCategoriesDemographic::getAge()
{
	return age;
}

void
ProductCategoriesDemographic::setAge(Map <string, string> age)
{
	this->age = age;
}

GenderDemographics
ProductCategoriesDemographic::getGender()
{
	return gender;
}

void
ProductCategoriesDemographic::setGender(GenderDemographics  gender)
{
	this->gender = gender;
}



