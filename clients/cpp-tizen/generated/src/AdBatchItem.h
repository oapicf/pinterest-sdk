/*
 * AdBatchItem.h
 *
 * 
 */

#ifndef _AdBatchItem_H_
#define _AdBatchItem_H_


#include <string>
#include "Ad.h"
#include "Pinterest.Lib.Error.h"
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

class AdBatchItem : public Object {
public:
	/*! \brief Constructor.
	 */
	AdBatchItem();
	AdBatchItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdBatchItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Ad getData();

	/*! \brief Set 
	 */
	void setData(Ad  data);
	/*! \brief Get 
	 */
	Pinterest.Lib.Error getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(Pinterest.Lib.Error  exceptions);

private:
	Ad data;
	Pinterest.Lib.Error exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdBatchItem_H_ */
