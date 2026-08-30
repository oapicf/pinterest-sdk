/*
 * CreationSource.h
 *
 * The source of conversion events ingestion
 */

#ifndef _CreationSource_H_
#define _CreationSource_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The source of conversion events ingestion
 *
 *  \ingroup Models
 *
 */

class CreationSource : public Object {
public:
	/*! \brief Constructor.
	 */
	CreationSource();
	CreationSource(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreationSource();

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

#endif /* _CreationSource_H_ */
