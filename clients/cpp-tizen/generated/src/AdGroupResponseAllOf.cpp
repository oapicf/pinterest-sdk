#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupResponse_allOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupResponse_allOf::AdGroupResponse_allOf()
{
	//__init();
}

AdGroupResponse_allOf::~AdGroupResponse_allOf()
{
	//__cleanup();
}

void
AdGroupResponse_allOf::__init()
{
	//id = std::string();
	//ad_account_id = std::string();
	//created_time = int(0);
	//updated_time = int(0);
	//type = std::string();
	//conversion_learning_mode_type = std::string();
	//summary_status = std::string();
	//feed_profile_id = std::string();
	//dca_assets = null;
}

void
AdGroupResponse_allOf::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//if(updated_time != NULL) {
	//
	//delete updated_time;
	//updated_time = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(conversion_learning_mode_type != NULL) {
	//
	//delete conversion_learning_mode_type;
	//conversion_learning_mode_type = NULL;
	//}
	//if(summary_status != NULL) {
	//
	//delete summary_status;
	//summary_status = NULL;
	//}
	//if(feed_profile_id != NULL) {
	//
	//delete feed_profile_id;
	//feed_profile_id = NULL;
	//}
	//if(dca_assets != NULL) {
	//
	//delete dca_assets;
	//dca_assets = NULL;
	//}
	//
}

void
AdGroupResponse_allOf::fromJson(char* jsonStr)
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
	const gchar *ad_account_idKey = "ad_account_id";
	node = json_object_get_member(pJsonObject, ad_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_account_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *created_timeKey = "created_time";
	node = json_object_get_member(pJsonObject, created_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *updated_timeKey = "updated_time";
	node = json_object_get_member(pJsonObject, updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *conversion_learning_mode_typeKey = "conversion_learning_mode_type";
	node = json_object_get_member(pJsonObject, conversion_learning_mode_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&conversion_learning_mode_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *summary_statusKey = "summary_status";
	node = json_object_get_member(pJsonObject, summary_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("AdGroupSummaryStatus")) {
			jsonToValue(&summary_status, node, "AdGroupSummaryStatus", "AdGroupSummaryStatus");
		} else {
			
		}
	}
	const gchar *feed_profile_idKey = "feed_profile_id";
	node = json_object_get_member(pJsonObject, feed_profile_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&feed_profile_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dca_assetsKey = "dca_assets";
	node = json_object_get_member(pJsonObject, dca_assetsKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&dca_assets, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&dca_assets);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdGroupResponse_allOf::AdGroupResponse_allOf(char* json)
{
	this->fromJson(json);
}

char*
AdGroupResponse_allOf::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
	if (isprimitive("int")) {
		int obj = getUpdatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_timeKey = "updated_time";
	json_object_set_member(pJsonObject, updated_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getConversionLearningModeType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *conversion_learning_mode_typeKey = "conversion_learning_mode_type";
	json_object_set_member(pJsonObject, conversion_learning_mode_typeKey, node);
	if (isprimitive("AdGroupSummaryStatus")) {
		AdGroupSummaryStatus obj = getSummaryStatus();
		node = converttoJson(&obj, "AdGroupSummaryStatus", "");
	}
	else {
		
	}
	const gchar *summary_statusKey = "summary_status";
	json_object_set_member(pJsonObject, summary_statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFeedProfileId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *feed_profile_idKey = "feed_profile_id";
	json_object_set_member(pJsonObject, feed_profile_idKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getDcaAssets();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getDcaAssets());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dca_assetsKey = "dca_assets";
	json_object_set_member(pJsonObject, dca_assetsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdGroupResponse_allOf::getId()
{
	return id;
}

void
AdGroupResponse_allOf::setId(std::string  id)
{
	this->id = id;
}

std::string
AdGroupResponse_allOf::getAdAccountId()
{
	return ad_account_id;
}

void
AdGroupResponse_allOf::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

int
AdGroupResponse_allOf::getCreatedTime()
{
	return created_time;
}

void
AdGroupResponse_allOf::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

int
AdGroupResponse_allOf::getUpdatedTime()
{
	return updated_time;
}

void
AdGroupResponse_allOf::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}

std::string
AdGroupResponse_allOf::getType()
{
	return type;
}

void
AdGroupResponse_allOf::setType(std::string  type)
{
	this->type = type;
}

std::string
AdGroupResponse_allOf::getConversionLearningModeType()
{
	return conversion_learning_mode_type;
}

void
AdGroupResponse_allOf::setConversionLearningModeType(std::string  conversion_learning_mode_type)
{
	this->conversion_learning_mode_type = conversion_learning_mode_type;
}

AdGroupSummaryStatus
AdGroupResponse_allOf::getSummaryStatus()
{
	return summary_status;
}

void
AdGroupResponse_allOf::setSummaryStatus(AdGroupSummaryStatus  summary_status)
{
	this->summary_status = summary_status;
}

std::string
AdGroupResponse_allOf::getFeedProfileId()
{
	return feed_profile_id;
}

void
AdGroupResponse_allOf::setFeedProfileId(std::string  feed_profile_id)
{
	this->feed_profile_id = feed_profile_id;
}

AnyType
AdGroupResponse_allOf::getDcaAssets()
{
	return dca_assets;
}

void
AdGroupResponse_allOf::setDcaAssets(AnyType  dca_assets)
{
	this->dca_assets = dca_assets;
}


