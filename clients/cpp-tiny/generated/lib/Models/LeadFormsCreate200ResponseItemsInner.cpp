

#include "Lead_forms_create_200_response_items_inner.h"

using namespace Tiny;

Lead_forms_create_200_response_items_inner::Lead_forms_create_200_response_items_inner()
{
	data = LeadForm();
	exceptions = std::list<Pinterest.Lib.BatchItemException>();
}

Lead_forms_create_200_response_items_inner::Lead_forms_create_200_response_items_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

Lead_forms_create_200_response_items_inner::~Lead_forms_create_200_response_items_inner()
{

}

void
Lead_forms_create_200_response_items_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        LeadForm* obj = &data;
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
Lead_forms_create_200_response_items_inner::toJson()
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

LeadForm
Lead_forms_create_200_response_items_inner::getData()
{
	return data;
}

void
Lead_forms_create_200_response_items_inner::setData(LeadForm data)
{
	this->data = data;
}

std::list<Pinterest.Lib.BatchItemException>
Lead_forms_create_200_response_items_inner::getExceptions()
{
	return exceptions;
}

void
Lead_forms_create_200_response_items_inner::setExceptions(std::list<Pinterest.Lib.BatchItemException> exceptions)
{
	this->exceptions = exceptions;
}



