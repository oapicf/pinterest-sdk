

#include "PinMediaSource.h"

using namespace Tiny;

PinMediaSource::PinMediaSource()
{
	content_type = ContentType();
	data = std::string();
	is_standard = bool(false);
	source_type = std::string();
	url = std::string();
	cover_image_content_type = null;
	cover_image_data = std::string();
	cover_image_key_frame_time = int(0);
	cover_image_url = std::string();
	media_id = std::string();
	index = int(0);
	items = std::list<PinMediaSourceImagesURLItem>();
	is_affiliate_link = bool(false);
}

PinMediaSource::PinMediaSource(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMediaSource::~PinMediaSource()
{

}

void
PinMediaSource::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *content_typeKey = "content_type";

    if(object.has_key(content_typeKey))
    {
        bourne::json value = object[content_typeKey];




        ContentType* obj = &content_type;
		obj->fromJson(value.dump());

    }

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];



        jsonToValue(&data, value, "std::string");


    }

    const char *is_standardKey = "is_standard";

    if(object.has_key(is_standardKey))
    {
        bourne::json value = object[is_standardKey];



        jsonToValue(&is_standard, value, "bool");


    }

    const char *source_typeKey = "source_type";

    if(object.has_key(source_typeKey))
    {
        bourne::json value = object[source_typeKey];



        jsonToValue(&source_type, value, "std::string");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }

    const char *cover_image_content_typeKey = "cover_image_content_type";

    if(object.has_key(cover_image_content_typeKey))
    {
        bourne::json value = object[cover_image_content_typeKey];




        ContentType* obj = &cover_image_content_type;
		obj->fromJson(value.dump());

    }

    const char *cover_image_dataKey = "cover_image_data";

    if(object.has_key(cover_image_dataKey))
    {
        bourne::json value = object[cover_image_dataKey];



        jsonToValue(&cover_image_data, value, "std::string");


    }

    const char *cover_image_key_frame_timeKey = "cover_image_key_frame_time";

    if(object.has_key(cover_image_key_frame_timeKey))
    {
        bourne::json value = object[cover_image_key_frame_timeKey];



        jsonToValue(&cover_image_key_frame_time, value, "int");


    }

    const char *cover_image_urlKey = "cover_image_url";

    if(object.has_key(cover_image_urlKey))
    {
        bourne::json value = object[cover_image_urlKey];



        jsonToValue(&cover_image_url, value, "std::string");


    }

    const char *media_idKey = "media_id";

    if(object.has_key(media_idKey))
    {
        bourne::json value = object[media_idKey];



        jsonToValue(&media_id, value, "std::string");


    }

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "int");


    }

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<PinMediaSourceImagesURLItem> items_list;
        PinMediaSourceImagesURLItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }

    const char *is_affiliate_linkKey = "is_affiliate_link";

    if(object.has_key(is_affiliate_linkKey))
    {
        bourne::json value = object[is_affiliate_linkKey];



        jsonToValue(&is_affiliate_link, value, "bool");


    }


}

bourne::json
PinMediaSource::toJson()
{
    bourne::json object = bourne::json::object();






	object["content_type"] = getContentType().toJson();





    object["data"] = getData();






    object["is_standard"] = isIsStandard();






    object["source_type"] = getSourceType();






    object["url"] = getUrl();







	object["cover_image_content_type"] = getCoverImageContentType().toJson();





    object["cover_image_data"] = getCoverImageData();






    object["cover_image_key_frame_time"] = getCoverImageKeyFrameTime();






    object["cover_image_url"] = getCoverImageUrl();






    object["media_id"] = getMediaId();






    object["index"] = getIndex();





    std::list<PinMediaSourceImagesURLItem> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        PinMediaSourceImagesURLItem obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;







    object["is_affiliate_link"] = isIsAffiliateLink();



    return object;

}

ContentType
PinMediaSource::getContentType()
{
	return content_type;
}

void
PinMediaSource::setContentType(ContentType  content_type)
{
	this->content_type = content_type;
}

std::string
PinMediaSource::getData()
{
	return data;
}

void
PinMediaSource::setData(std::string  data)
{
	this->data = data;
}

bool
PinMediaSource::isIsStandard()
{
	return is_standard;
}

void
PinMediaSource::setIsStandard(bool  is_standard)
{
	this->is_standard = is_standard;
}

std::string
PinMediaSource::getSourceType()
{
	return source_type;
}

void
PinMediaSource::setSourceType(std::string  source_type)
{
	this->source_type = source_type;
}

std::string
PinMediaSource::getUrl()
{
	return url;
}

void
PinMediaSource::setUrl(std::string  url)
{
	this->url = url;
}

ContentType
PinMediaSource::getCoverImageContentType()
{
	return cover_image_content_type;
}

void
PinMediaSource::setCoverImageContentType(ContentType  cover_image_content_type)
{
	this->cover_image_content_type = cover_image_content_type;
}

std::string
PinMediaSource::getCoverImageData()
{
	return cover_image_data;
}

void
PinMediaSource::setCoverImageData(std::string  cover_image_data)
{
	this->cover_image_data = cover_image_data;
}

int
PinMediaSource::getCoverImageKeyFrameTime()
{
	return cover_image_key_frame_time;
}

void
PinMediaSource::setCoverImageKeyFrameTime(int  cover_image_key_frame_time)
{
	this->cover_image_key_frame_time = cover_image_key_frame_time;
}

std::string
PinMediaSource::getCoverImageUrl()
{
	return cover_image_url;
}

void
PinMediaSource::setCoverImageUrl(std::string  cover_image_url)
{
	this->cover_image_url = cover_image_url;
}

std::string
PinMediaSource::getMediaId()
{
	return media_id;
}

void
PinMediaSource::setMediaId(std::string  media_id)
{
	this->media_id = media_id;
}

int
PinMediaSource::getIndex()
{
	return index;
}

void
PinMediaSource::setIndex(int  index)
{
	this->index = index;
}

std::list<PinMediaSourceImagesURLItem>
PinMediaSource::getItems()
{
	return items;
}

void
PinMediaSource::setItems(std::list <PinMediaSourceImagesURLItem> items)
{
	this->items = items;
}

bool
PinMediaSource::isIsAffiliateLink()
{
	return is_affiliate_link;
}

void
PinMediaSource::setIsAffiliateLink(bool  is_affiliate_link)
{
	this->is_affiliate_link = is_affiliate_link;
}



