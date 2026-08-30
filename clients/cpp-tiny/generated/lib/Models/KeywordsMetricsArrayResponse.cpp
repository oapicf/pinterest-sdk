

#include "KeywordsMetricsArrayResponse.h"

using namespace Tiny;

KeywordsMetricsArrayResponse::KeywordsMetricsArrayResponse()
{
	data = std::list<KeywordMetricsResponse>();
}

KeywordsMetricsArrayResponse::KeywordsMetricsArrayResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeywordsMetricsArrayResponse::~KeywordsMetricsArrayResponse()
{

}

void
KeywordsMetricsArrayResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];


        std::list<KeywordMetricsResponse> data_list;
        KeywordMetricsResponse element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            data_list.push_back(element);
        }
        data = data_list;


    }


}

bourne::json
KeywordsMetricsArrayResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<KeywordMetricsResponse> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        KeywordMetricsResponse obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;




    return object;

}

std::list<KeywordMetricsResponse>
KeywordsMetricsArrayResponse::getData()
{
	return data;
}

void
KeywordsMetricsArrayResponse::setData(std::list<KeywordMetricsResponse> data)
{
	this->data = data;
}



