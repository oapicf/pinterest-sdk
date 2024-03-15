#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AudienceInsightsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AudienceInsightsResponse::AudienceInsightsResponse()
{
	//__init();
}

AudienceInsightsResponse::~AudienceInsightsResponse()
{
	//__cleanup();
}

void
AudienceInsightsResponse::__init()
{
	//new std::list()std::list> categories;
	//demographics = new AudienceDemographics();
	//type = new AudienceInsightType();
	//date = std::string();
	//size = int(0);
	//size_is_upper_bound = bool(false);
}

void
AudienceInsightsResponse::__cleanup()
{
	//if(categories != NULL) {
	//categories.RemoveAll(true);
	//delete categories;
	//categories = NULL;
	//}
	//if(demographics != NULL) {
	//
	//delete demographics;
	//demographics = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(date != NULL) {
	//
	//delete date;
	//date = NULL;
	//}
	//if(size != NULL) {
	//
	//delete size;
	//size = NULL;
	//}
	//if(size_is_upper_bound != NULL) {
	//
	//delete size_is_upper_bound;
	//size_is_upper_bound = NULL;
	//}
	//
}

void
AudienceInsightsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *categoriesKey = "categories";
	node = json_object_get_member(pJsonObject, categoriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AudienceCategory> new_list;
			AudienceCategory inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AudienceCategory")) {
					jsonToValue(&inst, temp_json, "AudienceCategory", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			categories = new_list;
		}
		
	}
	const gchar *demographicsKey = "demographics";
	node = json_object_get_member(pJsonObject, demographicsKey);
	if (node !=NULL) {
	

		if (isprimitive("AudienceDemographics")) {
			jsonToValue(&demographics, node, "AudienceDemographics", "AudienceDemographics");
		} else {
			
			AudienceDemographics* obj = static_cast<AudienceDemographics*> (&demographics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AudienceInsightType")) {
			jsonToValue(&type, node, "AudienceInsightType", "AudienceInsightType");
		} else {
			
			AudienceInsightType* obj = static_cast<AudienceInsightType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dateKey = "date";
	node = json_object_get_member(pJsonObject, dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&date, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sizeKey = "size";
	node = json_object_get_member(pJsonObject, sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&size, node, "int", "");
		} else {
			
		}
	}
	const gchar *size_is_upper_boundKey = "size_is_upper_bound";
	node = json_object_get_member(pJsonObject, size_is_upper_boundKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&size_is_upper_bound, node, "bool", "");
		} else {
			
		}
	}
}

AudienceInsightsResponse::AudienceInsightsResponse(char* json)
{
	this->fromJson(json);
}

char*
AudienceInsightsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AudienceCategory")) {
		list<AudienceCategory> new_list = static_cast<list <AudienceCategory> > (getCategories());
		node = converttoJson(&new_list, "AudienceCategory", "array");
	} else {
		node = json_node_alloc();
		list<AudienceCategory> new_list = static_cast<list <AudienceCategory> > (getCategories());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AudienceCategory>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AudienceCategory obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *categoriesKey = "categories";
	json_object_set_member(pJsonObject, categoriesKey, node);
	if (isprimitive("AudienceDemographics")) {
		AudienceDemographics obj = getDemographics();
		node = converttoJson(&obj, "AudienceDemographics", "");
	}
	else {
		
		AudienceDemographics obj = static_cast<AudienceDemographics> (getDemographics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *demographicsKey = "demographics";
	json_object_set_member(pJsonObject, demographicsKey, node);
	if (isprimitive("AudienceInsightType")) {
		AudienceInsightType obj = getType();
		node = converttoJson(&obj, "AudienceInsightType", "");
	}
	else {
		
		AudienceInsightType obj = static_cast<AudienceInsightType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dateKey = "date";
	json_object_set_member(pJsonObject, dateKey, node);
	if (isprimitive("int")) {
		int obj = getSize();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sizeKey = "size";
	json_object_set_member(pJsonObject, sizeKey, node);
	if (isprimitive("bool")) {
		bool obj = getSizeIsUpperBound();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *size_is_upper_boundKey = "size_is_upper_bound";
	json_object_set_member(pJsonObject, size_is_upper_boundKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<AudienceCategory>
AudienceInsightsResponse::getCategories()
{
	return categories;
}

void
AudienceInsightsResponse::setCategories(std::list <AudienceCategory> categories)
{
	this->categories = categories;
}

AudienceDemographics
AudienceInsightsResponse::getDemographics()
{
	return demographics;
}

void
AudienceInsightsResponse::setDemographics(AudienceDemographics  demographics)
{
	this->demographics = demographics;
}

AudienceInsightType
AudienceInsightsResponse::getType()
{
	return type;
}

void
AudienceInsightsResponse::setType(AudienceInsightType  type)
{
	this->type = type;
}

std::string
AudienceInsightsResponse::getDate()
{
	return date;
}

void
AudienceInsightsResponse::setDate(std::string  date)
{
	this->date = date;
}

int
AudienceInsightsResponse::getSize()
{
	return size;
}

void
AudienceInsightsResponse::setSize(int  size)
{
	this->size = size;
}

bool
AudienceInsightsResponse::getSizeIsUpperBound()
{
	return size_is_upper_bound;
}

void
AudienceInsightsResponse::setSizeIsUpperBound(bool  size_is_upper_bound)
{
	this->size_is_upper_bound = size_is_upper_bound;
}


