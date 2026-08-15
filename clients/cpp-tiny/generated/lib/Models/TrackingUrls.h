
/*
 * TrackingUrls.h
 *
 * Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
 */

#ifndef TINY_CPP_CLIENT_TrackingUrls_H_
#define TINY_CPP_CLIENT_TrackingUrls_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 *
 *  \ingroup Models
 *
 */

class TrackingUrls{
public:

    /*! \brief Constructor.
	 */
    TrackingUrls();
    TrackingUrls(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrackingUrls();


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
    std::list<std::string> audience_verification;
    std::list<std::string> buyable_button;
    std::list<std::string> click;
    std::list<std::string> engagement;
    std::list<std::string> impression;
};
}

#endif /* TINY_CPP_CLIENT_TrackingUrls_H_ */
