#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RelatedTerms_related_terms_list_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RelatedTerms_related_terms_list_inner::RelatedTerms_related_terms_list_inner()
{
	//__init();
}

RelatedTerms_related_terms_list_inner::~RelatedTerms_related_terms_list_inner()
{
	//__cleanup();
}

void
RelatedTerms_related_terms_list_inner::__init()
{
	//term = std::string();
	//new std::list()std::list> related_terms;
}

void
RelatedTerms_related_terms_list_inner::__cleanup()
{
	//if(term != NULL) {
	//
	//delete term;
	//term = NULL;
	//}
	//if(related_terms != NULL) {
	//related_terms.RemoveAll(true);
	//delete related_terms;
	//related_terms = NULL;
	//}
	//
}

void
RelatedTerms_related_terms_list_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *termKey = "term";
	node = json_object_get_member(pJsonObject, termKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&term, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *related_termsKey = "related_terms";
	node = json_object_get_member(pJsonObject, related_termsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			related_terms = new_list;
		}
		
	}
}

RelatedTerms_related_terms_list_inner::RelatedTerms_related_terms_list_inner(char* json)
{
	this->fromJson(json);
}

char*
RelatedTerms_related_terms_list_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getTerm();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *termKey = "term";
	json_object_set_member(pJsonObject, termKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getRelatedTerms());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getRelatedTerms());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *related_termsKey = "related_terms";
	json_object_set_member(pJsonObject, related_termsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RelatedTerms_related_terms_list_inner::getTerm()
{
	return term;
}

void
RelatedTerms_related_terms_list_inner::setTerm(std::string  term)
{
	this->term = term;
}

std::list<std::string>
RelatedTerms_related_terms_list_inner::getRelatedTerms()
{
	return related_terms;
}

void
RelatedTerms_related_terms_list_inner::setRelatedTerms(std::list <std::string> related_terms)
{
	this->related_terms = related_terms;
}


