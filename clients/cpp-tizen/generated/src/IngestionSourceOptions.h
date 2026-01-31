/*
 * IngestionSourceOptions.h
 *
 * List of ingestion sources for a conversion event.
 */

#ifndef _IngestionSourceOptions_H_
#define _IngestionSourceOptions_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief List of ingestion sources for a conversion event.
 *
 *  \ingroup Models
 *
 */

class IngestionSourceOptions : public Object {
public:
	/*! \brief Constructor.
	 */
	IngestionSourceOptions();
	IngestionSourceOptions(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IngestionSourceOptions();

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

#endif /* _IngestionSourceOptions_H_ */
