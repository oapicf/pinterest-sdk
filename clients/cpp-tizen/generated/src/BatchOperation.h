/*
 * BatchOperation.h
 *
 * The operation performed by the batch
 */

#ifndef _BatchOperation_H_
#define _BatchOperation_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The operation performed by the batch
 *
 *  \ingroup Models
 *
 */

class BatchOperation : public Object {
public:
	/*! \brief Constructor.
	 */
	BatchOperation();
	BatchOperation(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BatchOperation();

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

#endif /* _BatchOperation_H_ */
