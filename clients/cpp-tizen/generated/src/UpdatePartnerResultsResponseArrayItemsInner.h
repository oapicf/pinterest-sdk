/*
 * UpdatePartnerResultsResponseArray_items_inner.h
 *
 * 
 */

#ifndef _UpdatePartnerResultsResponseArray_items_inner_H_
#define _UpdatePartnerResultsResponseArray_items_inner_H_


#include <string>
#include "BusinessAccessError.h"
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

class UpdatePartnerResultsResponseArray_items_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatePartnerResultsResponseArray_items_inner();
	UpdatePartnerResultsResponseArray_items_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatePartnerResultsResponseArray_items_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string member_or_partner_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdatePartnerResultsResponseArray_items_inner_H_ */
