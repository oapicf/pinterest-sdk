#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SummaryPin_media.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SummaryPin_media::SummaryPin_media()
{
	//__init();
}

SummaryPin_media::~SummaryPin_media()
{
	//__cleanup();
}

void
SummaryPin_media::__init()
{
	//media_type = std::string();
}

void
SummaryPin_media::__cleanup()
{
	//if(media_type != NULL) {
	//
	//delete media_type;
	//media_type = NULL;
	//}
	//
}

void
SummaryPin_media::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *media_typeKey = "media_type";
	node = json_object_get_member(pJsonObject, media_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&media_type, node, "std::string", "");
		} else {
			
		}
	}
}

SummaryPin_media::SummaryPin_media(char* json)
{
	this->fromJson(json);
}

char*
SummaryPin_media::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getMediaType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *media_typeKey = "media_type";
	json_object_set_member(pJsonObject, media_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SummaryPin_media::getMediaType()
{
	return media_type;
}

void
SummaryPin_media::setMediaType(std::string  media_type)
{
	this->media_type = media_type;
}


