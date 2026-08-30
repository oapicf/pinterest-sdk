/*
 * PartnerMetadata.h
 *
 * 
 */

#ifndef _PartnerMetadata_H_
#define _PartnerMetadata_H_


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

class PartnerMetadata : public Object {
public:
	/*! \brief Constructor.
	 */
	PartnerMetadata();
	PartnerMetadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PartnerMetadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Text field value that uniquely identifies a subscriber.
	 */
	std::string getSubscriberKey();

	/*! \brief Set Text field value that uniquely identifies a subscriber.
	 */
	void setSubscriberKey(std::string  subscriber_key);

private:
	std::string subscriber_key;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PartnerMetadata_H_ */
