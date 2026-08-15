
/*
 * PinMediaSourcePinURL.h
 *
 * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 */

#ifndef TINY_CPP_CLIENT_PinMediaSourcePinURL_H_
#define TINY_CPP_CLIENT_PinMediaSourcePinURL_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 *
 *  \ingroup Models
 *
 */

class PinMediaSourcePinURL{
public:

    /*! \brief Constructor.
	 */
    PinMediaSourcePinURL();
    PinMediaSourcePinURL(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinMediaSourcePinURL();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
	 */
	bool isIsAffiliateLink();

	/*! \brief Set This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
	 */
	void setIsAffiliateLink(bool  is_affiliate_link);
	/*! \brief Get 
	 */
	std::string getSourceType();

	/*! \brief Set 
	 */
	void setSourceType(std::string  source_type);


    private:
    bool is_affiliate_link{};
    std::string source_type{};
};
}

#endif /* TINY_CPP_CLIENT_PinMediaSourcePinURL_H_ */
