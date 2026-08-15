

#include "ConversionEvents.h"

using namespace Tiny;

ConversionEvents::ConversionEvents()
{
	data = std::list<ConversionEvents_data_inner>();
}

ConversionEvents::ConversionEvents(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionEvents::~ConversionEvents()
{

}

void
ConversionEvents::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];


        std::list<ConversionEvents_data_inner> data_list;
        ConversionEvents_data_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            data_list.push_back(element);
        }
        data = data_list;


    }


}

bourne::json
ConversionEvents::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ConversionEvents_data_inner> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        ConversionEvents_data_inner obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;




    return object;

}

std::list<ConversionEvents_data_inner>
ConversionEvents::getData()
{
	return data;
}

void
ConversionEvents::setData(std::list <ConversionEvents_data_inner> data)
{
	this->data = data;
}



