

#include "CustomNumber3Filter.h"

using namespace Tiny;

CustomNumber3Filter::CustomNumber3Filter()
{
	cUSTOM_NUMBER_3 = CatalogsProductGroupUint32Criteria();
}

CustomNumber3Filter::CustomNumber3Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomNumber3Filter::~CustomNumber3Filter()
{

}

void
CustomNumber3Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cUSTOM_NUMBER_3Key = "CUSTOM_NUMBER_3";

    if(object.has_key(cUSTOM_NUMBER_3Key))
    {
        bourne::json value = object[cUSTOM_NUMBER_3Key];




        CatalogsProductGroupUint32Criteria* obj = &cUSTOM_NUMBER_3;
		obj->fromJson(value.dump());

    }


}

bourne::json
CustomNumber3Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["cUSTOM_NUMBER_3"] = getCUSTOMNUMBER3().toJson();


    return object;

}

CatalogsProductGroupUint32Criteria
CustomNumber3Filter::getCUSTOMNUMBER3()
{
	return cUSTOM_NUMBER_3;
}

void
CustomNumber3Filter::setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_3)
{
	this->cUSTOM_NUMBER_3 = cUSTOM_NUMBER_3;
}



