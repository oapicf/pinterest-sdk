

#include "CatalogsProductGroupMultiplePinterestProductCategoryCriteria.h"

using namespace Tiny;

CatalogsProductGroupMultiplePinterestProductCategoryCriteria::CatalogsProductGroupMultiplePinterestProductCategoryCriteria()
{
	negated = bool(false);
	values = std::list<ProductCategoryEnum>();
}

CatalogsProductGroupMultiplePinterestProductCategoryCriteria::CatalogsProductGroupMultiplePinterestProductCategoryCriteria(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupMultiplePinterestProductCategoryCriteria::~CatalogsProductGroupMultiplePinterestProductCategoryCriteria()
{

}

void
CatalogsProductGroupMultiplePinterestProductCategoryCriteria::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *negatedKey = "negated";

    if(object.has_key(negatedKey))
    {
        bourne::json value = object[negatedKey];



        jsonToValue(&negated, value, "bool");


    }

    const char *valuesKey = "values";

    if(object.has_key(valuesKey))
    {
        bourne::json value = object[valuesKey];


        std::list<ProductCategoryEnum> values_list;
        ProductCategoryEnum element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            values_list.push_back(element);
        }
        values = values_list;


    }


}

bourne::json
CatalogsProductGroupMultiplePinterestProductCategoryCriteria::toJson()
{
    bourne::json object = bourne::json::object();





    object["negated"] = isNegated();





    std::list<ProductCategoryEnum> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        ProductCategoryEnum obj = var;
        values_arr.append(obj.toJson());
    }
    object["values"] = values_arr;




    return object;

}

bool
CatalogsProductGroupMultiplePinterestProductCategoryCriteria::isNegated()
{
	return negated;
}

void
CatalogsProductGroupMultiplePinterestProductCategoryCriteria::setNegated(bool negated)
{
	this->negated = negated;
}

std::list<ProductCategoryEnum>
CatalogsProductGroupMultiplePinterestProductCategoryCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupMultiplePinterestProductCategoryCriteria::setValues(std::list<ProductCategoryEnum> values)
{
	this->values = values;
}



