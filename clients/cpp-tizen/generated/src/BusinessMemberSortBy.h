/*
 * BusinessMemberSortBy.h
 *
 * The name of field that businesses are sorted by
 */

#ifndef _BusinessMemberSortBy_H_
#define _BusinessMemberSortBy_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The name of field that businesses are sorted by
 *
 *  \ingroup Models
 *
 */

class BusinessMemberSortBy : public Object {
public:
	/*! \brief Constructor.
	 */
	BusinessMemberSortBy();
	BusinessMemberSortBy(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BusinessMemberSortBy();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _BusinessMemberSortBy_H_ */
