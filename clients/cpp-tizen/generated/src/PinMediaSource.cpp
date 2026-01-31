#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaSource.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaSource::PinMediaSource()
{
	//__init();
}

PinMediaSource::~PinMediaSource()
{
	//__cleanup();
}

void
PinMediaSource::__init()
{
	//content_type = new ContentType();
	//data = std::string();
	//is_standard = bool(false);
	//source_type = std::string();
	//url = std::string();
	//cover_image_content_type = null;
	//cover_image_data = std::string();
	//cover_image_key_frame_time = int(0);
	//cover_image_url = std::string();
	//media_id = std::string();
	//index = int(0);
	//new std::list()std::list> items;
	//is_affiliate_link = bool(false);
}

void
PinMediaSource::__cleanup()
{
	//if(content_type != NULL) {
	//
	//delete content_type;
	//content_type = NULL;
	//}
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//if(is_standard != NULL) {
	//
	//delete is_standard;
	//is_standard = NULL;
	//}
	//if(source_type != NULL) {
	//
	//delete source_type;
	//source_type = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(cover_image_content_type != NULL) {
	//
	//delete cover_image_content_type;
	//cover_image_content_type = NULL;
	//}
	//if(cover_image_data != NULL) {
	//
	//delete cover_image_data;
	//cover_image_data = NULL;
	//}
	//if(cover_image_key_frame_time != NULL) {
	//
	//delete cover_image_key_frame_time;
	//cover_image_key_frame_time = NULL;
	//}
	//if(cover_image_url != NULL) {
	//
	//delete cover_image_url;
	//cover_image_url = NULL;
	//}
	//if(media_id != NULL) {
	//
	//delete media_id;
	//media_id = NULL;
	//}
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//if(is_affiliate_link != NULL) {
	//
	//delete is_affiliate_link;
	//is_affiliate_link = NULL;
	//}
	//
}

