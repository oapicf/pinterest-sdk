/*
 * AdUpdateRequest_1.h
 *
 * 
 */

#ifndef _AdUpdateRequest_1_H_
#define _AdUpdateRequest_1_H_


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

class AdUpdateRequest_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	AdUpdateRequest_1();
	AdUpdateRequest_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdUpdateRequest_1();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of this ad.
	 */
	std::string getId();

	/*! \brief Set The ID of this ad.
	 */
	void setId(std::string  id);

private:
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdUpdateRequest_1_H_ */
