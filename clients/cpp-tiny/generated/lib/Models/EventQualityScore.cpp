

#include "EventQualityScore.h"

using namespace Tiny;

EventQualityScore::EventQualityScore()
{
	ingestion_source = IngestionSourceOptions();
	lookback_period = LookbackPeriodOptions();
	overall_status = OverallStatusOptions();
	quality_components = QualityComponents();
	source_platform = SourcePlatformOptions();
}

EventQualityScore::EventQualityScore(std::string jsonString)
{
	this->fromJson(jsonString);
}

EventQualityScore::~EventQualityScore()
{

}

void
EventQualityScore::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ingestion_sourceKey = "ingestion_source";

    if(object.has_key(ingestion_sourceKey))
    {
        bourne::json value = object[ingestion_sourceKey];




        IngestionSourceOptions* obj = &ingestion_source;
		obj->fromJson(value.dump());

    }

    const char *lookback_periodKey = "lookback_period";

    if(object.has_key(lookback_periodKey))
    {
        bourne::json value = object[lookback_periodKey];




        LookbackPeriodOptions* obj = &lookback_period;
		obj->fromJson(value.dump());

    }

    const char *overall_statusKey = "overall_status";

    if(object.has_key(overall_statusKey))
    {
        bourne::json value = object[overall_statusKey];




        OverallStatusOptions* obj = &overall_status;
		obj->fromJson(value.dump());

    }

    const char *quality_componentsKey = "quality_components";

    if(object.has_key(quality_componentsKey))
    {
        bourne::json value = object[quality_componentsKey];




        QualityComponents* obj = &quality_components;
		obj->fromJson(value.dump());

    }

    const char *source_platformKey = "source_platform";

    if(object.has_key(source_platformKey))
    {
        bourne::json value = object[source_platformKey];




        SourcePlatformOptions* obj = &source_platform;
		obj->fromJson(value.dump());

    }


}

bourne::json
EventQualityScore::toJson()
{
    bourne::json object = bourne::json::object();






	object["ingestion_source"] = getIngestionSource().toJson();






	object["lookback_period"] = getLookbackPeriod().toJson();






	object["overall_status"] = getOverallStatus().toJson();






	object["quality_components"] = getQualityComponents().toJson();






	object["source_platform"] = getSourcePlatform().toJson();


    return object;

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



