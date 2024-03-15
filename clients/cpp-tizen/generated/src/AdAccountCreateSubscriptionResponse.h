/*
 * AdAccountCreateSubscriptionResponse.h
 *
 * 
 */

#ifndef _AdAccountCreateSubscriptionResponse_H_
#define _AdAccountCreateSubscriptionResponse_H_


#include <string>
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

class AdAccountCreateSubscriptionResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AdAccountCreateSubscriptionResponse();
	AdAccountCreateSubscriptionResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdAccountCreateSubscriptionResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Subscription ID.
	 */
	std::string getId();

	/*! \brief Set Subscription ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Base64 encoded key for client to decrypt lead data.
	 */
	std::string getCryptographicKey();

	/*! \brief Set Base64 encoded key for client to decrypt lead data.
	 */
	void setCryptographicKey(std::string  cryptographic_key);
	/*! \brief Get Lead data encryption algorithm.
	 */
	std::string getCryptographicAlgorithm();

	/*! \brief Set Lead data encryption algorithm.
	 */
	void setCryptographicAlgorithm(std::string  cryptographic_algorithm);
	/*! \brief Get Subscription creation time. Unix timestamp in milliseconds.
	 */
	int getCreatedTime();

	/*! \brief Set Subscription creation time. Unix timestamp in milliseconds.
	 */
	void setCreatedTime(int  created_time);

private:
	std::string id;
	std::string cryptographic_key;
	std::string cryptographic_algorithm;
	int created_time;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdAccountCreateSubscriptionResponse_H_ */
