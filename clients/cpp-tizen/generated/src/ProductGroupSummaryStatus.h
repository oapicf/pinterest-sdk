/*
 * ProductGroupSummaryStatus.h
 *
 * Summary status for product group
 */

#ifndef _ProductGroupSummaryStatus_H_
#define _ProductGroupSummaryStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Summary status for product group
 *
 *  \ingroup Models
 *
 */

class ProductGroupSummaryStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductGroupSummaryStatus();
	ProductGroupSummaryStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductGroupSummaryStatus();

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

#endif /* _ProductGroupSummaryStatus_H_ */
