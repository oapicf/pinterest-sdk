

#include "AttributionModel.h"

using namespace Tiny;

AttributionModel::AttributionModel()
{
}

AttributionModel::AttributionModel(std::string jsonString)
{
	this->fromJson(jsonString);
}

AttributionModel::~AttributionModel()
{

}

void
AttributionModel::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AttributionModel::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



