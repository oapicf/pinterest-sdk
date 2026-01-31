#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EventQualityScore.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EventQualityScore::EventQualityScore()
{
	//__init();
}

EventQualityScore::~EventQualityScore()
{
	//__cleanup();
}

void
EventQualityScore::__init()
{
	//ingestion_source = new IngestionSourceOptions();
	//lookback_period = new LookbackPeriodOptions();
	//overall_status = new OverallStatusOptions();
	//quality_components = new QualityComponents();
	//source_platform = new SourcePlatformOptions();
}

void
EventQualityScore::__cleanup()
{
	//if(ingestion_source != NULL) {
	//
	//delete ingestion_source;
	//ingestion_source = NULL;
	//}
	//if(lookback_period != NULL) {
	//
	//delete lookback_period;
	//lookback_period = NULL;
	//}
	//if(overall_status != NULL) {
	//
	//delete overall_status;
	//overall_status = NULL;
	//}
	//if(quality_components != NULL) {
	//
	//delete quality_components;
	//quality_components = NULL;
	//}
	//if(source_platform != NULL) {
	//
	//delete source_platform;
	//source_platform = NULL;
	//}
	//
}

void
EventQualityScore::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ingestion_sourceKey = "ingestion_source";
	node = json_object_get_member(pJsonObject, ingestion_sourceKey);
	if (node !=NULL) {
	

		if (isprimitive("IngestionSourceOptions")) {
			jsonToValue(&ingestion_source, node, "IngestionSourceOptions", "IngestionSourceOptions");
		} else {
			
			IngestionSourceOptions* obj = static_cast<IngestionSourceOptions*> (&ingestion_source);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *lookback_periodKey = "lookback_period";
	node = json_object_get_member(pJsonObject, lookback_periodKey);
	if (node !=NULL) {
	

		if (isprimitive("LookbackPeriodOptions")) {
			jsonToValue(&lookback_period, node, "LookbackPeriodOptions", "LookbackPeriodOptions");
		} else {
			
			LookbackPeriodOptions* obj = static_cast<LookbackPeriodOptions*> (&lookback_period);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *overall_statusKey = "overall_status";
	node = json_object_get_member(pJsonObject, overall_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("OverallStatusOptions")) {
			jsonToValue(&overall_status, node, "OverallStatusOptions", "OverallStatusOptions");
		} else {
			
			OverallStatusOptions* obj = static_cast<OverallStatusOptions*> (&overall_status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *quality_componentsKey = "quality_components";
	node = json_object_get_member(pJsonObject, quality_componentsKey);
	if (node !=NULL) {
	

		if (isprimitive("QualityComponents")) {
			jsonToValue(&quality_components, node, "QualityComponents", "QualityComponents");
		} else {
			
			QualityComponents* obj = static_cast<QualityComponents*> (&quality_components);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *source_platformKey = "source_platform";
	node = json_object_get_member(pJsonObject, source_platformKey);
	if (node !=NULL) {
	

		if (isprimitive("SourcePlatformOptions")) {
			jsonToValue(&source_platform, node, "SourcePlatformOptions", "SourcePlatformOptions");
		} else {
			
			SourcePlatformOptions* obj = static_cast<SourcePlatformOptions*> (&source_platform);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

EventQualityScore::EventQualityScore(char* json)
{
	this->fromJson(json);
}

char*
EventQualityScore::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("IngestionSourceOptions")) {
		IngestionSourceOptions obj = getIngestionSource();
		node = converttoJson(&obj, "IngestionSourceOptions", "");
	}
	else {
		
		IngestionSourceOptions obj = static_cast<IngestionSourceOptions> (getIngestionSource());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ingestion_sourceKey = "ingestion_source";
	json_object_set_member(pJsonObject, ingestion_sourceKey, node);
	if (isprimitive("LookbackPeriodOptions")) {
		LookbackPeriodOptions obj = getLookbackPeriod();
		node = converttoJson(&obj, "LookbackPeriodOptions", "");
	}
	else {
		
		LookbackPeriodOptions obj = static_cast<LookbackPeriodOptions> (getLookbackPeriod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *lookback_periodKey = "lookback_period";
	json_object_set_member(pJsonObject, lookback_periodKey, node);
	if (isprimitive("OverallStatusOptions")) {
		OverallStatusOptions obj = getOverallStatus();
		node = converttoJson(&obj, "OverallStatusOptions", "");
	}
	else {
		
		OverallStatusOptions obj = static_cast<OverallStatusOptions> (getOverallStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *overall_statusKey = "overall_status";
	json_object_set_member(pJsonObject, overall_statusKey, node);
	if (isprimitive("QualityComponents")) {
		QualityComponents obj = getQualityComponents();
		node = converttoJson(&obj, "QualityComponents", "");
	}
	else {
		
		QualityComponents obj = static_cast<QualityComponents> (getQualityComponents());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *quality_componentsKey = "quality_components";
	json_object_set_member(pJsonObject, quality_componentsKey, node);
	if (isprimitive("SourcePlatformOptions")) {
		SourcePlatformOptions obj = getSourcePlatform();
		node = converttoJson(&obj, "SourcePlatformOptions", "");
	}
	else {
		
		SourcePlatformOptions obj = static_cast<SourcePlatformOptions> (getSourcePlatform());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *source_platformKey = "source_platform";
	json_object_set_member(pJsonObject, source_platformKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

IngestionSourceOptions
EventQualityScore::getIngestionSource()
{
	return ingestion_source;
}

void
EventQualityScore::setIngestionSource(IngestionSourceOptions  ingestion_source)
{
	this->ingestion_source = ingestion_source;
}

LookbackPeriodOptions
EventQualityScore::getLookbackPeriod()
{
	return lookback_period;
}

void
EventQualityScore::setLookbackPeriod(LookbackPeriodOptions  lookback_period)
{
	this->lookback_period = lookback_period;
}

OverallStatusOptions
EventQualityScore::getOverallStatus()
{
	return overall_status;
}

void
EventQualityScore::setOverallStatus(OverallStatusOptions  overall_status)
{
	this->overall_status = overall_status;
}

QualityComponents
EventQualityScore::getQualityComponents()
{
	return quality_components;
}

void
EventQualityScore::setQualityComponents(QualityComponents  quality_components)
{
	this->quality_components = quality_components;
}

SourcePlatformOptions
EventQualityScore::getSourcePlatform()
{
	return source_platform;
}

void
EventQualityScore::setSourcePlatform(SourcePlatformOptions  source_platform)
{
	this->source_platform = source_platform;
}


