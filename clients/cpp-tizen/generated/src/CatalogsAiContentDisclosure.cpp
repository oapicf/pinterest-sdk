#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsAiContentDisclosure.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsAiContentDisclosure::CatalogsAiContentDisclosure()
{
	//__init();
}

CatalogsAiContentDisclosure::~CatalogsAiContentDisclosure()
{
	//__cleanup();
}

void
CatalogsAiContentDisclosure::__init()
{
	//new std::list()std::list> disclosure;
	//url = std::string();
}

void
CatalogsAiContentDisclosure::__cleanup()
{
	//if(disclosure != NULL) {
	//disclosure.RemoveAll(true);
	//delete disclosure;
	//disclosure = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
CatalogsAiContentDisclosure::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *disclosureKey = "disclosure";
	node = json_object_get_member(pJsonObject, disclosureKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CatalogsAiContentDisclosureLabel> new_list;
			CatalogsAiContentDisclosureLabel inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CatalogsAiContentDisclosureLabel")) {
					jsonToValue(&inst, temp_json, "CatalogsAiContentDisclosureLabel", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			disclosure = new_list;
		}
		
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsAiContentDisclosure::CatalogsAiContentDisclosure(char* json)
{
	this->fromJson(json);
}

char*
CatalogsAiContentDisclosure::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsAiContentDisclosureLabel")) {
		list<CatalogsAiContentDisclosureLabel> new_list = static_cast<list <CatalogsAiContentDisclosureLabel> > (getDisclosure());
		node = converttoJson(&new_list, "CatalogsAiContentDisclosureLabel", "array");
	} else {
		node = json_node_alloc();
		list<CatalogsAiContentDisclosureLabel> new_list = static_cast<list <CatalogsAiContentDisclosureLabel> > (getDisclosure());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CatalogsAiContentDisclosureLabel>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CatalogsAiContentDisclosureLabel obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *disclosureKey = "disclosure";
	json_object_set_member(pJsonObject, disclosureKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<CatalogsAiContentDisclosureLabel>
CatalogsAiContentDisclosure::getDisclosure()
{
	return disclosure;
}

void
CatalogsAiContentDisclosure::setDisclosure(std::list <CatalogsAiContentDisclosureLabel> disclosure)
{
	this->disclosure = disclosure;
}

std::string
CatalogsAiContentDisclosure::getUrl()
{
	return url;
}

void
CatalogsAiContentDisclosure::setUrl(std::string  url)
{
	this->url = url;
}


