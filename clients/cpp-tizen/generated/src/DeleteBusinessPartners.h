/*
 * DeleteBusinessPartners.h
 *
 * 
 */

#ifndef _DeleteBusinessPartners_H_
#define _DeleteBusinessPartners_H_


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

class DeleteBusinessPartners : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteBusinessPartners();
	DeleteBusinessPartners(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteBusinessPartners();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<std::string> getDeletedPartners();

	/*! \brief Set 
	 */
	void setDeletedPartners(std::list <std::string> deleted_partners);

private:
	std::list <std::string>deleted_partners;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteBusinessPartners_H_ */
