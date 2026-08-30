

#include "CustomLabel3Filter.h"

using namespace Tiny;

CustomLabel3Filter::CustomLabel3Filter()
{
	cUSTOM_LABEL_3 = CatalogsProductGroupFilterOperatorTypeCriteria();
}

CustomLabel3Filter::CustomLabel3Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomLabel3Filter::~CustomLabel3Filter()
{

}

void
CustomLabel3Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cUSTOM_LABEL_3Key = "CUSTOM_LABEL_3";

    if(object.has_key(cUSTOM_LABEL_3Key))
    {
        bourne::json value = object[cUSTOM_LABEL_3Key];




        CatalogsProductGroupFilterOperatorTypeCriteria* obj = &cUSTOM_LABEL_3;
		obj->fromJson(value.dump());

    }


}

bourne::json
CustomLabel3Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["cUSTOM_LABEL_3"] = getCUSTOMLABEL3().toJson();


    return object;

}

CatalogsProductGroupFilterOperatorTypeCriteria
CustomLabel3Filter::getCUSTOMLABEL3()
{
	return cUSTOM_LABEL_3;
}

void
CustomLabel3Filter::setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_3)
{
	this->cUSTOM_LABEL_3 = cUSTOM_LABEL_3;
}



