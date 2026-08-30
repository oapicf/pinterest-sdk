

#include "CatalogsFeedVideoCounts.h"

using namespace Tiny;

CatalogsFeedVideoCounts::CatalogsFeedVideoCounts()
{
	ingested_videos = int(0);
	not_ingested_videos = int(0);
	total_videos = int(0);
}

CatalogsFeedVideoCounts::CatalogsFeedVideoCounts(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedVideoCounts::~CatalogsFeedVideoCounts()
{

}

void
CatalogsFeedVideoCounts::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ingested_videosKey = "ingested_videos";

    if(object.has_key(ingested_videosKey))
    {
        bourne::json value = object[ingested_videosKey];



        jsonToValue(&ingested_videos, value, "int");


    }

    const char *not_ingested_videosKey = "not_ingested_videos";

    if(object.has_key(not_ingested_videosKey))
    {
        bourne::json value = object[not_ingested_videosKey];



        jsonToValue(&not_ingested_videos, value, "int");


    }

    const char *total_videosKey = "total_videos";

    if(object.has_key(total_videosKey))
    {
        bourne::json value = object[total_videosKey];



        jsonToValue(&total_videos, value, "int");


    }


}

bourne::json
CatalogsFeedVideoCounts::toJson()
{
    bourne::json object = bourne::json::object();





    object["ingested_videos"] = getIngestedVideos();






    object["not_ingested_videos"] = getNotIngestedVideos();






    object["total_videos"] = getTotalVideos();



    return object;

}

int
CatalogsFeedVideoCounts::getIngestedVideos()
{
	return ingested_videos;
}

void
CatalogsFeedVideoCounts::setIngestedVideos(int ingested_videos)
{
	this->ingested_videos = ingested_videos;
}

int
CatalogsFeedVideoCounts::getNotIngestedVideos()
{
	return not_ingested_videos;
}

void
CatalogsFeedVideoCounts::setNotIngestedVideos(int not_ingested_videos)
{
	this->not_ingested_videos = not_ingested_videos;
}

int
CatalogsFeedVideoCounts::getTotalVideos()
{
	return total_videos;
}

void
CatalogsFeedVideoCounts::setTotalVideos(int total_videos)
{
	this->total_videos = total_videos;
}



