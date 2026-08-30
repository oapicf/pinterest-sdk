/*
 * ConversionEventIngestionSource.h
 *
 * The source of conversion events ingestion
 */

#ifndef _ConversionEventIngestionSource_H_
#define _ConversionEventIngestionSource_H_


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

class ConversionEventIngestionSource : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionEventIngestionSource();
	ConversionEventIngestionSource(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionEventIngestionSource();

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

#endif /* _ConversionEventIngestionSource_H_ */
