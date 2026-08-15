

#include "LeadFormArrayResponse_items_inner.h"

using namespace Tiny;

LeadFormArrayResponse_items_inner::LeadFormArrayResponse_items_inner()
{
	data = LeadFormResponse();
	exceptions = std::list<Exception>();
}

LeadFormArrayResponse_items_inner::LeadFormArrayResponse_items_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadFormArrayResponse_items_inner::~LeadFormArrayResponse_items_inner()
{

}

void
LeadFormArrayResponse_items_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        LeadFormResponse* obj = &data;
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
LeadFormArrayResponse_items_inner::toJson()
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

LeadFormResponse
LeadFormArrayResponse_items_inner::getData()
{
	return data;
}

void
LeadFormArrayResponse_items_inner::setData(LeadFormResponse  data)
{
	this->data = data;
}

std::list<Exception>
LeadFormArrayResponse_items_inner::getExceptions()
{
	return exceptions;
}

void
LeadFormArrayResponse_items_inner::setExceptions(std::list <Exception> exceptions)
{
	this->exceptions = exceptions;
}



