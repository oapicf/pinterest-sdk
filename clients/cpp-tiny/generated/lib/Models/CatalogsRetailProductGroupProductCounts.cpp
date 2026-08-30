

#include "CatalogsRetailProductGroupProductCounts.h"

using namespace Tiny;

CatalogsRetailProductGroupProductCounts::CatalogsRetailProductGroupProductCounts()
{
	catalog_type = std::string();
	in_stock = float(0);
	out_of_stock = float(0);
	preorder = float(0);
	total = float(0);
	videos = float(0);
}

CatalogsRetailProductGroupProductCounts::CatalogsRetailProductGroupProductCounts(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailProductGroupProductCounts::~CatalogsRetailProductGroupProductCounts()
{

}

void
CatalogsRetailProductGroupProductCounts::fromJson(std::string jsonObj)
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


}

bourne::json
CatalogsRetailProductGroupProductCounts::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();






    object["in_stock"] = getInStock();






    object["out_of_stock"] = getOutOfStock();






    object["preorder"] = getPreorder();






    object["total"] = getTotal();






    object["videos"] = getVideos();



    return object;

}

std::string
CatalogsRetailProductGroupProductCounts::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailProductGroupProductCounts::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

long
CatalogsRetailProductGroupProductCounts::getInStock()
{
	return in_stock;
}

void
CatalogsRetailProductGroupProductCounts::setInStock(long in_stock)
{
	this->in_stock = in_stock;
}

long
CatalogsRetailProductGroupProductCounts::getOutOfStock()
{
	return out_of_stock;
}

void
CatalogsRetailProductGroupProductCounts::setOutOfStock(long out_of_stock)
{
	this->out_of_stock = out_of_stock;
}

long
CatalogsRetailProductGroupProductCounts::getPreorder()
{
	return preorder;
}

void
CatalogsRetailProductGroupProductCounts::setPreorder(long preorder)
{
	this->preorder = preorder;
}

long
CatalogsRetailProductGroupProductCounts::getTotal()
{
	return total;
}

void
CatalogsRetailProductGroupProductCounts::setTotal(long total)
{
	this->total = total;
}

long
CatalogsRetailProductGroupProductCounts::getVideos()
{
	return videos;
}

void
CatalogsRetailProductGroupProductCounts::setVideos(long videos)
{
	this->videos = videos;
}



