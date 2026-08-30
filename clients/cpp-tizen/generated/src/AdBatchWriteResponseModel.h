/*
 * AdBatchWriteResponseModel.h
 *
 * 
 */

#ifndef _AdBatchWriteResponseModel_H_
#define _AdBatchWriteResponseModel_H_


#include <string>
#include "AdBatchItem.h"
#include <list>
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

class AdBatchWriteResponseModel : public Object {
public:
	/*! \brief Constructor.
	 */
	AdBatchWriteResponseModel();
	AdBatchWriteResponseModel(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdBatchWriteResponseModel();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AdBatchItem> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AdBatchItem> items);

private:
	std::list <AdBatchItem>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdBatchWriteResponseModel_H_ */
