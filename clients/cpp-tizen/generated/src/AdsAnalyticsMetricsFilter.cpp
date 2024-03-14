#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdsAnalyticsMetricsFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdsAnalyticsMetricsFilter::AdsAnalyticsMetricsFilter()
{
	//__init();
}

AdsAnalyticsMetricsFilter::~AdsAnalyticsMetricsFilter()
{
	//__cleanup();
}

void
AdsAnalyticsMetricsFilter::__init()
{
	//field = new AdsAnalyticsFilterColumn();
	//r_operator = new AdsAnalyticsFilterOperator();
	//new std::list()std::list> values;
}

void
AdsAnalyticsMetricsFilter::__cleanup()
{
	//if(field != NULL) {
	//
	//delete field;
	//field = NULL;
	//}
	//if(r_operator != NULL) {
	//
	//delete r_operator;
	//r_operator = NULL;
	//}
	//if(values != NULL) {
	//values.RemoveAll(true);
	//delete values;
	//values = NULL;
	//}
	//
}

void
AdsAnalyticsMetricsFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fieldKey = "field";
	node = json_object_get_member(pJsonObject, fieldKey);
	if (node !=NULL) {
	

		if (isprimitive("AdsAnalyticsFilterColumn")) {
			jsonToValue(&field, node, "AdsAnalyticsFilterColumn", "AdsAnalyticsFilterColumn");
		} else {
			
			AdsAnalyticsFilterColumn* obj = static_cast<AdsAnalyticsFilterColumn*> (&field);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *r_operatorKey = "operator";
	node = json_object_get_member(pJsonObject, r_operatorKey);
	if (node !=NULL) {
	

		if (isprimitive("AdsAnalyticsFilterOperator")) {
			jsonToValue(&r_operator, node, "AdsAnalyticsFilterOperator", "AdsAnalyticsFilterOperator");
		} else {
			
			AdsAnalyticsFilterOperator* obj = static_cast<AdsAnalyticsFilterOperator*> (&r_operator);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<long long> new_list;
			long long inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("long long")) {
					jsonToValue(&inst, temp_json, "long long", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			values = new_list;
		}
		
	}
}

AdsAnalyticsMetricsFilter::AdsAnalyticsMetricsFilter(char* json)
{
	this->fromJson(json);
}

char*
AdsAnalyticsMetricsFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AdsAnalyticsFilterColumn")) {
		AdsAnalyticsFilterColumn obj = getField();
		node = converttoJson(&obj, "AdsAnalyticsFilterColumn", "");
	}
	else {
		
		AdsAnalyticsFilterColumn obj = static_cast<AdsAnalyticsFilterColumn> (getField());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fieldKey = "field";
	json_object_set_member(pJsonObject, fieldKey, node);
	if (isprimitive("AdsAnalyticsFilterOperator")) {
		AdsAnalyticsFilterOperator obj = getROperator();
		node = converttoJson(&obj, "AdsAnalyticsFilterOperator", "");
	}
	else {
		
		AdsAnalyticsFilterOperator obj = static_cast<AdsAnalyticsFilterOperator> (getROperator());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *r_operatorKey = "operator";
	json_object_set_member(pJsonObject, r_operatorKey, node);
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getValues());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<long long>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			long long obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *valuesKey = "values";
	json_object_set_member(pJsonObject, valuesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AdsAnalyticsFilterColumn
AdsAnalyticsMetricsFilter::getField()
{
	return field;
}

void
AdsAnalyticsMetricsFilter::setField(AdsAnalyticsFilterColumn  field)
{
	this->field = field;
}

AdsAnalyticsFilterOperator
AdsAnalyticsMetricsFilter::getROperator()
{
	return r_operator;
}

void
AdsAnalyticsMetricsFilter::setROperator(AdsAnalyticsFilterOperator  r_operator)
{
	this->r_operator = r_operator;
}

std::list<long long>
AdsAnalyticsMetricsFilter::getValues()
{
	return values;
}

void
AdsAnalyticsMetricsFilter::setValues(std::list <long long> values)
{
	this->values = values;
}


