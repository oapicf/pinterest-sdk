#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsFeedIngestionErrors.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsFeedIngestionErrors::CatalogsFeedIngestionErrors()
{
	//__init();
}

CatalogsFeedIngestionErrors::~CatalogsFeedIngestionErrors()
{
	//__cleanup();
}

void
CatalogsFeedIngestionErrors::__init()
{
	//image_download_error = int(0);
	//image_download_connection_timeout = int(0);
	//image_format_unrecognize = int(0);
	//line_level_internal_error = int(0);
	//large_product_count_decrease = int(0);
}

void
CatalogsFeedIngestionErrors::__cleanup()
{
	//if(image_download_error != NULL) {
	//
	//delete image_download_error;
	//image_download_error = NULL;
	//}
	//if(image_download_connection_timeout != NULL) {
	//
	//delete image_download_connection_timeout;
	//image_download_connection_timeout = NULL;
	//}
	//if(image_format_unrecognize != NULL) {
	//
	//delete image_format_unrecognize;
	//image_format_unrecognize = NULL;
	//}
	//if(line_level_internal_error != NULL) {
	//
	//delete line_level_internal_error;
	//line_level_internal_error = NULL;
	//}
	//if(large_product_count_decrease != NULL) {
	//
	//delete large_product_count_decrease;
	//large_product_count_decrease = NULL;
	//}
	//
}

void
CatalogsFeedIngestionErrors::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *image_download_errorKey = "image_download_error";
	node = json_object_get_member(pJsonObject, image_download_errorKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&image_download_error, node, "int", "");
		} else {
			
		}
	}
	const gchar *image_download_connection_timeoutKey = "image_download_connection_timeout";
	node = json_object_get_member(pJsonObject, image_download_connection_timeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&image_download_connection_timeout, node, "int", "");
		} else {
			
		}
	}
	const gchar *image_format_unrecognizeKey = "image_format_unrecognize";
	node = json_object_get_member(pJsonObject, image_format_unrecognizeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&image_format_unrecognize, node, "int", "");
		} else {
			
		}
	}
	const gchar *line_level_internal_errorKey = "line_level_internal_error";
	node = json_object_get_member(pJsonObject, line_level_internal_errorKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&line_level_internal_error, node, "int", "");
		} else {
			
		}
	}
	const gchar *large_product_count_decreaseKey = "large_product_count_decrease";
	node = json_object_get_member(pJsonObject, large_product_count_decreaseKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&large_product_count_decrease, node, "int", "");
		} else {
			
		}
	}
}

CatalogsFeedIngestionErrors::CatalogsFeedIngestionErrors(char* json)
{
	this->fromJson(json);
}

char*
CatalogsFeedIngestionErrors::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getImageDownloadError();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *image_download_errorKey = "image_download_error";
	json_object_set_member(pJsonObject, image_download_errorKey, node);
	if (isprimitive("int")) {
		int obj = getImageDownloadConnectionTimeout();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *image_download_connection_timeoutKey = "image_download_connection_timeout";
	json_object_set_member(pJsonObject, image_download_connection_timeoutKey, node);
	if (isprimitive("int")) {
		int obj = getImageFormatUnrecognize();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *image_format_unrecognizeKey = "image_format_unrecognize";
	json_object_set_member(pJsonObject, image_format_unrecognizeKey, node);
	if (isprimitive("int")) {
		int obj = getLineLevelInternalError();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *line_level_internal_errorKey = "line_level_internal_error";
	json_object_set_member(pJsonObject, line_level_internal_errorKey, node);
	if (isprimitive("int")) {
		int obj = getLargeProductCountDecrease();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *large_product_count_decreaseKey = "large_product_count_decrease";
	json_object_set_member(pJsonObject, large_product_count_decreaseKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CatalogsFeedIngestionErrors::getImageDownloadError()
{
	return image_download_error;
}

void
CatalogsFeedIngestionErrors::setImageDownloadError(int  image_download_error)
{
	this->image_download_error = image_download_error;
}

int
CatalogsFeedIngestionErrors::getImageDownloadConnectionTimeout()
{
	return image_download_connection_timeout;
}

void
CatalogsFeedIngestionErrors::setImageDownloadConnectionTimeout(int  image_download_connection_timeout)
{
	this->image_download_connection_timeout = image_download_connection_timeout;
}

int
CatalogsFeedIngestionErrors::getImageFormatUnrecognize()
{
	return image_format_unrecognize;
}

void
CatalogsFeedIngestionErrors::setImageFormatUnrecognize(int  image_format_unrecognize)
{
	this->image_format_unrecognize = image_format_unrecognize;
}

int
CatalogsFeedIngestionErrors::getLineLevelInternalError()
{
	return line_level_internal_error;
}

void
CatalogsFeedIngestionErrors::setLineLevelInternalError(int  line_level_internal_error)
{
	this->line_level_internal_error = line_level_internal_error;
}

int
CatalogsFeedIngestionErrors::getLargeProductCountDecrease()
{
	return large_product_count_decrease;
}

void
CatalogsFeedIngestionErrors::setLargeProductCountDecrease(int  large_product_count_decrease)
{
	this->large_product_count_decrease = large_product_count_decrease;
}


