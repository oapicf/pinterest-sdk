

#include "TrendingKeyword.h"

using namespace Tiny;

TrendingKeyword::TrendingKeyword()
{
	demographics = TrendingKeyword_demographics();
	has_prediction = bool(false);
	keyword = std::string();
	pct_growth_mom = int(0);
	pct_growth_wow = int(0);
	pct_growth_yoy = int(0);
	predicted_time_series = PredictedTimeSeries();
	time_series = TimeSeries();
}

TrendingKeyword::TrendingKeyword(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendingKeyword::~TrendingKeyword()
{

}

void
TrendingKeyword::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *demographicsKey = "demographics";

    if(object.has_key(demographicsKey))
    {
        bourne::json value = object[demographicsKey];




        TrendingKeyword_demographics* obj = &demographics;
		obj->fromJson(value.dump());

    }

    const char *has_predictionKey = "has_prediction";

    if(object.has_key(has_predictionKey))
    {
        bourne::json value = object[has_predictionKey];



        jsonToValue(&has_prediction, value, "bool");


    }

    const char *keywordKey = "keyword";

    if(object.has_key(keywordKey))
    {
        bourne::json value = object[keywordKey];



        jsonToValue(&keyword, value, "std::string");


    }

    const char *pct_growth_momKey = "pct_growth_mom";

    if(object.has_key(pct_growth_momKey))
    {
        bourne::json value = object[pct_growth_momKey];



        jsonToValue(&pct_growth_mom, value, "int");


    }

    const char *pct_growth_wowKey = "pct_growth_wow";

    if(object.has_key(pct_growth_wowKey))
    {
        bourne::json value = object[pct_growth_wowKey];



        jsonToValue(&pct_growth_wow, value, "int");


    }

    const char *pct_growth_yoyKey = "pct_growth_yoy";

    if(object.has_key(pct_growth_yoyKey))
    {
        bourne::json value = object[pct_growth_yoyKey];



        jsonToValue(&pct_growth_yoy, value, "int");


    }

    const char *predicted_time_seriesKey = "predicted_time_series";

    if(object.has_key(predicted_time_seriesKey))
    {
        bourne::json value = object[predicted_time_seriesKey];




        PredictedTimeSeries* obj = &predicted_time_series;
		obj->fromJson(value.dump());

    }

    const char *time_seriesKey = "time_series";

    if(object.has_key(time_seriesKey))
    {
        bourne::json value = object[time_seriesKey];




        TimeSeries* obj = &time_series;
		obj->fromJson(value.dump());

    }


}

bourne::json
TrendingKeyword::toJson()
{
    bourne::json object = bourne::json::object();






	object["demographics"] = getDemographics().toJson();





    object["has_prediction"] = isHasPrediction();






    object["keyword"] = getKeyword();






    object["pct_growth_mom"] = getPctGrowthMom();






    object["pct_growth_wow"] = getPctGrowthWow();






    object["pct_growth_yoy"] = getPctGrowthYoy();







	object["predicted_time_series"] = getPredictedTimeSeries().toJson();






	object["time_series"] = getTimeSeries().toJson();


    return object;

}

TrendingKeyword_demographics
TrendingKeyword::getDemographics()
{
	return demographics;
}

void
TrendingKeyword::setDemographics(TrendingKeyword_demographics  demographics)
{
	this->demographics = demographics;
}

bool
TrendingKeyword::isHasPrediction()
{
	return has_prediction;
}

void
TrendingKeyword::setHasPrediction(bool  has_prediction)
{
	this->has_prediction = has_prediction;
}

std::string
TrendingKeyword::getKeyword()
{
	return keyword;
}

void
TrendingKeyword::setKeyword(std::string  keyword)
{
	this->keyword = keyword;
}

int
TrendingKeyword::getPctGrowthMom()
{
	return pct_growth_mom;
}

void
TrendingKeyword::setPctGrowthMom(int  pct_growth_mom)
{
	this->pct_growth_mom = pct_growth_mom;
}

int
TrendingKeyword::getPctGrowthWow()
{
	return pct_growth_wow;
}

void
TrendingKeyword::setPctGrowthWow(int  pct_growth_wow)
{
	this->pct_growth_wow = pct_growth_wow;
}

int
TrendingKeyword::getPctGrowthYoy()
{
	return pct_growth_yoy;
}

void
TrendingKeyword::setPctGrowthYoy(int  pct_growth_yoy)
{
	this->pct_growth_yoy = pct_growth_yoy;
}

PredictedTimeSeries
TrendingKeyword::getPredictedTimeSeries()
{
	return predicted_time_series;
}

void
TrendingKeyword::setPredictedTimeSeries(PredictedTimeSeries  predicted_time_series)
{
	this->predicted_time_series = predicted_time_series;
}

TimeSeries
TrendingKeyword::getTimeSeries()
{
	return time_series;
}

void
TrendingKeyword::setTimeSeries(TimeSeries  time_series)
{
	this->time_series = time_series;
}



