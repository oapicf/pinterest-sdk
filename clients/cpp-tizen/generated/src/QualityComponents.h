/*
 * QualityComponents.h
 *
 * Set of quality components, with each component containing a event coverage and details.
 */

#ifndef _QualityComponents_H_
#define _QualityComponents_H_


#include <string>
#include "QualityComponentDetails.h"
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Set of quality components, with each component containing a event coverage and details.
 *
 *  \ingroup Models
 *
 */

class QualityComponents : public Object {
public:
	/*! \brief Constructor.
	 */
	QualityComponents();
	QualityComponents(char* str);

	/*! \brief Destructor.
	 */
	virtual ~QualityComponents();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::map<std::string, std::string> getAdvertiserExternalId();

	/*! \brief Set 
	 */
	void setAdvertiserExternalId(std::map <std::string, std::string> advertiser_external_id);
	/*! \brief Get 
	 */
	std::map<std::string, std::string> getClickIdEpik();

	/*! \brief Set 
	 */
	void setClickIdEpik(std::map <std::string, std::string> click_id_epik);
	/*! \brief Get Dedup components.
	 */
	std::map<std::string, std::string> getExternalEventId();

	/*! \brief Set Dedup components.
	 */
	void setExternalEventId(std::map <std::string, std::string> external_event_id);
	/*! \brief Get User matching identifiers.
	 */
	std::map<std::string, std::string> getHashedEmail();

	/*! \brief Set User matching identifiers.
	 */
	void setHashedEmail(std::map <std::string, std::string> hashed_email);
	/*! \brief Get 
	 */
	std::map<std::string, std::string> getHashedMaid();

	/*! \brief Set 
	 */
	void setHashedMaid(std::map <std::string, std::string> hashed_maid);
	/*! \brief Get 
	 */
	std::map<std::string, std::string> getIpAddress();

	/*! \brief Set 
	 */
	void setIpAddress(std::map <std::string, std::string> ip_address);
	/*! \brief Get 
	 */
	std::map<std::string, std::string> getOrderId();

	/*! \brief Set 
	 */
	void setOrderId(std::map <std::string, std::string> order_id);
	/*! \brief Get 
	 */
	std::map<std::string, std::string> getOrderValue();

	/*! \brief Set 
	 */
	void setOrderValue(std::map <std::string, std::string> order_value);
	/*! \brief Get Product/event metadata.
	 */
	std::map<std::string, std::string> getProductId();

	/*! \brief Set Product/event metadata.
	 */
	void setProductId(std::map <std::string, std::string> product_id);
	/*! \brief Get 
	 */
	std::map<std::string, std::string> getSourceUrl();

	/*! \brief Set 
	 */
	void setSourceUrl(std::map <std::string, std::string> source_url);
	/*! \brief Get 
	 */
	std::map<std::string, std::string> getUserAgent();

	/*! \brief Set 
	 */
	void setUserAgent(std::map <std::string, std::string> user_agent);

private:
	std::map <std::string, std::string>advertiser_external_id;
	std::map <std::string, std::string>click_id_epik;
	std::map <std::string, std::string>external_event_id;
	std::map <std::string, std::string>hashed_email;
	std::map <std::string, std::string>hashed_maid;
	std::map <std::string, std::string>ip_address;
	std::map <std::string, std::string>order_id;
	std::map <std::string, std::string>order_value;
	std::map <std::string, std::string>product_id;
	std::map <std::string, std::string>source_url;
	std::map <std::string, std::string>user_agent;
	void __init();
	void __cleanup();

};
}
}

#endif /* _QualityComponents_H_ */
