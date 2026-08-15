

#include "AdGroupArrayResponseElement.h"

using namespace Tiny;

AdGroupArrayResponseElement::AdGroupArrayResponseElement()
{
	data = AdGroupResponse();
	exceptions = std::list<Exception>();
}

AdGroupArrayResponseElement::AdGroupArrayResponseElement(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupArrayResponseElement::~AdGroupArrayResponseElement()
{

}

void
AdGroupArrayResponseElement::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        AdGroupResponse* obj = &data;
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
AdGroupArrayResponseElement::toJson()
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

AdGroupResponse
AdGroupArrayResponseElement::getData()
{
	return data;
}

void
AdGroupArrayResponseElement::setData(AdGroupResponse  data)
{
	this->data = data;
}

std::list<Exception>
AdGroupArrayResponseElement::getExceptions()
{
	return exceptions;
}

void
AdGroupArrayResponseElement::setExceptions(std::list <Exception> exceptions)
{
	this->exceptions = exceptions;
}



