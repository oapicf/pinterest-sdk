

#include "ConversionEvents.h"

using namespace Tiny;

ConversionEvents::ConversionEvents()
{
	events = std::list<ConversionApiResponseEventsItems>();
	num_events_processed = int(0);
	num_events_received = int(0);
}

ConversionEvents::ConversionEvents(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionEvents::~ConversionEvents()
{

}

void
ConversionEvents::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *eventsKey = "events";

    if(object.has_key(eventsKey))
    {
        bourne::json value = object[eventsKey];


        std::list<ConversionApiResponseEventsItems> events_list;
        ConversionApiResponseEventsItems element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            events_list.push_back(element);
        }
        events = events_list;


    }

    const char *num_events_processedKey = "num_events_processed";

    if(object.has_key(num_events_processedKey))
    {
        bourne::json value = object[num_events_processedKey];



        jsonToValue(&num_events_processed, value, "int");


    }

    const char *num_events_receivedKey = "num_events_received";

    if(object.has_key(num_events_receivedKey))
    {
        bourne::json value = object[num_events_receivedKey];



        jsonToValue(&num_events_received, value, "int");


    }


}

bourne::json
ConversionEvents::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ConversionApiResponseEventsItems> events_list = getEvents();
    bourne::json events_arr = bourne::json::array();

    for(auto& var : events_list)
    {
        ConversionApiResponseEventsItems obj = var;
        events_arr.append(obj.toJson());
    }
    object["events"] = events_arr;







    object["num_events_processed"] = getNumEventsProcessed();






    object["num_events_received"] = getNumEventsReceived();



    return object;

}

std::list<ConversionApiResponseEventsItems>
ConversionEvents::getEvents()
{
	return events;
}

void
ConversionEvents::setEvents(std::list<ConversionApiResponseEventsItems> events)
{
	this->events = events;
}

int
ConversionEvents::getNumEventsProcessed()
{
	return num_events_processed;
}

void
ConversionEvents::setNumEventsProcessed(int num_events_processed)
{
	this->num_events_processed = num_events_processed;
}

int
ConversionEvents::getNumEventsReceived()
{
	return num_events_received;
}

void
ConversionEvents::setNumEventsReceived(int num_events_received)
{
	this->num_events_received = num_events_received;
}



