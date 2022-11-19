/*
 * BulkUpsertRequest.h
 *
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 */

#ifndef _BulkUpsertRequest_H_
#define _BulkUpsertRequest_H_


#include <string>
#include "BulkUpsertRequestCreate.h"
#include "BulkUpsertRequestUpdate.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 *
 *  \ingroup Models
 *
 */

class BulkUpsertRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkUpsertRequest();
	BulkUpsertRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkUpsertRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	BulkUpsertRequestCreate getCreate();

	/*! \brief Set 
	 */
	void setCreate(BulkUpsertRequestCreate  create);
	/*! \brief Get 
	 */
	BulkUpsertRequestUpdate getUpdate();

	/*! \brief Set 
	 */
	void setUpdate(BulkUpsertRequestUpdate  update);

private:
	BulkUpsertRequestCreate create;
	BulkUpsertRequestUpdate update;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BulkUpsertRequest_H_ */
