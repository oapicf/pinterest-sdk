#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BidOptionsAgeBucketMultipliers.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BidOptionsAgeBucketMultipliers::BidOptionsAgeBucketMultipliers()
{
	//__init();
}

BidOptionsAgeBucketMultipliers::~BidOptionsAgeBucketMultipliers()
{
	//__cleanup();
}

void
BidOptionsAgeBucketMultipliers::__init()
{
	//1824 = double(0);
	//2534 = double(0);
	//3544 = double(0);
	//4549 = double(0);
	//5054 = double(0);
	//5564 = double(0);
	//65 = double(0);
}

void
BidOptionsAgeBucketMultipliers::__cleanup()
{
	//if(1824 != NULL) {
	//
	//delete 1824;
	//1824 = NULL;
	//}
	//if(2534 != NULL) {
	//
	//delete 2534;
	//2534 = NULL;
	//}
	//if(3544 != NULL) {
	//
	//delete 3544;
	//3544 = NULL;
	//}
	//if(4549 != NULL) {
	//
	//delete 4549;
	//4549 = NULL;
	//}
	//if(5054 != NULL) {
	//
	//delete 5054;
	//5054 = NULL;
	//}
	//if(5564 != NULL) {
	//
	//delete 5564;
	//5564 = NULL;
	//}
	//if(65 != NULL) {
	//
	//delete 65;
	//65 = NULL;
	//}
	//
}

void
BidOptionsAgeBucketMultipliers::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *1824Key = "18-24";
	node = json_object_get_member(pJsonObject, 1824Key);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&1824, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&1824);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *2534Key = "25-34";
	node = json_object_get_member(pJsonObject, 2534Key);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&2534, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&2534);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *3544Key = "35-44";
	node = json_object_get_member(pJsonObject, 3544Key);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&3544, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&3544);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *4549Key = "45-49";
	node = json_object_get_member(pJsonObject, 4549Key);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&4549, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&4549);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *5054Key = "50-54";
	node = json_object_get_member(pJsonObject, 5054Key);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&5054, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&5054);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *5564Key = "55-64";
	node = json_object_get_member(pJsonObject, 5564Key);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&5564, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&5564);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *65Key = "65+";
	node = json_object_get_member(pJsonObject, 65Key);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&65, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&65);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BidOptionsAgeBucketMultipliers::BidOptionsAgeBucketMultipliers(char* json)
{
	this->fromJson(json);
}

char*
BidOptionsAgeBucketMultipliers::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = get1824();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (get1824());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *1824Key = "18-24";
	json_object_set_member(pJsonObject, 1824Key, node);
	if (isprimitive("long long")) {
		long long obj = get2534();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (get2534());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *2534Key = "25-34";
	json_object_set_member(pJsonObject, 2534Key, node);
	if (isprimitive("long long")) {
		long long obj = get3544();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (get3544());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *3544Key = "35-44";
	json_object_set_member(pJsonObject, 3544Key, node);
	if (isprimitive("long long")) {
		long long obj = get4549();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (get4549());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *4549Key = "45-49";
	json_object_set_member(pJsonObject, 4549Key, node);
	if (isprimitive("long long")) {
		long long obj = get5054();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (get5054());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *5054Key = "50-54";
	json_object_set_member(pJsonObject, 5054Key, node);
	if (isprimitive("long long")) {
		long long obj = get5564();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (get5564());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *5564Key = "55-64";
	json_object_set_member(pJsonObject, 5564Key, node);
	if (isprimitive("long long")) {
		long long obj = get65();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (get65());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *65Key = "65+";
	json_object_set_member(pJsonObject, 65Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
BidOptionsAgeBucketMultipliers::get1824()
{
	return 1824;
}

void
BidOptionsAgeBucketMultipliers::set1824(long long  1824)
{
	this->1824 = 1824;
}

long long
BidOptionsAgeBucketMultipliers::get2534()
{
	return 2534;
}

void
BidOptionsAgeBucketMultipliers::set2534(long long  2534)
{
	this->2534 = 2534;
}

long long
BidOptionsAgeBucketMultipliers::get3544()
{
	return 3544;
}

void
BidOptionsAgeBucketMultipliers::set3544(long long  3544)
{
	this->3544 = 3544;
}

long long
BidOptionsAgeBucketMultipliers::get4549()
{
	return 4549;
}

void
BidOptionsAgeBucketMultipliers::set4549(long long  4549)
{
	this->4549 = 4549;
}

long long
BidOptionsAgeBucketMultipliers::get5054()
{
	return 5054;
}

void
BidOptionsAgeBucketMultipliers::set5054(long long  5054)
{
	this->5054 = 5054;
}

long long
BidOptionsAgeBucketMultipliers::get5564()
{
	return 5564;
}

void
BidOptionsAgeBucketMultipliers::set5564(long long  5564)
{
	this->5564 = 5564;
}

long long
BidOptionsAgeBucketMultipliers::get65()
{
	return 65;
}

void
BidOptionsAgeBucketMultipliers::set65(long long  65)
{
	this->65 = 65;
}


