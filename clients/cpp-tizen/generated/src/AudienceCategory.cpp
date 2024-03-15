#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AudienceCategory.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AudienceCategory::AudienceCategory()
{
	//__init();
}

AudienceCategory::~AudienceCategory()
{
	//__cleanup();
}

void
AudienceCategory::__init()
{
	//key = std::string();
	//name = std::string();
	//ratio = double(0);
	//index = double(0);
	//id = std::string();
	//new std::list()std::list> subcategories;
}

void
AudienceCategory::__cleanup()
{
	//if(key != NULL) {
	//
	//delete key;
	//key = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(ratio != NULL) {
	//
	//delete ratio;
	//ratio = NULL;
	//}
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(subcategories != NULL) {
	//subcategories.RemoveAll(true);
	//delete subcategories;
	//subcategories = NULL;
	//}
	//
}

void
AudienceCategory::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *keyKey = "key";
	node = json_object_get_member(pJsonObject, keyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&key, node, "std::string", "");
		} else {
			
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
	const gchar *ratioKey = "ratio";
	node = json_object_get_member(pJsonObject, ratioKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&ratio, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&ratio);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *indexKey = "index";
	node = json_object_get_member(pJsonObject, indexKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&index, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&index);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *subcategoriesKey = "subcategories";
	node = json_object_get_member(pJsonObject, subcategoriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AudienceSubcategory> new_list;
			AudienceSubcategory inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AudienceSubcategory")) {
					jsonToValue(&inst, temp_json, "AudienceSubcategory", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			subcategories = new_list;
		}
		
	}
}

AudienceCategory::AudienceCategory(char* json)
{
	this->fromJson(json);
}

char*
AudienceCategory::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getKey();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *keyKey = "key";
	json_object_set_member(pJsonObject, keyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getRatio();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getRatio());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ratioKey = "ratio";
	json_object_set_member(pJsonObject, ratioKey, node);
	if (isprimitive("long long")) {
		long long obj = getIndex();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getIndex());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *indexKey = "index";
	json_object_set_member(pJsonObject, indexKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("AudienceSubcategory")) {
		list<AudienceSubcategory> new_list = static_cast<list <AudienceSubcategory> > (getSubcategories());
		node = converttoJson(&new_list, "AudienceSubcategory", "array");
	} else {
		node = json_node_alloc();
		list<AudienceSubcategory> new_list = static_cast<list <AudienceSubcategory> > (getSubcategories());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AudienceSubcategory>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AudienceSubcategory obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *subcategoriesKey = "subcategories";
	json_object_set_member(pJsonObject, subcategoriesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AudienceCategory::getKey()
{
	return key;
}

void
AudienceCategory::setKey(std::string  key)
{
	this->key = key;
}

std::string
AudienceCategory::getName()
{
	return name;
}

void
AudienceCategory::setName(std::string  name)
{
	this->name = name;
}

long long
AudienceCategory::getRatio()
{
	return ratio;
}

void
AudienceCategory::setRatio(long long  ratio)
{
	this->ratio = ratio;
}

long long
AudienceCategory::getIndex()
{
	return index;
}

void
AudienceCategory::setIndex(long long  index)
{
	this->index = index;
}

std::string
AudienceCategory::getId()
{
	return id;
}

void
AudienceCategory::setId(std::string  id)
{
	this->id = id;
}

std::list<AudienceSubcategory>
AudienceCategory::getSubcategories()
{
	return subcategories;
}

void
AudienceCategory::setSubcategories(std::list <AudienceSubcategory> subcategories)
{
	this->subcategories = subcategories;
}


