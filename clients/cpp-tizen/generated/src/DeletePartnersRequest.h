/*
 * DeletePartnersRequest.h
 *
 * 
 */

#ifndef _DeletePartnersRequest_H_
#define _DeletePartnersRequest_H_


#include <string>
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

class DeletePartnersRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	DeletePartnersRequest();
	DeletePartnersRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeletePartnersRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<std::string> getPartnerIds();

	/*! \brief Set 
	 */
	void setPartnerIds(std::list <std::string> partner_ids);
	/*! \brief Get 
	 */
	std::string getPartnerType();

	/*! \brief Set 
	 */
	void setPartnerType(std::string  partner_type);

private:
	std::list <std::string>partner_ids;
	std::string partner_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeletePartnersRequest_H_ */
