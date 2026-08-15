

#include "CustomNumber0Filter.h"

using namespace Tiny;

CustomNumber0Filter::CustomNumber0Filter()
{
	cUSTOM_NUMBER_0 = CatalogsProductGroupUint32Criteria();
}

CustomNumber0Filter::CustomNumber0Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomNumber0Filter::~CustomNumber0Filter()
{

}

void
CustomNumber0Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cUSTOM_NUMBER_0Key = "CUSTOM_NUMBER_0";

    if(object.has_key(cUSTOM_NUMBER_0Key))
    {
        bourne::json value = object[cUSTOM_NUMBER_0Key];




        CatalogsProductGroupUint32Criteria* obj = &cUSTOM_NUMBER_0;
		obj->fromJson(value.dump());

    }


}

bourne::json
CustomNumber0Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["cUSTOM_NUMBER_0"] = getCUSTOMNUMBER0().toJson();


    return object;

}

CatalogsProductGroupUint32Criteria
CustomNumber0Filter::getCUSTOMNUMBER0()
{
	return cUSTOM_NUMBER_0;
}

void
CustomNumber0Filter::setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_0)
{
	this->cUSTOM_NUMBER_0 = cUSTOM_NUMBER_0;
}



