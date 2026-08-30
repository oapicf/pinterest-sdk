/*
 * BookClosed.h
 *
 * 
 */

#ifndef _BookClosed_H_
#define _BookClosed_H_


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

class BookClosed : public Object {
public:
	/*! \brief Constructor.
	 */
	BookClosed();
	BookClosed(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BookClosed();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Are conversion metrics ready?
	 */
	bool getConversionMetricsReady();

	/*! \brief Set Are conversion metrics ready?
	 */
	void setConversionMetricsReady(bool  conversion_metrics_ready);
	/*! \brief Get Are non-conversion metrics ready?
	 */
	bool getNonConversionMetricsReady();

	/*! \brief Set Are non-conversion metrics ready?
	 */
	void setNonConversionMetricsReady(bool  non_conversion_metrics_ready);

private:
	bool conversion_metrics_ready;
	bool non_conversion_metrics_ready;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BookClosed_H_ */
