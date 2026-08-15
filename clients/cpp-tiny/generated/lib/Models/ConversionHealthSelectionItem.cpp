

#include "ConversionHealthSelectionItem.h"

using namespace Tiny;

ConversionHealthSelectionItem::ConversionHealthSelectionItem()
{
	conversionType = null;
	criteria = null;
	ingestionSource = null;
	status = null;
}

ConversionHealthSelectionItem::ConversionHealthSelectionItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionHealthSelectionItem::~ConversionHealthSelectionItem()
{

}

void
ConversionHealthSelectionItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *conversionTypeKey = "conversionType";

    if(object.has_key(conversionTypeKey))
    {
        bourne::json value = object[conversionTypeKey];




        Object* obj = &conversionType;
		obj->fromJson(value.dump());

    }

    const char *criteriaKey = "criteria";

    if(object.has_key(criteriaKey))
    {
        bourne::json value = object[criteriaKey];




        Object* obj = &criteria;
		obj->fromJson(value.dump());

    }

    const char *ingestionSourceKey = "ingestionSource";

    if(object.has_key(ingestionSourceKey))
    {
        bourne::json value = object[ingestionSourceKey];




        Object* obj = &ingestionSource;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        AnyType* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
ConversionHealthSelectionItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["conversionType"] = getConversionType().toJson();






	object["criteria"] = getCriteria().toJson();






	object["ingestionSource"] = getIngestionSource().toJson();






	object["status"] = getStatus().toJson();


    return object;

}

Object
ConversionHealthSelectionItem::getConversionType()
{
	return conversionType;
}

void
ConversionHealthSelectionItem::setConversionType(Object  conversionType)
{
	this->conversionType = conversionType;
}

Object
ConversionHealthSelectionItem::getCriteria()
{
	return criteria;
}

void
ConversionHealthSelectionItem::setCriteria(Object  criteria)
{
	this->criteria = criteria;
}

Object
ConversionHealthSelectionItem::getIngestionSource()
{
	return ingestionSource;
}

void
ConversionHealthSelectionItem::setIngestionSource(Object  ingestionSource)
{
	this->ingestionSource = ingestionSource;
}

AnyType
ConversionHealthSelectionItem::getStatus()
{
	return status;
}

void
ConversionHealthSelectionItem::setStatus(AnyType  status)
{
	this->status = status;
}



