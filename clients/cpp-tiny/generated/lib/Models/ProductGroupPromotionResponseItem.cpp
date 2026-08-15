

#include "ProductGroupPromotionResponseItem.h"

using namespace Tiny;

ProductGroupPromotionResponseItem::ProductGroupPromotionResponseItem()
{
	data = ProductGroupPromotion();
	exceptions = std::list<Exception>();
}

ProductGroupPromotionResponseItem::ProductGroupPromotionResponseItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductGroupPromotionResponseItem::~ProductGroupPromotionResponseItem()
{

}

void
ProductGroupPromotionResponseItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        ProductGroupPromotion* obj = &data;
		obj->fromJson(value.dump());

    }

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];


        std::list<Exception> exceptions_list;
        Exception element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            exceptions_list.push_back(element);
        }
        exceptions = exceptions_list;


    }


}

bourne::json
ProductGroupPromotionResponseItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["data"] = getData().toJson();




    std::list<Exception> exceptions_list = getExceptions();
    bourne::json exceptions_arr = bourne::json::array();

    for(auto& var : exceptions_list)
    {
        Exception obj = var;
        exceptions_arr.append(obj.toJson());
    }
    object["exceptions"] = exceptions_arr;




    return object;

}

ProductGroupPromotion
ProductGroupPromotionResponseItem::getData()
{
	return data;
}

void
ProductGroupPromotionResponseItem::setData(ProductGroupPromotion  data)
{
	this->data = data;
}

std::list<Exception>
ProductGroupPromotionResponseItem::getExceptions()
{
	return exceptions;
}

void
ProductGroupPromotionResponseItem::setExceptions(std::list <Exception> exceptions)
{
	this->exceptions = exceptions;
}



