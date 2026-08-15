
/*
 * CatalogsHotelItemsBatch.h
 *
 * Object describing the catalogs hotel items batch
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelItemsBatch_H_
#define TINY_CPP_CLIENT_CatalogsHotelItemsBatch_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BatchOperationStatus.h"
#include "CatalogsType.h"
#include "HotelProcessingRecord.h"
#include <list>

namespace Tiny {


/*! \brief Object describing the catalogs hotel items batch
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelItemsBatch{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelItemsBatch();
    CatalogsHotelItemsBatch(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelItemsBatch();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Id of the catalogs items batch
	 */
	std::string getBatchId();

	/*! \brief Set Id of the catalogs items batch
	 */
	void setBatchId(std::string  batch_id);
	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
	 */
	std::string getCompletedTime();

	/*! \brief Set Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
	 */
	void setCompletedTime(std::string  completed_time);
	/*! \brief Get Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
	 */
	std::string getCreatedTime();

	/*! \brief Set Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
	 */
	void setCreatedTime(std::string  created_time);
	/*! \brief Get Array with the catalogs items processing records part of the catalogs items batch
	 */
	std::list<HotelProcessingRecord> getItems();

	/*! \brief Set Array with the catalogs items processing records part of the catalogs items batch
	 */
	void setItems(std::list <HotelProcessingRecord> items);
	/*! \brief Get 
	 */
	BatchOperationStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(BatchOperationStatus  status);


    private:
    std::string batch_id{};
    CatalogsType catalog_type;
    std::string completed_time{};
    std::string created_time{};
    std::list<HotelProcessingRecord> items;
    BatchOperationStatus status;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelItemsBatch_H_ */
