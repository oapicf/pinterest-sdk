#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsCreativeAssetsProductGroupProductCounts.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsCreativeAssetsProductGroupProductCounts::CatalogsCreativeAssetsProductGroupProductCounts()
{
	//__init();
}

CatalogsCreativeAssetsProductGroupProductCounts::~CatalogsCreativeAssetsProductGroupProductCounts()
{
	//__cleanup();
}

void
CatalogsCreativeAssetsProductGroupProductCounts::__init()
{
	//app_links = double(0);
	//catalog_type = std::string();
	//images = double(0);
	//total = double(0);
	//videos = double(0);
}

void
CatalogsCreativeAssetsProductGroupProductCounts::__cleanup()
{
	//if(app_links != NULL) {
	//
	//delete app_links;
	//app_links = NULL;
	//}
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
	//}
	//if(images != NULL) {
	//
	//delete images;
	//images = NULL;
	//}
	//if(total != NULL) {
	//
	//delete total;
	//total = NULL;
	//}
	//if(videos != NULL) {
	//
	//delete videos;
	//videos = NULL;
	//}
	//
}

void
CatalogsCreativeAssetsProductGroupProductCounts::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *app_linksKey = "app_links";
	node = json_object_get_member(pJsonObject, app_linksKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&app_links, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&app_links);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *catalog_typeKey = "catalog_type";
	node = json_object_get_member(pJsonObject, catalog_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *imagesKey = "images";
	node = json_object_get_member(pJsonObject, imagesKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&images, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&images);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *totalKey = "total";
	node = json_object_get_member(pJsonObject, totalKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&total, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&total);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *videosKey = "videos";
	node = json_object_get_member(pJsonObject, videosKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&videos, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&videos);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsCreativeAssetsProductGroupProductCounts::CatalogsCreativeAssetsProductGroupProductCounts(char* json)
{
	this->fromJson(json);
}

char*
CatalogsCreativeAssetsProductGroupProductCounts::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getAppLinks();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getAppLinks());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *app_linksKey = "app_links";
	json_object_set_member(pJsonObject, app_linksKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCatalogType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_typeKey = "catalog_type";
	json_object_set_member(pJsonObject, catalog_typeKey, node);
	if (isprimitive("long long")) {
		long long obj = getImages();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getImages());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *imagesKey = "images";
	json_object_set_member(pJsonObject, imagesKey, node);
	if (isprimitive("long long")) {
		long long obj = getTotal();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getTotal());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *totalKey = "total";
	json_object_set_member(pJsonObject, totalKey, node);
	if (isprimitive("long long")) {
		long long obj = getVideos();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getVideos());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *videosKey = "videos";
	json_object_set_member(pJsonObject, videosKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CatalogsCreativeAssetsProductGroupProductCounts::getAppLinks()
{
	return app_links;
}

void
CatalogsCreativeAssetsProductGroupProductCounts::setAppLinks(long long  app_links)
{
	this->app_links = app_links;
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

long long
CatalogsCreativeAssetsProductGroupProductCounts::getImages()
{
	return images;
}

void
CatalogsCreativeAssetsProductGroupProductCounts::setImages(long long  images)
{
	this->images = images;
}

long long
CatalogsCreativeAssetsProductGroupProductCounts::getTotal()
{
	return total;
}

void
CatalogsCreativeAssetsProductGroupProductCounts::setTotal(long long  total)
{
	this->total = total;
}

long long
CatalogsCreativeAssetsProductGroupProductCounts::getVideos()
{
	return videos;
}

void
CatalogsCreativeAssetsProductGroupProductCounts::setVideos(long long  videos)
{
	this->videos = videos;
}


