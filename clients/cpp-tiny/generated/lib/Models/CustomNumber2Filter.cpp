

#include "CustomNumber2Filter.h"

using namespace Tiny;

CustomNumber2Filter::CustomNumber2Filter()
{
	cUSTOM_NUMBER_2 = CatalogsProductGroupUint32Criteria();
}

CustomNumber2Filter::CustomNumber2Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomNumber2Filter::~CustomNumber2Filter()
{

}

void
CustomNumber2Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cUSTOM_NUMBER_2Key = "CUSTOM_NUMBER_2";

    if(object.has_key(cUSTOM_NUMBER_2Key))
    {
        bourne::json value = object[cUSTOM_NUMBER_2Key];




        CatalogsProductGroupUint32Criteria* obj = &cUSTOM_NUMBER_2;
		obj->fromJson(value.dump());

    }


}

bourne::json
CustomNumber2Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["cUSTOM_NUMBER_2"] = getCUSTOMNUMBER2().toJson();


    return object;

}

CatalogsProductGroupUint32Criteria
CustomNumber2Filter::getCUSTOMNUMBER2()
{
	return cUSTOM_NUMBER_2;
}

void
CustomNumber2Filter::setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_2)
{
	this->cUSTOM_NUMBER_2 = cUSTOM_NUMBER_2;
}



