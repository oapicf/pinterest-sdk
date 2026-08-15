

#include "AdsAnalyticsMetricsFilter.h"

using namespace Tiny;

AdsAnalyticsMetricsFilter::AdsAnalyticsMetricsFilter()
{
	field = AdsAnalyticsFilterColumn();
	r_operator = AdsAnalyticsFilterOperator();
	values = std::list<long>();
}

AdsAnalyticsMetricsFilter::AdsAnalyticsMetricsFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsAnalyticsMetricsFilter::~AdsAnalyticsMetricsFilter()
{

}

void
AdsAnalyticsMetricsFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fieldKey = "field";

    if(object.has_key(fieldKey))
    {
        bourne::json value = object[fieldKey];




        AdsAnalyticsFilterColumn* obj = &field;
		obj->fromJson(value.dump());

    }

    const char *r_operatorKey = "operator";

    if(object.has_key(r_operatorKey))
    {
        bourne::json value = object[r_operatorKey];




        AdsAnalyticsFilterOperator* obj = &r_operator;
		obj->fromJson(value.dump());

    }

    const char *valuesKey = "values";

    if(object.has_key(valuesKey))
    {
        bourne::json value = object[valuesKey];


        std::list<long> values_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            values_list.push_back(element);
        }
        values = values_list;


    }


}

bourne::json
AdsAnalyticsMetricsFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["field"] = getField().toJson();






	object["r_operator"] = getROperator().toJson();




    std::list<long> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        values_arr.append(var);
    }
    object["values"] = values_arr;






    return object;

}

AdsAnalyticsFilterColumn
AdsAnalyticsMetricsFilter::getField()
{
	return field;
}

void
AdsAnalyticsMetricsFilter::setField(AdsAnalyticsFilterColumn  field)
{
	this->field = field;
}

AdsAnalyticsFilterOperator
AdsAnalyticsMetricsFilter::getROperator()
{
	return r_operator;
}

void
AdsAnalyticsMetricsFilter::setROperator(AdsAnalyticsFilterOperator  r_operator)
{
	this->r_operator = r_operator;
}

std::list<long>
AdsAnalyticsMetricsFilter::getValues()
{
	return values;
}

void
AdsAnalyticsMetricsFilter::setValues(std::list <long> values)
{
	this->values = values;
}



