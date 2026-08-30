

#include "CustomNumber4Filter.h"

using namespace Tiny;

CustomNumber4Filter::CustomNumber4Filter()
{
	cUSTOM_NUMBER_4 = CatalogsProductGroupUint32Criteria();
}

CustomNumber4Filter::CustomNumber4Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomNumber4Filter::~CustomNumber4Filter()
{

}

void
CustomNumber4Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cUSTOM_NUMBER_4Key = "CUSTOM_NUMBER_4";

    if(object.has_key(cUSTOM_NUMBER_4Key))
    {
        bourne::json value = object[cUSTOM_NUMBER_4Key];




        CatalogsProductGroupUint32Criteria* obj = &cUSTOM_NUMBER_4;
		obj->fromJson(value.dump());

    }


}

bourne::json
CustomNumber4Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["cUSTOM_NUMBER_4"] = getCUSTOMNUMBER4().toJson();


    return object;

}

CatalogsProductGroupUint32Criteria
CustomNumber4Filter::getCUSTOMNUMBER4()
{
	return cUSTOM_NUMBER_4;
}

void
CustomNumber4Filter::setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_4)
{
	this->cUSTOM_NUMBER_4 = cUSTOM_NUMBER_4;
}



