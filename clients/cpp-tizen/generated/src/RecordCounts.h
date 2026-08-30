/*
 * RecordCounts.h
 *
 * 
 */

#ifndef _RecordCounts_H_
#define _RecordCounts_H_


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

class RecordCounts : public Object {
public:
	/*! \brief Constructor.
	 */
	RecordCounts();
	RecordCounts(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RecordCounts();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Number of invalid records processed
	 */
	int getInvalid();

	/*! \brief Set Number of invalid records processed
	 */
	void setInvalid(int  invalid);
	/*! \brief Get Number of records processed
	 */
	int getProcessed();

	/*! \brief Set Number of records processed
	 */
	void setProcessed(int  processed);
	/*! \brief Get Number of valid records processed
	 */
	int getValid();

	/*! \brief Set Number of valid records processed
	 */
	void setValid(int  valid);

private:
	int invalid;
	int processed;
	int valid;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RecordCounts_H_ */
