

#include "MediaTypeFilter.h"

using namespace Tiny;

MediaTypeFilter::MediaTypeFilter()
{
	mEDIA_TYPE = CatalogsProductGroupMultipleMediaTypesCriteria();
}

MediaTypeFilter::MediaTypeFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

MediaTypeFilter::~MediaTypeFilter()
{

}

void
MediaTypeFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mEDIA_TYPEKey = "MEDIA_TYPE";

    if(object.has_key(mEDIA_TYPEKey))
    {
        bourne::json value = object[mEDIA_TYPEKey];




        CatalogsProductGroupMultipleMediaTypesCriteria* obj = &mEDIA_TYPE;
		obj->fromJson(value.dump());

    }


}

bourne::json
MediaTypeFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["mEDIA_TYPE"] = getMEDIATYPE().toJson();


    return object;

}

CatalogsProductGroupMultipleMediaTypesCriteria
MediaTypeFilter::getMEDIATYPE()
{
	return mEDIA_TYPE;
}

void
MediaTypeFilter::setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria  mEDIA_TYPE)
{
	this->mEDIA_TYPE = mEDIA_TYPE;
}



