
/*
 * AdPreviewSourcePinId.h
 *
 * Ad preview source from an existing Pin.
 */

#ifndef TINY_CPP_CLIENT_AdPreviewSourcePinId_H_
#define TINY_CPP_CLIENT_AdPreviewSourcePinId_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdPinPreviewCreativeType.h"

namespace Tiny {


/*! \brief Ad preview source from an existing Pin.
 *
 *  \ingroup Models
 *
 */

class AdPreviewSourcePinId{
public:

    /*! \brief Constructor.
	 */
    AdPreviewSourcePinId();
    AdPreviewSourcePinId(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdPreviewSourcePinId();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Creative type of the ad preview.
	 */
	AdPinPreviewCreativeType getCreativeType();

	/*! \brief Set Creative type of the ad preview.
	 */
	void setCreativeType(AdPinPreviewCreativeType creative_type);
	/*! \brief Get Pin ID.
	 */
	std::string getPinId();

	/*! \brief Set Pin ID.
	 */
	void setPinId(std::string pin_id);


    private:
    AdPinPreviewCreativeType creative_type;
    std::string pin_id{};
};
}

#endif /* TINY_CPP_CLIENT_AdPreviewSourcePinId_H_ */
