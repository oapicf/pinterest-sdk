/*
 * AdCommon_tracking_urls.h
 *
 * 
 */

#ifndef _AdCommon_tracking_urls_H_
#define _AdCommon_tracking_urls_H_


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


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdCommon_tracking_urls : public Object {
public:
	/*! \brief Constructor.
	 */
	AdCommon_tracking_urls();
	AdCommon_tracking_urls(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdCommon_tracking_urls();

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

#endif /* _AdCommon_tracking_urls_H_ */
