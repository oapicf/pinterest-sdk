

#include "ConversionEventsCreate.h"

using namespace Tiny;

ConversionEventsCreate::ConversionEventsCreate()
{
	data = std::list<ConversionEventsDataItems>();
}

ConversionEventsCreate::ConversionEventsCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionEventsCreate::~ConversionEventsCreate()
{

}

void
ConversionEventsCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];


        std::list<ConversionEventsDataItems> data_list;
        ConversionEventsDataItems element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            data_list.push_back(element);
        }
        data = data_list;


    }


}

bourne::json
ConversionEventsCreate::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ConversionEventsDataItems> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        ConversionEventsDataItems obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;




    return object;

}

std::list<ConversionEventsDataItems>
ConversionEventsCreate::getData()
{
	return data;
}

void
ConversionEventsCreate::setData(std::list<ConversionEventsDataItems> data)
{
	this->data = data;
}



