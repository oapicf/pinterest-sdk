

#include "CatalogsFeedProductCounts.h"

using namespace Tiny;

CatalogsFeedProductCounts::CatalogsFeedProductCounts()
{
	ingested = int(0);
	original = int(0);
}

CatalogsFeedProductCounts::CatalogsFeedProductCounts(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedProductCounts::~CatalogsFeedProductCounts()
{

}

void
CatalogsFeedProductCounts::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ingestedKey = "ingested";

    if(object.has_key(ingestedKey))
    {
        bourne::json value = object[ingestedKey];



        jsonToValue(&ingested, value, "int");


    }

    const char *originalKey = "original";

    if(object.has_key(originalKey))
    {
        bourne::json value = object[originalKey];



        jsonToValue(&original, value, "int");


    }


}

bourne::json
CatalogsFeedProductCounts::toJson()
{
    bourne::json object = bourne::json::object();





    object["ingested"] = getIngested();






    object["original"] = getOriginal();



    return object;

}

int
CatalogsFeedProductCounts::getIngested()
{
	return ingested;
}

void
CatalogsFeedProductCounts::setIngested(int  ingested)
{
	this->ingested = ingested;
}

int
CatalogsFeedProductCounts::getOriginal()
{
	return original;
}

void
CatalogsFeedProductCounts::setOriginal(int  original)
{
	this->original = original;
}



