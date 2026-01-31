#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "S3FilePart.h"

using namespace std;
using namespace Tizen::ArtikCloud;

S3FilePart::S3FilePart()
{
	//__init();
}

S3FilePart::~S3FilePart()
{
	//__cleanup();
}

void
S3FilePart::__init()
{
	//part_number = int(0);
	//presigned_url = std::string();
}

void
S3FilePart::__cleanup()
{
	//if(part_number != NULL) {
	//
	//delete part_number;
	//part_number = NULL;
	//}
	//if(presigned_url != NULL) {
	//
	//delete presigned_url;
	//presigned_url = NULL;
	//}
	//
}

void
S3FilePart::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *part_numberKey = "part_number";
	node = json_object_get_member(pJsonObject, part_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&part_number, node, "int", "");
		} else {
			
		}
	}
	const gchar *presigned_urlKey = "presigned_url";
	node = json_object_get_member(pJsonObject, presigned_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&presigned_url, node, "std::string", "");
		} else {
			
		}
	}
}

S3FilePart::S3FilePart(char* json)
{
	this->fromJson(json);
}

char*
S3FilePart::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getPartNumber();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *part_numberKey = "part_number";
	json_object_set_member(pJsonObject, part_numberKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPresignedUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *presigned_urlKey = "presigned_url";
	json_object_set_member(pJsonObject, presigned_urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
S3FilePart::getPartNumber()
{
	return part_number;
}

void
S3FilePart::setPartNumber(int  part_number)
{
	this->part_number = part_number;
}

std::string
S3FilePart::getPresignedUrl()
{
	return presigned_url;
}

void
S3FilePart::setPresignedUrl(std::string  presigned_url)
{
	this->presigned_url = presigned_url;
}


