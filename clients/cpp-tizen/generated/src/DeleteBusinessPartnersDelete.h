/*
 * DeleteBusinessPartnersDelete.h
 *
 * 
 */

#ifndef _DeleteBusinessPartnersDelete_H_
#define _DeleteBusinessPartnersDelete_H_


#include <string>
#include "NullablePartnerType.h"
#include <list>
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

class DeleteBusinessPartnersDelete : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteBusinessPartnersDelete();
	DeleteBusinessPartnersDelete(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteBusinessPartnersDelete();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of partner ids to be deleted
	 */
	std::list<std::string> getPartnerIds();

	/*! \brief Set A list of partner ids to be deleted
	 */
	void setPartnerIds(std::list <std::string> partner_ids);
	/*! \brief Get 
	 */
	NullablePartnerType getPartnerType();

	/*! \brief Set 
	 */
	void setPartnerType(NullablePartnerType  partner_type);

private:
	std::list <std::string>partner_ids;
	NullablePartnerType partner_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteBusinessPartnersDelete_H_ */
