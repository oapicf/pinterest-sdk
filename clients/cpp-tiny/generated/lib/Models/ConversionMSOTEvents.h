
/*
 * ConversionMSOTEvents.h
 *
 * Object containing the MSOT conversion events.
 */

#ifndef TINY_CPP_CLIENT_ConversionMSOTEvents_H_
#define TINY_CPP_CLIENT_ConversionMSOTEvents_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Currency.h"
#include <list>

namespace Tiny {


/*! \brief Object containing the MSOT conversion events.
 *
 *  \ingroup Models
 *
 */

class ConversionMSOTEvents{
public:

    /*! \brief Constructor.
	 */
    ConversionMSOTEvents();
    ConversionMSOTEvents(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionMSOTEvents();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
	 */
	std::list<long> getActionTimestamps();

	/*! \brief Set Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
	 */
	void setActionTimestamps(std::list <long> action_timestamps);
	/*! \brief Get The ID of the ad group that was attributed to the conversion event.
	 */
	std::string getAdGroupId();

	/*! \brief Set The ID of the ad group that was attributed to the conversion event.
	 */
	void setAdGroupId(std::string  ad_group_id);
	/*! \brief Get The attribution model used to attribute the conversion event.
	 */
	std::string getAttributionModel();

	/*! \brief Set The attribution model used to attribute the conversion event.
	 */
	void setAttributionModel(std::string  attribution_model);
	/*! \brief Get Ad event type.
	 */
	std::string getAttributionScope();

	/*! \brief Set Ad event type.
	 */
	void setAttributionScope(std::string  attribution_scope);
	/*! \brief Get Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
	 */
	double getAttributionScore();

	/*! \brief Set Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
	 */
	void setAttributionScore(double  attribution_score);
	/*! \brief Get The ID of the campaign that was attributed to the conversion event.
	 */
	std::string getCampaignId();

	/*! \brief Set The ID of the campaign that was attributed to the conversion event.
	 */
	void setCampaignId(std::string  campaign_id);
	/*! \brief Get 
	 */
	Currency getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(Currency  currency);
	/*! \brief Get A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
	 */
	std::string getEventId();

	/*! \brief Set A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
	 */
	void setEventId(std::string  event_id);
	/*! \brief Get Type of user event.
	 */
	std::string getEventName();

	/*! \brief Set Type of user event.
	 */
	void setEventName(std::string  event_name);
	/*! \brief Get The time when the event occurred. Unix timestamp in seconds.
	 */
	long getEventTimestamp();

	/*! \brief Set The time when the event occurred. Unix timestamp in seconds.
	 */
	void setEventTimestamp(long  event_timestamp);
	/*! \brief Get Total number of ad events including other non-Pinterest ad platforms.
	 */
	int getTotalEventTouchpoints();

	/*! \brief Set Total number of ad events including other non-Pinterest ad platforms.
	 */
	void setTotalEventTouchpoints(int  total_event_touchpoints);
	/*! \brief Get Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>
	 */
	int getTotalEvents();

	/*! \brief Set Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>
	 */
	void setTotalEvents(int  total_events);
	/*! \brief Get Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.
	 */
	double getValue();

	/*! \brief Set Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.
	 */
	void setValue(double  value);


    private:
    std::list<long> action_timestamps;
    std::string ad_group_id{};
    std::string attribution_model{};
    std::string attribution_scope{};
    double attribution_score{};
    std::string campaign_id{};
    Currency currency;
    std::string event_id{};
    std::string event_name{};
    long event_timestamp{};
    int total_event_touchpoints{};
    int total_events{};
    double value{};
};
}

#endif /* TINY_CPP_CLIENT_ConversionMSOTEvents_H_ */
