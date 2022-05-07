#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MediaUpload_allOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MediaUpload_allOf::MediaUpload_allOf()
{
	//__init();
}

MediaUpload_allOf::~MediaUpload_allOf()
{
	//__cleanup();
}

void
MediaUpload_allOf::__init()
{
	//media_id = std::string();
	//media_type = std::string();
	//upload_url = std::string();
	//upload_parameters = new MediaUpload_allOf_upload_parameters();
}

void
MediaUpload_allOf::__cleanup()
{
	//if(media_id != NULL) {
	//
	//delete media_id;
	//media_id = NULL;
	//}
	//if(media_type != NULL) {
	//
	//delete media_type;
	//media_type = NULL;
	//}
	//if(upload_url != NULL) {
	//
	//delete upload_url;
	//upload_url = NULL;
	//}
	//if(upload_parameters != NULL) {
	//
	//delete upload_parameters;
	//upload_parameters = NULL;
	//}
	//
}

void
MediaUpload_allOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *media_idKey = "media_id";
	node = json_object_get_member(pJsonObject, media_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&media_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *media_typeKey = "media_type";
	node = json_object_get_member(pJsonObject, media_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("MediaUploadType")) {
			jsonToValue(&media_type, node, "MediaUploadType", "MediaUploadType");
		} else {
			
		}
	}
	const gchar *upload_urlKey = "upload_url";
	node = json_object_get_member(pJsonObject, upload_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&upload_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *upload_parametersKey = "upload_parameters";
	node = json_object_get_member(pJsonObject, upload_parametersKey);
	if (node !=NULL) {
	

		if (isprimitive("MediaUpload_allOf_upload_parameters")) {
			jsonToValue(&upload_parameters, node, "MediaUpload_allOf_upload_parameters", "MediaUpload_allOf_upload_parameters");
		} else {
			
			MediaUpload_allOf_upload_parameters* obj = static_cast<MediaUpload_allOf_upload_parameters*> (&upload_parameters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MediaUpload_allOf::MediaUpload_allOf(char* json)
{
	this->fromJson(json);
}

char*
MediaUpload_allOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getMediaId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *media_idKey = "media_id";
	json_object_set_member(pJsonObject, media_idKey, node);
	if (isprimitive("MediaUploadType")) {
		MediaUploadType obj = getMediaType();
		node = converttoJson(&obj, "MediaUploadType", "");
	}
	else {
		
	}
	const gchar *media_typeKey = "media_type";
	json_object_set_member(pJsonObject, media_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUploadUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *upload_urlKey = "upload_url";
	json_object_set_member(pJsonObject, upload_urlKey, node);
	if (isprimitive("MediaUpload_allOf_upload_parameters")) {
		MediaUpload_allOf_upload_parameters obj = getUploadParameters();
		node = converttoJson(&obj, "MediaUpload_allOf_upload_parameters", "");
	}
	else {
		
		MediaUpload_allOf_upload_parameters obj = static_cast<MediaUpload_allOf_upload_parameters> (getUploadParameters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *upload_parametersKey = "upload_parameters";
	json_object_set_member(pJsonObject, upload_parametersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MediaUpload_allOf::getMediaId()
{
	return media_id;
}

void
MediaUpload_allOf::setMediaId(std::string  media_id)
{
	this->media_id = media_id;
}

MediaUploadType
MediaUpload_allOf::getMediaType()
{
	return media_type;
}

void
MediaUpload_allOf::setMediaType(MediaUploadType  media_type)
{
	this->media_type = media_type;
}

std::string
MediaUpload_allOf::getUploadUrl()
{
	return upload_url;
}

void
MediaUpload_allOf::setUploadUrl(std::string  upload_url)
{
	this->upload_url = upload_url;
}

MediaUpload_allOf_upload_parameters
MediaUpload_allOf::getUploadParameters()
{
	return upload_parameters;
}

void
MediaUpload_allOf::setUploadParameters(MediaUpload_allOf_upload_parameters  upload_parameters)
{
	this->upload_parameters = upload_parameters;
}


