

#include "CustomLabel2Filter.h"

using namespace Tiny;

CustomLabel2Filter::CustomLabel2Filter()
{
	cUSTOM_LABEL_2 = CatalogsProductGroupFilterOperatorTypeCriteria();
}

CustomLabel2Filter::CustomLabel2Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomLabel2Filter::~CustomLabel2Filter()
{

}

void
CustomLabel2Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cUSTOM_LABEL_2Key = "CUSTOM_LABEL_2";

    if(object.has_key(cUSTOM_LABEL_2Key))
    {
        bourne::json value = object[cUSTOM_LABEL_2Key];




        CatalogsProductGroupFilterOperatorTypeCriteria* obj = &cUSTOM_LABEL_2;
		obj->fromJson(value.dump());

    }


}

bourne::json
CustomLabel2Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["cUSTOM_LABEL_2"] = getCUSTOMLABEL2().toJson();


    return object;

}

CatalogsProductGroupFilterOperatorTypeCriteria
CustomLabel2Filter::getCUSTOMLABEL2()
{
	return cUSTOM_LABEL_2;
}

void
CustomLabel2Filter::setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_2)
{
	this->cUSTOM_LABEL_2 = cUSTOM_LABEL_2;
}



