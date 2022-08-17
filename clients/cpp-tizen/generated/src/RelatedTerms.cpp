#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RelatedTerms.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RelatedTerms::RelatedTerms()
{
	//__init();
}

RelatedTerms::~RelatedTerms()
{
	//__cleanup();
}

void
RelatedTerms::__init()
{
	//id = std::string();
	//related_term_count = int(0);
	//new std::list()std::list> related_terms_list;
}

void
RelatedTerms::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(related_term_count != NULL) {
	//
	//delete related_term_count;
	//related_term_count = NULL;
	//}
	//if(related_terms_list != NULL) {
	//related_terms_list.RemoveAll(true);
	//delete related_terms_list;
	//related_terms_list = NULL;
	//}
	//
}

void
RelatedTerms::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *related_term_countKey = "related_term_count";
	node = json_object_get_member(pJsonObject, related_term_countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&related_term_count, node, "int", "");
		} else {
			
		}
	}
	const gchar *related_terms_listKey = "related_terms_list";
	node = json_object_get_member(pJsonObject, related_terms_listKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RelatedTerms_related_terms_list_inner> new_list;
			RelatedTerms_related_terms_list_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RelatedTerms_related_terms_list_inner")) {
					jsonToValue(&inst, temp_json, "RelatedTerms_related_terms_list_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			related_terms_list = new_list;
		}
		
	}
}

RelatedTerms::RelatedTerms(char* json)
{
	this->fromJson(json);
}

char*
RelatedTerms::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("int")) {
		int obj = getRelatedTermCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *related_term_countKey = "related_term_count";
	json_object_set_member(pJsonObject, related_term_countKey, node);
	if (isprimitive("RelatedTerms_related_terms_list_inner")) {
		list<RelatedTerms_related_terms_list_inner> new_list = static_cast<list <RelatedTerms_related_terms_list_inner> > (getRelatedTermsList());
		node = converttoJson(&new_list, "RelatedTerms_related_terms_list_inner", "array");
	} else {
		node = json_node_alloc();
		list<RelatedTerms_related_terms_list_inner> new_list = static_cast<list <RelatedTerms_related_terms_list_inner> > (getRelatedTermsList());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RelatedTerms_related_terms_list_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RelatedTerms_related_terms_list_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *related_terms_listKey = "related_terms_list";
	json_object_set_member(pJsonObject, related_terms_listKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RelatedTerms::getId()
{
	return id;
}

void
RelatedTerms::setId(std::string  id)
{
	this->id = id;
}

int
RelatedTerms::getRelatedTermCount()
{
	return related_term_count;
}

void
RelatedTerms::setRelatedTermCount(int  related_term_count)
{
	this->related_term_count = related_term_count;
}

std::list<RelatedTerms_related_terms_list_inner>
RelatedTerms::getRelatedTermsList()
{
	return related_terms_list;
}

void
RelatedTerms::setRelatedTermsList(std::list <RelatedTerms_related_terms_list_inner> related_terms_list)
{
	this->related_terms_list = related_terms_list;
}


