/*
 * OptimizationType.h
 *
 * Optimization type for ad group delivery estimates. Supported types vary by objective.
 */

#ifndef _OptimizationType_H_
#define _OptimizationType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Optimization type for ad group delivery estimates. Supported types vary by objective.
 *
 *  \ingroup Models
 *
 */

class OptimizationType : public Object {
public:
	/*! \brief Constructor.
	 */
	OptimizationType();
	OptimizationType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OptimizationType();

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

#endif /* _OptimizationType_H_ */
