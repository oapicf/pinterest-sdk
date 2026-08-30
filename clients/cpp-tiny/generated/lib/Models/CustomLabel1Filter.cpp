

#include "CustomLabel1Filter.h"

using namespace Tiny;

CustomLabel1Filter::CustomLabel1Filter()
{
	cUSTOM_LABEL_1 = CatalogsProductGroupFilterOperatorTypeCriteria();
}

CustomLabel1Filter::CustomLabel1Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomLabel1Filter::~CustomLabel1Filter()
{

}

void
CustomLabel1Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cUSTOM_LABEL_1Key = "CUSTOM_LABEL_1";

    if(object.has_key(cUSTOM_LABEL_1Key))
    {
        bourne::json value = object[cUSTOM_LABEL_1Key];




        CatalogsProductGroupFilterOperatorTypeCriteria* obj = &cUSTOM_LABEL_1;
		obj->fromJson(value.dump());

    }


}

bourne::json
CustomLabel1Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["cUSTOM_LABEL_1"] = getCUSTOMLABEL1().toJson();


    return object;

}

CatalogsProductGroupFilterOperatorTypeCriteria
CustomLabel1Filter::getCUSTOMLABEL1()
{
	return cUSTOM_LABEL_1;
}

void
CustomLabel1Filter::setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_1)
{
	this->cUSTOM_LABEL_1 = cUSTOM_LABEL_1;
}



