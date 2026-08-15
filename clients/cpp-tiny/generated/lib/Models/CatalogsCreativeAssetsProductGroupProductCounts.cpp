

#include "CatalogsCreativeAssetsProductGroupProductCounts.h"

using namespace Tiny;

CatalogsCreativeAssetsProductGroupProductCounts::CatalogsCreativeAssetsProductGroupProductCounts()
{
	catalog_type = std::string();
	total = float(0);
	videos = float(0);
}

CatalogsCreativeAssetsProductGroupProductCounts::CatalogsCreativeAssetsProductGroupProductCounts(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsProductGroupProductCounts::~CatalogsCreativeAssetsProductGroupProductCounts()
{

}

void
CatalogsCreativeAssetsProductGroupProductCounts::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *totalKey = "total";

    if(object.has_key(totalKey))
    {
        bourne::json value = object[totalKey];



        jsonToValue(&total, value, "long");


    }

    const char *videosKey = "videos";

    if(object.has_key(videosKey))
    {
        bourne::json value = object[videosKey];



        jsonToValue(&videos, value, "long");


    }


}

bourne::json
CatalogsCreativeAssetsProductGroupProductCounts::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();






    object["total"] = getTotal();






    object["videos"] = getVideos();



    return object;

}

std::string
CatalogsCreativeAssetsProductGroupProductCounts::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsProductGroupProductCounts::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

long
CatalogsCreativeAssetsProductGroupProductCounts::getTotal()
{
	return total;
}

void
CatalogsCreativeAssetsProductGroupProductCounts::setTotal(long  total)
{
	this->total = total;
}

long
CatalogsCreativeAssetsProductGroupProductCounts::getVideos()
{
	return videos;
}

void
CatalogsCreativeAssetsProductGroupProductCounts::setVideos(long  videos)
{
	this->videos = videos;
}



