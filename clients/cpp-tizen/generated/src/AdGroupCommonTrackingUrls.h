/*
 * AdGroupCommon_tracking_urls.h
 *
 * Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
 */

#ifndef _AdGroupCommon_tracking_urls_H_
#define _AdGroupCommon_tracking_urls_H_


#include <string>
#include "TrackingUrls.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 *
 *  \ingroup Models
 *
 */

class AdGroupCommon_tracking_urls : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupCommon_tracking_urls();
	AdGroupCommon_tracking_urls(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupCommon_tracking_urls();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<std::string> getImpression();

	/*! \brief Set 
	 */
	void setImpression(std::list <std::string> impression);
	/*! \brief Get 
	 */
	std::list<std::string> getClick();

	/*! \brief Set 
	 */
	void setClick(std::list <std::string> click);
	/*! \brief Get 
	 */
	std::list<std::string> getEngagement();

	/*! \brief Set 
	 */
	void setEngagement(std::list <std::string> engagement);
	/*! \brief Get 
	 */
	std::list<std::string> getBuyableButton();

	/*! \brief Set 
	 */
	void setBuyableButton(std::list <std::string> buyable_button);
	/*! \brief Get 
	 */
	std::list<std::string> getAudienceVerification();

	/*! \brief Set 
	 */
	void setAudienceVerification(std::list <std::string> audience_verification);

private:
	std::list <std::string>impression;
	std::list <std::string>click;
	std::list <std::string>engagement;
	std::list <std::string>buyable_button;
	std::list <std::string>audience_verification;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupCommon_tracking_urls_H_ */
