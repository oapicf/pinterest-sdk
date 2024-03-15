#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TemplateResponse_date_range_absolute_date_range.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TemplateResponse_date_range_absolute_date_range::TemplateResponse_date_range_absolute_date_range()
{
	//__init();
}

TemplateResponse_date_range_absolute_date_range::~TemplateResponse_date_range_absolute_date_range()
{
	//__cleanup();
}

void
TemplateResponse_date_range_absolute_date_range::__init()
{
	//type = std::string();
	//start_date = double(0);
	//end_date = double(0);
}

void
TemplateResponse_date_range_absolute_date_range::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(start_date != NULL) {
	//
	//delete start_date;
	//start_date = NULL;
	//}
	//if(end_date != NULL) {
	//
	//delete end_date;
	//end_date = NULL;
	//}
	//
}

void
TemplateResponse_date_range_absolute_date_range::fromJson(char* jsonStr)
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
	const gchar *start_dateKey = "start_date";
	node = json_object_get_member(pJsonObject, start_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&start_date, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&start_date);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *end_dateKey = "end_date";
	node = json_object_get_member(pJsonObject, end_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&end_date, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&end_date);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TemplateResponse_date_range_absolute_date_range::TemplateResponse_date_range_absolute_date_range(char* json)
{
	this->fromJson(json);
}

char*
TemplateResponse_date_range_absolute_date_range::toJson()
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
	if (isprimitive("long long")) {
		long long obj = getStartDate();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getStartDate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *start_dateKey = "start_date";
	json_object_set_member(pJsonObject, start_dateKey, node);
	if (isprimitive("long long")) {
		long long obj = getEndDate();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getEndDate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *end_dateKey = "end_date";
	json_object_set_member(pJsonObject, end_dateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TemplateResponse_date_range_absolute_date_range::getType()
{
	return type;
}

void
TemplateResponse_date_range_absolute_date_range::setType(std::string  type)
{
	this->type = type;
}

long long
TemplateResponse_date_range_absolute_date_range::getStartDate()
{
	return start_date;
}

void
TemplateResponse_date_range_absolute_date_range::setStartDate(long long  start_date)
{
	this->start_date = start_date;
}

long long
TemplateResponse_date_range_absolute_date_range::getEndDate()
{
	return end_date;
}

void
TemplateResponse_date_range_absolute_date_range::setEndDate(long long  end_date)
{
	this->end_date = end_date;
}


