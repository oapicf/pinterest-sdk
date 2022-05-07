/*
 * CatalogsItemsBatch.h
 *
 * Object describing the catalogs items batch
 */

#ifndef _CatalogsItemsBatch_H_
#define _CatalogsItemsBatch_H_


#include <string>
#include "BatchOperationStatus.h"
#include "ItemProcessingRecord.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing the catalogs items batch
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsBatch : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemsBatch();
	CatalogsItemsBatch(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemsBatch();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Array with the catalogs items processing records part of the catalogs items batch
	 */
	std::list<ItemProcessingRecord> getItems();

	/*! \brief Set Array with the catalogs items processing records part of the catalogs items batch
	 */
	void setItems(std::list <ItemProcessingRecord> items);
	/*! \brief Get Id of the catalogs items batch
	 */
	std::string getBatchId();

	/*! \brief Set Id of the catalogs items batch
	 */
	void setBatchId(std::string  batch_id);
	/*! \brief Get Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
	 */
	std::string getCreatedTime();

	/*! \brief Set Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
	 */
	void setCreatedTime(std::string  created_time);
	/*! \brief Get Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
	 */
	std::string getCompletedTime();

	/*! \brief Set Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
	 */
	void setCompletedTime(std::string  completed_time);
	/*! \brief Get 
	 */
	BatchOperationStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(BatchOperationStatus  status);

private:
	std::list <ItemProcessingRecord>items;
	std::string batch_id;
	std::string created_time;
	std::string completed_time;
	BatchOperationStatus status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemsBatch_H_ */
