/*
 * AdGroupUpdateRequest_allOf.h
 *
 * 
 */

#ifndef _AdGroupUpdateRequest_allOf_H_
#define _AdGroupUpdateRequest_allOf_H_


#include <string>
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

class AdGroupUpdateRequest_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupUpdateRequest_allOf();
	AdGroupUpdateRequest_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupUpdateRequest_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Ad group ID.
	 */
	std::string getId();

	/*! \brief Set Ad group ID.
	 */
	void setId(std::string  id);

private:
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupUpdateRequest_allOf_H_ */
