
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
	std::map<std::string, QualityComponentDetails> getAdvertiserExternalId();

	/*! \brief Set 
	 */
	void setAdvertiserExternalId(std::map<std::string, QualityComponentDetails> advertiser_external_id);
	/*! \brief Get 
	 */
	std::map<std::string, QualityComponentDetails> getClickIdEpik();

	/*! \brief Set 
	 */
	void setClickIdEpik(std::map<std::string, QualityComponentDetails> click_id_epik);
	/*! \brief Get Dedup components.
	 */
	std::map<std::string, QualityComponentDetails> getExternalEventId();

	/*! \brief Set Dedup components.
	 */
	void setExternalEventId(std::map<std::string, QualityComponentDetails> external_event_id);
	/*! \brief Get User matching identifiers.
	 */
	std::map<std::string, QualityComponentDetails> getHashedEmail();

	/*! \brief Set User matching identifiers.
	 */
	void setHashedEmail(std::map<std::string, QualityComponentDetails> hashed_email);
	/*! \brief Get 
	 */
	std::map<std::string, QualityComponentDetails> getHashedMaid();

	/*! \brief Set 
	 */
	void setHashedMaid(std::map<std::string, QualityComponentDetails> hashed_maid);
	/*! \brief Get 
	 */
	std::map<std::string, QualityComponentDetails> getIpAddress();

	/*! \brief Set 
	 */
	void setIpAddress(std::map<std::string, QualityComponentDetails> ip_address);
	/*! \brief Get 
	 */
	std::map<std::string, QualityComponentDetails> getOrderId();

	/*! \brief Set 
	 */
	void setOrderId(std::map<std::string, QualityComponentDetails> order_id);
	/*! \brief Get 
	 */
	std::map<std::string, QualityComponentDetails> getOrderValue();

	/*! \brief Set 
	 */
	void setOrderValue(std::map<std::string, QualityComponentDetails> order_value);
	/*! \brief Get Product/event metadata.
	 */
	std::map<std::string, QualityComponentDetails> getProductId();

	/*! \brief Set Product/event metadata.
	 */
	void setProductId(std::map<std::string, QualityComponentDetails> product_id);
	/*! \brief Get 
	 */
	std::map<std::string, QualityComponentDetails> getSourceUrl();

	/*! \brief Set 
	 */
	void setSourceUrl(std::map<std::string, QualityComponentDetails> source_url);
	/*! \brief Get 
	 */
	std::map<std::string, QualityComponentDetails> getUserAgent();

	/*! \brief Set 
	 */
	void setUserAgent(std::map<std::string, QualityComponentDetails> user_agent);


    private:
    std::map<std::string, QualityComponentDetails> advertiser_external_id;
    std::map<std::string, QualityComponentDetails> click_id_epik;
    std::map<std::string, QualityComponentDetails> external_event_id;
    std::map<std::string, QualityComponentDetails> hashed_email;
    std::map<std::string, QualityComponentDetails> hashed_maid;
    std::map<std::string, QualityComponentDetails> ip_address;
    std::map<std::string, QualityComponentDetails> order_id;
    std::map<std::string, QualityComponentDetails> order_value;
    std::map<std::string, QualityComponentDetails> product_id;
    std::map<std::string, QualityComponentDetails> source_url;
    std::map<std::string, QualityComponentDetails> user_agent;
};
}

#endif /* TINY_CPP_CLIENT_QualityComponents_H_ */
