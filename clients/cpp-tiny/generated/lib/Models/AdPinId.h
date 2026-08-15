
/*
 * AdPinId.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdPinId_H_
#define TINY_CPP_CLIENT_AdPinId_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdPinId{
public:

    /*! \brief Constructor.
	 */
    AdPinId();
    AdPinId(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdPinId();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Pin ID.
	 */
	std::string getPinId();

	/*! \brief Set Pin ID.
	 */
	void setPinId(std::string  pin_id);


    private:
    std::string pin_id{};
};
}

#endif /* TINY_CPP_CLIENT_AdPinId_H_ */
