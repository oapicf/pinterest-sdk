

#include "CatalogsProductGroupProductCountsVertical.h"

using namespace Tiny;

CatalogsProductGroupProductCountsVertical::CatalogsProductGroupProductCountsVertical()
{
	catalog_type = std::string();
	in_stock = float(0);
	out_of_stock = float(0);
	preorder = float(0);
	total = float(0);
	videos = float(0);
	app_links = float(0);
	images = float(0);
}

CatalogsProductGroupProductCountsVertical::CatalogsProductGroupProductCountsVertical(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupProductCountsVertical::~CatalogsProductGroupProductCountsVertical()
{

}

void
CatalogsProductGroupProductCountsVertical::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *in_stockKey = "in_stock";

    if(object.has_key(in_stockKey))
    {
        bourne::json value = object[in_stockKey];



        jsonToValue(&in_stock, value, "long");


    }

    const char *out_of_stockKey = "out_of_stock";

    if(object.has_key(out_of_stockKey))
    {
        bourne::json value = object[out_of_stockKey];



        jsonToValue(&out_of_stock, value, "long");


    }

    const char *preorderKey = "preorder";

    if(object.has_key(preorderKey))
    {
        bourne::json value = object[preorderKey];



        jsonToValue(&preorder, value, "long");


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

    const char *app_linksKey = "app_links";

    if(object.has_key(app_linksKey))
    {
        bourne::json value = object[app_linksKey];



        jsonToValue(&app_links, value, "long");


    }

    const char *imagesKey = "images";

    if(object.has_key(imagesKey))
    {
        bourne::json value = object[imagesKey];



        jsonToValue(&images, value, "long");


    }


}

bourne::json
CatalogsProductGroupProductCountsVertical::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();






    object["in_stock"] = getInStock();






    object["out_of_stock"] = getOutOfStock();






    object["preorder"] = getPreorder();






    object["total"] = getTotal();






    object["videos"] = getVideos();






    object["app_links"] = getAppLinks();






    object["images"] = getImages();



    return object;

}

std::string
CatalogsProductGroupProductCountsVertical::getCatalogType()
{
	return catalog_type;
}

void
CatalogsProductGroupProductCountsVertical::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

long
CatalogsProductGroupProductCountsVertical::getInStock()
{
	return in_stock;
}

void
CatalogsProductGroupProductCountsVertical::setInStock(long in_stock)
{
	this->in_stock = in_stock;
}

long
CatalogsProductGroupProductCountsVertical::getOutOfStock()
{
	return out_of_stock;
}

void
CatalogsProductGroupProductCountsVertical::setOutOfStock(long out_of_stock)
{
	this->out_of_stock = out_of_stock;
}

long
CatalogsProductGroupProductCountsVertical::getPreorder()
{
	return preorder;
}

void
CatalogsProductGroupProductCountsVertical::setPreorder(long preorder)
{
	this->preorder = preorder;
}

long
CatalogsProductGroupProductCountsVertical::getTotal()
{
	return total;
}

void
CatalogsProductGroupProductCountsVertical::setTotal(long total)
{
	this->total = total;
}

long
CatalogsProductGroupProductCountsVertical::getVideos()
{
	return videos;
}

void
CatalogsProductGroupProductCountsVertical::setVideos(long videos)
{
	this->videos = videos;
}

long
CatalogsProductGroupProductCountsVertical::getAppLinks()
{
	return app_links;
}

void
CatalogsProductGroupProductCountsVertical::setAppLinks(long app_links)
{
	this->app_links = app_links;
}

long
CatalogsProductGroupProductCountsVertical::getImages()
{
	return images;
}

void
CatalogsProductGroupProductCountsVertical::setImages(long images)
{
	this->images = images;
}



