

#include "CustomLabel4Filter.h"

using namespace Tiny;

CustomLabel4Filter::CustomLabel4Filter()
{
	cUSTOM_LABEL_4 = CatalogsProductGroupFilterOperatorTypeCriteria();
}

CustomLabel4Filter::CustomLabel4Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomLabel4Filter::~CustomLabel4Filter()
{

}

void
CustomLabel4Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cUSTOM_LABEL_4Key = "CUSTOM_LABEL_4";

    if(object.has_key(cUSTOM_LABEL_4Key))
    {
        bourne::json value = object[cUSTOM_LABEL_4Key];




        CatalogsProductGroupFilterOperatorTypeCriteria* obj = &cUSTOM_LABEL_4;
		obj->fromJson(value.dump());

    }


}

bourne::json
CustomLabel4Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["cUSTOM_LABEL_4"] = getCUSTOMLABEL4().toJson();


    return object;

}

CatalogsProductGroupFilterOperatorTypeCriteria
CustomLabel4Filter::getCUSTOMLABEL4()
{
	return cUSTOM_LABEL_4;
}

void
CustomLabel4Filter::setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_4)
{
	this->cUSTOM_LABEL_4 = cUSTOM_LABEL_4;
}



