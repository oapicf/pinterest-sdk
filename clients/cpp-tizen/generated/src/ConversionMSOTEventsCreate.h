/*
 * ConversionMSOTEventsCreate.h
 *
 * Resource create operation model.
 */

#ifndef _ConversionMSOTEventsCreate_H_
#define _ConversionMSOTEventsCreate_H_


#include <string>
#include "AttributionModel.h"
#include "AttributionScope.h"
#include "Currency.h"
#include "MsotEventName.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class ConversionMSOTEventsCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionMSOTEventsCreate();
	ConversionMSOTEventsCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionMSOTEventsCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
	 */
	std::list<long long> getActionTimestamps();

	/*! \brief Set Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
	 */
	void setActionTimestamps(std::list <long long> action_timestamps);
	/*! \brief Get The ID of the ad group that was attributed to the conversion event.
	 */
	std::string getAdGroupId();

	/*! \brief Set The ID of the ad group that was attributed to the conversion event.
	 */
	void setAdGroupId(std::string  ad_group_id);
	/*! \brief Get The attribution model used to attribute the conversion event.
	 */
	AttributionModel getAttributionModel();

	/*! \brief Set The attribution model used to attribute the conversion event.
	 */
	void setAttributionModel(AttributionModel  attribution_model);
	/*! \brief Get Ad event type.
	 */
	AttributionScope getAttributionScope();

	/*! \brief Set Ad event type.
	 */
	void setAttributionScope(AttributionScope  attribution_scope);
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
	/*! \brief Get Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).
	 */
	std::string getClickWindow();

	/*! \brief Set Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).
	 */
	void setClickWindow(std::string  click_window);
	/*! \brief Get Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.
	 */
	Currency getCurrency();

	/*! \brief Set Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.
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
	MsotEventName getEventName();

	/*! \brief Set Type of user event.
	 */
	void setEventName(MsotEventName  event_name);
	/*! \brief Get The time when the event occurred. Unix timestamp in seconds.
	 */
	long long getEventTimestamp();

	/*! \brief Set The time when the event occurred. Unix timestamp in seconds.
	 */
	void setEventTimestamp(long long  event_timestamp);
	/*! \brief Get Total number of ad events including other non-Pinterest ad platforms.
	 */
	int getTotalEventTouchpoints();

	/*! \brief Set Total number of ad events including other non-Pinterest ad platforms.
	 */
	void setTotalEventTouchpoints(int  total_event_touchpoints);
	/*! \brief Get Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
	 */
	int getTotalEvents();

	/*! \brief Set Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
	 */
	void setTotalEvents(int  total_events);
	/*! \brief Get Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
	 */
	double getTotalEventsFractional();

	/*! \brief Set Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
	 */
	void setTotalEventsFractional(double  total_events_fractional);
	/*! \brief Get Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.
	 */
	double getValue();

	/*! \brief Set Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.
	 */
	void setValue(double  value);
	/*! \brief Get View window used for attribution (for example, `1d`, `7d`, `30d`).
	 */
	std::string getViewWindow();

	/*! \brief Set View window used for attribution (for example, `1d`, `7d`, `30d`).
	 */
	void setViewWindow(std::string  view_window);

private:
	std::list <long long>action_timestamps;
	std::string ad_group_id;
	AttributionModel attribution_model;
	AttributionScope attribution_scope;
	double attribution_score;
	std::string campaign_id;
	std::string click_window;
	Currency currency;
	std::string event_id;
	MsotEventName event_name;
	long long event_timestamp;
	int total_event_touchpoints;
	int total_events;
	double total_events_fractional;
	double value;
	std::string view_window;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionMSOTEventsCreate_H_ */
