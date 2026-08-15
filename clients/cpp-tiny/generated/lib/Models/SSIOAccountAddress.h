
/*
 * SSIOAccountAddress.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SSIOAccountAddress_H_
#define TINY_CPP_CLIENT_SSIOAccountAddress_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SSIOAccountAddress{
public:

    /*! \brief Constructor.
	 */
    SSIOAccountAddress();
    SSIOAccountAddress(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SSIOAccountAddress();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Salesforce id for address
	 */
	std::string getAddressId();

	/*! \brief Set Salesforce id for address
	 */
	void setAddressId(std::string  address_id);
	/*! \brief Get Address display
	 */
	std::string getDisplay();

	/*! \brief Set Address display
	 */
	void setDisplay(std::string  display);
	/*! \brief Get Legal entity for this insertion order
	 */
	std::string getOrderLegalEntity();

	/*! \brief Set Legal entity for this insertion order
	 */
	void setOrderLegalEntity(std::string  order_legal_entity);
	/*! \brief Get Purpose for which the address is used, usually Billing or Businness
	 */
	std::string getPurpose();

	/*! \brief Set Purpose for which the address is used, usually Billing or Businness
	 */
	void setPurpose(std::string  purpose);


    private:
    std::string address_id{};
    std::string display{};
    std::string order_legal_entity{};
    std::string purpose{};
};
}

#endif /* TINY_CPP_CLIENT_SSIOAccountAddress_H_ */