void
PinMediaSource::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *content_typeKey = "content_type";
	node = json_object_get_member(pJsonObject, content_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ContentType")) {
			jsonToValue(&content_type, node, "ContentType", "ContentType");
		} else {
			
			ContentType* obj = static_cast<ContentType*> (&content_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&data, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_standardKey = "is_standard";
	node = json_object_get_member(pJsonObject, is_standardKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_standard, node, "bool", "");
		} else {
			
		}
	}
	const gchar *source_typeKey = "source_type";
	node = json_object_get_member(pJsonObject, source_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&source_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *cover_image_content_typeKey = "cover_image_content_type";
	node = json_object_get_member(pJsonObject, cover_image_content_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ContentType")) {
			jsonToValue(&cover_image_content_type, node, "ContentType", "ContentType");
		} else {
			
			ContentType* obj = static_cast<ContentType*> (&cover_image_content_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cover_image_dataKey = "cover_image_data";
	node = json_object_get_member(pJsonObject, cover_image_dataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cover_image_data, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *cover_image_key_frame_timeKey = "cover_image_key_frame_time";
	node = json_object_get_member(pJsonObject, cover_image_key_frame_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&cover_image_key_frame_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *cover_image_urlKey = "cover_image_url";
	node = json_object_get_member(pJsonObject, cover_image_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cover_image_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *media_idKey = "media_id";
	node = json_object_get_member(pJsonObject, media_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&media_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *indexKey = "index";
	node = json_object_get_member(pJsonObject, indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&index, node, "int", "");
		} else {
			
		}
	}
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PinMediaSourceImagesURLItem> new_list;
			PinMediaSourceImagesURLItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PinMediaSourceImagesURLItem")) {
					jsonToValue(&inst, temp_json, "PinMediaSourceImagesURLItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
	const gchar *is_affiliate_linkKey = "is_affiliate_link";
	node = json_object_get_member(pJsonObject, is_affiliate_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_affiliate_link, node, "bool", "");
		} else {
			
		}
	}
}

PinMediaSource::PinMediaSource(char* json)
{
	this->fromJson(json);
}

char*
PinMediaSource::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ContentType")) {
		ContentType obj = getContentType();
		node = converttoJson(&obj, "ContentType", "");
	}
	else {
		
		ContentType obj = static_cast<ContentType> (getContentType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *content_typeKey = "content_type";
	json_object_set_member(pJsonObject, content_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getData();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsStandard();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_standardKey = "is_standard";
	json_object_set_member(pJsonObject, is_standardKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSourceType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *source_typeKey = "source_type";
	json_object_set_member(pJsonObject, source_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	if (isprimitive("ContentType")) {
		ContentType obj = getCoverImageContentType();
		node = converttoJson(&obj, "ContentType", "");
	}
	else {
		
		ContentType obj = static_cast<ContentType> (getCoverImageContentType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cover_image_content_typeKey = "cover_image_content_type";
	json_object_set_member(pJsonObject, cover_image_content_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCoverImageData();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cover_image_dataKey = "cover_image_data";
	json_object_set_member(pJsonObject, cover_image_dataKey, node);
	if (isprimitive("int")) {
		int obj = getCoverImageKeyFrameTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *cover_image_key_frame_timeKey = "cover_image_key_frame_time";
	json_object_set_member(pJsonObject, cover_image_key_frame_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCoverImageUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cover_image_urlKey = "cover_image_url";
	json_object_set_member(pJsonObject, cover_image_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMediaId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *media_idKey = "media_id";
	json_object_set_member(pJsonObject, media_idKey, node);
	if (isprimitive("int")) {
		int obj = getIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *indexKey = "index";
	json_object_set_member(pJsonObject, indexKey, node);
	if (isprimitive("PinMediaSourceImagesURLItem")) {
		list<PinMediaSourceImagesURLItem> new_list = static_cast<list <PinMediaSourceImagesURLItem> > (getItems());
		node = converttoJson(&new_list, "PinMediaSourceImagesURLItem", "array");
	} else {
		node = json_node_alloc();
		list<PinMediaSourceImagesURLItem> new_list = static_cast<list <PinMediaSourceImagesURLItem> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PinMediaSourceImagesURLItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PinMediaSourceImagesURLItem obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsAffiliateLink();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_affiliate_linkKey = "is_affiliate_link";
	json_object_set_member(pJsonObject, is_affiliate_linkKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ContentType
PinMediaSource::getContentType()
{
	return content_type;
}

void
PinMediaSource::setContentType(ContentType  content_type)
{
	this->content_type = content_type;
}

std::string
PinMediaSource::getData()
{
	return data;
}

void
PinMediaSource::setData(std::string  data)
{
	this->data = data;
}

bool
PinMediaSource::getIsStandard()
{
	return is_standard;
}

void
PinMediaSource::setIsStandard(bool  is_standard)
{
	this->is_standard = is_standard;
}

std::string
PinMediaSource::getSourceType()
{
	return source_type;
}

void
PinMediaSource::setSourceType(std::string  source_type)
{
	this->source_type = source_type;
}

std::string
PinMediaSource::getUrl()
{
	return url;
}

void
PinMediaSource::setUrl(std::string  url)
{
	this->url = url;
}

ContentType
PinMediaSource::getCoverImageContentType()
{
	return cover_image_content_type;
}

void
PinMediaSource::setCoverImageContentType(ContentType  cover_image_content_type)
{
	this->cover_image_content_type = cover_image_content_type;
}

std::string
PinMediaSource::getCoverImageData()
{
	return cover_image_data;
}

void
PinMediaSource::setCoverImageData(std::string  cover_image_data)
{
	this->cover_image_data = cover_image_data;
}

int
PinMediaSource::getCoverImageKeyFrameTime()
{
	return cover_image_key_frame_time;
}

void
PinMediaSource::setCoverImageKeyFrameTime(int  cover_image_key_frame_time)
{
	this->cover_image_key_frame_time = cover_image_key_frame_time;
}

std::string
PinMediaSource::getCoverImageUrl()
{
	return cover_image_url;
}

void
PinMediaSource::setCoverImageUrl(std::string  cover_image_url)
{
	this->cover_image_url = cover_image_url;
}

std::string
PinMediaSource::getMediaId()
{
	return media_id;
}

void
PinMediaSource::setMediaId(std::string  media_id)
{
	this->media_id = media_id;
}

int
PinMediaSource::getIndex()
{
	return index;
}

void
PinMediaSource::setIndex(int  index)
{
	this->index = index;
}

std::list<PinMediaSourceImagesURLItem>
PinMediaSource::getItems()
{
	return items;
}

void
PinMediaSource::setItems(std::list <PinMediaSourceImagesURLItem> items)
{
	this->items = items;
}

bool
PinMediaSource::getIsAffiliateLink()
{
	return is_affiliate_link;
}

void
PinMediaSource::setIsAffiliateLink(bool  is_affiliate_link)
{
	this->is_affiliate_link = is_affiliate_link;
}


