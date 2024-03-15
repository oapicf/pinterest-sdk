#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TemplateResponse_date_range_relative_date_range.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TemplateResponse_date_range_relative_date_range::TemplateResponse_date_range_relative_date_range()
{
	//__init();
}

TemplateResponse_date_range_relative_date_range::~TemplateResponse_date_range_relative_date_range()
{
	//__cleanup();
}

void
TemplateResponse_date_range_relative_date_range::__init()
{
	//type = std::string();
	//start_days_in_past = double(0);
	//end_days_in_past = double(0);
}

void
TemplateResponse_date_range_relative_date_range::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(start_days_in_past != NULL) {
	//
	//delete start_days_in_past;
	//start_days_in_past = NULL;
	//}
	//if(end_days_in_past != NULL) {
	//
	//delete end_days_in_past;
	//end_days_in_past = NULL;
	//}
	//
}

void
TemplateResponse_date_range_relative_date_range::fromJson(char* jsonStr)
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
	const gchar *start_days_in_pastKey = "start_days_in_past";
	node = json_object_get_member(pJsonObject, start_days_in_pastKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&start_days_in_past, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&start_days_in_past);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *end_days_in_pastKey = "end_days_in_past";
	node = json_object_get_member(pJsonObject, end_days_in_pastKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&end_days_in_past, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&end_days_in_past);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TemplateResponse_date_range_relative_date_range::TemplateResponse_date_range_relative_date_range(char* json)
{
	this->fromJson(json);
}

char*
TemplateResponse_date_range_relative_date_range::toJson()
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
		long long obj = getStartDaysInPast();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getStartDaysInPast());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *start_days_in_pastKey = "start_days_in_past";
	json_object_set_member(pJsonObject, start_days_in_pastKey, node);
	if (isprimitive("long long")) {
		long long obj = getEndDaysInPast();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getEndDaysInPast());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *end_days_in_pastKey = "end_days_in_past";
	json_object_set_member(pJsonObject, end_days_in_pastKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TemplateResponse_date_range_relative_date_range::getType()
{
	return type;
}

void
TemplateResponse_date_range_relative_date_range::setType(std::string  type)
{
	this->type = type;
}

long long
TemplateResponse_date_range_relative_date_range::getStartDaysInPast()
{
	return start_days_in_past;
}

void
TemplateResponse_date_range_relative_date_range::setStartDaysInPast(long long  start_days_in_past)
{
	this->start_days_in_past = start_days_in_past;
}

long long
TemplateResponse_date_range_relative_date_range::getEndDaysInPast()
{
	return end_days_in_past;
}

void
TemplateResponse_date_range_relative_date_range::setEndDaysInPast(long long  end_days_in_past)
{
	this->end_days_in_past = end_days_in_past;
}


