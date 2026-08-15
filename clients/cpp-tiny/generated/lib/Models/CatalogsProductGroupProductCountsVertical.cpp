

#include "CatalogsProductGroupProductCountsVertical.h"

using namespace Tiny;

CatalogsProductGroupProductCountsVertical::CatalogsProductGroupProductCountsVertical()
{
	catalog_type = CatalogsType();
	in_stock = float(0);
	out_of_stock = float(0);
	preorder = float(0);
	total = float(0);
	videos = float(0);
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




        CatalogsType* obj = &catalog_type;
		obj->fromJson(value.dump());

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
CatalogsProductGroupProductCountsVertical::toJson()
{
    bourne::json object = bourne::json::object();






	object["catalog_type"] = getCatalogType().toJson();





    object["in_stock"] = getInStock();






    object["out_of_stock"] = getOutOfStock();






    object["preorder"] = getPreorder();






    object["total"] = getTotal();






    object["videos"] = getVideos();



    return object;

}

CatalogsType
CatalogsProductGroupProductCountsVertical::getCatalogType()
{
	return catalog_type;
}

void
CatalogsProductGroupProductCountsVertical::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

long
CatalogsProductGroupProductCountsVertical::getInStock()
{
	return in_stock;
}

void
CatalogsProductGroupProductCountsVertical::setInStock(long  in_stock)
{
	this->in_stock = in_stock;
}

long
CatalogsProductGroupProductCountsVertical::getOutOfStock()
{
	return out_of_stock;
}

void
CatalogsProductGroupProductCountsVertical::setOutOfStock(long  out_of_stock)
{
	this->out_of_stock = out_of_stock;
}

long
CatalogsProductGroupProductCountsVertical::getPreorder()
{
	return preorder;
}

void
CatalogsProductGroupProductCountsVertical::setPreorder(long  preorder)
{
	this->preorder = preorder;
}

long
CatalogsProductGroupProductCountsVertical::getTotal()
{
	return total;
}

void
CatalogsProductGroupProductCountsVertical::setTotal(long  total)
{
	this->total = total;
}

long
CatalogsProductGroupProductCountsVertical::getVideos()
{
	return videos;
}

void
CatalogsProductGroupProductCountsVertical::setVideos(long  videos)
{
	this->videos = videos;
}



