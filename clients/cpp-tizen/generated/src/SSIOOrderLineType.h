/*
 * SSIOOrderLineType.h
 *
 * The type of an SSIO order line.
 */

#ifndef _SSIOOrderLineType_H_
#define _SSIOOrderLineType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The type of an SSIO order line.
 *
 *  \ingroup Models
 *
 */

class SSIOOrderLineType : public Object {
public:
	/*! \brief Constructor.
	 */
	SSIOOrderLineType();
	SSIOOrderLineType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SSIOOrderLineType();

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

#endif /* _SSIOOrderLineType_H_ */
