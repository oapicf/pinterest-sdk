/*
 * CatalogsItemsBatch.h
 *
 * Object describing the catalogs items batch
 */

#ifndef _CatalogsItemsBatch_H_
#define _CatalogsItemsBatch_H_


#include <string>
#include "BatchOperationStatus.h"
#include "CatalogsCreativeAssetsItemsBatch.h"
#include "CatalogsHotelItemsBatch.h"
#include "CatalogsRetailItemsBatch.h"
#include "CatalogsType.h"
#include "CreativeAssetsProcessingRecord.h"
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

	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get Id of the catalogs items batch
	 */
	std::string getBatchId();

	/*! \brief Set Id of the catalogs items batch
	 */
	void setBatchId(std::string  batch_id);
	/*! \brief Get Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
	 */
	std::string getCreatedTime();

	/*! \brief Set Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
	 */
	void setCreatedTime(std::string  created_time);
	/*! \brief Get Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
	 */
	std::string getCompletedTime();

	/*! \brief Set Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
	 */
	void setCompletedTime(std::string  completed_time);
	/*! \brief Get 
	 */
	BatchOperationStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(BatchOperationStatus  status);
	/*! \brief Get Array with the catalogs items processing records part of the catalogs items batch
	 */
	std::list<CreativeAssetsProcessingRecord> getItems();

	/*! \brief Set Array with the catalogs items processing records part of the catalogs items batch
	 */
	void setItems(std::list <CreativeAssetsProcessingRecord> items);

private:
	CatalogsType catalog_type;
	std::string batch_id;
	std::string created_time;
	std::string completed_time;
	BatchOperationStatus status;
	std::list <CreativeAssetsProcessingRecord>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemsBatch_H_ */
