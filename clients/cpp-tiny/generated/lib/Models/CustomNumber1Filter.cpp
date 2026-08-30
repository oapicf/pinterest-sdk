

#include "CustomNumber1Filter.h"

using namespace Tiny;

CustomNumber1Filter::CustomNumber1Filter()
{
	cUSTOM_NUMBER_1 = CatalogsProductGroupUint32Criteria();
}

CustomNumber1Filter::CustomNumber1Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomNumber1Filter::~CustomNumber1Filter()
{

}

void
CustomNumber1Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cUSTOM_NUMBER_1Key = "CUSTOM_NUMBER_1";

    if(object.has_key(cUSTOM_NUMBER_1Key))
    {
        bourne::json value = object[cUSTOM_NUMBER_1Key];




        CatalogsProductGroupUint32Criteria* obj = &cUSTOM_NUMBER_1;
		obj->fromJson(value.dump());

    }


}

bourne::json
CustomNumber1Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["cUSTOM_NUMBER_1"] = getCUSTOMNUMBER1().toJson();


    return object;

}

CatalogsProductGroupUint32Criteria
CustomNumber1Filter::getCUSTOMNUMBER1()
{
	return cUSTOM_NUMBER_1;
}

void
CustomNumber1Filter::setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_1)
{
	this->cUSTOM_NUMBER_1 = cUSTOM_NUMBER_1;
}



