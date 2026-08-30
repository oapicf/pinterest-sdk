/*
 * AttributionModel.h
 *
 * Attribution model used to attribute the conversion event.
 */

#ifndef _AttributionModel_H_
#define _AttributionModel_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Attribution model used to attribute the conversion event.
 *
 *  \ingroup Models
 *
 */

class AttributionModel : public Object {
public:
	/*! \brief Constructor.
	 */
	AttributionModel();
	AttributionModel(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AttributionModel();

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

#endif /* _AttributionModel_H_ */
