

#include "Ad_groups_create_200_response_items_inner.h"

using namespace Tiny;

Ad_groups_create_200_response_items_inner::Ad_groups_create_200_response_items_inner()
{
	data = AdGroup();
	exceptions = std::list<Pinterest.Lib.BatchItemException>();
}

Ad_groups_create_200_response_items_inner::Ad_groups_create_200_response_items_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

Ad_groups_create_200_response_items_inner::~Ad_groups_create_200_response_items_inner()
{

}

void
Ad_groups_create_200_response_items_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        AdGroup* obj = &data;
		obj->fromJson(value.dump());

    }

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];


        std::list<Pinterest.Lib.BatchItemException> exceptions_list;
        Pinterest.Lib.BatchItemException element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            exceptions_list.push_back(element);
        }
        exceptions = exceptions_list;


    }


}

bourne::json
Ad_groups_create_200_response_items_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["data"] = getData().toJson();




    std::list<Pinterest.Lib.BatchItemException> exceptions_list = getExceptions();
    bourne::json exceptions_arr = bourne::json::array();

    for(auto& var : exceptions_list)
    {
        Pinterest.Lib.BatchItemException obj = var;
        exceptions_arr.append(obj.toJson());
    }
    object["exceptions"] = exceptions_arr;




    return object;

}

AdGroup
Ad_groups_create_200_response_items_inner::getData()
{
	return data;
}

void
Ad_groups_create_200_response_items_inner::setData(AdGroup data)
{
	this->data = data;
}

std::list<Pinterest.Lib.BatchItemException>
Ad_groups_create_200_response_items_inner::getExceptions()
{
	return exceptions;
}

void
Ad_groups_create_200_response_items_inner::setExceptions(std::list<Pinterest.Lib.BatchItemException> exceptions)
{
	this->exceptions = exceptions;
}



