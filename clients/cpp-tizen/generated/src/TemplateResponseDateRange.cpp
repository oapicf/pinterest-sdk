#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TemplateResponse_date_range.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TemplateResponse_date_range::TemplateResponse_date_range()
{
	//__init();
}

TemplateResponse_date_range::~TemplateResponse_date_range()
{
	//__cleanup();
}

void
TemplateResponse_date_range::__init()
{
	//dynamic_date_range = new TemplateResponse_date_range_dynamic_date_range();
	//relative_date_range = new TemplateResponse_date_range_relative_date_range();
	//absolute_date_range = new TemplateResponse_date_range_absolute_date_range();
}

void
TemplateResponse_date_range::__cleanup()
{
	//if(dynamic_date_range != NULL) {
	//
	//delete dynamic_date_range;
	//dynamic_date_range = NULL;
	//}
	//if(relative_date_range != NULL) {
	//
	//delete relative_date_range;
	//relative_date_range = NULL;
	//}
	//if(absolute_date_range != NULL) {
	//
	//delete absolute_date_range;
	//absolute_date_range = NULL;
	//}
	//
}

void
TemplateResponse_date_range::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dynamic_date_rangeKey = "dynamic_date_range";
	node = json_object_get_member(pJsonObject, dynamic_date_rangeKey);
	if (node !=NULL) {
	

		if (isprimitive("TemplateResponse_date_range_dynamic_date_range")) {
			jsonToValue(&dynamic_date_range, node, "TemplateResponse_date_range_dynamic_date_range", "TemplateResponse_date_range_dynamic_date_range");
		} else {
			
			TemplateResponse_date_range_dynamic_date_range* obj = static_cast<TemplateResponse_date_range_dynamic_date_range*> (&dynamic_date_range);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *relative_date_rangeKey = "relative_date_range";
	node = json_object_get_member(pJsonObject, relative_date_rangeKey);
	if (node !=NULL) {
	

		if (isprimitive("TemplateResponse_date_range_relative_date_range")) {
			jsonToValue(&relative_date_range, node, "TemplateResponse_date_range_relative_date_range", "TemplateResponse_date_range_relative_date_range");
		} else {
			
			TemplateResponse_date_range_relative_date_range* obj = static_cast<TemplateResponse_date_range_relative_date_range*> (&relative_date_range);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *absolute_date_rangeKey = "absolute_date_range";
	node = json_object_get_member(pJsonObject, absolute_date_rangeKey);
	if (node !=NULL) {
	

		if (isprimitive("TemplateResponse_date_range_absolute_date_range")) {
			jsonToValue(&absolute_date_range, node, "TemplateResponse_date_range_absolute_date_range", "TemplateResponse_date_range_absolute_date_range");
		} else {
			
			TemplateResponse_date_range_absolute_date_range* obj = static_cast<TemplateResponse_date_range_absolute_date_range*> (&absolute_date_range);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TemplateResponse_date_range::TemplateResponse_date_range(char* json)
{
	this->fromJson(json);
}

char*
TemplateResponse_date_range::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TemplateResponse_date_range_dynamic_date_range")) {
		TemplateResponse_date_range_dynamic_date_range obj = getDynamicDateRange();
		node = converttoJson(&obj, "TemplateResponse_date_range_dynamic_date_range", "");
	}
	else {
		
		TemplateResponse_date_range_dynamic_date_range obj = static_cast<TemplateResponse_date_range_dynamic_date_range> (getDynamicDateRange());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dynamic_date_rangeKey = "dynamic_date_range";
	json_object_set_member(pJsonObject, dynamic_date_rangeKey, node);
	if (isprimitive("TemplateResponse_date_range_relative_date_range")) {
		TemplateResponse_date_range_relative_date_range obj = getRelativeDateRange();
		node = converttoJson(&obj, "TemplateResponse_date_range_relative_date_range", "");
	}
	else {
		
		TemplateResponse_date_range_relative_date_range obj = static_cast<TemplateResponse_date_range_relative_date_range> (getRelativeDateRange());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *relative_date_rangeKey = "relative_date_range";
	json_object_set_member(pJsonObject, relative_date_rangeKey, node);
	if (isprimitive("TemplateResponse_date_range_absolute_date_range")) {
		TemplateResponse_date_range_absolute_date_range obj = getAbsoluteDateRange();
		node = converttoJson(&obj, "TemplateResponse_date_range_absolute_date_range", "");
	}
	else {
		
		TemplateResponse_date_range_absolute_date_range obj = static_cast<TemplateResponse_date_range_absolute_date_range> (getAbsoluteDateRange());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *absolute_date_rangeKey = "absolute_date_range";
	json_object_set_member(pJsonObject, absolute_date_rangeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

TemplateResponse_date_range_dynamic_date_range
TemplateResponse_date_range::getDynamicDateRange()
{
	return dynamic_date_range;
}

void
TemplateResponse_date_range::setDynamicDateRange(TemplateResponse_date_range_dynamic_date_range  dynamic_date_range)
{
	this->dynamic_date_range = dynamic_date_range;
}

TemplateResponse_date_range_relative_date_range
TemplateResponse_date_range::getRelativeDateRange()
{
	return relative_date_range;
}

void
TemplateResponse_date_range::setRelativeDateRange(TemplateResponse_date_range_relative_date_range  relative_date_range)
{
	this->relative_date_range = relative_date_range;
}

TemplateResponse_date_range_absolute_date_range
TemplateResponse_date_range::getAbsoluteDateRange()
{
	return absolute_date_range;
}

void
TemplateResponse_date_range::setAbsoluteDateRange(TemplateResponse_date_range_absolute_date_range  absolute_date_range)
{
	this->absolute_date_range = absolute_date_range;
}


