/*
 * CatalogsHotelItemsBatch.h
 *
 * Object describing the catalogs hotel items batch
 */

#ifndef _CatalogsHotelItemsBatch_H_
#define _CatalogsHotelItemsBatch_H_


#include <string>
#include "BatchOperationStatus.h"
#include "CatalogsType.h"
#include "HotelProcessingRecord.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing the catalogs hotel items batch
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelItemsBatch : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelItemsBatch();
	CatalogsHotelItemsBatch(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelItemsBatch();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get Array with the catalogs items processing records part of the catalogs items batch
	 */
	std::list<HotelProcessingRecord> getItems();

	/*! \brief Set Array with the catalogs items processing records part of the catalogs items batch
	 */
	void setItems(std::list <HotelProcessingRecord> items);

private:
	std::string batch_id;
	std::string created_time;
	std::string completed_time;
	BatchOperationStatus status;
	CatalogsType catalog_type;
	std::list <HotelProcessingRecord>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelItemsBatch_H_ */
