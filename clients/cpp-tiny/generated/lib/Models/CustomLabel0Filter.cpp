

#include "CustomLabel0Filter.h"

using namespace Tiny;

CustomLabel0Filter::CustomLabel0Filter()
{
	cUSTOM_LABEL_0 = CatalogsProductGroupFilterOperatorTypeCriteria();
}

CustomLabel0Filter::CustomLabel0Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomLabel0Filter::~CustomLabel0Filter()
{

}

void
CustomLabel0Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cUSTOM_LABEL_0Key = "CUSTOM_LABEL_0";

    if(object.has_key(cUSTOM_LABEL_0Key))
    {
        bourne::json value = object[cUSTOM_LABEL_0Key];




        CatalogsProductGroupFilterOperatorTypeCriteria* obj = &cUSTOM_LABEL_0;
		obj->fromJson(value.dump());

    }


}

bourne::json
CustomLabel0Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["cUSTOM_LABEL_0"] = getCUSTOMLABEL0().toJson();


    return object;

}

CatalogsProductGroupFilterOperatorTypeCriteria
CustomLabel0Filter::getCUSTOMLABEL0()
{
	return cUSTOM_LABEL_0;
}

void
CustomLabel0Filter::setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_0)
{
	this->cUSTOM_LABEL_0 = cUSTOM_LABEL_0;
}



