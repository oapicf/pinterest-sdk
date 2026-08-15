
/*
 * UpdatePartnerResultsResponseArray_items_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdatePartnerResultsResponseArray_items_inner_H_
#define TINY_CPP_CLIENT_UpdatePartnerResultsResponseArray_items_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BusinessAccessError.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdatePartnerResultsResponseArray_items_inner{
public:

    /*! \brief Constructor.
	 */
    UpdatePartnerResultsResponseArray_items_inner();
    UpdatePartnerResultsResponseArray_items_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatePartnerResultsResponseArray_items_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	BusinessAccessError getException();

	/*! \brief Set 
	 */
	void setException(BusinessAccessError  exception);
	/*! \brief Get 
	 */
	std::string getMemberOrPartnerId();

	/*! \brief Set 
	 */
	void setMemberOrPartnerId(std::string  member_or_partner_id);


    private:
    BusinessAccessError exception;
    std::string member_or_partner_id{};
};
}

#endif /* TINY_CPP_CLIENT_UpdatePartnerResultsResponseArray_items_inner_H_ */
