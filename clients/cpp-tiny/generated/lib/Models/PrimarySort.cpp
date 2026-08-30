

#include "PrimarySort.h"

using namespace Tiny;

PrimarySort::PrimarySort()
{
}

PrimarySort::PrimarySort(std::string jsonString)
{
	this->fromJson(jsonString);
}

PrimarySort::~PrimarySort()
{

}

void
PrimarySort::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PrimarySort::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



