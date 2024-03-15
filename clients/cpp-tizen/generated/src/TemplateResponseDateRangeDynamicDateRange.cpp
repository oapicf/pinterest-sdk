#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TemplateResponse_date_range_dynamic_date_range.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TemplateResponse_date_range_dynamic_date_range::TemplateResponse_date_range_dynamic_date_range()
{
	//__init();
}

TemplateResponse_date_range_dynamic_date_range::~TemplateResponse_date_range_dynamic_date_range()
{
	//__cleanup();
}

void
TemplateResponse_date_range_dynamic_date_range::__init()
{
	//type = std::string();
	//range = std::string();
}

void
TemplateResponse_date_range_dynamic_date_range::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(range != NULL) {
	//
	//delete range;
	//range = NULL;
	//}
	//
}

void
TemplateResponse_date_range_dynamic_date_range::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *rangeKey = "range";
	node = json_object_get_member(pJsonObject, rangeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&range, node, "std::string", "");
		} else {
			
		}
	}
}

TemplateResponse_date_range_dynamic_date_range::TemplateResponse_date_range_dynamic_date_range(char* json)
{
	this->fromJson(json);
}

char*
TemplateResponse_date_range_dynamic_date_range::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRange();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *rangeKey = "range";
	json_object_set_member(pJsonObject, rangeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TemplateResponse_date_range_dynamic_date_range::getType()
{
	return type;
}

void
TemplateResponse_date_range_dynamic_date_range::setType(std::string  type)
{
	this->type = type;
}

std::string
TemplateResponse_date_range_dynamic_date_range::getRange()
{
	return range;
}

void
TemplateResponse_date_range_dynamic_date_range::setRange(std::string  range)
{
	this->range = range;
}


