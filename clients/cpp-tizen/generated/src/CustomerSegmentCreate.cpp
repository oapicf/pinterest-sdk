#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomerSegmentCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomerSegmentCreate::CustomerSegmentCreate()
{
	//__init();
}

CustomerSegmentCreate::~CustomerSegmentCreate()
{
	//__cleanup();
}

void
CustomerSegmentCreate::__init()
{
	//new std::list()std::list> audience_ids;
	//name = std::string();
}

void
CustomerSegmentCreate::__cleanup()
{
	//if(audience_ids != NULL) {
	//audience_ids.RemoveAll(true);
	//delete audience_ids;
	//audience_ids = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
CustomerSegmentCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *audience_idsKey = "audience_ids";
	node = json_object_get_member(pJsonObject, audience_idsKey);
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
			audience_ids = new_list;
		}
		
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

CustomerSegmentCreate::CustomerSegmentCreate(char* json)
{
	this->fromJson(json);
}

char*
CustomerSegmentCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAudienceIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAudienceIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *audience_idsKey = "audience_ids";
	json_object_set_member(pJsonObject, audience_idsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
CustomerSegmentCreate::getAudienceIds()
{
	return audience_ids;
}

void
CustomerSegmentCreate::setAudienceIds(std::list <std::string> audience_ids)
{
	this->audience_ids = audience_ids;
}

std::string
CustomerSegmentCreate::getName()
{
	return name;
}

void
CustomerSegmentCreate::setName(std::string  name)
{
	this->name = name;
}


