/*
 * TrackingUrls.h
 *
 *   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
 */

#ifndef _TrackingUrls_H_
#define _TrackingUrls_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
 *
 *  \ingroup Models
 *
 */

class TrackingUrls : public Object {
public:
	/*! \brief Constructor.
	 */
	TrackingUrls();
	TrackingUrls(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrackingUrls();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<std::string> getAudienceVerification();

	/*! \brief Set 
	 */
	void setAudienceVerification(std::list <std::string> audience_verification);
	/*! \brief Get 
	 */
	std::list<std::string> getBuyableButton();

	/*! \brief Set 
	 */
	void setBuyableButton(std::list <std::string> buyable_button);
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
	std::list<std::string> getImpression();

	/*! \brief Set 
	 */
	void setImpression(std::list <std::string> impression);

private:
	std::list <std::string>audience_verification;
	std::list <std::string>buyable_button;
	std::list <std::string>click;
	std::list <std::string>engagement;
	std::list <std::string>impression;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TrackingUrls_H_ */
