
/*
 * AdGroupTrackingURLs.h
 *
 *   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
 */

#ifndef TINY_CPP_CLIENT_AdGroupTrackingURLs_H_
#define TINY_CPP_CLIENT_AdGroupTrackingURLs_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
 *
 *  \ingroup Models
 *
 */

class AdGroupTrackingURLs{
public:

    /*! \brief Constructor.
	 */
    AdGroupTrackingURLs();
    AdGroupTrackingURLs(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdGroupTrackingURLs();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<std::string> getAudienceVerification();

	/*! \brief Set 
	 */
	void setAudienceVerification(std::list<std::string> audience_verification);
	/*! \brief Get 
	 */
	std::list<std::string> getBuyableButton();

	/*! \brief Set 
	 */
	void setBuyableButton(std::list<std::string> buyable_button);
	/*! \brief Get 
	 */
	std::list<std::string> getClick();

	/*! \brief Set 
	 */
	void setClick(std::list<std::string> click);
	/*! \brief Get 
	 */
	std::list<std::string> getEngagement();

	/*! \brief Set 
	 */
	void setEngagement(std::list<std::string> engagement);
	/*! \brief Get 
	 */
	std::list<std::string> getImpression();

	/*! \brief Set 
	 */
	void setImpression(std::list<std::string> impression);


    private:
    std::list<std::string> audience_verification;
    std::list<std::string> buyable_button;
    std::list<std::string> click;
    std::list<std::string> engagement;
    std::list<std::string> impression;
};
}

#endif /* TINY_CPP_CLIENT_AdGroupTrackingURLs_H_ */
