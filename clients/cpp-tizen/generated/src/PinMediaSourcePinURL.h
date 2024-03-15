/*
 * PinMediaSourcePinURL.h
 *
 * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 */

#ifndef _PinMediaSourcePinURL_H_
#define _PinMediaSourcePinURL_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 *
 *  \ingroup Models
 *
 */

class PinMediaSourcePinURL : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaSourcePinURL();
	PinMediaSourcePinURL(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaSourcePinURL();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getSourceType();

	/*! \brief Set 
	 */
	void setSourceType(std::string  source_type);
	/*! \brief Get This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
	 */
	bool getIsAffiliateLink();

	/*! \brief Set This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
	 */
	void setIsAffiliateLink(bool  is_affiliate_link);

private:
	std::string source_type;
	bool is_affiliate_link;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSourcePinURL_H_ */
