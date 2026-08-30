

#include "MetricsResponse.h"

using namespace Tiny;

MetricsResponse::MetricsResponse()
{
	data = std::list<MetricsResponseDataItems>();
}

MetricsResponse::MetricsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

MetricsResponse::~MetricsResponse()
{

}

void
MetricsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];


        std::list<MetricsResponseDataItems> data_list;
        MetricsResponseDataItems element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            data_list.push_back(element);
        }
        data = data_list;


    }


}

bourne::json
MetricsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<MetricsResponseDataItems> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        MetricsResponseDataItems obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;




    return object;

}

std::list<MetricsResponseDataItems>
MetricsResponse::getData()
{
	return data;
}

void
MetricsResponse::setData(std::list<MetricsResponseDataItems> data)
{
	this->data = data;
}



