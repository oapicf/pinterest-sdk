
/*
 * QualityComponents.h
 *
 * Set of quality components, with each component containing a event coverage and details.
 */

#ifndef TINY_CPP_CLIENT_QualityComponents_H_
#define TINY_CPP_CLIENT_QualityComponents_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "QualityComponentDetails.h"
#include <map>

namespace Tiny {


/*! \brief Set of quality components, with each component containing a event coverage and details.
 *
 *  \ingroup Models
 *
 */

class QualityComponents{
public:

    /*! \brief Constructor.
	 */
    QualityComponents();
    QualityComponents(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~QualityComponents();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Map<std::string, std::string> getAdvertiserExternalId();

	/*! \brief Set 
	 */
	void setAdvertiserExternalId(Map <std::string, std::string> advertiser_external_id);
	/*! \brief Get 
	 */
	Map<std::string, std::string> getClickIdEpik();

	/*! \brief Set 
	 */
	void setClickIdEpik(Map <std::string, std::string> click_id_epik);
	/*! \brief Get Dedup components.
	 */
	Map<std::string, std::string> getExternalEventId();

	/*! \brief Set Dedup components.
	 */
	void setExternalEventId(Map <std::string, std::string> external_event_id);
	/*! \brief Get User matching identifiers.
	 */
	Map<std::string, std::string> getHashedEmail();

	/*! \brief Set User matching identifiers.
	 */
	void setHashedEmail(Map <std::string, std::string> hashed_email);
	/*! \brief Get 
	 */
	Map<std::string, std::string> getHashedMaid();

	/*! \brief Set 
	 */
	void setHashedMaid(Map <std::string, std::string> hashed_maid);
	/*! \brief Get 
	 */
	Map<std::string, std::string> getIpAddress();

	/*! \brief Set 
	 */
	void setIpAddress(Map <std::string, std::string> ip_address);
	/*! \brief Get 
	 */
	Map<std::string, std::string> getOrderId();

	/*! \brief Set 
	 */
	void setOrderId(Map <std::string, std::string> order_id);
	/*! \brief Get 
	 */
	Map<std::string, std::string> getOrderValue();

	/*! \brief Set 
	 */
	void setOrderValue(Map <std::string, std::string> order_value);
	/*! \brief Get Product/event metadata.
	 */
	Map<std::string, std::string> getProductId();

	/*! \brief Set Product/event metadata.
	 */
	void setProductId(Map <std::string, std::string> product_id);
	/*! \brief Get 
	 */
	Map<std::string, std::string> getSourceUrl();

	/*! \brief Set 
	 */
	void setSourceUrl(Map <std::string, std::string> source_url);
	/*! \brief Get 
	 */
	Map<std::string, std::string> getUserAgent();

	/*! \brief Set 
	 */
	void setUserAgent(Map <std::string, std::string> user_agent);


    private:
    Map<std::string, std::string> advertiser_external_id;
    Map<std::string, std::string> click_id_epik;
    Map<std::string, std::string> external_event_id;
    Map<std::string, std::string> hashed_email;
    Map<std::string, std::string> hashed_maid;
    Map<std::string, std::string> ip_address;
    Map<std::string, std::string> order_id;
    Map<std::string, std::string> order_value;
    Map<std::string, std::string> product_id;
    Map<std::string, std::string> source_url;
    Map<std::string, std::string> user_agent;
};
}

#endif /* TINY_CPP_CLIENT_QualityComponents_H_ */
