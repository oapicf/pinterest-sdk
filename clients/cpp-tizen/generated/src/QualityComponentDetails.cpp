#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "QualityComponentDetails.h"

using namespace std;
using namespace Tizen::ArtikCloud;

QualityComponentDetails::QualityComponentDetails()
{
	//__init();
}

QualityComponentDetails::~QualityComponentDetails()
{
	//__cleanup();
}

void
QualityComponentDetails::__init()
{
	//coverage = double(0);
	//new std::list()std::list> issues;
	//overlap = double(0);
}

void
QualityComponentDetails::__cleanup()
{
	//if(coverage != NULL) {
	//
	//delete coverage;
	//coverage = NULL;
	//}
	//if(issues != NULL) {
	//issues.RemoveAll(true);
	//delete issues;
	//issues = NULL;
	//}
	//if(overlap != NULL) {
	//
	//delete overlap;
	//overlap = NULL;
	//}
	//
}

void
QualityComponentDetails::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *coverageKey = "coverage";
	node = json_object_get_member(pJsonObject, coverageKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&coverage, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&coverage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *issuesKey = "issues";
	node = json_object_get_member(pJsonObject, issuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<QualityComponentIssue> new_list;
			QualityComponentIssue inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("QualityComponentIssue")) {
					jsonToValue(&inst, temp_json, "QualityComponentIssue", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			issues = new_list;
		}
		
	}
	const gchar *overlapKey = "overlap";
	node = json_object_get_member(pJsonObject, overlapKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&overlap, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&overlap);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

QualityComponentDetails::QualityComponentDetails(char* json)
{
	this->fromJson(json);
}

char*
QualityComponentDetails::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getCoverage();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getCoverage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *coverageKey = "coverage";
	json_object_set_member(pJsonObject, coverageKey, node);
	if (isprimitive("QualityComponentIssue")) {
		list<QualityComponentIssue> new_list = static_cast<list <QualityComponentIssue> > (getIssues());
		node = converttoJson(&new_list, "QualityComponentIssue", "array");
	} else {
		node = json_node_alloc();
		list<QualityComponentIssue> new_list = static_cast<list <QualityComponentIssue> > (getIssues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<QualityComponentIssue>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			QualityComponentIssue obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *issuesKey = "issues";
	json_object_set_member(pJsonObject, issuesKey, node);
	if (isprimitive("long long")) {
		long long obj = getOverlap();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getOverlap());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *overlapKey = "overlap";
	json_object_set_member(pJsonObject, overlapKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
QualityComponentDetails::getCoverage()
{
	return coverage;
}

void
QualityComponentDetails::setCoverage(long long  coverage)
{
	this->coverage = coverage;
}

std::list<QualityComponentIssue>
QualityComponentDetails::getIssues()
{
	return issues;
}

void
QualityComponentDetails::setIssues(std::list <QualityComponentIssue> issues)
{
	this->issues = issues;
}

long long
QualityComponentDetails::getOverlap()
{
	return overlap;
}

void
QualityComponentDetails::setOverlap(long long  overlap)
{
	this->overlap = overlap;
}


