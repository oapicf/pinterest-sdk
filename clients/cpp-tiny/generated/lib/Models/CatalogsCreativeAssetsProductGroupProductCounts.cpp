

#include "CatalogsCreativeAssetsProductGroupProductCounts.h"

using namespace Tiny;

CatalogsCreativeAssetsProductGroupProductCounts::CatalogsCreativeAssetsProductGroupProductCounts()
{
	app_links = float(0);
	catalog_type = std::string();
	images = float(0);
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

    const char *app_linksKey = "app_links";

    if(object.has_key(app_linksKey))
    {
        bourne::json value = object[app_linksKey];



        jsonToValue(&app_links, value, "long");


    }

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *imagesKey = "images";

    if(object.has_key(imagesKey))
    {
        bourne::json value = object[imagesKey];



        jsonToValue(&images, value, "long");


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





    object["app_links"] = getAppLinks();






    object["catalog_type"] = getCatalogType();






    object["images"] = getImages();






    object["total"] = getTotal();






    object["videos"] = getVideos();



    return object;

}

long
CatalogsCreativeAssetsProductGroupProductCounts::getAppLinks()
{
	return app_links;
}

void
CatalogsCreativeAssetsProductGroupProductCounts::setAppLinks(long app_links)
{
	this->app_links = app_links;
}

std::string
CatalogsCreativeAssetsProductGroupProductCounts::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsProductGroupProductCounts::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

long
CatalogsCreativeAssetsProductGroupProductCounts::getImages()
{
	return images;
}

void
CatalogsCreativeAssetsProductGroupProductCounts::setImages(long images)
{
	this->images = images;
}

long
CatalogsCreativeAssetsProductGroupProductCounts::getTotal()
{
	return total;
}

void
CatalogsCreativeAssetsProductGroupProductCounts::setTotal(long total)
{
	this->total = total;
}

long
CatalogsCreativeAssetsProductGroupProductCounts::getVideos()
{
	return videos;
}

void
CatalogsCreativeAssetsProductGroupProductCounts::setVideos(long videos)
{
	this->videos = videos;
}



