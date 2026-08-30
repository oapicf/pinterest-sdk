
/*
 * AdUpdateRequestAllOf1.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdUpdateRequestAllOf1_H_
#define TINY_CPP_CLIENT_AdUpdateRequestAllOf1_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdUpdateRequestAllOf1{
public:

    /*! \brief Constructor.
	 */
    AdUpdateRequestAllOf1();
    AdUpdateRequestAllOf1(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdUpdateRequestAllOf1();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of this ad.
	 */
	std::string getId();

	/*! \brief Set The ID of this ad.
	 */
	void setId(std::string id);
	/*! \brief Get Pin ID. This field may only be updated for draft ads.
	 */
	std::string getPinId();

	/*! \brief Set Pin ID. This field may only be updated for draft ads.
	 */
	void setPinId(std::string pin_id);


    private:
    std::string id{};
    std::string pin_id{};
};
}

#endif /* TINY_CPP_CLIENT_AdUpdateRequestAllOf1_H_ */
