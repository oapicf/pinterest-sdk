#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsFeedVideoCounts.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsFeedVideoCounts::CatalogsFeedVideoCounts()
{
	//__init();
}

CatalogsFeedVideoCounts::~CatalogsFeedVideoCounts()
{
	//__cleanup();
}

void
CatalogsFeedVideoCounts::__init()
{
	//ingested_videos = int(0);
	//not_ingested_videos = int(0);
	//total_videos = int(0);
}

void
CatalogsFeedVideoCounts::__cleanup()
{
	//if(ingested_videos != NULL) {
	//
	//delete ingested_videos;
	//ingested_videos = NULL;
	//}
	//if(not_ingested_videos != NULL) {
	//
	//delete not_ingested_videos;
	//not_ingested_videos = NULL;
	//}
	//if(total_videos != NULL) {
	//
	//delete total_videos;
	//total_videos = NULL;
	//}
	//
}

void
CatalogsFeedVideoCounts::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ingested_videosKey = "ingested_videos";
	node = json_object_get_member(pJsonObject, ingested_videosKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&ingested_videos, node, "int", "");
		} else {
			
		}
	}
	const gchar *not_ingested_videosKey = "not_ingested_videos";
	node = json_object_get_member(pJsonObject, not_ingested_videosKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&not_ingested_videos, node, "int", "");
		} else {
			
		}
	}
	const gchar *total_videosKey = "total_videos";
	node = json_object_get_member(pJsonObject, total_videosKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&total_videos, node, "int", "");
		} else {
			
		}
	}
}

CatalogsFeedVideoCounts::CatalogsFeedVideoCounts(char* json)
{
	this->fromJson(json);
}

char*
CatalogsFeedVideoCounts::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getIngestedVideos();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *ingested_videosKey = "ingested_videos";
	json_object_set_member(pJsonObject, ingested_videosKey, node);
	if (isprimitive("int")) {
		int obj = getNotIngestedVideos();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *not_ingested_videosKey = "not_ingested_videos";
	json_object_set_member(pJsonObject, not_ingested_videosKey, node);
	if (isprimitive("int")) {
		int obj = getTotalVideos();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *total_videosKey = "total_videos";
	json_object_set_member(pJsonObject, total_videosKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CatalogsFeedVideoCounts::getIngestedVideos()
{
	return ingested_videos;
}

void
CatalogsFeedVideoCounts::setIngestedVideos(int  ingested_videos)
{
	this->ingested_videos = ingested_videos;
}

int
CatalogsFeedVideoCounts::getNotIngestedVideos()
{
	return not_ingested_videos;
}

void
CatalogsFeedVideoCounts::setNotIngestedVideos(int  not_ingested_videos)
{
	this->not_ingested_videos = not_ingested_videos;
}

int
CatalogsFeedVideoCounts::getTotalVideos()
{
	return total_videos;
}

void
CatalogsFeedVideoCounts::setTotalVideos(int  total_videos)
{
	this->total_videos = total_videos;
}


