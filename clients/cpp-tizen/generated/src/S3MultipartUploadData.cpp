#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "S3MultipartUploadData.h"

using namespace std;
using namespace Tizen::ArtikCloud;

S3MultipartUploadData::S3MultipartUploadData()
{
	//__init();
}

S3MultipartUploadData::~S3MultipartUploadData()
{
	//__cleanup();
}

void
S3MultipartUploadData::__init()
{
	//new std::list()std::list> file_parts;
}

void
S3MultipartUploadData::__cleanup()
{
	//if(file_parts != NULL) {
	//file_parts.RemoveAll(true);
	//delete file_parts;
	//file_parts = NULL;
	//}
	//
}

void
S3MultipartUploadData::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *file_partsKey = "file_parts";
	node = json_object_get_member(pJsonObject, file_partsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<S3FilePart> new_list;
			S3FilePart inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("S3FilePart")) {
					jsonToValue(&inst, temp_json, "S3FilePart", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			file_parts = new_list;
		}
		
	}
}

S3MultipartUploadData::S3MultipartUploadData(char* json)
{
	this->fromJson(json);
}

char*
S3MultipartUploadData::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("S3FilePart")) {
		list<S3FilePart> new_list = static_cast<list <S3FilePart> > (getFileParts());
		node = converttoJson(&new_list, "S3FilePart", "array");
	} else {
		node = json_node_alloc();
		list<S3FilePart> new_list = static_cast<list <S3FilePart> > (getFileParts());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<S3FilePart>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			S3FilePart obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *file_partsKey = "file_parts";
	json_object_set_member(pJsonObject, file_partsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<S3FilePart>
S3MultipartUploadData::getFileParts()
{
	return file_parts;
}

void
S3MultipartUploadData::setFileParts(std::list <S3FilePart> file_parts)
{
	this->file_parts = file_parts;
}


